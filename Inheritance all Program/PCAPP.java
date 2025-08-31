class P {
   P() {
      System.out.println("I am parent constructor");
   }
}

class C extends P {
   C() {
      System.out.println("I am child constructor");
   }
}

public class PCAPP {
   public static void main(String x[]) {
      C c1 = new C();
   }
}
