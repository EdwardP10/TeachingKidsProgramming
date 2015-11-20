package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String currentEdVerb = MessageBox.askForTextInput("Enter a verb ending in -ed");
    if (currentEdVerb.isEmpty())
    {
      MessageBox.showMessage("y u no enter word");
      return;
    }
    else if (currentEdVerb.matches("[//d]*"))
    {
      MessageBox.showMessage("Hello! Numbers are Not EdVerbs, try again");
      return;
    }
    String currentNumber = MessageBox.askForTextInput("Enter a number");
    String currentVerb = MessageBox.askForTextInput("Enter a verb");
    String currentNoun = MessageBox.askForTextInput("Enter a living noun");
    String currentIngVerb = MessageBox.askForTextInput("Enter verb ending in -ing");
    String currentFood = MessageBox.askForTextInput("Enter a type of food");
    String currentStory = "Today I woke my " + currentNoun + ". Then I went " + currentIngVerb + " with "
        + currentFood + " . After that I " + currentVerb + " " + currentNumber + " people. Finally During night I "
        + currentEdVerb + " alone.";
    MessageBox.showMessage(currentStory);
  }
}
