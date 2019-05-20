package com.deanalvero.algorithms.domain;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class SortTest {

    protected Sort sort;

    public void sort_evenCountOfInputs_returnSorted() {
        int[] input = new int[] {
                6, 3, 9, 2, 1, 4, 5, 8
        };
        int[] expected = new int[] {
                1, 2, 3, 4, 5, 6, 8, 9
        };

        int[] actual = sort.sort(input);

        System.out.println(Arrays.toString(actual));
        assertArrayEquals(
                expected,
                actual
        );
    }

    public void sort_emptyInputs_returnEmpty() {
        int[] input = new int[] {};
        int[] expected = new int[] {};

        int[] actual = sort.sort(input);

        assertArrayEquals(
                expected,
                actual
        );
    }

    public void sort_oddCountOfInputs_returnSorted() {
        int[] input = new int[] {
                4, 8, 2, 1, 9, 6, 3
        };
        int[] expected = new int[] {
                1, 2, 3, 4, 6, 8, 9
        };

        int[] actual = sort.sort(input);

        assertArrayEquals(
                expected,
                actual
        );
    }
}
