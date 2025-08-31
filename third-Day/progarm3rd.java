
// 3. Word Frequency Counter (Map + Set)
// Accept a paragraph from the user and count the frequency of each word (ignore case).

// Use Map<String, Integer> to store word-frequency.

// Use a Set to store and print unique words only.
import java.util.*;

public class progarm3rd {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println(" Enter the Paragraph user something you Write and we Count the per one each world");

        String paragraph = cin.nextLine();// java is the programing languge and is java handle the File and we save java
                                          // file in the Stoarage.

        String wordStore[] = paragraph.toLowerCase().split("\\W+");
        HashMap<String, Integer> Hs = new HashMap<>();

        Set<String> st = new HashSet<String>();
        for (String str : wordStore) {

            Hs.put(str, Hs.getOrDefault(str, 0) + 1);
            st.add(str);
        }

        System.out.println(" Show the aLL the String and Intger: \n");
        for (Map.Entry<String, Integer> M : Hs.entrySet()) {

            System.out.println(M.getValue() + " " + M.getKey());

        }

    }

}
