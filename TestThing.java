public class TestThing {
   public static void main(String[] args) {
   for (int i = 5; i >= 0; i--){
      for (int s = 1; s < 1; s++){
      System.out.print(" ");
      }
      for (int j = 5; j>= i; j--){
      System.out.print("*");
      }
      System.out.println("");
    }
  }
}