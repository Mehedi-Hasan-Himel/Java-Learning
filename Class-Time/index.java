import java.util.Scanner;


class HelloWorld {
   public static void main(String args[]) {

      Scanner myScanner = new Scanner(System.in);
      System.out.print("Please enter any integer number:");

      int inputData = myScanner.nextInt();

      // int inputData = 101;
      if (inputData % 2 == 0) {
         System.out.println("This Number " + inputData + " is Even");

      } else {
         System.out.println("This Number " + inputData + " is Odd");

      }

   }

}
