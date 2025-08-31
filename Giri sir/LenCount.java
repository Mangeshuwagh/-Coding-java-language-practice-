class count {

    private char ch[];
    private int length;

    count(char ch[]) {
        this.ch = ch;

    }

    public int GetLen() {
        for (int i = 0; i < ch.length; i++) {
            length++;
        }
        return length;
    }
}

public class LenCount {

    public static void main(String[] args) {
        char ch[] = { 'h', 'e', 'l', 'l', 'o', 'm', 'a', 'n', 'g', 'e', 's', 'h' };

        count c = new count(ch);
        int r = c.GetLen();
        System.out.println("Total length of charaters : " + r);
    }

}
