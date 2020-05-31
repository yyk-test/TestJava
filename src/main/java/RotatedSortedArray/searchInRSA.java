package RotatedSortedArray;

public class searchInRSA {

    public static int find(int[] arr, int t) {
        if(arr == null || arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        int mostRight = arr[arr.length - 1];

        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            System.out.println(mid);
            if(arr[mid] == t) {
                return mid;
            }
            if(arr[mid] > mostRight) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if(arr[end] == t) {
            return end;
        }
        if(arr[start] == t) {
            return start;
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] arr = {4, 5, 6, 7, 0, 1, 2};
//        int[] arr = {0, 1, 2, 4, 5, 6, 7};
        int[] arr = {1,2,3};
        int target = 1;

        System.out.println(find(arr, target));
    }
}
