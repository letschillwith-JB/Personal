package com.masai.DSA;

public class MaxSumOfSubarray {
    public static void main(String[] args) {
        int arr[] = {-4,8,2,-5,7};
        int ans = printMaxSumOfSubarray(arr);
        System.out.println(ans);
    }
    static int printMaxSumOfSubarray(int arr[]){
        //by this algorith the Time Complexity will be O(N)

        int max_ending_here = arr[0];
        int max_so_far = arr[0];
        for(int i=1; i<arr.length; i++){
            max_ending_here = Math.max( arr[i], max_ending_here + arr[i] );
            max_so_far = Math.max(max_ending_here,max_so_far);
        }return max_so_far;
    }
}
