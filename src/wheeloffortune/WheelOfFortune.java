/*
* CMPSC 261, Section 1
* Fall 2016
* Instructor: Phil O'Connell
* TODO: DON'T FORGET TO PUT YOUR NAME AND ID
* Student: Shenghao Huang
* ID: sih5462
*/
package wheeloffortune;

import java.util.Scanner;

public class WheelOfFortune {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
      Scanner user = new Scanner(System.in);

//		As a user, I want to be able to guess a letter, so I can discover the puzzle.	
		
//		char letter;		
//		System.out.print("Please enter a letter!\n");
//		letter = user.next().charAt(0);
//		
//		if (Character.toString(letter).matches("^[a-zA-Z]+")){
//			System.out.println("You have selected : " + letter);
//		}
//		else {
//			System.out.println("You have entered more than one letter or a number!");
//		}
		
		
		
		
		
		
		System.out.println("Welcome to the Wheel of Fortune\n" + 
	               "Please select an option:    \n" +
	               "    1) Spin the Wheel!\n" + 
	               "    2) Buy a Vowel!\n" + 
	               "    3) Solve the Puzzle!\n" + 
	               "    4) Testing\n" +
	               "    5) Quit\n" +
	               "    Please enter a number : "
	       );
		
		String input = user.nextLine();
		int choice = Integer.parseInt(input);
		
		switch (choice) {
		case 1:
			System.out.println("You chose to spin the wheel!");
			break;
		case 2:
			System.out.println("You chose to buy a vowel!");
			break;
		case 3:
			System.out.println("You chose to solve the puzzle!");
			break;
		case 4:
			//As a QA tester, I want a "test" choice beneath the current user choices on the main menu,
			//so I can test additional functionality
			System.out.println("You chose testing\n" + 
								"Please enter a letter!");
			char letter;
			letter = user.next().charAt(0);
			
			if (Character.toString(letter).matches("^[a-zA-Z]+")){
				System.out.println("You have selected : " + letter);
			}
			else {
				System.out.println("You have entered more than one letter or a number!");
			}
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("You didnt chose any of the menu selection!");			
		}
  }
  
}
