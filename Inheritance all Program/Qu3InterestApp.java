// 3. WAP using  inheritance with a simple Interest Rate Formula for calculate the interest on 
// loan we have the following class hierarchy and conditions given below 

import java.util.Scanner;

class Interest {

    public int pamt, irate, dur;

    public void setPRD(int pamt, int irate, int dur) {
        this.pamt = pamt;
        this.irate = irate;
        this.dur = dur;


    }
    public void callnterest() {
        int intrest = 0;
        intrest = (pamt * irate * dur) / 100;
        System.out.println("Interest of: " + intrest);
    }

}

class CalculateInterest extends Interest {
   

}


public class Qu3InterestApp {

    public static void main(String[] args) {
        int pmd, irate, dur;

        Scanner cin = new Scanner(System.in);
        System.out.println(" Enter the Amount : ");
        pmd = cin.nextInt();
        System.out.println(pmd);
        System.out.println("Enter the rate");
        irate = cin.nextInt();
        System.out.println(irate);
        System.out.println("Enter the duration ");
        dur = cin.nextInt();
        System.out.println(dur);

        CalculateInterest c = new CalculateInterest();
        c.setPRD(pmd, irate, dur);
        c.callnterest();
        cin.close();
    }
}
