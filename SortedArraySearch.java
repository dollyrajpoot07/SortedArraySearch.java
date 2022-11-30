// Given a sorted array arr[] consisting of N distinct integers and an integer K, the task is to find the index of K, 
// if it’s present in the array arr[]. Otherwise, find the index where K must be inserted to keep the array sorted.

// Examples: 

// Input: arr[] = {1, 3, 5, 6}, K = 5
// Output: 2
// Explanation: Since 5 is found at index 2 as arr[2] = 5, the output is 2.

// Input: arr[] = {1, 3, 5, 6}, K = 2
// Output: 1
// Explanation: Since 2 is not present in the array but can be inserted at index 1 to make the array sorted.

class SortedArraySearch {
    static int find_index(int[] arr, int n, int K) {

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == K)
                return mid;

            else if (arr[mid] < K)
                start = mid + 1;

            else
                end = mid - 1;
        }

        return end + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int n = arr.length;
        int K = 2;

        System.out.println(find_index(arr, n, K));
    }
}
