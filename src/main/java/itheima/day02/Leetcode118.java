package itheima.day02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode118 {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> generate(int numRows) {
        int[][] dp=new int[numRows+1][numRows+1];
        List<List<Integer>> res=new ArrayList<>();
        for (int i = 1; i <=numRows; i++) {
            List<Integer> path=new ArrayList<>();
            for (int j = 1; j <=i; j++) {
                if (j==1||i==j){
                    dp[i][j]=1;
                }else{
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }
                path.add(dp[i][j]);
            }
            res.add(path);
        }
        return res;
    }

    public static void main(String[] args) {
        Leetcode118 leetcode118=new Leetcode118();
        List<List<Integer>> res = leetcode118.generate(5);
        System.out.println(res);
    }


}
