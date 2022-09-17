package com.michaltomczyk.strategy.arraysorter;

public class ArraySelectionSorter extends ArraySorter {
    public ArraySelectionSorter() {
        this.sortingStrategy = new SelectionSortingStrategy();
    }
}
