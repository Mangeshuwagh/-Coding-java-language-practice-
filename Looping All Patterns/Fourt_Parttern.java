/*
    * * * * * *
    * * * * *
    * * * * 
    * * * 
    * *
    *
 */

public class Fourt_Parttern {

    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j <= 6 - i + 1) {// 1<=6-1+1// 1<=6:    * * * * * *
                                        // 1<=6-2+1// 1<=5: * * * * *
                                        // 1<=6-3+1// 1<=4: * * * * 
                    System.out.print(" *");
                } else {
                    System.out.print(" ");
                }

            }
            System.err.println();
        }
    }
}