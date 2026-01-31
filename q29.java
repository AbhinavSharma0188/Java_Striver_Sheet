import java.util.*;


class Solution {
    public void nextPermutation(int[] arr) {
        int pivot = -1;


        // Step 1: Find pivot
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i - 1] < arr[i]) {
                pivot = i - 1;
                break;
            }
        }


        // Step 2: If no pivot, reverse whole array
        if (pivot == -1) {
            reverse(arr, 0, arr.length - 1);
            return;
        }


        // Step 3: Find element just greater than pivot and swap
        for (int i = arr.length - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }


        // Step 4: Reverse the suffix after pivot
        reverse(arr, pivot + 1, arr.length - 1);
    }


    // Helper function to reverse part of array
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}


