package ArraysQuestions;

public class Program8_MaxSumSubArray {
    /*
        Given an array Arr[] of N integers.
        Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
        Example 1:

        Input:
        N = 5
        Arr[] = {1,2,3,-2,5}
        Output:
        9
        Explanation:
        Max subarray sum is 9
        of elements (1, 2, 3, -2, 5) which
        is a contiguous subarray.
     */

    public static void main(String[] args) {
        int []arr = {1,2,3,-2,5};
        System.out.println(maxSum(arr));

        int []arr1 = {-1,-2,-3,-4};
        System.out.println(maxSubarraySum(arr1, 4));

        int []arr2 = {1,2,3,-2,5};
        System.out.println(maxSubarraySum(arr2,5));

    }

    private static int maxSum(int[] arr) {
        int maxSum =0;
        int sum =0;
        for(int i =0; i<arr.length;i++){

            if(sum<0) {
                sum = arr[i];
            }else {
                sum = sum +arr[i];
            }
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }

    static long maxSubarraySum(int arr[], int n){
        int max = Integer.MIN_VALUE;
        int sum=0;

        for(int a:arr){

            sum+=a;
            max =Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }

        return max;
    }
}
