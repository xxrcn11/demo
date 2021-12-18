package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static final int SIZE = 10;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        int[] array = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            array[i] = generator();
            System.out.println("Generator complete! - " + array[i]);
        }

        System.out.println("정렬전 >> " + Arrays.toString(array));

        BubbleSort sort = new BubbleSort();
        sort.sort(array);


        System.out.println("정렬 후 >> " + Arrays.toString(array));


    }

    private int generator() {
        return (int) (Math.random() * 10) + 1;
    }
}
