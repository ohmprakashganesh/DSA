package Level1_1;

//repeatdly sum number until you get 1
//192   1+9+2=12   1+2=3  not magic



public class Magic_number {
    public static boolean checkMagic(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        if (sum > 9) {
            return checkMagic(sum); // Return the recursive result
        } else {
            return sum == 1; // Only return true if the final digit is 1
        }
    }

    public static void main(String[] args) {
        System.out.println(checkMagic(10)); // true
        System.out.println(checkMagic(192));  // false
        System.out.println(checkMagic(1));    // true
    }
}





