import arc.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;

public class cptTools{
  public static void main(String[] args){
    Console con = new Console(880,500);
    logo(con);
  }
  
  //logo
  
  public static void logo(Console con){
    BufferedImage imgLogo = con.loadImage("logo.png");
    con.drawImage(imgLogo,0,0);
    con.repaint();
  }
    public static void title(Console con){
    BufferedImage title = con.loadImage("Title.png");
    con.drawImage(title,-40,0);
    con.repaint();
  }
  
    public static void clear(Console con){
      con.setDrawColor(Color.BLACK);
      con.fillRect(0,0,800,800);
      con.repaint();
    }
    //button base + draw label
    //animated(pressed event){ true} use for --> if(true){go to page}
  public static boolean purplebutton(Console con,String strLabel,int intX, int intY,int intclick, int intMouseX, int intMouseY){
    BufferedImage buttonBaseP = con.loadImage("buttonp.png");
    BufferedImage buttonBasePress = con.loadImage("buttonppress.png");
    Font Montserrant = con.loadFont("/Montserrat-Bold.ttf",50);
    boolean blnclick = false;

    con.drawImage(buttonBaseP,intX,intY);
    con.setDrawFont(Montserrant);
    con.setDrawColor(Color.WHITE);
    con.drawString(strLabel,intX+20, intY-5);
    con.repaint();
    if(intclick == 1 &&((intMouseX >= intX && intMouseX <= (intX+500)) && (intMouseY >= intY && intMouseY <= (intY+200)))){
      con.setDrawColor(Color.BLACK);
      con.fillRect(intX,intY,800,200);
      con.drawImage(buttonBasePress,intX,intY);
      con.repaint();
      blnclick = true;

    }else{
      blnclick = false;
    }
    return blnclick;
  }

//map to array
  public static String[][] txtToArray(){
    TextInputFile map = new TextInputFile("maptest.txt");
    String strMap[][] = new String[5][100];
    
    for(int intcount = 0; intcount < 5;intcount++){
      String strLine = map.readLine();
      for(int intcount2 = 0;intcount2 <= 99; intcount2++){
        strMap[intcount][intcount2] = strLine.substring(intcount2, intcount2+1);
      }
    }
    map.close();
    return strMap;
  }
  
//tile draw
  public static void tiles(String[][] strMap,Console con, int intPlayerX){
    for(int intcount = 0; intcount < 5;intcount++){
      int intPlayerWidth = 70;
      int intPlayerHeight = 70;
      for(int intcount2 = intPlayerX;intcount2 < intPlayerX + 10; intcount2++){
        if(strMap[intcount][intcount2].equalsIgnoreCase("O")){
          con.setDrawColor(Color.WHITE);
          con.drawRect(intcount2 * intPlayerHeight, intcount * intPlayerWidth,intPlayerWidth,intPlayerHeight);
          
        }else if(strMap[intcount][intcount2].equalsIgnoreCase("K")){
          con.clear();
          con.setDrawColor(Color.RED);
          con.fillRect(intcount2 * intPlayerHeight, intcount * intPlayerWidth,intPlayerWidth,intPlayerHeight);
        }
        con.repaint();
      }
    }
  }
  public static String[][] playerMove(String[][] strMap,int intPlayerX, int intPlayerY, int intkey){
    String[][] strmapnew = new String[5][100];
    for (int intcount = 0; intcount < 5;intcount++)
    {
      for (int intcount2 = 0;intcount2 <= 50; intcount2++)
      {
        if (strMap[intPlayerY -1][intPlayerX].equalsIgnoreCase("S") && (intkey == KeyEvent.VK_UP || intkey == KeyEvent.VK_W)){
          strMap[intPlayerY][intPlayerX]= "S";
        intPlayerY = intPlayerY - 1;
      }
        else if(strMap[intPlayerY -1][intPlayerX].equalsIgnoreCase("O") && (intkey == KeyEvent.VK_UP || intkey == KeyEvent.VK_W)){
        //intPlayer =
      
    }return strmapnew;
  }
  
    }
  }
  
