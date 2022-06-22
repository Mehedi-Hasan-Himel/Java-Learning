package Tutorial;

import java.util.Scanner;

public class UserInput {

   public static void main(String[] args) {
      // Scanner input = new Scanner(System.in);

      Scanner input = new Scanner(System.in);

      // int number;
      // System.out.print("Enter any number : ");
      // number = input.nextInt();
      // System.out.println("Number = " +

      String name;
      System.out.print("Enter your name : ");
      name = input.nextLine();
      System.out.println("Name : " + name);

   }
}
