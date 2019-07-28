package com.sp.cloud.integration;

import com.sp.cloud.conf.ApplicationConfiguration;
import com.sp.cloud.model.Car;
import   org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = ApplicationConfiguration.class)
public class CarIntegration {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getCar_returnCarDetails() throws Exception {

        ResponseEntity<Car> res = restTemplate.getForEntity("/car/prius", Car.class);

        Assertions.assertThat(res.getStatusCode()).isEqualTo(HttpStatus.OK);

        Assertions.assertThat(res.getBody().getName()).isEqualTo("prius");
        Assertions.assertThat(res.getBody().getType()).isEqualTo("hybrid");
    }


}
