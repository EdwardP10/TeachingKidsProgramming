package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.virtualproctor.VirtualProctor;
import org.teachingextensions.windows.MessageBox;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("palm stem academy");
    VirtualProctor.setName("alex & teyonce");
    int sides = MessageBox.askForNumericalInput("How many sides?");
    for (int i = 0; i < sides * 12; i++)
    {
      Tortoise.show();
      Tortoise.setSpeed(10);
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(i);
      Tortoise.turn(360.0 * 15 / sides);
      Tortoise.hide();
      for (int j = 0; j < args.length; j++)
      {
        Tortoise.move(21);
        Tortoise.turn(360.0 * 48);
        Tortoise.hide();
      }
    }
  }
}