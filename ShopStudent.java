public class ShopStudent extends Student {
   private String shopName;
   private Uniform uniform;
   private String academy;
   private String guidenceCoun;
   
   public ShopStudent(String fN, String lN, int a, double w, double gpa, String school, String shop, String acad, String counc){
      super(fN, lN, a, w, gpa, school);
      shopName = shop;
      academy = acad;
      guidenceCoun = counc;
   }
   public ShopStudent(){
      shopName = " ";
      academy = " ";
      guidenceCoun = " ";
   }
   public String getShop(){
      return shopName;
   }
   public Uniform getUniform(){
      return uniform;
   }
   public String getAcademy(){
      return academy;
   }
   public String getGuidence(){
      return guidenceCoun;
   }
   public void setShop(String shop){
      shopName = shop;
   }
   public void setUniform(Uniform uni){
      uniform = uni;
   }
   public void setAcademy(String acad){
      academy = acad;
   }
   public void setGuidence(String counce){
      guidenceCoun = counce;
   }
   // add toSting
}