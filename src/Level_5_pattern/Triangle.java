package Level_5_pattern;

public class Triangle {
    public static void main(String[] args) {
//        execute 4 times
        for(int i=1; i<5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
