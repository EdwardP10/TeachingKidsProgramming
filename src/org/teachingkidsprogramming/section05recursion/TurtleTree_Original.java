package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TurtleTree_Original
{
  //private static final String b = null;
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setColor(PenColors.Grays.Black);
    int branch = 60;
    drawBranch(branch);
  }
  private static void drawBranch(int branch)
  {
    if (branch > 0)
    {
      adjustColor(branch);
      Tortoise.move(branch);
      drawLowerBranches(branch);
    }
  }
  private static void adjustColor(int branch)
  {
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    colors.put(10, PenColors.Greens.Lime);
    colors.put(20, PenColors.Greens.ForestGreen);
    colors.put(30, PenColors.Greens.DarkGreen);
    colors.put(40, PenColors.Greens.Olive);
    colors.put(50, PenColors.Browns.Sienna);
    colors.put(60, PenColors.Browns.SaddleBrown);
    Tortoise.setPenColor(colors.get(branch));
  }
  private static void drawLowerBranches(int branch)
  {
    Tortoise.turn(30);
    drawShorterBranch(branch);
    Tortoise.turn(-60);
    drawShorterBranch(branch);
    Tortoise.turn(30);
    adjustColor(branch);
    Tortoise.move(-branch);
  }
  private static void drawShorterBranch(int branch)
  {
    drawBranch(branch - 10);
  }
}