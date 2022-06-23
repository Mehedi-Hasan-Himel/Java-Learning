import java.util.Scanner;

public class gpa {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Your mark: ");
      int mark = sc.nextInt();

      // Class 8 , GPA result by mark-sheet number.

      if (mark >= 80) {
         System.out.println("A+");
      } else if (mark <= 79 && mark > 69) {
         System.out.println("A");
      } else if (mark <= 69 && mark > 59) {
         System.out.println("b");
      } else if (mark <= 59 && mark > 49) {
         System.out.println("c");
      } else if (mark <= 49 && mark >= 33) {
         System.out.println("d");
      } else {
         System.out.println("fail");
      }
      // Problem: 03 End;
   }
}
