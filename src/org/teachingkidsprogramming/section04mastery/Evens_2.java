package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.windows.MessageBox;

public class Evens_2
{
  public static void main(String[] args)
  {
    int numbers = MessageBox.askForNumericalInput("how many evens  do you want?");
    int jeff = MessageBox.askForNumericalInput("what multiple do you want  your numbers to go by");
    for (int i = 0; i < numbers; i++)
    {
      if (i % jeff == 0)
      {
        System.out.println(i);
      }
    }
  }
}
