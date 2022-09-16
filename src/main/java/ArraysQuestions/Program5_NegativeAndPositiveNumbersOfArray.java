package ArraysQuestions;

import java.util.Arrays;

public class Program5_NegativeAndPositiveNumbersOfArray {
    /*
        Move all negative numbers to beginning and positive to end with constant extra space
        Examples :
        Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
        Output: -12 -13 -5 -7 -3 -6 11 6 5
     */

    public static void main(String[] args) {
        int []arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        System.out.println(Arrays.toString(sortNegativeAndPositive(arr)));

    }

    private static int[] sortNegativeAndPositive(int[] arr) {
       int j =0, temp;
       for (int i =0; i<arr.length;i++){
           if(arr[i]<0){
               if (i!=j){
                   temp = arr[i];
                   arr[i]= arr[j];
                   arr[j]=temp;
               }
               j++;
           }

       }
        return arr;
    }
}

