package Level1;

public class Tricky {

    public static  void main(String args[]){

        int x=100;
        int y=200;

        boolean temp= ++x > --y && ++x <y++;

        System.out.println(x);
        System.out.println(y);

    }



}
