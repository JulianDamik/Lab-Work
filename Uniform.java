public class Uniform{
   private String shirt;
   private String pants;
   private String shoes;
   private boolean jewelryAllowed;
   
   public Uniform(String shir, String pant, String shoe, boolean jewelry){
      shirt = shir;
      pants = pant;
      shoes = shoe;
      jewelryAllowed = jewelry;
   }
   public Uniform(){
       shirt = " ";
       pants = " ";
       shoes = " ";
       jewelryAllowed = false;
   }
   public void setShirt(String shir){
      shirt = shirt;   
   }
   public void setPants(String pant){
      pants = pant;
   }
   public void setShoes(String shoe){
      shoes = shoe;
   }
   public void setJewelry(boolean jewelry){
      jewelryAllowed = jewelry;
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
   public boolean getjewlery(){
      return jewelryAllowed;
   }
   public String toString(){
      return "\nShirt: " + shirt + "\nPants: " + pants + "\nShoes: " + shoes + "\nJewelry Allowed? " + jewelryAllowed;
   }
}