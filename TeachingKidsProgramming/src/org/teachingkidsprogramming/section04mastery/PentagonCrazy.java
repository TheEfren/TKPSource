package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors.Blues;
import org.teachingextensions.logo.PenColors.Greens;
import org.teachingextensions.logo.PenColors.Pinks;
import org.teachingextensions.logo.PenColors.Purples;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    createColorPalette();
    drawPentagon();
  }
  public static void drawPentagon()
  {
    for (int i = 0; i < 200; i++)
    {
      adjustPen();
      Tortoise.move(i);
      Tortoise.turn(560 / 4);
      Tortoise.turn(1);
    }
  }
  public static void adjustPen()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    int i = 1;
    Tortoise.setPenWidth(1 + i);
    if (Tortoise.getPenWidth() > 4)
    {
      Tortoise.setPenWidth(1);
    }
  }
  public static void createColorPalette()
  {
    ColorWheel.addColor(Purples.Violet);
    ColorWheel.addColor(Greens.Aquamarine);
    ColorWheel.addColor(Blues.LightBlue);
    ColorWheel.addColor(Blues.LightSteelBlue);
    ColorWheel.addColor(Pinks.LightPink);
  }
}
