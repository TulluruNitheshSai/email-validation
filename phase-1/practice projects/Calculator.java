package source;

import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
      int num1;
      int num2;
      int ans;
      char op;
      Scanner s = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      num1 = s.nextInt();
      num2 = s.nextInt();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      op = s.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
      default: System.out.printf("Error! Enter correct operator");
         return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}


