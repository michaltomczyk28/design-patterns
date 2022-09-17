package com.michaltomczyk.strategy.arraysorter;

public class ArrayBubbleSorter extends ArraySorter{
    public ArrayBubbleSorter() {
        this.sortingStrategy = new BubbleSortingStrategy();
    }
}
