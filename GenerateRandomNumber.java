// this code provide by Ankit KUmar GUpta
import java.util.*;

class GenerateRandomNumber {
   public static void main(String[] args) {
      int counter;
      Random rnum = new Random();
      /* 5 random number generate hoga
       * between 0 and 200.*/
      System.out.println("Random Numbers:");
      System.out.println("------------------");
      for (counter = 1; counter <= 5; counter++) {
         System.out.println(rnum.nextInt(200));
      }
   }
}