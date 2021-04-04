package com.solvd.hellogit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Fibonacci {
    private static final Logger log = LogManager.getFormatterLogger(Fibonacci.class);
    private int [] fiboNums;
    private int n;

    public Fibonacci(int n){
        fiboNums = new int[n+2];
        this.n = n;
    }

    public Fibonacci(){
        this.n = 0;
    }

    public void assignFiboNums(int n){
        this.n = n;
        fiboNums = new int[n+2];
    }

    public int[] calculateFiboNums(){
        if (n == 0){
            return null;
        }

        fiboNums[0] = 0;
        fiboNums[1] = 1;

        for(int i=2; i<=n-1; i++){
            fiboNums[i] = fiboNums[i-1] + fiboNums[i-2];
        }

        return Arrays.copyOfRange(fiboNums,0, n);
    }

    public int[] getFiboNums() {
        return fiboNums;
    }

    public int getN() {
        return n;
    }
}
