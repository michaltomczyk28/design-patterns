package com.michaltomczyk.strategy.arraysorter;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] data = generateRandomArray(25000);
        SortingStrategy[] sortingStrategies = new SortingStrategy[]{
            new BubbleSortingStrategy(),
            new SelectionSortingStrategy()
        };

        ArraySorter arraySorter = new ArraySorter();
        ExecutionTimer executionTimer = new ExecutionTimer();

        for(SortingStrategy sortingStrategy: sortingStrategies){
            arraySorter.setSortingStrategy(sortingStrategy);
            double elapsedTime = executionTimer.compute(() -> {
                arraySorter.sort(data, true);
            });

            System.out.println(sortingStrategy.getClass().getSimpleName() + ": " + elapsedTime);
        }
    }

    private static Integer[] generateRandomArray(int size){
        Integer[] array = new Integer[size];
        Arrays.setAll(array, i -> i);

        List<Integer> list = Arrays.asList(array);

        Collections.shuffle(list);
        list.toArray(array);

        return array;
    }
}
