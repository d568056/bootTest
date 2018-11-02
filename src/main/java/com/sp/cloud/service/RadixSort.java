package com.sp.cloud.service;

import java.util.ArrayList;
import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args ){
        int[] inputArray = {405,45,10,4,506,80};
        final int RADIX = 10;
        ArrayList<Integer>[] buckets = new ArrayList[RADIX];
        for(int i=0;i < buckets.length;i++){
            buckets[i] = new ArrayList<>();
        }
        boolean maxDigitsLengthReached = false;
        int temp = -1,placeValue = 1;
        while(!maxDigitsLengthReached){
        maxDigitsLengthReached = true;
        for(Integer element :inputArray){
            temp = element/placeValue;
            buckets[temp % RADIX].add(element);
            if(maxDigitsLengthReached && temp>0){
                maxDigitsLengthReached= false;
            }
        }
        int a = 0;
        for(int b= 0; b <RADIX; b++){
            for(Integer i : buckets[b]){
                inputArray[a++] = i;
            }
            buckets[b].clear();
        }
        placeValue = placeValue * RADIX;

        }
        Arrays.stream(inputArray).forEach(System.out::println);
    }
}
