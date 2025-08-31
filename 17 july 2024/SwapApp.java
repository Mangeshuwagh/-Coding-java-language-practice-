import java.util.Scanner;
// import java.util.Scannerr;
// import java.lang.Math;

class SwapDigit {
  int no1;

  void SetValue(int n) {
    no1 = n;
  }

  int getNumberSwap() {
    int temp = no1;
    int count = 0;
    while (temp != 0) {
      temp /= 10;
      count++;
    }

    int last;
    int first;
    last = no1 % 10;
    int Result = 0;
    Result = (int) Math.pow(10, count - 1);

    first = no1 / Result;
    int tempp = first;
    no1 = no1 - last;
    first = first * Result;
    no1 = no1 - first;
    last = last * Result;
    no1 = last + no1 + tempp;
    return no1;
  }
}

class SwapApp {

  public static void main(String[] args) {

    int number;
    Scanner cin = new Scanner(System.in);
    System.out.println("Enter the number:\n");
    number = cin.nextInt();
    SwapDigit s = new SwapDigit();
    s.SetValue(number);
    System.out.println("After Swaping number: \t " + s.getNumberSwap());

  }
}