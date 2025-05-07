package Level1_1;

public class Sum_of_prime_number_up2N {

    public  static  boolean checkPrime(int n){
        if(n<=1)  return false;

       for(int i=2; i<=Math.sqrt(n); i++){
           if(n%i == 0) {
               return false;
           }
       }
       return true;

    }
    public  static  int sumOfPrime(int n){
         int sum=0;
        while (n!=0){
         boolean temp= checkPrime(n);
         if(temp){
             System.out.println(n);
             sum+=n;
         }
            n--;
        }
        return  sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfPrime(10));
    }
}
