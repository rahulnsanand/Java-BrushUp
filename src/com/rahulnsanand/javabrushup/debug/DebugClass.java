package com.rahulnsanand.javabrushup.debug;

import java.util.Scanner;

public class DebugClass {

    public static void debugThis(){
        String a="coding";
        for(int i=2;i<5;i++)
        {
            System.out.print(a.substring(i-2,i+1));
        }

        System.out.println();
    }
    public static void  fun(int[][] arr2d)
    {

        for(int i=0;i<arr2d.length;i++)
        {
            for(int j=0;j<arr2d[i].length;j++)
            {
                arr2d[i][j]=2*i+j;
            }
        }
    }
    public static int[] change(int input[]){
        input = new int[5];
        input[0] = 15;
        return input;
    }
    public static boolean isPrime(int x)
    {
        for(int i=2;i<x/2;i++)
        {
            if(x%i==0)
                return false;
        }
        return true;

    }
}
