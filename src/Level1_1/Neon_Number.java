package Level1_1;

//number whose square of number's sum of difit is equals to orignal number
//9 square = 81     8+1= 9
public class Neon_Number {
    public  static  boolean check(int n){
        int squared=n*n;
        int sum=0;
        while (squared!=0){
            sum+=squared%10;
            squared/=10;
        }
        return  sum==n;
    }
    public static  void  main(String args[]){
        int n=9;
        System.out.println("is it a Neon Number "+ check(n));
    }
}
