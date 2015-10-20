public class TestThing {
   public static void main(String[] args) {
  int max = 2;
  
  for (int line = 1; line <= max; line++){
   for (int m = 0; m <= (max-line); m++){
      System.out.print(" ");
   }
   for ( int s = 1; s <= line*2-1; s++){
      System.out.print("*");
   }
   System.out.println();
   }
  }
 }