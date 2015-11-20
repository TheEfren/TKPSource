package org.teachingkidsprogramming.section05recursion;

import org.teachingkidsprogramming.recipes.quizzes.graders.TreeQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.TreeQuizGrader;

public class TreeQuiz extends TreeQuizAdapter
{
  public void questions1To4()
  {
    //   Question 1 
    doubleLength();
    //
    //   Question 2 
    decreaseTurn();
    //
    //   Question 3 
    setNinety();
    //
    //   Question 4 
    //   angleFive (recipe below) 
    angleFive();
  }
  public void angleFive()
  {
    //   ------------- Recipe for angleFive 
    //       sets the 5th angle to 36 degrees
    angles.put(5, 36);
    //   ------------- End of angleFive recipe
  }
  public void setNinety()
  {
    angles.put(turn, 90);
  }
  public void decreaseTurn()
  {
    turn = turn - 1;
  }
  public void doubleLength()
  {
    length = length * 2;
  }
  public static void main(String[] args)
  {
    new TreeQuizGrader().grade(new TreeQuiz());
  }
}
