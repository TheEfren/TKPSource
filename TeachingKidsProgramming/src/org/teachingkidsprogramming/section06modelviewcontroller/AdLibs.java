package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String currentAdverb = MessageBox.askForTextInput("Enter an adverb! :3");
    if (currentAdverb.isEmpty())
    {
      MessageBox.showMessage("Chill man,follow da rules!");
      System.exit(0);
    }
    else if (currentAdverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("lel u sux @ elnglish");
    }
    String currentEdVerb = MessageBox.askForTextInput("Enter a verb ending in '-ed' :3");
    String currentBodyPart = MessageBox.askForTextInput("Enter a body part :3");
    String currentStory = "Today I woke " + currentAdverb + ". Then I " + currentEdVerb + " my " + currentBodyPart
        + ". ";
    MessageBox.showMessage(currentStory);
  }
}