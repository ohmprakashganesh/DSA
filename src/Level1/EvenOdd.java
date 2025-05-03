package Level1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class EvenOdd {
    public Map<String, Stack<Integer>> compute(int[] arr) {
        Stack<Integer> odd = new Stack<>();
        Stack<Integer> even = new Stack<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                even.push(num);
            } else {
                odd.push(num);
            }
        }
     Map<String,Stack<Integer>> map=new HashMap<>();
       map.put("odd", odd);
       map.put("even", even);

        return map;
    }


    public static void main(String args[]){
        EvenOdd obj= new EvenOdd();
        int[] arr={3,5,44,3,5,4,22,44,3,55};
       Map<String ,Stack<Integer>> map= obj.compute(arr);
       for(Map.Entry<String ,Stack<Integer>>temp: map.entrySet()){
           Stack<Integer> odds=temp.getValue();
           System.out.print(temp.getKey());
           while(!odds.isEmpty()){
               System.out.print(odds.pop());
           }
           System.out.println();


       }

    }

}

