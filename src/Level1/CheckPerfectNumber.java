package Level1;
//the number whose sum of divisor are equal to the number
public class CheckPerfectNumber {

    public static int check(int n){
        int sum=0;
        for(int i=1; i<n; i++){
            if(n % i == 0){
                sum+=i;
            }
        }
        return sum;
    }


    public static void main(String args[]){
     int n=18;
       int num= CheckPerfectNumber.check(n);
       if(num==n){
           System.out.println("perfect number");
       }else{
           System.out.println("not a perfect number"+" "+ n);
       }





    }
}
