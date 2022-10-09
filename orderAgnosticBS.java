public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {174,154,136,124,115,101,95};
        int target = 124;
        int ans = OrderAgnosticsBS(arr, target);
        System.out.println(ans);
    }

    static int OrderAgnosticsBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        //find wheather the array is sorted in ascending or descending
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;

                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;

                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }

        } return -1;
    }
}
