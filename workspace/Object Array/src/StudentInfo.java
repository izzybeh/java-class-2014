/*
 * Author: Israel Beh
 * Description: The midterm that ask us enter in student names, average grades and final grades. this also enables us to print it off.
 */
import java.util.Scanner;


public class StudentInfo {

	public static void main(String[] args) {
		Scanner oScan = new Scanner(System.in);
		Student aiStudent[] = new Student[3];
		int iCount;
		String sName;
		int iquiz;
		int itest;
		int ihomework;
		String sFav;
		
		
		
		// I forgot how to call a constructor
		for (iCount = 0; iCount < aiStudent.length; iCount++)// sets the values for each category
		{
				
				System.out.println("What is the student's name:");
				
				sName = oScan.nextLine();
				
				System.out.println("What is your quiz ave?");
				iquiz = oScan.nextInt();
				
				System.out.println("What is your test ave?");
				itest = oScan.nextInt();
				
				System.out.println("What is your homework ave?");
				ihomework = oScan.nextInt();
				
				oScan.nextLine();
				
				System.out.println("What is the favorite subject:");
				sFav = oScan.nextLine();
				
				aiStudent[iCount] = new Student(sName, iquiz, itest, ihomework, sFav);
			
		}

		for (iCount = aiStudent.length-1 ; iCount > 0; iCount--)// prints off the student info starting with the last entered
		{
			System.out.println("Name \t Subject \t Ave \t Grade \t");
			System.out.println(aiStudent[iCount].name + '\t'+ aiStudent[iCount].favorite_Subject + '\t' + aiStudent[iCount].final_ave
					+ '\t' + aiStudent[iCount].letter_grade);
			
		}
		
		
	}

}
