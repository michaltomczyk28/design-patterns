package com.michaltomczyk.strategy.arraysorter;

public class ExecutionTimer {
    public double compute(Runnable callback){
        long start = System.nanoTime();
        callback.run();
        long end = System.nanoTime();

        return (end - start) / Math.pow(10, 9);
    }
}
