import java.util.Arrays;


class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;


        rotate(arr, k);
    }


    public static void rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n; // important to avoid errors when k > n


        // Step 1: Reverse whole array
        reverse(0, n-1, arr);


        // Step 2: Reverse first k elements
        reverse(0, k-1, arr);


        // Step 3: Reverse remaining elements
        reverse(k, n-1, arr);


        System.out.println(Arrays.toString(arr));
    }


    public static void reverse(int i, int j, int arr[]) {
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
