package org.teachingkidsprogramming.section03ifs;

import java.util.concurrent.TimeUnit;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.virtualproctor.VirtualProctor;
import org.teachingextensions.windows.MessageBox;

public class ChooseYourOwnAdventure
{
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm STEM Academy");
    VirtualProctor.setName("Teyonce & Eddie'");
    startStory();
  }
  private static void startStory()
  {
    MessageBox.showMessage("One morning the Tortoise woke up in a dream");
    animateStartStory();
    int answer = MessageBox.askForNumericalInput("Type (1) for 'wake up' or (2)for 'explore' the dream?");
    if (answer == 1)
    {
      wakeUp();
    }
    else if (answer == 2)
    {
      approachOoze();
    }
    else
    {
      badAnswer();
    }
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Tortoise.setPenColor(PenColors.Grays.Black);
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setBackground(ColorWheel.getNextColor());
      ColorWheel.addColor(PenColors.Grays.Black);
      try
      {
        TimeUnit.MILLISECONDS.sleep(100);
      }
      catch (InterruptedException e)
      {
        //TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
  private static void badAnswer()
  {
    MessageBox.showMessage("You don't know how to read directions.  You can't play this game.  The End.");
  }
  private static void approachOoze()
  {
    MessageBox.showMessage(
        "You approach a glowing, green bucket of ooze, worried that you will get in trouble, you pick up the bucket.");
    int answer = MessageBox.askForNumericalInput("Type (3) to pour the ooze into the 'toilet' or (4) 'backyard'?");
    if (answer == 3)
    {
      pourIntoToilet();
    }
    else if (answer == 4)
    {
      pourIntoBackyard();
    }
    else
    {
      badAnswer();
    }
  }
  private static void pourIntoBackyard()
  {
    MessageBox.showMessage(
        "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
    int answer = MessageBox
        .askForNumericalInput("As the man starts to prepare you as soup, do you...(5)'Scream' or (6)'Faint'?");
    if (answer == 6)
    {
      tortoiseSoup();
    }
    else if (answer == 5)
    {
      startStory();
    }
    else
    {
      badAnswer();
    }
  }
  private static void tortoiseSoup()
  {
    MessageBox.showMessage("You made a delicious soup!  Yum!  The End.");
  }
  private static void pourIntoToilet()
  {
    MessageBox.showMessage(
        "As you pour the ooze into the toilet it backs up, gurgles and explodes covering you in radio-active waste.");
    int answer = MessageBox
        .askForNumericalInput("Do you want to train to be a NINJA?  (7)'Yes' or (8)'HECK YES'?");
    if (answer == 7)
    {
      ninjaTortoise();
    }
    else if (answer == 8)
    {
      ninjaTortoise();
    }
    else
    {
      badAnswer();
    }
  }
  private static void ninjaTortoise()
  {
    MessageBox.showMessage("Awesome Dude!  You live out the rest of your life fighting crimes and eating pizza!");
  }
  private static void wakeUp()
  {
    MessageBox.showMessage("You Wake up and have a boring day.  The End.");
  }
}
