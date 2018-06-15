import arc.*;
import java.awt.*;

public class tileMap{
  
  private int x;
  private int y;
  
  private int tileSize;
  private String strMap[][];
  private int mapWidth;
  private int mapHeight;
  
  public tileMap(String s,int tileSize){
    this.tileSize = tileSize;
    
    try{
      TextInputFile map = new TextInputFile("maptest.txt");
      mapWidth = 100;
      //mapWidth = Integer.parseInt(map.readLine);
      mapHeight = 5;
      //mapHeight = Integer.parseInt(map.readLine);
      strMap = new String[mapHeight][mapWidth];
      
      //substring to add txt to map array
      for(int intcount = 0; intcount <= 3;intcount++){
        String strLine = map.readLine();
        int introw = 0;
        for(int intcount2 =0;intcount2 < 3; intcount2++){
          strMap[introw][intcount2] = strLine.substring(intcount2, intcount2+1);
        }
      }
    }
        catch(Exception e){
        }
  }
        public void update(){
    }
        public void draw(Graphics2D g){
          for(int row = 0; row < mapHeight;row++){
            for(int col= 0 ; col < mapWidth;col++){
              
              String rc = strMap[row][col];
              
              if(rc.equalsIgnoreCase("S")){
                
                //black tiles with spaces for now
                g.setColor(Color.BLACK);
              }
              else if(rc.equalsIgnoreCase("O")){
                //white for obstacles (change this later)
                g.setColor(Color.WHITE);
              }
                      g.fillRect(x + col * tileSize, y + row * tileSize,tileSize,tileSize);
                      
                      
  }
}
        }
}