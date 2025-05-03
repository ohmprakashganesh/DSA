package Level1;

import java.util.Arrays;

public class MaxMin {

      static  void find(int[] nums){
        int min=nums[0];
        int max=0;

        //first way
//        for (int i = 0; i < nums.length; i++) {
//                if( min > nums[i]){
//                    min= nums[i];
//                }else if(max < nums[i]){
//                    max=nums[i];
//                }
//        }

        //second way
        int maximum= Arrays.stream(nums).max().getAsInt();
        int minimum= Arrays.stream(nums).min().getAsInt();
          System.out.println("max is"+ max + "min is "+ min);
          System.out.println("max2 is" + maximum + "min2 is " + minimum);

          for(int num: nums){
              if(max < num){
                  max=num;
              }
              if(min > num){
                  min=num;
              }
          }
          System.out.println("maximum is "+max );
          System.out.println("minimum is "+min );
    }
    public static void main(String[] args) {
        MaxMin.find(new int[]{3,5,42,5,2,5,});

    }
}
