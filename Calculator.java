import java.util.Scanner;

class Calculator {
  public static void main(String args[]) {
    String yn;
    do {
      Scanner s = new Scanner(System.in);
      System.out.println("first number : ");
      int no1 = s.nextInt();
      System.out.println("second number : ");
      int no2 = s.nextInt();
      System.out.println("enter symbol (+,-,*,/) : ");
      String sym = s.next();
      int res;
      switch (sym) {
        case "+":
          res = no1 + no2;
          System.out.println("addition number : " + res);
          break;
        case "-":
          res = no1 - no2;
          System.out.println("subtract number : " + res);
          break;
        case "*":
          res = no1 * no2;
          System.out.println("multiple number : " + res);
          break;
        case "/":
          res = no1 / no2;
          System.out.println("devide number : " + res);
          break;
      }
      System.out.println(" do you want to continue (press y for yes and n for no)");
      yn = s.next();
    } while (yn.equals("y") || yn.equals("Y"));

  }
}
