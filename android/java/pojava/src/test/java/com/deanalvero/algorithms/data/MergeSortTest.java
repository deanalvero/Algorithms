package com.deanalvero.algorithms.data;

import com.deanalvero.algorithms.domain.SortTest;

import org.junit.Before;
import org.junit.Test;

public class MergeSortTest extends SortTest {

    @Before
    public void setUp() {
        sort = new MergeSort();
    }

    @Test
    public void sort_evenCountOfInputs_returnSorted() {
        super.sort_evenCountOfInputs_returnSorted();
    }

    @Test
    public void sort_emptyInputs_returnEmpty() {
        super.sort_emptyInputs_returnEmpty();
    }

    @Test
    public void sort_oddCountOfInputs_returnSorted() {
        super.sort_oddCountOfInputs_returnSorted();
    }
}
