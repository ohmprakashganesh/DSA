package Level1_1;

public class disarium_Number {
    public static  boolean check(int num) {
          int x=num;
        int sum=0;
        int n= String.valueOf(num).length();
            while (num !=0 && n>0){
                int temp= x%10;
                sum+= Math.pow(temp,n);
                n=n-1;
                x=x/10;
            }

        return  num==sum;

    }




    public  static  void main(String args[]){
        System.out.println("is is disarium number? " + check(135));
    }
}
