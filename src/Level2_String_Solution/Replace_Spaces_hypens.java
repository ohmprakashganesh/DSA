package Level2_String_Solution;

public class Replace_Spaces_hypens {
    public  static  void check(String str){
        int len= str.length()-1;
        char[] ch=str.toCharArray();
        String temp="";

        while (len>=0){
            char c=ch[len];
            if ( ch[len]!='-' && ch[len]!='+'){
                temp+=c;
            }
            len--;
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        check("hello+raja+");
    }
}
