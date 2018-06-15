import arc.*;
public class sort{
  public static void main(String[] args){
    Console con = new Console();
    TextInputFile map = new TextInputFile("maptest.txt");
    String strMap[][] = new String[5][100];
    for(int intcount = 0; intcount <= 3;intcount++){
      String strLine = map.readLine();
      int introw = 0;
      for(int intcount2 =0;intcount2 < 3; intcount2++){
         strMap[introw][intcount2] = strLine.substring(intcount2, intcount2+1);
         //con.println(strMap[introw][intcount2]);
         //con.sleep(2000);
          }
}
  }
}