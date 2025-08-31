public class Alphabet {

    public static void main(String[] args) {
        char a;
        int i = 'a';
        System.out.print("Show the A To Z all Alphabet: \n");
        while (i <= 'z') {

            System.out.print((char) (i - 32) + " ");
            i++;
        }

    }
}
