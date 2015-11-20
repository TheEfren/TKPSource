package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class FourSquare
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.turn(90);
      drawSquare();
    }
  }
  public static void drawSquare()
  {
    for (int i = 0; i < 4; i++)
    {
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(50);
      Tortoise.turn(90);
    }
  }
}
