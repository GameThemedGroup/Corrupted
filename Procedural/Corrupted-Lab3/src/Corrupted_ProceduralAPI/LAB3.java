package Corrupted_ProceduralAPI;

import Corrupted_ProceduralAPI.CorruptedProceduralAPI;

/**
 * LAB 3: If/Else Lab
 * 
 * @author Rachel Horton
 */
public class LAB3 extends CorruptedProceduralAPI
{
    
   public void buildGame()
   {
       
   }
   
   public void updateGame()
   {
       if(pressingRight())
       {
           drawTile(22,5, "green");
       }
       else if(pressingLeft())
       {
           drawTile(1,5, "red"); 
       }
       else if (pressingUp())
       {
           drawTile(8,8,"yellow");
       }
       else if (pressingDown())
       {
           drawTile(1,1,"blue");
       }
    }
}
