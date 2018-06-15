import arc.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;

public class CPTGameKiara{
  public static void main(String[] args){
    Console con = new Console("Dissonance",850,700);
    
    int intPlayerX = 0;
    int intPlayerY = 2;
    boolean running = true;
    //logo + title page
     /* cptTools.logo(con);
      con.repaint();
      con.sleep(2000);
      con.setDrawColor(Color.BLACK);
      con.fillRect(0,0,900,900);
      cptTools.title(con);
      con.sleep(3000);
        con.setDrawColor(Color.BLACK);
      con.fillRect(0,0,900,900);
      */
    boolean blnreturn = false;
    while(running = true || blnreturn == true){
      int intMouseX = con.currentMouseX();
      int intMouseY = con.currentMouseY();
      
      
      int intclick = con.currentMouseButton();
      //main menu
     
      String strLabel1 = "P L A Y";
      String strLabel2 = "T U T O R I A L";
      String strLabel3 = "H I G H S C O R E S";
      String strLabel5 = "Q U I T";
      
      //cptTools.purplebutton(con,strLabel1,150,50,intclick,intMouseX,intMouseY);
      boolean blnplay = cptTools.purplebutton(con,strLabel1,150,50,intclick,intMouseX,intMouseY);
      String[][] strMap = cptTools.txtToArray();
      if(blnplay == true){
        //the game
        cptTools.clear(con);
        
        cptTools.tiles(strMap,con);
        
        int intkey = con.currentChar();
        strMap = cptTools.playerMove(strMap,intPlayerX, intPlayerY,intkey);
        
      }
      boolean blntut = cptTools.purplebutton(con,strLabel2,150,250,intclick,intMouseX,intMouseY);
      
      while(blntut == true){
      
      BufferedImage tut = con.loadImage("tutorial.png");
      con.drawImage(tut,-30,-10);
                                      
      
      String strLabel4 = "R E T U R N";
      //return button
      blnreturn = cptTools.purplebutton(con,strLabel4,150,550,intclick,intMouseX,intMouseY);
      if(blnreturn == true){
        blntut = false;
      }
      }
      boolean blnHS = cptTools.purplebutton(con,strLabel3,150,450,intclick,intMouseX,intMouseY);
      if(blnHS == true){
        boolean blnwin = false;
        cptTools.highscores(con,blnwin);
        
        
     // }
   // }
  
}
}
}
}
//}