package itheima.day02.codeTop;

public class Leetcode5 {
    public String longestPalindrome(String s) {
        int n = s.length();
        char[] a = s.toCharArray();
        boolean[][] dp=new boolean[n+1][n+1];
        for (int i = 1; i <=n; i++) {
            dp[i][i]=true;
        }
        String res=s.substring(0,1);
        int max=0;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <i; j++) {
                if (a[i-1]==a[j-1]){
                    if (i-j<=2){
                        dp[j][i]=true;
                    }else{
                        dp[j][i]=dp[j+1][i-1];
                    }
                }
                if (dp[j][i]&&max<i-j+1){
                      max=i-j+1;
                      res=s.substring(j-1,i);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Leetcode5 leetcode5=new Leetcode5();
        String res = leetcode5.longestPalindrome("babab");
        System.out.println(res);
    }
}
