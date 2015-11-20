package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.windows.MessageBox;

public class Password
{
  public static void main(String[] args)
  {
    // Specification - create a little messagebox app for a login system that checks for an integer password and limits the number of 
    //attempts to enter it before it locks you our (like my phone)
    int password = 667;
    for (int i = 0; i < 5; i++)
    {
      int tries = (5 - i - 1);
      int input = MessageBox.askForNumericalInput("What's the password?");
      if (password == input)
      {
        MessageBox.showMessage("Welcome (:");
        System.exit(0);
      }
      if (input != password && i < 5)
      {
        MessageBox.showMessage("You have " + tries + " tries left.");
      }
      if (input != password && i > 5)
      {
        MessageBox.showMessage("You ran out of tries.");
        System.exit(0);
      }
    }
  }
}