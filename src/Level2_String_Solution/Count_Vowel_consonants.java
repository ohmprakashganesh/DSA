package Level2_String_Solution;

public class Count_Vowel_consonants {
    public  static  int[] check(String st){
        String str=st.replaceAll("[\\s\\d]","");
        System.out.println(str);
         char[] arr= st.toCharArray();
         int len= arr.length-1;
         int count=0;
         int count2=0;

         while (len >=0){
             char ch=arr[len];
             if(Character.isLetter(ch)) {


                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                         ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                     count++;

                 } else {
                     count2++;

                 }
             }
             len--;
         }
         int[] array= {count, count2};
         return array;
    }

    public static void main(String[] args) {
        int[] arr=check("ramdomgirlintehcity kall54u maharaj");
        System.out.println("vowels"+ arr[0]);
        System.out.println("const"+ arr[1]);

    }
}
