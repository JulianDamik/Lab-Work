// Lizzy's Dragon
import java.util.Scanner; 
//start class
class LizzysDragon{
   private int numFeet;
   private int numWings;
   private String color;
   private int health;
   private int hits;
   
   public LizzysDragon(){
	   numFeet = 4;
	   numWings = 2;
	   color = "orange";
   }
   
   public LizzysDragon(int f, int w, String c, int h, int hi){
      numFeet = f;
	   numWings = w;
	   color = c;
	   health = h;
	   hits = hi;
   }
   
   public LizzysDragon(int w, String c){
	   numWings = w;
	   color = c;
   }
   
   public void changeHits(int hi){
	   hits = hi;
   }
   
   public int healthDamage(int h, int hi) {
	   health = h;
	   hits = hi;
	   int i;
	
	   for(i = 1; i <= hits; i++){
		   health = health - 5;
	   }
	
	   return health;
   }
   
   public void changeFeet(int f){
	   numFeet = f;
   }
   
   public void changeWings(int w){
	   numWings = w;
   }
   
   public void changeColor(String c){
	   color = c;
	}
   
	public int getFeet(){
	   return numFeet ;
	}
   
	public int getWings(){
		return numWings;
	}
   
	public String getColor(){
	   return color;
	}
   
	public int getHealth(){
		return health;
	}
   
	public int getHits(){
		return hits;
	}

	public String toString(){
	   return "Feet: "+ numFeet + "\nWings: " + numWings + "\nColor: "
	   + color + "\nNumber of times hit: " + hits + "Health after hits: " + health;
	}
}// end of class