import arc.*;
import java.awt.*;
import java.awt.image.*;

public class map{
  public static void main(String[] args){
    Console con = new Console();
    
    TextInputFile map = new TextInputFile("maptest.txt");
    //while(map.eof() == false){
    int intmapwidth = Integer.parseInt(map.readLine());
    int intmapheight = Integer.parseInt(map.readLine());
    
    con.println(intmapwidth);
    con.println(intmapheight);
    
    String strmap[][] = new String[intmapheight][intmapwidth];
    for(int intcount = 0; intcount < (intmapwidth * intmapheight);intcount++){
      //make this into method later
       String strLine = map.readLine();
        con.println(strLine);
        int intlength = strLine.length()/2;
        
      while(map.eof() == false){
       
        for(intcount = 0;intcount <= intlength ;intcount++){
          String strpart = strLine.substring(intcount,intcount+1);
          
          for(int intcount2 = 0; intcount2 < intlength;intcount2++){
            int introw = 0;
            strmap[introw][intcount2] = strpart;
            
            con.sleep(2000);
            con.println(strmap[introw][intcount2]);
            
            
          }
        }
      }
    }
  }
}