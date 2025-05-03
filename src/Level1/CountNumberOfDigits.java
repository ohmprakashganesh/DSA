package Level1;
//count the number of digit in a number
public class CountNumberOfDigits {
    public static  int count(int n){
        int sum=0;
        if(n/10==0) return 0;
        while (n !=0){
            sum++;
            n/=10;
        }
        return  sum;
    }
    public  static  void  main(String args[]){
        int num=4534;
        int numOfDigit= CountNumberOfDigits.count(num);
        System.out.println(numOfDigit);
    }
}
