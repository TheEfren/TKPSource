package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;

public class BackgroundPhoto
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    //  Set the current picture to this url "http://img2.timeinc.net/ew/dynamic/imgs/101110/sonny-cher_240.jpg" --#7.1
    //  Set the background image to the current picture--#7.2
    for (int i = 2; i < 75; i++)
    {
      //     Set the current pen color to crimson --#8.1
      //     Use the current pen color for the line the tortoise draws --#8.2
      //     Increase the length of a side by 1 pixel --#5
      Tortoise.move(i + 1);
      Tortoise.move(i);
      //     Set the X position of the tortoise to 555 pixels --#4.3
      Tortoise.setX(555);
      //     Set the Y position of the tortoise to 65 pixels --#4.4
      Tortoise.setY(65);
      Tortoise.turn(360 / 3);
      //     Turn the tortoise 1 more degree --#6
    }
  }
}