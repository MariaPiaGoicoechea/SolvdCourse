package com.solvd.theuniversity.reflection;

import java.util.List;

public class Fibonacci {

    int [] fiboNums;
    int n;

    public Fibonacci(int n){
        fiboNums = new int[n+2];
        this.n = n;
    }

    public int[] calculateFiboNums(){
        fiboNums[0] = 0;
        fiboNums[1] = 1;

        for(int i=2; i<=n; i++){
            fiboNums[i] = fiboNums[i-1] + fiboNums[i-2];
        }

        return fiboNums;
    }

}
