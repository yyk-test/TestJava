package SortingAlgo;

public class mergeSort {
    public static void ms(int[] arr, int[] temp, int s, int e) { // s he e shi kaishi jieshu d fanwei
        if (s >= e) {
            return;
        }
//        System.out.println("s:"+s+", e:"+e);

        int mid = (s + e) / 2;
        ms(arr, temp, s, mid);
        ms(arr, temp, mid + 1, e);
        int left = s; // zuobian d kaishi
        int right = mid+1; // youbian d kaishi
        int idx = s;
        while(left <= mid && right <= e) {
            if (arr[left] < arr[right]) {
                temp[idx++] = arr[left++];
            } else {
                temp[idx++] = arr[right++];
            }
        }
// zhiyou renyi yige partition jieshu le cai append jiexiaqu d yuansu
        // suoyi zheli yao xie 3 ge while
        while(left <= mid) {
            temp[idx++] = arr[left++];
        }

        while(right <= e) {
            temp[idx++] = arr[right++];
        }
//        System.out.println("========= one level ========");
        for(int i = s; i <= e; i++) {
//            System.out.print(temp[i]);
            arr[i] = temp[i];
        }
//        System.out.println("");
//        System.out.println("========= one-2 level ========");
    }
}