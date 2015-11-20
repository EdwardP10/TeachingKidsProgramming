package org.teachingkidsprogramming.section04mastery;

import java.awt.Color;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.PenColors.Grays;
import org.teachingextensions.logo.Tortoise;

public class DigiFlower
{
  public static void main(String[] args)
  {
    {
      //    Show the tortoise --#1
      Tortoise.show();
      //    Make the tortoise move as fast as possible --#7
      Tortoise.setSpeed(10);
      //    Make the background silver  --#8
      Tortoise.getBackgroundWindow().setBackground(Grays.Silver);
      //    Make the line the tortoise draws 3 pixels wide --#20
      Tortoise.setPenWidth(3);
      //    createColorPalette (recipe below) --#9.1
      //        Do the following 15 times --#19.1
      for (int i = 0; i < 15; i++)
      {
        //          drawOctogon (recipe below) --#10.1
        //          Turn the tortoise 1/15th of 360 degrees to the right --#18
        Tortoise.turn(360 / 15);
        //        Repeat --#19.2
        createColorPalette();
        //
        drawOctogon();
      }
    }
  }
  private static void drawOctogon()
  {
    //    ------------- Recipe for drawOctogon --#10.2
    //    Do the following 8 times --#6.1
    for (int i = 0; i < 8; i++)
    {
      //      Change the pen color of the line the tortoise draws to the next color on the color wheel --#4
      Tortoise.setPenColor(ColorWheel.getNextColor());
      //      Move the tortoise 50 pixels --#2
      Tortoise.move(50);
      //      Turn the tortoise 1/8th of 360 degrees to the right --#5
      Tortoise.turn(360 / 8);
      //    Repeat --#6.2 
    }
    //    ------------- End of drawOctogon recipe --#10.3
  }
  private static void createColorPalette()
  {
    //    ------------- Recipe for createColorPalette --#9.2
    //    Pen Color 1 is red --#3
    Color color1 = PenColors.Whites.White;
    //    Pen Color 2 is dark orange --#11
    Color color2 = PenColors.Reds.Red;
    //    Pen Color 3 is gold --#12
    Color color3 = PenColors.Reds.OrangeRed;
    //    Pen Color 4 is yellow --#13
    Color color4 = PenColors.Reds.OrangeRed;
    //
    //    Add color 1 to the color wheel --#3.1
    ColorWheel.addColor(color1);
    //    Add color 2 to the color wheel --#11.1
    ColorWheel.addColor(color2);
    //    Add color 3 to the color wheel --#12.1
    ColorWheel.addColor(color3);
    //    Add color 4 to the color wheel --#13.1
    ColorWheel.addColor(color4);
    //    Add color 4 to the color wheel --#14
    ColorWheel.addColor(color4);
    //    Add color 3 to the color wheel --#15
    ColorWheel.addColor(color3);
    //    Add color 2 to the color wheel --#16
    ColorWheel.addColor(color2);
    //    Add color 1 to the color wheel --#17
    ColorWheel.addColor(color1);
    //    ------------- End of createColorPalette recipe --#9.3
  }
}
