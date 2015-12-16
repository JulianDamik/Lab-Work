public class DragonAbilities {
	private char flight;
	private char breathAttack;
	private char physicalAttack;
	
	public DragonAbilities(){
		flight = ' ';
		breathAttack = ' ';
		physicalAttack = ' ';
	}
	public DragonAbilities(char fly, char breath, char physical){
		flight = fly;
		breathAttack = breath;
		physicalAttack = physical;
	}
	public void setFlight(char fly){
		flight = fly;
	}
	public void setBreath(char breath){
		breathAttack = breath;
	}
	public void setPhysical(char physical){
		physicalAttack = physical;
	}
	public char getFlight(){
		return flight;
	}
	public char getBreath(){
		return breathAttack;
	}
	public char getPhysical(){
		return physicalAttack;
	}
	public String toString(){
      return "\nFlight: " + flight + "\nBreath Attack: " + breathAttack + "\nPhyical Attack: " + physicalAttack;
      }
   }