package SortingAlgo;

public class quickSort {

    public static void qs(int[] arr, int s, int e) {
        if(s > e) {
            return;
        }
        int left = s;
        int right = e;
        int mid = (s + e) / 2;
        int pivot = arr[mid];

        while(s <= e) {
            while(s <= mid && arr[s] < pivot) {
                s++;
            }

            while(mid <= e && pivot < arr[e]) {
                e--;
            }

            int temp = arr[e];
            arr[e] = arr[s];
            arr[s] = temp;

            s++;
            e--;
        }

        qs(arr, left, e);
        qs(arr, s, right);
    }

}
