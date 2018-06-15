import arc.*;

public class tools{

public String[][] loadMap(TextInputFile map){
    
    String strMap[][] = new String[5][100];
    //load the thingie
    

    for(int introws = 0; introws < 5;introws++){
      String strLine = map.readLine();
      for(int intcount2 = 0;intcount2 <= 99; intcount2++){
        strMap[intcount][intcount2] = strLine.substring(intcount2, intcount2+1);
      }
    }
    map.close();
 return strMap; 
  }
  
  public void render(Console con, String[][] map){

    for(int intcols = 0; intcols < 5;intcols++){

      for(int intcols = 0;intcols <= 99; intcols++){
        if(map[introws][intcols].equalsIgnoreCase("O")){
          con.setDrawColor(Color.WHITE);
          con.drawRect(intcols * 30, introws * 30,30,30);
         
      }
  } 
} con.repaint();
}
}