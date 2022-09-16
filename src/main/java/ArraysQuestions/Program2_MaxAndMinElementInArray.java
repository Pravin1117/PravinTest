package ArraysQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program2_MaxAndMinElementInArray {
    /*
    Maximum and minimum of an array using minimum number of comparisons
     */

    public static void main(String[] args) {
        int []arr = {10,20,30,50,25,35};

        minAndMaxFunction(arr);

    }

    private static void minAndMaxFunction(int[] arr) {
        //Method 1 : using sort method
        int min, max;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(min = arr[0]);
        System.out.println(max = arr[arr.length-1]);


        //Method 2 Comparing each element in array.
        min = arr[0];
        max = arr[0];
        for (int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }

            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
