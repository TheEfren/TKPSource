package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizGrader;

public class HousesQuiz extends HousesQuizAdapter
{
  public void questions1Thru6()
  {
    // Question 1 
    small();
    //
    //   Question2
    medium();
    //
    //   Question3
    large();
    drawASide();
    //   ------------- End of turnTheCorner recipe
    //
    //   Question6
    //   drawASide (recipe below) 
    //   ------------- Recipe for drawASide 
    //      call moveTheLength and turnTheCorner
    drawASide();
    //   ------------- End of drawASide recipe
  }
  public void drawASide()
  {
    moveTheLength();
    turnTheCorner();
  }
  public void turnTheCorner()
  {
    Tortoise.turn(-360 / 3);
  }
  public void moveTheLength()
  {
    Tortoise.move(length);
  }
  public void large()
  {
    length = 63;
  }
  public void medium()
  {
    length = 21;
  }
  public void small()
  {
    length = 7;
  }
  public static void main(String[] args)
  {
    new HousesQuizGrader().grade(new HousesQuiz());
  }
}
