package com.michaltomczyk.strategy.arraysorter;

public class ArraySorter {
    protected SortingStrategy sortingStrategy;

    public Integer[] sort(Integer[] data, boolean ascending){
        return this.sortingStrategy.sort(data, ascending);
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }
}
