package org.teachingkidsprogramming.section03ifs;

import java.util.Random;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    Random randomGenerator = new Random();
    int maxGuessValue = MessageBox.askForNumericalInput("Please enter the max number in your range");
    int answer = randomGenerator.nextInt(maxGuessValue + 1);
    int numberOfGuesses = MessageBox.askForNumericalInput("Please enter the number of guesses you desire:");
    for (int i = 0; i < numberOfGuesses; i++)
    {
      int guess = MessageBox.askForNumericalInput("Please enter a number between 1 to " + maxGuessValue);
      if (guess == answer)
      {
        Sounds.playBeep();
        MessageBox.showMessage("You won !CONGRATS!");
        System.exit(0);
      }
      if (guess > maxGuessValue)
      {
        MessageBox.showMessage("!your guess is higher then the max value your game will now end!");
        System.exit(0);
      }
      if (guess > answer)
      {
        MessageBox.showMessage("Your guess is too high!  Please try again");
      }
      if (guess < 0)
      {
        MessageBox.showMessage("!your guess is lower then the 1 your game will now end!");
        System.exit(0);
      }
      if (guess < answer)
      {
        MessageBox.showMessage("Your guess is too low! try again");
      }
    }
    MessageBox.showMessage(" your " + numberOfGuesses + " tries are up. !You lose! ");
  }
}