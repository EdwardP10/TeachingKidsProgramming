package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.hide();
    Tortoise.setSpeed(10);
    createColorPalette();
    drawPentagon();
  }
  private static void drawPentagon()
  {
    for (int i = 0; i < 100; i++)
    {
      adjustPen();
      Tortoise.move(i);
      Tortoise.turn(360 / 3);
      Tortoise.turn(1);
    }
  }
  private static void adjustPen()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.setPenWidth(5);
    int i = 1;
    if (i > 7)
    {
      Tortoise.setPenWidth(8);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(PenColors.Blues.SteelBlue);
    ColorWheel.addColor(PenColors.Purples.DarkOrchid);
    ColorWheel.addColor(PenColors.Blues.DarkSlateBlue);
    ColorWheel.addColor(PenColors.Blues.Teal);
    ColorWheel.addColor(PenColors.Purples.Indigo);
    ColorWheel.addColor(PenColors.Reds.DarkRed);
    ColorWheel.addColor(PenColors.Reds.OrangeRed);
  }
}
