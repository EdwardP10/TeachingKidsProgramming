package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.PenColors.Grays;
import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    //Tortoise.hide();
    int Height = 40;
    drawHouseWithFlatRoof(Height);
    drawHouseWithSlantyRoof(120);
    drawHouseWithPointyRoof(90);
    drawHouseWithSlantyRoof(20);
    drawHouseWithStairRoof(160);
    drawseattlebuilding(180);
  }
  private static void drawHouseWithSlantyRoof(int Height)
  {
    Tortoise.setPenColor(Grays.LightGray);
    Tortoise.move(Height);
    drawSlantyRoof();
    Tortoise.move(Height);
    Tortoise.turn(-90);
    Tortoise.move(45);
    Tortoise.turn(-90);
  }
  private static void drawHouseWithFlatRoof(int Height)
  {
    Tortoise.setPenColor(Grays.LightGray);
    Tortoise.move(Height);
    DrawFlatRoof();
    Tortoise.move(Height);
    Tortoise.turn(-90);
    Tortoise.move(45);
    Tortoise.turn(-90);
  }
  private static void drawSlantyRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(30);
    Tortoise.turn(135);
    Tortoise.move(20);
  }
  private static void DrawFlatRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(45);
    Tortoise.turn(90);
  }
  private static void drawHouseWithPointyRoof(int Height)
  {
    Tortoise.setPenColor(Grays.LightGray);
    Tortoise.move(Height);
    drawPointyRoof();
    Tortoise.move(Height);
    Tortoise.turn(-90);
    Tortoise.move(45);
    Tortoise.turn(-90);
  }
  private static void drawPointyRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(90);
    Tortoise.move(15);
    Tortoise.turn(45);
  }
  private static void drawHouseWithStairRoof(int Height)
  {
    Tortoise.move(Height);
    drawStairRoof();
    Tortoise.move(Height);
    Tortoise.turn(-90);
    Tortoise.move(45);
  }
  private static void drawStairRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(7);
    Tortoise.turn(-90);
    Tortoise.move(7);
    Tortoise.turn(90);
    Tortoise.move(7);
    Tortoise.turn(-90);
    Tortoise.move(7);
    Tortoise.turn(90);
    Tortoise.move(7);
    Tortoise.turn(90);
    Tortoise.move(7);
    Tortoise.turn(-90);
    Tortoise.move(7);
    Tortoise.turn(90);
    Tortoise.move(7);
    Tortoise.turn(-90);
    Tortoise.move(7);
    Tortoise.turn(90);
  }
  private static void drawseattlebuilding(int Height)
  {
    Tortoise.turn(-65);
    Tortoise.move(10);
    Tortoise.turn(-4);
    Tortoise.move(10);
    Tortoise.turn(-4);
    Tortoise.move(10);
    Tortoise.turn(-4);
    Tortoise.move(10);
    Tortoise.turn(-4);
    Tortoise.move(10);
    Tortoise.turn(-4);
    Tortoise.move(10);
    Tortoise.turn(-4);
    Tortoise.move(10);
    Tortoise.turn(-4);
    Tortoise.move(10);
    Tortoise.turn(-4);
    Tortoise.move(10);
    Tortoise.turn(-4);
    Tortoise.move(10);
    Tortoise.turn(-4);
    Tortoise.move(10);
    Tortoise.turn(-4);
    Tortoise.move(10);
    Tortoise.turn(-4);
    Tortoise.move(10);
    Tortoise.turn(-50);
    Tortoise.move(15);
  }
}
