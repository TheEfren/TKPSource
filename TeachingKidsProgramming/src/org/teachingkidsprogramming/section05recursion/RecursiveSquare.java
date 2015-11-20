package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class RecursiveSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.getBackgroundWindow().setBackground(PenColors.Greens.DarkGreen);
    Tortoise.setPenColor(PenColors.Yellows.Gold);
    //
    //Set the speed to the fastest --#8
    double length = 100.0;
    //MakeASquare with the current length(recipe below) --#11.4
    //
    //Create the makeASquare recipe --#11.1
    //If the current length is greater than 10 --#10.2
    moveToTheSquareStart(length);
    //
    //  Do the following 4 times --#7.1
    //    Move the Tortoise the current length --#6.2
    //    MakeASquare with the current length divided by 1.7 (recipe below)--#11.3 
    //      If the current process count is less than 3 (HINT: use 'i') --#9
    //          Turn the tortoise 90 degrees to the right --#6.1
    //  Repeat --#7.2
    //
    moveBackToCenter(length);
    //
    //  Set the current length to the current length times two --#10.1
    //
    //End of makeASquare recipe --#11.2
  }
  public static void moveBackToCenter(double length)
  {
    Tortoise.setPenUp();
    Tortoise.turn(90);
    Tortoise.move(length / 2);
    Tortoise.turn(90);
    Tortoise.move(length / 2);
    Tortoise.turn(180);
    Tortoise.setPenDown();
  }
  public static void moveToTheSquareStart(double length)
  {
    Tortoise.setPenUp();
    Tortoise.move(length / 2);
    Tortoise.turn(-90);
    Tortoise.move(length / 2);
    Tortoise.turn(180);
    Tortoise.setPenDown();
  }
}
