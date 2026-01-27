import java.util.Arrays;


class Main {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void moveZeroes(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = 0; // pointer for placing non-zero elements


        // Step 1: Move all non-zero elements to front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }


        // Step 2: Fill remaining positions with zeros
        while (nonZeroIndex < n) {
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}
