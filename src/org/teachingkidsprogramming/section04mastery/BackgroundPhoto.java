package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.PenColors.Reds;
import org.teachingextensions.logo.Tortoise;

public class BackgroundPhoto
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    //  Set the current picture to this url "http://img2.timeinc.net/ew/dynamic/imgs/101110/sonny-cher_240.jpg" --#7.1
    //Tortoise.getBackgroundWindow().setBackgroundImage(http://img2.timeinc.net/ew/dynamic/imgs/101110/sonny-cher_240.jpg);
    //  Set the background image to the current picture--#7.2
    int length = 2;
    for (int i = 0; i < 75; i++)
    {
      Tortoise.setPenColor(Reds.Crimson);
      //     Use the current pen color for the line the tortoise draws --#8.2
      Tortoise.getPenC);
      Tortoise.move(length + 1);
      Tortoise.move(length);
      Tortoise.setX(555);
      Tortoise.setY(65);
      Tortoise.turn(360 / 3);
      Tortoise.turn(360 / 4);
    }
  }
}
