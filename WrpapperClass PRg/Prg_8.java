// Q8. WAP to input string and incrypt like as?
// Example: abcmno
// Output: a2b2c2m1n1c1

public class Prg_8 {
    public static void main(String[] args) {
        String name = "abcmno";

        char ch[] = name.toCharArray();

        int l = ch.length * 2;
        char ch1[] = new char[l];

        for (int i = 0; i < ch.length; i++) {
            ch1[i * 2] = ch[i];
            if (i < 3) {

                ch1[i * 2 + 1] = '2';
            } else {
                ch1[i * 2 + 1] = '1';
            }
        }
        for (char c : ch1) {
            System.out.print(c);
        }

    }

}
