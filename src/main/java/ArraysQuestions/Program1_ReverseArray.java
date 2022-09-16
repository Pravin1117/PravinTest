package ArraysQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program1_ReverseArray {
    /*
    Given an array (or string), the task is to reverse the array/string.
    Examples :
    Input  : arr[] = {1, 2, 3}
    Output : arr[] = {3, 2, 1}

    Input :  arr[] = {4, 5, 1, 2}
    Output : arr[] = {2, 1, 5, 4}
     */

    public static void main(String[] args) {
        int []arr = {1, 2, 3};

        System.out.println("Before reversing the order of array : "+Arrays.toString(arr));

        System.out.println("After reversing the order of array : "+Arrays.toString(reverseArray(arr)));

    }

    private static int[] reverseArray(int[] arr) {
        int temp,start,end;
        start = 0;
        end = arr.length-1;
        while (start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start ++;
            end --;
        }


        return arr;
       }
}
