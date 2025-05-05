package Level1;

public class GCD_hcf {
    public  static  int gcd(int a, int b){
          while(b !=0){
           int temp= a%b;
              a=b;
              b=temp;
          }
            return  a;
    }


    public  static  void main(String args[]){
        //for single
//        System.out.println(gcd(2, 10));


        //for multiple
        int[] arr= {5,55,100,200,5};
        int result=arr[0];
        for(int i=1; i<arr.length; i++){
           result= gcd(result,arr[i] );
        }
        System.out.println("final out HCF is  " +result);
    }

}
