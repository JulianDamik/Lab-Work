public class RocketObject {

   private int rocketSize;

   public RocketObject(int rockSize){
      rocketSize = rockSize;
      for (int line = 1; line <= rocketSize*2-1; line++){ // cone/bottom
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
         for(int line = 1;line <= rocketSize; line++){ // body part 1/4
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
          for(int line = 1;line <= rocketSize; line++){ // body part 2/3
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
         for(int line = 1;line <= rocketSize; line++){ // body part 2/3
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
         for(int line = 1;line <= rocketSize; line++){ // body part 1/4
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
        for (int line = 1; line <= rocketSize*2-1; line++){ // cone/bottom
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

  