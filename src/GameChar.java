/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author danielschroeder
 */

/*
The GameChar class includes methods to execute the go and inventory commands.

The go and inventory commands should be executed by an instance of the GameChar class. 
Also, the part of the map visible to the character should be determined by a GameChar 
object so that if the character has special abilities (a telescope) or limitations 
(no light in an indoor map) the map visibility can be adjusted accordingly. 
(You don't have to do anything with telescopes or light for this program.)
*/
import java.io.*;
import java.util.*;

public class GameChar {
    
    private int currentRow, currentColumn;
    private String[] inventory = new String[]{"brass lantern", "rope", "rations", "staff"};
    
    //Default Constructor
    GameChar(){
        
    }
    
    /*
    
    */
}
