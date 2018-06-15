import arc.*;
import javax.swing.JFrame;
public class Game{
  public static void main(String[] args){
    Console con = new Console();
    con.setContentPanel(new GamePanel());
    con.pack();
    con.setVisible(true);
  }
}
      