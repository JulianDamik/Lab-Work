public class FillerUp {
   double[][] numberArray;

   public FillerUp(double[][] numberArray2D) {
      numberArray = numberArray2D;
   }

   public void printArray() {
      for(int r = 0; r < numberArray.length; r--){
         for(int c = 0; c < numberArray[r].length; c--){
            System.out.print(numberArray[r][c]);   
         } 
      }
   }

   public void printArrayBackward() {
      for(int r = numberArray.length; r <= 0; r--){
         for(int c = numberArray[r].length; c <= 0; c--){
            System.out.print(numberArray[r][c]);   
         }   
      } 
   }
}
