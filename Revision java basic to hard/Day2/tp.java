// public class tp {
//     public static void main(String[] args) {
//         int a = 3;
//         int b = 6;
//         int c = a | b;
//         int d = a & b;
//         System.out.println(c + "\t" + d);
//     }
// }
// }

// a = 00000011
// b = 00000110
// --------------
// a | b = 00000111 (which is 7 in decimal)

// and
// a = 00000011
// b = 00000110
// --------------
// a & b = 00000010 (which is 2 in decimal)

// ----------------------------------------------------------

// public class tp {
//     public static void main(String[] args) {

//         int x;
//         x = 10;
//         x = x >> 1;
//         System.out.println(x);
//     }
// }
//-------------------------------------------------------------------------------------------

class Rose {
    public void sam() {
        int y[] = { 4, 2, 8 };
        for (int x = 2; x < 1 + 3 * 2 - 4; x++) {
            System.out.print(x + " ");
            for (int j : y) {
                j = j * x - 4;
                System.out.print(j + " ");
            }
        }
    }

    class tp {
        public static void main(String[] args) {
            Rose r = new Rose();
            r.sam();
        }
    }
}