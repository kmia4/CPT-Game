
import arc.*;
public class maptest{
  public static void main(String[] args){
    Console con = new Console();
    
    TextInputFile map = new TextInputFile("maptest.txt");
    
    int introws = 0;
    while(map.eof() == false){
      String strRows = map.readLine();
      
      introws = introws +1;
      
    }
    map.close();
    con.println("There are this many rows: "+introws);
    
    
    TextInputFile sub = new TextInputFile("maptest.txt");
    
    while(sub.eof() == false){
      String strLine = sub.readLine();
      con.println(strLine);
      int intlength = strLine.length();
      for(int intcount = 0;intcount <= intlength;intcount++){
        String strpart = strLine.substring(intcount,intcount+1);
        con.println(strpart);

        String strmap[][] = new String[introws][intlength];
        for(int intcount2 = 0;intcount2<(intlength*introws);intcount2++){
          int intrownumb = 0;
          strmap[intrownumb][intcount2] = strpart;
          if(intcount2 == intlength){
            intrownumb = intrownumb + 1;
      }
    }
       /*  for(int intRow = 0; intRow < 6; intRow++){
      con.println(strmap[intRow][0] + "\t"
                    + strmap[intRow][1] + "\t"
                    + strmap[intRow][2] + "\t"
                    + strmap[intRow][3] + "\t"
                    + strmap[intRow][4] + "\t"
                    + strmap[intRow][5]);
    } */
  }
      

}
}
}