package Level1;

public class lcm {
    public static  int lcm(int a, int b){
        int x=a*b;
        return  x/hcf(a,b);
    }
    public static  int hcf(int a , int b){
            while(b!=0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
        return a;
    }
    public  static  void main(String args[]){
        Integer out=lcm.lcm(44 , 33);
        System.out.println( "the final output is here of lcm  "+out);
    }
}
