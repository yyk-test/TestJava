package FindAPeak;

public class findPeak {
    public static int findAPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int time = 10;

        while(start + 1 < end) {
            int mid = start + (end - start) / 2;


                System.out.println("---");
                System.out.println("mid: " + arr[mid] + " " + mid);
                System.out.println("mid-1: " + arr[mid-1] + " " + (mid-1));
                System.out.println("mid+1: " + arr[mid+1] + " " + (mid+1));
                System.out.println("===");

            if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                start = mid;
            } else if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                start = mid;
            }
        }
        return (arr[start] > arr[end]) ? start : end;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 1, 3, 6, 7, 8, 9, 23,  20, 21, 4, 3};
//        int[] arr = {1,2,3,4,5};
        System.out.println(findAPeak(arr));
    }
}
