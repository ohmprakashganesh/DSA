package Level2_String_Solution;

public class RotationOfEachOther {
    //rotation for left to righ
    public  static  void check(String str, int rot){
        int l=str.length();

        char[] org= str.toCharArray();
        char[] mod= new char[l];
        int i=0;
        int x=rot;
        while ( x <l){
            System.out.println("prev"+i);
            mod[i++]=org[x++];
            System.out.println("after"+i);
        }
        int y=0;
        while (y <rot ){
            mod[i++]=org[y++];
        }
        System.out.println(mod);
    }
    public static void main(String[] args) {
        check("abcdefghijkl",3);
    }
}
