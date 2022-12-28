package com.masai.DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextGreaterOdd {
    public static void main(String[] args) {
        int arr[] = {5,3,7,2,9};
        System.out.println(findNextGreaterOdd(arr));
    }

    public static int findNextGreaterOdd(int [] arr){
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            if(list.size() > 0){
                Collections.sort(list);
                while(list.size() > 0 && arr[i] > list.get(0)){
                    if(arr[i] % 2 == 0){//even
                        list.remove(0);
                    }
                    else{
                        sum+=list.remove(0);
                    }
                }
            }
            list.add(arr[i]);
        }
        return sum;
    }
}
