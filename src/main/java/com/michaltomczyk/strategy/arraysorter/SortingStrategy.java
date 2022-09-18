package com.michaltomczyk.strategy.arraysorter;

public abstract class SortingStrategy {
    abstract Integer[] sort(Integer[] data, boolean ascending);

    protected boolean shouldSwap(int a, int b, boolean ascending){
        return (a < b) ^ ascending;
    }
}
