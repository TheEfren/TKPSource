package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors.Purples;
import org.teachingextensions.logo.Tortoise;

public class Spiral
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    ColorWheel.addColor(Purples.BlueViolet);
    ColorWheel.addColor(Purples.Violet);
    ColorWheel.addColor(Purples.Purple);
    for (int i = 0; i < 75; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(5 * i);
      Tortoise.turn(360 / 3);
    }
  }
}
