import java.util.Scanner;

public class DragonDriver {
	public static void main(String[] args) {
		   Scanner scnr = new Scanner(System.in);
		   
		   int wings = 0;
		   String color = "";
		   String type = "";
		   int age = 0;
		   
		   char flight = ' ';
		   char breathAttack = ' ';
		   char physicalAttack = ' ';
		   
         
         int i = 0;
         System.out.println("Enter amount of dragons.");
         i = scnr.nextInt();
		   
         Dragon[] dragonArray = new Dragon[i];
         
         for(int j = 0; j < i; j++){
            dragonArray[j] = new Dragon();

            System.out.println();
            System.out.println("Dragon" + (j + 1));
            System.out.println("Enter number of wings: ");
		      wings = scnr.nextInt();
		   
		      System.out.println("Enter color: ");
		      color = scnr.next();
		   
		      System.out.println("Enter type: ");
		      type = scnr.next();
		   
		      System.out.println("Enter age: ");
		      age = scnr.nextInt();
		   
		      System.out.println("Can the dragon fly? (Y or N) ");
		      flight = scnr.next().charAt(0);
		      System.out.println("Does the dragon have a breath attack? (Y or N) ");
		      breathAttack = scnr.next().charAt(0);
		      System.out.println("Can the dragon attack physically? (Y or N) (Use it's tail or claws to attack) ");
		      physicalAttack = scnr.next().charAt(0);
		      System.out.println();

            dragonArray[j].setNumWings(wings);
            dragonArray[j].setColor(color);
            dragonArray[j].setType(type);
            dragonArray[j].setAge(age);
            
            DragonAbilities abilities = new DragonAbilities(flight, breathAttack, physicalAttack);
            dragonArray[j].setAbilities(abilities);

            dragonArray[j].print();

          }
          
	}	   
}