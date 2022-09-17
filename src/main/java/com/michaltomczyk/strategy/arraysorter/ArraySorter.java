package com.michaltomczyk.strategy.arraysorter;

public abstract class ArraySorter {
    public abstract int[] sort(int[] data, boolean ascending);

    protected boolean shouldSwap(int a, int b, boolean ascending){
        return (a < b) ^ ascending;
    }
}
