/*
 Author: Israel Beh
 Description: Quiz 3. This program enables the user to enter the name of a boy and a girl. 
 The program then calculates the number of occurrences of the letters: T, R, U, E, L, O, V.
 Based on how many occurrences of these the letter, the two people will be true loves,
 Just Friends, or siblings.
 */
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args)
	{
		
		Scanner oScan = new Scanner(System.in);
		Names aiName[] = new Names[1];//Create an array that will hold both names
		int iCount = 0;
		String TrueLoves;
		
		
		for (iCount = 0; iCount < aiName.length; iCount ++)
		{
	//Prompt the user to enter a name of a boy
			aiName[iCount] = new Names();
			System.out.println("Enter the name of a boy");
			aiName[iCount].boy = oScan.nextLine().toUpperCase();
			
	//Prompt the user to enter a name of a girl
			System.out.println("Enter the name of a girl");
			aiName[iCount].girl = oScan.nextLine().toUpperCase();
			
			int iCharCountT = 0;//count all of the T, R, U, E, L, O, V characters
			
	//For each name in the array, I want you to check each character in the name
			for(int iC = 0; iC < aiName[iCount].boy.length(); iC++){
				if (aiName[iCount].boy.charAt(iC) == 'T' || aiName[iCount].boy.charAt(iC) == 'R' ||
					aiName[iCount].boy.charAt(iC) == 'U' || aiName[iCount].boy.charAt(iC) == 'E' || 
					aiName[iCount].boy.charAt(iC) == 'L' || aiName[iCount].boy.charAt(iC) == 'O' ||
					aiName[iCount].boy.charAt(iC) == 'V') 
					iCharCountT++;
			}
			
			for(int iG = 0; iG < aiName[iCount].girl.length(); iG++){
				if (aiName[iCount].girl.charAt(iG) == 'T' || aiName[iCount].girl.charAt(iG) == 'R' ||
					aiName[iCount].girl.charAt(iG) == 'U' || aiName[iCount].girl.charAt(iG) == 'E' || 
					aiName[iCount].girl.charAt(iG) == 'L' || aiName[iCount].girl.charAt(iG) == 'O' ||
					aiName[iCount].girl.charAt(iG) == 'V') 
					iCharCountT++;
			}
				
		/*
		 5.If the count is 10 or more then print:
		Name + OtherName = True Love

		6. if the count is 5-9 then print:
		Name + OtherName = Just Friends

		7. Otherwise print
		Name + OtherName = Siblings*/
			
			if (iCharCountT >= 10)
			{
				System.out.println(aiName[iCount].boy + " + " + aiName[iCount].girl + " = "
									+ "True Love");
			}
			else if (iCharCountT < 9 && iCharCountT > 5)
			{
				System.out.println(aiName[iCount].boy + " + " + aiName[iCount].girl + " = "
									+ "Just Friends");
			}
			else
			{
				System.out.println(aiName[iCount].boy + " + " + aiName[iCount].girl + " = "
						+ "Siblings");
			}
		}	
		}
		
		

	}


