import java.util.Scanner;
import java.util.ArrayList;
public class PersonDerivation {
	public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
		ArrayList<Person> personList = new ArrayList<Person>();
		ArrayList<ShopStudent> studentList = new ArrayList<ShopStudent>();
      
      String fName;
	   String lName;
	   int age;
	   double weight;
      
      double GPA;
      String schoolName;
      
      String englishClass = " ";
      String mathClass = " ";
      String historyClass = " ";
      String scienceClass = " ";
      String otherClass = " ";
 
      String shopName = " ";
      String academy = " ";
 
      String shirt = " ";
      String pants = " ";
      String shoes = " ";
      
      char pCont = ' ';
      char sCont = ' ';

		   
		System.out.println("Do you want to create a person? (y or n) \n");
		pCont = scnr.next().charAt(0);
      		
      while(pCont == 'y'){
			   System.out.println("Enter first name. ");
			   fName = scnr.next();
			   
			   System.out.println("Enter last name. ");
			   lName = scnr.next();
			   
			   System.out.println("Enter age. (Whole number) ");
			   age = scnr.nextInt();
			   
			   System.out.println("Enter weight. (Decimal) ");
			   weight = scnr.nextDouble();
			   			   
			   Person person = new Person();
			   personList.add(new Person(fName, lName, age, weight));
			   
			   System.out.println("Do you want to make another person? (y or n) \n");
			   pCont = scnr.next().charAt(0);
		   }
         		
      System.out.println("Do you want to create a student? (y or n) \n");
		sCont = scnr.next().charAt(0);
      
      while(sCont == 'y'){
			   System.out.println("Enter first name. ");
			   fName = scnr.next();
			   
			   System.out.println("Enter last name. ");
			   lName = scnr.next();
			   
			   System.out.println("Enter age. (Whole number) ");
			   age = scnr.nextInt();
			   
			   System.out.println("Enter weight. (Decimal) ");
			   weight = scnr.nextDouble();

            System.out.println("Enter GPA. (Decimal) ");
			   GPA = scnr.nextDouble();
            
            System.out.println("Enter school name. ");
			   schoolName = scnr.next();
            
            System.out.println("What English class are they taking? (N/A if not taking) ");
			   englishClass = scnr.next();
            
            System.out.println("What Math class are they taking? (N/A if not taking) ");
			   mathClass = scnr.next();
            
            System.out.println("What History class are they taking? (N/A if not taking) ");
			   historyClass = scnr.next();
            
            System.out.println("What Science class are they taking? (N/A if not taking) ");
			   scienceClass = scnr.next();
            
            System.out.println("What other class are they taking? (N/A if not taking) ");
			   otherClass = scnr.next();
            
            System.out.println("What shop is the student in? ");
			   shopName = scnr.next();
            
            System.out.println("What academy is the student in?");
			   academy = scnr.next();

            System.out.println("Describe the type of shirt that is needed for the shop uniform. (N/A if it does not matter) ");
			   shirt = scnr.next();

            System.out.println("Describe the type of pants that is needed for the shop uniform. (N/A if it does not matter) ");
			   pants = scnr.next();

            System.out.println("Describe the type of shoes that is needed for the shop uniform. (N/A if it does not matter) ");
			   shoes = scnr.next();
			   
            studentList.add(new ShopStudent(fName, lName, age, weight, GPA, schoolName, shopName, academy));
            
			   ClassesTaking classes = new ClassesTaking(englishClass, mathClass, historyClass, scienceClass, otherClass);
            studentList.get(studentList.size() - 1).setClasses(classes);
            
            Uniform uniform = new Uniform(shirt, pants, shoes);
            studentList.get(studentList.size()-1).setUniform(uniform);
            
			   
			   System.out.println("Do you want to make another student? (y or n) \n");
			   sCont = scnr.next().charAt(0);
		   } 
              
         for(int i = 0; i < personList.size(); i++){
			   System.out.println("Person " + (i + 1));
			   System.out.println(personList.get(i));		   
         } 
         
         for(int i = 0; i < studentList.size(); i++){
			   System.out.println("Student " + (i + 1));
			   System.out.println(studentList.get(i));		   
         }      
 	}
}