package com.michaltomczyk;

public class ArrayBubbleSorter {
    public int[] sort(int[] data, boolean ascending) {
        for(int i = 0; i < data.length; i++){
            for(int j = i + 1; j < data.length; j++){
                if(shouldSwap(data[i], data[j], ascending)){
                    int temp = data[j];

                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }
        return data;
    }

    private boolean shouldSwap(int a, int b, boolean ascending){
        return (a < b) ^ ascending;
    }
}
