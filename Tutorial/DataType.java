package Tutorial;
public class DataType {
   public static void main(String[] args) {
      boolean b = true;
      char c = 'a';
      short s = 32677;
      int i = 126587;
      float f = 10.2f;
      double d = 10.2;

      // println() Start

      // System.out.println("b = " + b);

      // System.out.println("c = " + c);

      // System.out.println("s = " + s);

      // System.out.println("i = " + i);

      // System.out.println("f = " + f);

      // System.out.println("d = " + d);

      // println() End

      // printf() Start

      System.out.printf(" boolean b = %b\n" , b);

      System.out.printf(" character c = %c\n" , c);

      System.out.printf(" Short c = %d\n" , s);

      System.out.printf(" Integer i = %d\n" , i);

      System.out.printf(" Float f = %.2f\n" , f);

      System.out.printf(" Double d = %.3f\n" , d);

      // printf() End

   }
}
