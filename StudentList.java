import java.util.Scanner;

public class StudentList {
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		
		int NUM_STUDENTS = 0;
		System.out.println("Enter number of students:");
		NUM_STUDENTS = scnr.nextInt();
		String[] studentList = new String[NUM_STUDENTS];
		int i = 0;
		int numChars = 0;
		
		for(i = 0; i < NUM_STUDENTS; i++){
			System.out.print("Enter Student Name: ");
			studentList[i] = scnr.next();
		}
		System.out.println("");
		
		for(i = 0; i < NUM_STUDENTS; i++){
			System.out.print("Student " + i + ": ");
			System.out.println(studentList[i]);
		}
		
		for(i = 0; i < NUM_STUDENTS; i++){
			numChars = numChars + studentList[i].length();
		}
		System.out.println("");
		System.out.println("Total characters: " + numChars);
		
		String longestName = studentList[0];
		for(i = 0; i < NUM_STUDENTS; i++){
			if(longestName.length() < studentList[i].length()){
				longestName = studentList[i];
			}
		}
		System.out.println("");
		System.out.println("Longest name:" + longestName);
		
		for(i=1;i<NUM_STUDENTS;i++) {
	        int j = 0;
	        for(;j<i;j++) {
	            if(studentList[j].length() > studentList[j+1].length()) {
	                String temp = studentList[j];
	                studentList[j] = studentList[j+1];
	                studentList[j+1] = temp;
	            }
	        }
	    }
		System.out.println("");
		
		System.out.println("List sorted by length:");
		
		for(i = 0; i < NUM_STUDENTS; i++){
			System.out.println(studentList[i]);
		}
	}
}