package Level3_Arrays_solution;

import java.util.HashMap;
import java.util.Map;

public class Count_even_odd {
    public  static Map<String, Integer>  check(int []arr){
        int len= arr.length-1;
        int i=0;
        int even=0;
        int odd=0;
        Map<String, Integer> map= new HashMap<>();
        while(i<=len){
            if(arr[i]%2==0){
                map.put("even",++even);
            }else{
                map.put("odd", ++odd);
            }

            i++;
        }
        return  map;
    }

    public static void main(String[] args) {
        int arr[]={4,3,6,44,56,3};

        Map<String, Integer> map= check(arr);
        for (Map.Entry<String, Integer> temp : map.entrySet()) {
            System.out.println(temp.getKey() + " => " + temp.getValue());
        }
    }
}
