package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(1);
    Tortoise.setAnimal(Animals.Spider);
    Tortoise.setPenColor(Color.RED.red);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    double length = 10.5;
    double zoom = 1.1 * 3;
    for (int i = 0; i < 10; i++)
    {
      //
      length = weaveOneLayer(length, zoom);
      //
    }
  }
  public static double weaveOneLayer(double length, double zoom)
  {
    for (int i = 0; i < 6; i++)
    {
      drawTriangle(length);
      //
      Tortoise.turn(360 / 6);
      length = length + zoom;
    }
    return length;
  }
  public static void drawTriangle(double length)
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3);
    }
  }
}
