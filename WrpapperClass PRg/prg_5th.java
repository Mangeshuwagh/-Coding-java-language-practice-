// Q5. WAP to input string and count the words from a string using split() method?

public class prg_5th {

    public static void main(String[] args) {

        String sentence = "Mangesh You can carry    on     the     your hard working";
        String str[] = sentence.trim().split("\\s+");
        System.out.println(str.length);
    }
}
