package Level1;


public class sumOfDigits {

    //using while loop
    int sumOfNums(int num){
        int sum=0;
        while (num!=0){
            int temp= num%10;
            sum+= temp;
            num=num/10;
        }
        return  sum;


    }


    //recursion
//    int sumOfNums(int num) {
//        if (num == 0) return 0;
//        return (num % 10) + sumOfNums(num / 10);
//    }

    public static void main(String arg[]){
        sumOfDigits obj= new sumOfDigits();
    double num=obj.sumOfNums(909);
        System.out.println(num);

    }
}
