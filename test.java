import arc.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;

public class test{
  public static void main(String[] args){
    Console con = new Console("GAME",750,600);
    
    boolean blnrun = true;
    while(blnrun = true){
      
     /* int intMouseX = con.currentMouseX();
      int intMouseY = con.currentMouseY();
      
      
      int intclick = con.currentMouseButton();
      //logo on startup
      //cptTools.logo((con));
      
      con.sleep(2000);
      con.clear();
      
      //game title
      BufferedImage title = con.loadImage("Title.png");
      con.drawImage(title, 0,0);
      con.repaint();
      con.sleep(5000);
      //game menu
      
      
      //play
      
      BufferedImage bgr = con.loadImage("bg.png");
      con.drawImage(bgr, 0,0);
      con.repaint();
      */
      String[][] strMap = cptTools.txtToArray();
      cptTools.highscores(con);
      cptTools.tiles(strMap,(con));
      //instructions
      //highscores
      //quit
     // if(intclick == 1 && (intMouse...0{
      //  blnrun = false;
      }
       
         
         }
 
   }
    