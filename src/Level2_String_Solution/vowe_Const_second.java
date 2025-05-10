package Level2_String_Solution;

public class vowe_Const_second {
    public  static  void arr(String str){
        int l= str.length()-1;
        int vow=0;
        int con=0;

        while (l >=0){
            char c=str.charAt(l);
            if("aeiou".indexOf(c)!=-1){
                vow++;
            }else{
                con++;
            }
            l--;
        }
        System.out.println("vowel"+vow);
        System.out.println("vowel"+con);

    }

    public static void main(String[] args) {
        arr("abecijoku");
    }
}
