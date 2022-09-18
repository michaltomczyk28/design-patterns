package com.michaltomczyk.strategy.arraysorter;

public class SelectionSortingStrategy extends SortingStrategy{
    public Integer[] sort(Integer[] data, boolean ascending) {
        for(int i = 0; i < data.length; i++){
            int extremeIndex = i;

            for(int j = i + 1; j < data.length; j++){
                if(this.shouldSwap(data[extremeIndex], data[j], ascending)){
                    extremeIndex = j;
                }
            }

            int temp = data[i];
            data[i] = data[extremeIndex];
            data[extremeIndex] = temp;
        }

        return data;
    }
}
