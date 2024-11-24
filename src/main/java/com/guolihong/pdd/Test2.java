package com.guolihong.pdd;
import java.util.Scanner;

public class Test2 {
    //在奥运会中C国和A国可能是金牌榜第一，第一行输入项目数n,第二行输入每个项目C国和A国得金牌得概率，请计算C国成为金牌榜第一得概率，例如1    0.3 0.2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取项目数
        int n = scanner.nextInt();

        // 读取每个项目中C国和A国获得金牌的概率
        double[][] probabilities = new double[n][2];
        for (int i = 0; i < n; i++) {
            probabilities[i][0] = scanner.nextDouble(); // C国获得金牌的概率
            probabilities[i][1] = scanner.nextDouble(); // A国获得金牌的概率
        }

        scanner.close();

        // 计算C国成为金牌榜第一的概率
        double probability = calculateProbability(n, probabilities);

        // 输出结果，保留四位小数
        System.out.printf("C国成为金牌榜第一的概率是: %.4f\n", probability);
    }

    public static double calculateProbability(int n, double[][] probabilities) {
        // dp[i][j]表示在第i个项目后，C国获得j枚金牌的概率
        double[][] dp = new double[n + 1][n + 1];
        dp[0][0] = 1.0; // 初始状态，C国在0个项目后获得0枚金牌的概率为1

        for (int i = 1; i <= n; i++) {
            double p_c = probabilities[i - 1][0]; // C国获得金牌的概率
            double p_a = probabilities[i - 1][1]; // A国获得金牌的概率

            for (int j = 0; j <= i; j++) {
                // C国获得j枚金牌的情况
                if (j > 0) {
                    // C国获得金牌，A国没有获得金牌
                    dp[i][j] += dp[i - 1][j - 1] * p_c * (1 - p_a);
                }
                if (j < i) {
                    // C国没有获得金牌，A国获得金牌
                    dp[i][j] += dp[i - 1][j] * (1 - p_c) * p_a;
                }
                // C国和A国都没有获得金牌
                dp[i][j] += dp[i - 1][j] * (1 - p_c) * (1 - p_a);
            }
        }

        // 计算C国获得的金牌数大于A国的概率
        double probability = 0.0;
        for (int j = 0; j <= n; j++) {
            for (int k = 0; k < j; k++) {
                probability += dp[n][j] * dp[n][k];
            }
        }

        return probability;
    }
}