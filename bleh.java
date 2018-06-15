import arc.*;
import java.awt.*;
import java.awt.image.*;

public class bleh{
  public static void main(String[] args){
    Console con = new Console();
    
  
    String[][] strMap = loadMap();
    con.render(con,strMap);
  }
public String[][] loadMap(){
    TextInputFile map = new TextInputFile(maptest.txt);
    String strMap[][] = new String[5][100];
    //load the thingie
    

    for(int intcount = 0; intcount < 5;intcount++){
      String strLine = map.readLine();
      for(int intcount2 = 0;intcount2 <= 99; intcount2++){
        strMap[intcount][intcount2] = strLine.substring(intcount2, intcount2+1);
      }
    }
    map.close();
 return strMap; 
  }
  
  public void render(Console con, String[][] map){

    for(int intcount = 0; intcount < 5;intcount++){

      for(int intcount2 = 0;intcount2 <= 99; intcount2++){
        if(map[intcount][intcount2].equalsIgnoreCase("O")){
          con.setDrawColor(Color.WHITE);
          con.drawRect(intcount2 * 30, intcount * 30,30,30);
         
      }
  } 
} con.repaint();
}
}
  
//}

