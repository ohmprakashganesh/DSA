package Level1_1;

//number which is divisible by its sum of digits
public class Harshad_Number {
     public static int sum(int n){
         int sum=0;
         while (n!=0){
             int temp= n%10;
             sum=sum+temp;
             n=n/10;
         }
         return  sum;
     }
     public  static  void  main(String args[]){
          int num=sum(12);
           if(12%num==0){
               System.out.println("this is harshad number");
           }


     }
}
