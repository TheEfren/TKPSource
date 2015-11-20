package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors.Greens;
import org.teachingextensions.logo.PenColors.Reds;
import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.PentagonCrazyQuizGrader;
import org.teachingkidsprogramming.recipes.quizzes.graders.PentagonQuizAdapter;

public class PentagonCrazyQuiz extends PentagonQuizAdapter
{
  public void question1()
  {
    // Question 1 
    thread();
  }
  public void thread()
  {
    Tortoise.move(6);
  }
  public void question2()
  {
    for (int i = 0; i < 76; i++)
    {
      stitch();
    }
  }
  public void question3()
  {
    ColorWheel.addColor(Greens.Lime);
  }
  public void question4()
  {
    ColorWheel.addColor(Reds.Red);
  }
  public static void main(String[] args)
  {
    new PentagonCrazyQuizGrader().grade(new PentagonCrazyQuiz());
  }
}
