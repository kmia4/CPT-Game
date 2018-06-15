import arc.*;
import java.awt.*;
import java.awt.image.*;

public class aNOTHERONE{
  public static void main(String[] args){
    Console con = new Console();
    
    String strMap[][] = new String[5][100];
    //load the thingie
    
    for(int intcount = 0; intcount < 5;intcount++){
      String strLine = map.readLine();
      for(int intcount2 = 0;intcount2 <= 99; intcount2++){
        strMap[intcount][intcount2] = strLine.substring(intcount2, intcount2+1);
      }
    }
    map.close();
  }
}
    