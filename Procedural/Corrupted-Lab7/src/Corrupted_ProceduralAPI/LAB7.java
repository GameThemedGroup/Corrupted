package Corrupted_ProceduralAPI;

import Corrupted_ProceduralAPI.CorruptedProceduralAPI;

/**
 * LAB 7: Make a Board!
 * 
 * You can model for the students writing the drawColumn() method, if you like.
 * Make sure to model it though. Having 2 variables in the loop will be difficult.
 * Code included here.
 * 
 * @author Rachel Horton
 */
public class LAB7 extends CorruptedProceduralAPI
{
    public void buildGame()
    {
        for(int currentNum = 8; currentNum < 26; currentNum = currentNum + 1)
        {
            drawColumn(currentNum);
        }
    }
    
    public void updateGame()
    {
    }
    
    public void drawColumn(int x)
    {
        for(int i = 0; i < 10; i++)
        {
            drawTile(x, i, getRandomColor());   
        }        
    }
}
