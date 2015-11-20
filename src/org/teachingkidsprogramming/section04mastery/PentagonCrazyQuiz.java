package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.PentagonCrazyQuizGrader;
import org.teachingkidsprogramming.recipes.quizzes.graders.PentagonQuizAdapter;

public class PentagonCrazyQuiz extends PentagonQuizAdapter
{
  public void question1()
  {
    // Question 1 
    //   thread (recipe below) 
    thread();
  }
  private void thread()
  {
    //   ------------- Recipe for thread
    //       that moves the tortoise 6 pixels
    Tortoise.move(6);
    //   ------------- End of thread recipe
  }
  public void question2()
  {
    //        Do the following 76 times
    for (int i = 0; i < 76; i++)
    {
      stitch();
      //           call stitch
      //        Repeat
    }
  }
  public void question3()
  {
    ColorWheel.addColor(PenColors.Greens.Lime);
    //        Add lime to the color wheel
  }
  public void question4()
  {
    ColorWheel.addColor(PenColors.Reds.Red);
    //        Add red to the color wheel
  }
  public static void main(String[] args)
  {
    new PentagonCrazyQuizGrader().grade(new PentagonCrazyQuiz());
  }
}