  //Highscores (if blncollide = true or if end is reached)
  public static String[][] highscores(Console con,boolean blnwin){
    if(blnwin == true){
     TextOutputFile scores = new TextOutputFile("scores.txt",true);
    con.println("What is your name?");
    scores.println(con.readLine());
    scores.println(con.readLine());
//format will be:
//name
//max score
    scores.close();
    }
    TextInputFile lines = new TextInputFile("scores.txt");
    /* Insert code to count the number of lines in the file
     * and chop the aray based on the count
     */
    String strline;
    int intplayercount = 0;
    
    while(lines.eof() == false){
      strline = lines.readLine();
      intplayercount = intplayercount+1;
    }
    intplayercount = intplayercount/2;
    lines.close();
    
    
    TextInputFile hs = new TextInputFile("scores.txt");
    String strHS[][];
    strHS = new String[intplayercount][1];
    
    int intcount;
    for(intcount = 0; intcount<intplayercount-1; intcount++){
      String strname = hs.readLine();
      String strscore = hs.readLine();
      strHS[intcount][0] = strname;
      strHS[intcount][1] = strscore;
    }
    hs.close();

  // Sort 2d array
  int intleft;
  int intright;
  String strtemp;
  int intcount3;
  int intcount2;
  for(intcount2 = 0; intcount2 < intplayercount-1; intcount2++){
    for(intcount3 = 0; intcount3 < intplayercount-1; intcount3++){
      intleft = Integer.parseInt( strHS[intcount3][1]);
      intright = Integer.parseInt( strHS[intcount3+1][1]);
      if(intleft > intright){
        // best scores
        strtemp =  strHS[intcount3][1];
         strHS[intcount3][1] =  strHS[intcount3+1][1];
         strHS[intcount3+1][1] = strtemp;
        // names
        strtemp =  strHS[intcount3][0];
         strHS[intcount3][0] =  strHS[intcount3+1][0];
         strHS[intcount3+1][0] = strtemp;
      }
    }
  }
  
  // Print 2d array
  con.println("after sorting");
  for(intcount = 0; intcount < intplayercount; intcount++){
    con.println( strHS[intcount][0] + "\t"
                  +  strHS[intcount][1] + "\t"
                  +  strHS[intcount][2] + "\t");
  }
  return strHS;
}
  /*
  public class void printScores(Console con, String[][] strHS){
    clear();
     Font Montserrant = con.loadFont("/Montserrat-Bold.ttf",50);
     Font score = con.loadFont("/Montserrat-Bold.ttf",30);
     
     for(int intcount = 0; intcount < 
    con.setDrawColor(Color.WHITE);
    con.drawString(strLabel,intX+20, intY-5);
    con.repaint();
     
  }

  */ 
  
  
 // int intPlayerX, intPlayerY, intPlayerWidth, intPlayerHeight;
//WE WILL STORE AN X, Y, WIDTH, AND HEIGHT FOR EVERY OBJECT IN THE GAME
  //int[][] intObjectCoords[][];
  
  public static boolean collision(int[][] intObjectCoords,int intPlayerX,int intPlayerY, int intPlayerWidth,int intPlayerHeight){                                
    
//\EXTRA PLAYER VARIABLES (X2 and Y2 are X + Width and Y + Height)
    int intPlayerX2 = intPlayerX + intPlayerWidth;
    int intPlayerY2 = intPlayerY + intPlayerHeight;
    boolean blncollide = false;
//LOOP THROUGH OBJECTS
    for(int intCount = 0; intCount < intObjectCoords.length; intCount++){
      //SET UP OBJECT VARIABLES (X2 and Y2 are X + Width and Y + Height)
      int intObjectX = intObjectCoords[intCount][0];
      int intObjectY = intObjectCoords[intCount][1];
      int intObjectX2 = intObjectX + intObjectCoords[intCount][2];
      int intObjectY2 = intObjectY + intObjectCoords[intCount][3];
      
      //CHECK FOR COLLISION
      if(intPlayerX2 >= intObjectX && intPlayerX <= intObjectX2 &&
         intPlayerY2 >= intObjectY && intPlayerY <= intObjectY2){
        //YOU HAVE COLLIDED!!
        blncollide = true;
      }else{
        blncollide = false;
      }  
      
      //if collision = true;
      //store x in array as hs
      
      

//highscores(playerscore, name) {bblsort}
      
    }
    return blncollide;
    
  }
  }
