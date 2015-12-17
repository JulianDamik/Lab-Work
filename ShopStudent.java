public class ShopStudent extends Student {
   private String shopName;
   private String uniform;
   private String academy;
   private String guidenceCoun;
   
   public ShopStudent(String fN, String lN, int a, double w, double gpa, String school, String shop, String uni, String acad, String counc){
      super(fN, lN, a, w, gpa, school);
      shopName = shop;
      uniform = uni;
      academy = acad;
      guidenceCoun = counc;
   }
   public ShopStudent(){
      shopName = " ";
      uniform = " ";
      academy = " ";
      guidenceCoun = " ";
   }
   public void setShop(String shop){
      shopName = shop;
   }
   public void setUniform(String uni){
      uniform = uni;
   }
   public void setAcademy(String acad){
      academy = acad;
   }
}