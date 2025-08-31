
// 9.WAP to create the class name as Seller with a following functions 
// class Seller 
// { 
//    void acceptSellingCostPrice(int sp,int cp) 
//    { //here we need to store the sp and sp values in instance variable 
//    } 
//    void showProfitLoss() 
//    { //here we need to write the logics for profit and loss 
//    } 
// } 
// class SellerApp{ 
//     public static void main(String x[]) 
//     {  //here we need to create the object of Scanner class  
//        //declare the two values sp and cp and store values in it using scanner 
//       //create the object of Seller class 
//       //call its acceptSellingCostPrice function and pass two values in it 
//       //call the showProfitLoss() function 
//     } 
// }
import java.util.Scanner;

class Seller {

    int sp, cp;

    void acceptSellingCostPrice(int sp, int cp) {
        this.sp = sp;
        this.cp = cp;

    }

    void showProfitLoss() {
        int result = 0;
        if (cp < sp) {
            result = sp - cp;
            System.out.println(" Profit : " + result);

        } else if (cp > sp) {
            result = cp - sp;
            System.out.println(" loss : " + result);
        }
    }
}

public class Question9 {

    public static void main(String[] args) {

        int sellPrice, costPrice;

        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the Cost price: ");
        costPrice = cin.nextInt();
        System.out.println("Enter the Selling price: \n");
        sellPrice = cin.nextInt();

        Seller s = new Seller();
        s.acceptSellingCostPrice(sellPrice, costPrice);
        s.showProfitLoss();
    }
}
