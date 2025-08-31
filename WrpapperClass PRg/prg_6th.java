// Q6. WAP to input string and input second string and search second string in first input string using
// indexOf() method?
// Example: First String: Good Morning India
//  Second string: Morning

public class prg_6th {
    public static void main(String[] args) {

        String str = "Good Morning India";
        int n = str.indexOf("Morning");
        if (n != -1) {
            System.out.println("Found the index in String " + n);

        } else {
            System.out.println(" is not found the index " + n);
        }
        System.out.println();
    }
}
