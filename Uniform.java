public class Uniform {
	
	private String shirt;
	private String pants;
	private String shoes;
	
	public Uniform(String shi, String pant, String sho){
		shirt = shi;
      pants = pant;
		shoes = sho;
	}
	public Uniform(){
		shirt = " ";
      pants = " ";
		shoes = " ";
	}
	public void setShirt(String shi){
		shirt = shi;
	}
   public void setPants(String pant){
		pants = pant;
	}
	public void setShoes(String sho){
		shoes = sho;
	}
	public String getShirt(){
		return shirt;
	}
   public String getPants(){
		return pants;
	}
	public String getShoes(){
		return shoes;
	}
	@Override
	public String toString(){
		return "\nShirt: " + shirt + "\nPants: " + pants + "\nShoes: " + shoes;
	}
}