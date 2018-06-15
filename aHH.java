import arc.*;
import java.awt.*;
import java.awt.image.*;

public class aHH{
  public static void main(String[] args){
    while(true){
      Console con = new Console("GAME",800,550);
      BufferedImage bgr = con.loadImage("bg.png");
      con.drawImage(bgr, 0,0);
      con.repaint();
      
      TextInputFile map = new TextInputFile("maptest.txt");
      String strMap[][] = new String[5][100];
      //load the thingie
      
      
      
      map.close();
      
      for(int intcount = 0; intcount < 5;intcount++){
        
        for(int intcount2 = 0;intcount2 <= 50; intcount2++){
          if(strMap[intcount][intcount2].equalsIgnoreCase("O")){
            con.setDrawColor(Color.WHITE);
            con.drawRect(intcount2 * 70, intcount * 70,70,70);
            
          }else if(strMap[intcount][intcount2].equalsIgnoreCase("K")){
            con.setDrawColor(Color.RED);
            con.fillRect(intcount2 * 70, intcount * 70,70,70);
          }
          con.repaint();
        }
        
       
          for(int introws = 0; introws < 5;introws++){
            
            for(int intcols = 0;intcols <= 50; intcols++){
              if(strMap[introws][intcols].equalsIgnoreCase("K")){
                boolean blnChr = true;
                if(blnChr = true){
                  int intCurrentPosX = intcols;
                  int intCurrentPosY = introws;
                  
                  int intKey = con.currentChar();
                  if(intKey == 'W' || con.currentKey() == 38){
                    for(int intMove = 0; intMove < 100; intMove++){
                      String strtemp = strMap[intCurrentPosX][intCurrentPosY];
                      strMap[introws][intcols] = "S";
                      strMap[intCurrentPosX+1][intCurrentPosY+1] = strtemp;
                    }
                  }
                }
              }
            }
          }
          
        }
      }
    }
  }
//}
