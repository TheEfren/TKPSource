package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.SimpleSquareQuizGrader;
import org.teachingkidsprogramming.recipes.quizzes.graders.SquareQuiz;

public class SimpleSquareQuiz implements SquareQuiz
{
  public void question1()
  {
    Tortoise.move(110);
  }
  public void question2()
  {
    Tortoise.turn(360 / 5);
  }
  public void question3()
  {
    Tortoise.setPenColor(PenColors.Yellows.Yellow);
  }
  public void question4()
  {
    Tortoise.setPenWidth(5);
  }
  public static void main(String[] args)
  {
    new SimpleSquareQuizGrader().grade(new SimpleSquareQuiz());
  }
}
