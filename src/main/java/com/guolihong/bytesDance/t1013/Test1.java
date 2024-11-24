package com.guolihong.bytesDance.t1013;

import java.util.Scanner;

public class Test1 {
    private static int[] LED={
            0b11111001100110011111,
            0b00110001000100010001,
            0b11110001111110001111,
            0b11110001111100011111,
            0b10101010111100100010,
            0b11111000111100011111,
            0b11111000111110011111,
            0b11110001000100010001,
            0b11111001111110011111,
            0b11111001111100011111
    };
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        String s=scanner.next();
        int res=ChangeCount(n,x,y,s);
        System.out.println(res);
    }

    private static int ChangeCount(int n, int x, int y, String s) {
        int pos=19-((x-1)*4+(y-1));
        int count=0;
        int c = s.charAt(0) - '0';
        int mask=1<<pos;
        int last =mask&LED[c];
        for (int i = 1; i < s.length(); i++) {
            int z= s.charAt(i) - '0';
            if (last!=(mask&LED[z])){
                count++;
                last=mask&LED[z];
            }
        }
        return count;
    }
}
