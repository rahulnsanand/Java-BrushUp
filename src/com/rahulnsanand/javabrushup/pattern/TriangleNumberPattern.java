package com.rahulnsanand.javabrushup.pattern;

import java.util.Scanner;

public class TriangleNumberPattern {
    public static void run(){
        Scanner scanner=new Scanner (System.in);
        int n = scanner.nextInt();
        int i = 1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(i);
                j += 1;
            }
            System.out.println();
            i += 1;
        }
    }
}
