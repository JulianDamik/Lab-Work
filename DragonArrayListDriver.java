import java.util.Scanner;
import java.util.ArrayList;
public class DragonArrayListDriver {
	
	public static void main(String[] args) {
		   Scanner scnr = new Scanner(System.in);
		   ArrayList<DragonAL> dragonList = new ArrayList<DragonAL>();
		   
		   int wings = 0;
		   String color = "";
		   String type = "";
		   int health = 0;
		   int age = 0;
		   
		   char cont = ' ';
		   
		   System.out.println("Do you want to build a dragon? (y or n)");
		   cont = scnr.next().charAt(0);
		   
		   while(cont == 'y'){
			   System.out.print("Enter number of wings: ");
			   wings = scnr.nextInt();
			   
			   System.out.print("Enter color: ");
			   color = scnr.next();
			   
			   System.out.print("Enter type: ");
			   type = scnr.next();
			   
			   System.out.print("Enter amount of health: ");
			   health = scnr.nextInt();
			   
			   System.out.print("Enter age: ");
			   age = scnr.nextInt();
			   
			   DragonAL dragon = new DragonAL();
			   dragonList.add(new DragonAL(wings, color, type, health, age));
			   
			   System.out.println("Do you want to make another dragon? (y or n)");
			   cont = scnr.next().charAt(0);
		   }
		   
		   for(int i = 0; i < dragonList.size(); i++){
			   System.out.println("Dragon" + (i + 1));
			   System.out.println(dragonList.get(i));
		   }
		   
	}	   
}
