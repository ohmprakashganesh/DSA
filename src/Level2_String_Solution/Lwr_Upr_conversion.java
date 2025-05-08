package Level2_String_Solution;
//convert lowercase to upper and upper case to lower 
public class Lwr_Upr_conversion {
    public  static void check(String arg){
        char[] ch= arg.toCharArray();
        int n=ch.length-1;
        while (n >=0){

            //convert ot lowercase
            if(ch[n] >='A' && ch[n]<='Z'){
                int x=(int) ch[n];
                int converse=x+32;
                ch[n]=(char)converse;
            }
            //convert to uppercase
            else if(ch[n] >='a' && ch[n]<='z'){
                int x=(int) ch[n];
                int converse=x-32;
                ch[n]=(char)converse;
            }
            n--;
        }
        System.out.println(new String(ch));
    }

    public static void main(String[] args) {
        check("KHALIDONhello");
    }
}
