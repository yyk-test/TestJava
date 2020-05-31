package Async;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<CompletableFuture<Integer>> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            int t = i;
            list.add(CompletableFuture.supplyAsync(() -> { return t;}));
        }
        for(CompletableFuture<Integer> cf : list) {
            System.out.println(cf.get());
        }
    }
}
