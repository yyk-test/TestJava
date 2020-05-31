package SearchBigSortedArray;

import java.util.Random;

public class bigArr {
    public static int searchBigSortedArray(int[] bigArr, int target) {
        if(bigArr == null || bigArr.length == 0) {
            return -1;
        }
        int seed = 1;
        int end = 0;
        while(bigArr[seed] <= target) {
            seed *= 2;
            if(bigArr[seed] > target) {
                end = seed;
                break;
            }
        }
        seed /= 2;
        while(seed + 1 < end) {
            int mid = seed + (end - seed) / 2;
            if(bigArr[mid] < target) {
                seed = mid;
            } else if (bigArr[mid] == target) {
                end = mid;
            } else {
                seed = mid;
            }
        }
        if(bigArr[seed] == target) {
            return seed;
        }
        if(bigArr[end] == target) {
            return end;
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = new int[10000];
        Random random = new Random();
        for(int i = 0; i < 10000; i++) {
            arr[i] = i + ((random.nextInt(1) > 0.5) ? 1 : 0);
        }
        int t = 2;
        System.out.println(searchBigSortedArray(arr, t));
    }
}
