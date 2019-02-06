
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;
import java.util.Scanner;

public class Main
{
    // instance variables - replace the example below with your own
    //private int x;

    /**
     * Constructor for objects of class Main
     */
    public static void Main()
    {
       captureGuess();
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void captureGuess()
    {
    int counter=0;
    Random ran_num = new Random();
    int number = ran_num.nextInt(10);
    Scanner num = new Scanner(System.in);
    System.out.println("Guess and Enter a number between 1 and 10");

    int guess = num.nextInt();
    int pre_guess=0;
    
    while(guess!= number) {
    
       if(guess>number && guess>=0 && guess<=10) {
      System.out.println("Your Guess is too High Try again and Enter a number between 1 and 10");
      
      //if ()
      //guess=num.nextInt();
        
      //counter++;
    }
    else if (guess<number && guess>=0 && guess<=10) {
        
        System.out.println("Your Guess is too Low Try again and Enter a number between 1 and 10");
      
      //if ()
      //guess=num.nextInt();
        
      //counter++;
        
    }
    else if (guess>10 || guess<0) {
        
        System.out.println("Your Guess is Invalid Try again and Enter a number between 1 and 10");
      
      //if ()
      //guess=num.nextInt();
        
      //counter++;
        
    }
    
    if (pre_guess!=guess){
      counter++;  
        
        
    }
    
    pre_guess=guess;
    guess=num.nextInt();
    
    
}
    
    System.out.println("Your Guess is correct and you guessed " + (counter+1)+" times");
        //break;
    
    }
    
}
    
    
        //return x + y;
    

