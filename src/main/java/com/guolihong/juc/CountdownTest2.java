package com.guolihong.juc;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class CountdownTest2 {
    private static int file=0;
    public static void main(String[] args) {
        CompletableFuture task1=CompletableFuture.supplyAsync((Supplier<Object>) () -> {
            file++;
            return file;
        });
        CompletableFuture task2 = CompletableFuture.supplyAsync((Supplier<Object>) () -> {
                    file++;
                    return file;
                });

        CompletableFuture task3 = CompletableFuture.supplyAsync((Supplier<Object>) () -> {
            file++;
            return file;
        });
        CompletableFuture<Void> headerFuture= CompletableFuture.allOf(task1,task2,task3);

        try {
            headerFuture.join();
        } catch (Exception ex) {
            //......
        }
        System.out.println(file);
    }
}
