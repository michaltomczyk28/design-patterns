package com.michaltomczyk.strategy.arraysorter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArraySorterTest {
    private ArraySorter arraySorter;
    private SortingStrategy[] sortingStrategies;

    @BeforeEach
    void setUp() {
        this.arraySorter = new ArraySorter();
        this.sortingStrategies = new SortingStrategy[]{
                new BubbleSortingStrategy(),
                new SelectionSortingStrategy()
        };
    }

    @Test
    void shouldSortArrayAscending() {
        int[] data = { 5, 2, 3, 4, 1};
        int[] expected = {1, 2, 3, 4, 5};

        for(SortingStrategy strategy: this.sortingStrategies){
            this.arraySorter.setSortingStrategy(strategy);
            int[] result = this.arraySorter.sort(data, true);

            Assertions.assertArrayEquals(expected, result);
        }
    }

    @Test
    void shouldSortArrayDescending() {
        int[] data = { 5, 2, 3, 4, 1};
        int[] expected = {5, 4, 3, 2, 1};

        for(SortingStrategy strategy: this.sortingStrategies){
            this.arraySorter.setSortingStrategy(strategy);
            int[] result = this.arraySorter.sort(data, false);

            Assertions.assertArrayEquals(expected, result);
        }
    }
}
