package com.guolihong.tuwei.T1031;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] arr=new int[n][n];
        boolean isSuc=true;
        for (int i = 0; i < n; i++) {
            int cnt=0;
            for (int j = 0; j < n; j++) {
                arr[i][j]=scanner.nextInt();
                if (arr[i][j]==1) cnt++;
            }
            if (cnt==0){
                isSuc=false;
            }
        }
        if (!isSuc) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < n; i++) {

        }
    }
}
