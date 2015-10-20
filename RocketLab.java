import java.util.Scanner;

public class RocketLab {
   public static void main(String[] args) {
   Scanner scnr = new Scanner(System.in);

   int rocketSize = 0;
   
   System.out.print("Enter Rocket Size: ");
   rocketSize = scnr.nextInt();
   
   for (int line = 1; line <= rocketSize*2-1; line++){ // cone
        for (int space = rocketSize*2-line; space >= 1; space--){
            System.out.print(" ");
            }
        for (int fSlash = line; fSlash >= 1; fSlash--){
            System.out.print("/");
            }
        System.out.print("**");
        for (int bSlash = line; bSlash >= 1; bSlash --){
         System.out.print("\\");
            }
         System.out.println("");
         }
    for (int line = 1; line > 0; line--){ // seperator
         System.out.print("+");
         for (int symbol = rocketSize * 2; symbol >=1; symbol--){
            System.out.print("=*");
            }
         System.out.println("+");
         }
    for(int line = 1;line <= rocketSize; line++){ // body part 1
         System.out.print("|");
         for (int dot = rocketSize - line; dot >= 1; dot--){
               System.out.print(".");
               }
         for (int upCone = line; upCone >= 1; upCone--){
               System.out.print("/\\");
               }
         for (int dot = rocketSize - line; dot >= 1; dot--){
               System.out.print("..");
               }
         for (int upCone = line; upCone>= 1; upCone--){
               System.out.print("/\\");
               }
         for (int dot = rocketSize - line; dot >= 1; dot--){
               System.out.print(".");
               }
          System.out.println("|");
         }
         for(int line = 1;line <= rocketSize; line++){ // body part 2
               System.out.print("|");
               for (int dot = line - 1; dot >= 1; dot--){
                  System.out.print(".");
                  }
               for (int downCone = (rocketSize + 1)-line; downCone >=1; downCone--){
                  System.out.print("\\/");
                  }
               for (int dot = line - 1; dot >= 1; dot--){
                  System.out.print("..");
                  }
               for (int downCone = (rocketSize + 1)-line; downCone >=1; downCone--){
                  System.out.print("\\/");
                  }
               for (int dot = line - 1; dot >= 1; dot--){
                  System.out.print(".");
                  }
               System.out.println("|");
            }
         for (int line = 1; line > 0; line--){ // seperator
            System.out.print("+");
            for (int symbol = rocketSize * 2; symbol >=1; symbol--){
               System.out.print("=*");
            }
            System.out.println("+");
         }
         for (int line = 1; line <= rocketSize; line++){ //body part 3 
              System.out.print("|");
              for (int dot = line - 1; dot >= 1; dot--){
                  System.out.print(".");
                  }
              for (int upCone = (rocketSize + 1)-line; upCone >= 1; upCone--){
                  System.out.print("\\/");
               }
              for (int dot = line - 1; dot >= 1; dot--){
                  System.out.print("..");
                  }
              for (int upCone = (rocketSize + 1)-line; upCone >= 1; upCone--){
                  System.out.print("\\/");
               }
              for (int dot = line - 1; dot >= 1; dot--){
                  System.out.print(".");
                  }
              System.out.println("|");
              }
          for(int line = 1;line <= rocketSize; line++){ // body part 4
              System.out.print("|");
              for (int dot = rocketSize - line; dot >= 1; dot--){
                  System.out.print(".");
               }
              for (int upCone = line; upCone >= 1; upCone--){
                  System.out.print("/\\");
               }
              for (int dot = rocketSize - line; dot >= 1; dot--){
                  System.out.print("..");
               }
              for (int upCone = line; upCone>= 1; upCone--){
                  System.out.print("/\\");
               }
              for (int dot = rocketSize - line; dot >= 1; dot--){
                  System.out.print(".");
               }
              System.out.println("|");
             }
         for (int line = 1; line > 0; line--){ // seperator
              System.out.print("+");
              for (int symbol = rocketSize * 2; symbol >=1; symbol--){
                  System.out.print("=*");
            }
            System.out.println("+");
         }

        for (int line = 1; line <= rocketSize*2-1; line++){ // cone
            for (int space = rocketSize*2-line; space >= 1; space--){
                 System.out.print(" ");
            }
            for (int fSlash = line; fSlash >= 1; fSlash--){
                 System.out.print("/");
            }
            System.out.print("**");
            for (int bSlash = line; bSlash >= 1; bSlash --){
                 System.out.print("\\");
            }
            System.out.println("");
         }


         }
       }
      