package Level_5_pattern;

public class Reverse_triangle {
    public static void main(String[] args) {
        for(int i=5; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
