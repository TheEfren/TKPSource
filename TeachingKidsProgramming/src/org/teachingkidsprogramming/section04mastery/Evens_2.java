package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.windows.MessageBox;

public class Evens_2
{
  public static void main(String[] args)
  {
    int div = MessageBox.askForNumericalInput("What should your numbers be divisible by?");
    int numbers = MessageBox.askForNumericalInput("How high do you want the numbers to go?");
    for (int i = 0; i < numbers; i++)
    {
      if (i % div == 0)
      {
        System.out.println(i);
      }
    }
  }
}
