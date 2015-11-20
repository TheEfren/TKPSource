package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    int Branch = 60;
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    //
    drawBranch(Branch);
  }
  public static void drawBranch(int Branch)
  {
    if (Branch > 0)
    {
      adjustColor(Branch);
      //
      Tortoise.move(Branch);
      //
      drawLowerBranches(Branch);
      //
    }
  }
  public static void adjustColor(int Branch)
  {
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    colors.put(10, PenColors.Greens.Lime);
    colors.put(20, PenColors.Greens.ForestGreen);
    colors.put(30, PenColors.Greens.DarkGreen);
    colors.put(40, PenColors.Greens.Olive);
    colors.put(50, PenColors.Browns.Sienna);
    colors.put(60, PenColors.Browns.SaddleBrown);
    Tortoise.setPenColor(colors.get(Branch));
  }
  public static void drawLowerBranches(int Branch)
  {
    Tortoise.turn(30);
    drawShorterBranch(Branch);
    //
    Tortoise.turn(-60);
    drawShorterBranch(Branch);
    Tortoise.turn(30);
    adjustColor(Branch);
    Tortoise.move(-Branch);
  }
  public static void drawShorterBranch(int Branch)
  {
    drawBranch(Branch - 10);
  }
}