package Corrupted_ProceduralAPI;


import Engine.GameWindow;

/**
 * Class Main - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
@SuppressWarnings("serial")
public class Main extends GameWindow
{
  public Main()
  {
      setRunner(new LAB8());
  }

  public static void main(String[] args)
  {
	   
	  (new Main()).startProgram();
  }
}
