package com.rahulnsanand.javadatastructures.twodimensionalarrays.assignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintLikeAWave {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] take2DInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int n_rows = Integer.parseInt(strRowsCols[0]);
        int m_cols = Integer.parseInt(strRowsCols[1]);

        if (n_rows == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[n_rows][m_cols];

        for (int row = 0; row < n_rows; row++) {
            String[] strNums;
            strNums = br.readLine().trim().split("\\s");

            for (int col = 0; col < m_cols; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }


    public static void run() throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            wavePrint(mat);
            System.out.println();

            t -= 1;
        }
    }

    public static void wavePrint(int mat[][]){
        int rowLen = mat.length;
        if(rowLen>0){
            int colLen = mat[0].length;
            for (int j = 0; j < colLen; j++) {
                if (j % 2 == 0) {
                    for (int i = 0; i < rowLen; i++) {
                        System.out.print(mat[i][j] + " ");
                    }
                } else {
                    for (int i = rowLen - 1; i >= 0; i--) {
                        System.out.print(mat[i][j] + " ");
                    }
                }
            }
        }

    }
}
