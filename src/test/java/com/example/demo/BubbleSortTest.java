package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    private BubbleSort sort;
    @BeforeEach
    void setUp() {
        sort = new BubbleSort();
    }

    @Test
    void sort() {

        int[] array = {7,3,2};

        sort.sort(array);

    }
}