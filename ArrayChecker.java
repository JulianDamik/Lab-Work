public class ArrayChecker {
   
   public ArrayChecker(int [][] array){
      int [][] arraynums = new int 
   }
   
   public int arrayInstance (int [][] array){
      int numElements = 0;
      
      for(int rows = 0; row < array.length; row++){
         for(int col = 0; col < array[row].length; col++){
            numElements++;
         }
      }
      return numElements;
   }
      
   public int arrayDivisor(int divisor){
      
      int numDivided = 0;
      
      for(int rows = 0; row < array.length; row++){
         for(int col = 0; col < array[row].length; col++){
            if(array[row][col] % divisor == 0){
               numDivided++;
            }
         }
      }
   } 
   
}

