package com.michaltomczyk.strategy.arraysorter;

public class BubbleSortingStrategy implements SortingStrategy{
    public int[] sort(int[] data, boolean ascending) {
        for(int i = 0; i < data.length; i++){
            for(int j = i + 1; j < data.length; j++){
                if(this.shouldSwap(data[i], data[j], ascending)){
                    int temp = data[j];

                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }
        return data;
    }

    protected boolean shouldSwap(int a, int b, boolean ascending){
        return (a < b) ^ ascending;
    }
}
