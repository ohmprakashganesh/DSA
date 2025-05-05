package Level1;

import java.util.Stack;

//number whose sum of digit power is equal to original number
public class Armstrong {
    public static  int numCheck(int num){
        int count=0;
        while(num !=0){
            count++;
           num=num/10;
        }
        return  count;
    }

    public  static int check(int num){
       int x=0;
//       int size=numCheck(num);
       int size=String.valueOf(num).length();
        while(num !=0){
          int j= num%10;
       x+=Math.pow(j,size);
            num/=10;
        }
        return  x;
    }
    public static  void main(String args[]){
        int num=153;
     int temp= check(num);
        if(num==temp){
            System.out.println("this is armstrong number");
        }else {
            System.out.println("this is not armstrong Number");
        }
    }
}
