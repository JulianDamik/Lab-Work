public class Book{
   private String title;
   private String author;
   private int PgNum;
   private int PgRead;
   
   public Book(){
      title = "";
      author = "";
      PgNum = 0;
      PgRead = 0;
   }
   public Book(String nam, String au, int pn, int pr){
      title = nam;
      author = au;
      PgNum = pn;
      PgRead = pr;
   }
   public void setTitle(String nam){
     title = nam; 
     return;
   }
   public void setAuthor(String au){
     author = au;
     return;
   }
   public void setPgNum(int num){
     PgNum = num;
     return;
   }
   public void setPgRead(int pgUp){
      PgRead = PgRead + pgUp;
      return;
   }

   public String getTitle(){
      return title;
   }
   public String getAuthor(){
      return author;
   }
   public int getPgNum(){
      return PgNum;
   }
   public int getPgRead(){
      return PgRead;
   }
   public void changeRead(int PgUp){
      PgRead = PgUp + PgRead;
   }
   public String toString(){
      return "Title: " + title + "\nAuthor: " + author + "\nPage Number: " + PgNum + "\nPages Read: " + PgRead + "\n";
      }
 }
 