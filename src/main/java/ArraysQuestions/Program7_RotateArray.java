package ArraysQuestions;

import java.util.Arrays;

public class Program7_RotateArray {
    /*
        Given an array, rotate the array by one position in clock-wise direction.
        Example 1:

        Input:
        N = 5
        A[] = {1, 2, 3, 4, 5}
        Output:
        5 1 2 3 4
     */

    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateArray(arr)));

    }

    private static int [] rotateArray(int[] arr) {
        int temp =arr[0];
        for (int i =0; i<arr.length-1;i++){
            arr[i]= arr[i+1];
        }
        arr[arr.length-1]=temp;

        return arr;
    }
}
