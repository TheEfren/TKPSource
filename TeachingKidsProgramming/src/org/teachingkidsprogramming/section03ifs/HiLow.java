package org.teachingkidsprogramming.section03ifs;

import java.util.Random;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    Random randomGenerator = new Random();
    int maxGuessValue = MessageBox.askForNumericalInput("Enter maximum guess value : ");
    int answer = randomGenerator.nextInt(maxGuessValue + 1);
    int numberOfGuesses = MessageBox.askForNumericalInput("Enter number of guesses : ");
    for (int i = 0; i < numberOfGuesses; i++)
    {
      int guess = MessageBox.askForNumericalInput("Enter a number between 1-100 : ");
      if (guess == answer)
      {
        Sounds.playBeep();
        MessageBox.showMessage("You won!! ^_^");
        System.exit(0);
      }
      if (guess > answer)
      {
        MessageBox.showMessage("Too high. Try again.");
      }
      if (guess < answer)
      {
        MessageBox.showMessage("Too low. Try again.");
        {
          if (maxGuessValue > 100)
            MessageBox.showMessage("Invalid input.");
          System.exit(0);
        }
        if (maxGuessValue < 0)
        {
          MessageBox.showMessage("Invalid input.");
          System.exit(0);
        }
      }
    }
    MessageBox.showMessage("You guessed " + numberOfGuesses + " times, you lose. ;-;");
  }
}