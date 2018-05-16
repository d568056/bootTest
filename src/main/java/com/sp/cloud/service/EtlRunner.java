package com.sp.cloud.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EtlRunner implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        System.out.print("Command Line runner *************************");
    }
}
