package Level1_1;

public class Perfect_square_checker {
    public static void main(String[] args) {
        int num=34;

        int sqr=(int) Math.sqrt(num);
        if(sqr*sqr==num){
            System.out.println("this is perfect square number ");
        }else{
            System.out.println("not a perfect square number ");
        }

    }
}
