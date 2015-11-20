package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.windows.MessageBox;

public class Password
{
  public static void main(String[] args)
  {
    int password = 12;
    for (int i = 0; i < 5; i++)
    {
      int guess = MessageBox.askForNumericalInput("enter your password");
      if (guess == password)
      {
        MessageBox.showMessage("You have entered the correct password");
        System.exit(0);
      }
      else if (guess != password)
      {
        MessageBox.showMessage("You have entered the wrong password you have " + (4 - i) + " more tries ");
      }
    }
    MessageBox.showMessage("You have run out of tries sorry try again in 30 seconds");
  }
}
