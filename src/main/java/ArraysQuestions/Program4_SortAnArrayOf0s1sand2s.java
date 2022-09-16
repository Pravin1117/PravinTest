package ArraysQuestions;

import java.util.Arrays;

public class Program4_SortAnArrayOf0s1sand2s {
    /*
    Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
        Example 1:

        Input:
        N = 5
        arr[]= {0 2 1 2 0}
        Output:
        0 0 1 2 2
        Explanation:
        0s 1s and 2s are segregated
        into ascending order.
     */
    public static void main(String[] args) {
        int []arr = {0, 2, 1, 2, 0, 1};

        System.out.println(Arrays.toString(repositioningOfArray(arr)));
    }

    private static int[] repositioningOfArray(int[] arr) {
        int zeroCount = 0, oneCount = 0,twoCount;
        //int []sortedArray = new int[arr.length];
        for (int i =0; i<arr.length;i++){
            if(arr[i] == 0){
                zeroCount++;
            }

            if(arr[i] ==1){
                oneCount++;
            }
        }

        for(int i = 0; i<zeroCount;i++){
            arr[i]=0;
        }

        for (int i= zeroCount; i<zeroCount+oneCount;i++){
            arr[i]=1;
        }

        for (int i = zeroCount+oneCount; i <arr.length;i++){
            arr[i]=2;
        }

        return arr;
    }
}
