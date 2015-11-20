package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.virtualproctor.VirtualProctor;
import org.teachingextensions.windows.MessageBox;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("Palm STEM Academy");
    VirtualProctor.setName("Siobhan and Vashti");
    Tortoise.show();
    Tortoise.setSpeed(5);
    Tortoise.setAnimal(Animals.Unicorn);
    Tortoise.setPenWidth(3);
    int sides = MessageBox.askForNumericalInput("How many sides?");
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(i * 7);
      Tortoise.turn(360.0 * 7 / sides);
      for (int j = 0; j < args.length; j++)
      {
      }
    }
  }
}