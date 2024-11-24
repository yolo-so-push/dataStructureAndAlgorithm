package com.guolihong.meituan;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int q=scanner.nextInt();
        int[][] grid=new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            int u=scanner.nextInt();
            int v=scanner.nextInt();
            grid[u][v]=1;
            grid[v][u]=1;
        }
        while (q-->0){
            int op=scanner.nextInt();
            int u=scanner.nextInt();
            int v=scanner.nextInt();
            if (op==1){
                grid[u][v]=0;
                grid[v][u]=0;
            }else{

            }
        }
    }
}
