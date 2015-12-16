public class Dragon {
	private int wings;
	private String color;
	private String type;
	private int age;
	private DragonAbilities dragonAbilities;
	
	public Dragon(){
		wings = 0;
		color = "";
		type = "";
		age = 0;
	}
	public Dragon(int wi, String col, String ty, int ag){
		wings = wi;
		color = col;
		type = ty;
		age = ag;
	}
	public int getNumWings(){
		return wings;
	}
	public String getColor(){
		return color;
	}
	public String getType(){
		return type;
	}
	public int getAge(){
		return age;
	}
	public void setNumWings(int wi){
		wings = wi;
	}
	public void setColor(String col){
		color = col;
	}
	public void setType(String ty){
		type = ty;
	}
   public void setAge(int ag){
      age = ag;
      }
	public void setAbilities(DragonAbilities abilities){
		dragonAbilities = abilities;
	}
	public DragonAbilities getAbilities(){
		return dragonAbilities;
	}
	public String toString(){
      return "Wings: " + wings + "\nColor: " + color + "\nType: " + type + "\nAge: " + age + "\nAbilities: " + dragonAbilities;
      }
   }