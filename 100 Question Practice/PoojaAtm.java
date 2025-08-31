// Problem
// Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US.
// Calculate Pooja's account balance after an attempted transaction.
// Input
// Positive integer 0 < X <= 2000 - the amount of cash which Pooja wishes to withdraw.
// Nonnegative number 0<= Y <= 2000 with two digits of precision - Pooja's initial account balance.
// Output
// Output the account balance after the attempted transaction, given as a number with two digits of precision. If there is not enough money in the account to complete the transaction, output the current bank balance.
// Example - Successful Transaction
// Input:
// 30 120.00
// Output:
// 89.50
// Example - Incorrect Withdrawal Amount (not multiple of 5)
// Input:
// 42 120.00
// Output:
// 120.00
// Example - Insufficient Funds
// Input:
// 300 120.00
// Output:
// 120.00

// import java.util.Scanner;

// public class PoojaAtm {
//     public static void main(String[] args) {
//         double Balence = 0, withdraw, Credit;

//         System.out.println("Enter the Bank credit amount: ");

//         Scanner cin = new Scanner(System.in);
//         // System.out.println("Enter the ");
//         Credit = cin.nextDouble();

//         Balence += Credit;

//         System.out.println("Enter the withdraw Amout: ");

//         withdraw = cin.nextDouble();
//         if (withdraw % 5 == 0) {
//             double bb = Balence;
//             Balence -= withdraw;
//             Balence -= 0.50;
//             System.out.println("  Successful Transaction: Withdraw befor balence is" + bb + " and withdraw Money is +"
//                     + withdraw + "Current Balence is" + Balence);

//         } else if (withdraw % 5 == 1) {
//             System.out.println(
//                     " Incorrect Withdrawal Amount (not multiple of 5)" + withdraw + "Current Balence is" + Balence);

//         } else if (withdraw > Balence) {
//             System.out.println("Insufficient Balence: " + " Incorrect Withdrawal Amount " + withdraw
//                     + "Current Balence is" + Balence);
//         }

//     }

// }

import java.util.Scanner;

public class PoojaAtm {
    public static void main(String[] args) {
        double balance, withdraw, credit;

        // Initial input from user
        System.out.println("Enter the Bank credit amount: ");
        Scanner cin = new Scanner(System.in);
        credit = cin.nextDouble(); // Pooja's initial balance
        balance = credit;

        System.out.println("Enter the withdraw amount: ");
        withdraw = cin.nextDouble(); // Withdrawal amount

        // Check if withdrawal amount is a multiple of 5
        if (withdraw % 5 == 0) {
            // Check if balance is enough for withdrawal and bank charge (0.50)
            if (withdraw + 0.50 <= balance) {
                // Deduct the amount and bank fee
                balance -= withdraw;
                balance -= 0.50;
                System.out.printf("Successful Transaction: Withdrawn %.2f, Current Balance: %.2f\n", withdraw, balance);
            } else {
                // Not enough balance to complete the transaction
                System.out.printf(
                        "Insufficient Funds: Withdrawal amount %.2f exceeds available balance. Current Balance: %.2f\n",
                        withdraw, balance);
            }
        } else {
            // Withdrawal amount is not a multiple of 5
            System.out.printf("Incorrect Withdrawal Amount (not multiple of 5): Current Balance: %.2f\n", balance);
        }

        cin.close();
    }
}
