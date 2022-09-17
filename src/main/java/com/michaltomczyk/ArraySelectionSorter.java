package com.michaltomczyk;

public class ArraySelectionSorter {
    public int[] sort(int[] data, boolean ascending) {
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

    private boolean shouldSwap(int a, int b, boolean ascending){
        return (a < b) ^ ascending;
    }
}
