package org.teachingkidsprogramming.section03ifs;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ChooseYourOwnAdventure
{
  public static void main(String[] args)
  {
    startStory();
  }
  public static void startStory()
  {
    MessageBox.showMessage("One morning the tortoise woke up in a dream.");
    animateStartStory();
    int response = MessageBox.askForNumericalInput("Do you want to wake up(1) or explore(2) the dream?");
    if (response == 1)
    {
      wakeUp();
    }
    else if (response == 2)
    {
      approachOoze();
    }
    else
    {
      badAnswer();
    }
  }
  public static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Grays.Black;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);;
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  public static void badAnswer()
  {
    MessageBox.showMessage("You don't know how to read directions. You can't play this game. The End.");
  }
  public static void approachOoze()
  {
    MessageBox.showMessage(
        "You approach a glowing, green bucket of ooze, worried that you will get in trouble, you pick up the bucket.");
    int response2 = MessageBox
        .askForNumericalInput("Do you want to approach the ooze into the backyard(1) or toilet(2)?");
    if (response2 == 1)
    {
      pourIntoToilet();
    }
    else if (response2 == 2)
    {
      pourIntoBackyard();
    }
    else
    {
      badAnswer();
    }
  }
  public static void pourIntoBackyard()
  {
    MessageBox.showMessage(
        "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
    int response3 = MessageBox
        .askForNumericalInput("As the man starts to prepare you as soup, do you...  'Scream'(1) or 'Faint'(2)?");
    if (response3 == 2)
    {
      tortoiseSoup();
    }
    else if (response3 == 1)
    {
      startStory();
    }
    else
    {
      badAnswer();
    }
  }
  public static void tortoiseSoup()
  {
    //
    MessageBox.showMessage("You made a delicious soup! Yum! The End.");
  }
  public static void pourIntoToilet()
  {
    MessageBox.showMessage(
        "As you pour the ooze into the toilet it backs up, gurgles and explodes covering you in radio-active waste.");
    int response4 = MessageBox.askForNumericalInput("Do you want to train to be a ninja? Yes(1) or HECK YES(2)");
    if (response4 == 1)
    {
      ninjaTortoise();
    }
    else if (response4 == 2)
    {
      ninjaTortoise();
    }
    else
    {
      badAnswer();
    }
  }
  public static void ninjaTortoise()
  {
    MessageBox.showMessage("Awesome Dude!  You live out the rest of your life fighting crimes and eating pizza!");
  }
  public static void wakeUp()
  {
    MessageBox.showMessage("You wake up and have a boring day. The End.");
  }
}
