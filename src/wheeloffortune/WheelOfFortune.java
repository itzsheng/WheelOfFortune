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
import java.util.Random;

public class WheelOfFortune {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      String letter;
      String puzzle = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
      Scanner userGuess = new Scanner(System.in);
      
      //Instructions for the user
      System.out.println(
      "                 ======================\n    " +
      "             =  Wheel Of Fortune  = \n   " +
      "              ======================\n    " +
      "     1. Spin the wheel\n" +
      "         2. Buy a vowel\n" +
      "         3. Solve the puzzle\n" + 
      "         4. Quit\n" + 
      "         5. N/A\n" + 
      "         6. N/A\n" + 
      "         7. N/A\n" +
      "         8. Toggle Puzzle\n" + 
      "         9. Test letter input\n\n" +
      "         Please select a number :    ");
      
      boolean quit = false;
      while (!quit) {
      String userInput = userGuess.nextLine();
      int choice = Integer.parseInt(userInput);
      
      switch (choice) {
          case 1:
              System.out.println("You chose to spin the wheel");
              spinWheel();
              randomPuzzle();
              
              System.out.println("Please enter a letter : ");

              break;
          case 2:
              System.out.println("You choose to buy a vowel");
              break;
          case 3:
              System.out.println("You have chose to solve the puzzle");
              break;
          case 4:
              System.exit(0);
              break;
          case 5:
              System.out.println("N/A");
              break;
          case 6:
              System.out.println("N/A");
              break;
          case 7:
              System.out.println("N/A");
              break;
          case 8:
              System.out.println(puzzle);
              int number;
             Scanner scan = new Scanner(System.in);
              System.out.println("Press 8 again to untoggle the puzzle");
            number = scan.nextInt();
 
              break;
          case 9:
              System.out.println("Test letter input : ");
              String test = userGuess.next();
              System.out.println("You selected  : " + test);
              break;
          default:
              break;
      }
      }
      
      
      
  }
//Creating a method for the user to spin the wheel with the 24 different wedge values
      public static void spinWheel(){
          String [] wedgeValues = {"$300","$300","$300","$300","$300","$350",
              "$400", "$400", "$450",
              "$500", "$500", "$500", "$550",
              "$600", "$600", "$600",
              "$700",
              "$800", "$800",
              "$900", "$900",
              "$5000",
              "LOSE A TURN", "BANKRUPT"};
          //Import java random to select a random value from the list
          Random value = new Random();
          int index = value.nextInt(wedgeValues.length);
          //Then output what value was selected to the user
          System.out.println("You landed on : " + wedgeValues[index]);
      }
      
      //Method for creating a puzzle, I figured eventually I'll make it into an array list like the spin wheel
      //method for the future. For example adding different puzzles and it'll pick a random one.
      public static void randomPuzzle(){
          String puzzle = "THE QUICK BROWN DDOG JUMPS OVER THE LAZY DOG";
          String input = " ";
          Scanner userGuess = new Scanner(System.in);
          boolean puzzleNotSolved = true;
          
          //Replaces the letters with blanks to hide the puzzle
          while (puzzleNotSolved){
              puzzleNotSolved = false;
              for (char unvieldLetter: puzzle.toCharArray()){
                  if (input.indexOf(unvieldLetter) == -1){
                      System.out.print("_ ");
                      puzzleNotSolved = true;
                      
                  }
                  else {
                      System.out.print(unvieldLetter);
                  }
              }
           if (! puzzleNotSolved ){
               break;
           }
           System.out.println("\nPlease enter a letter : ");
           String letter = userGuess.next();
           input += letter;
           
          }
          
      }
      

  }
  

