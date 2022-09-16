package ArraysQuestions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Program3_KthSmallestElement {
    /*
    Given an array arr[] and an integer K where K is smaller than size of array,
    the task is to find the Kth smallest element in the given array.
    It is given that all array elements are distinct.

        Example 1:

        Input:
        N = 6
        arr[] = 7 10 4 3 20 15
        K = 3
        Output : 7
        Explanation :
        3rd smallest element in the given
        array is 7.
     */
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(kthSmallestFunction(arr, k));
    }

    private static int kthSmallestFunction(int[] arr, int k) {
        // Method 1 : Using Sort method.
        int smallest = 0;
        /*Arrays.sort(arr);
        smallest = arr[k-1];

        return smallest;
*/
        //Method 2 : Using heap method :- Priority Queue.

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        for (int i = 0; i < k - 1; i++) {
            pq.poll();
        }
        smallest = pq.peek();
        return smallest;
    }
}
