public class BookDriver{
   public static void main(String[] args){
   Book book1 = new Book("batbook", "person", 50, 0);
   Book book2 = new Book();
   
   book2.setTitle("title");
   book2.setAuthor("author");
   book2.setPgNum(100);
   book2.setPgRead(20);
   
   System.out.println(book2);

   
   book1.changeRead(25);
   book2.changeRead(10);

  
   System.out.println(book1);
   System.out.println(book2);
   
 }
}  