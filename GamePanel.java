import arc.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;


  public class GamePanel extends JPanel implements Runnable{
    
    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;
    
    private Thread thread;
    private boolean running;
    private BufferedImage image;
    private Graphics2D g;
    
    private int FPS = 30;
    private int targetTime = 1000/FPS;
    
    private TileMap tileMap;
    
    public GamePanel(){
      super();
      setPrefferedSize(new Dimension(WIDTH,HEIGHT));
      setFocusable(true);
      requestFocus();
    }
    public void addNotify(){
      super.addNotify();
      if(thread == null){
        thread = new Thread(this);
        thread.start();
      }
    }
    
      
      public void run(){
        
        initialize();
        
        long startTime;
        long urdTime;
        long waitTime;
        
        while(running){
          startTime = System.nanoTime();
          
          update();
          render();
          draw();
          
          urdTime = (System.nanoTime() - startTime)/1000000;
          waitTime = targetTime - urdTime;
          
          try{
            Thread.sleep(waitTime);
          }
          catch(Exception e){
          }
          
        }
      }
          //init
          public void initilialize(){
            
            running = true;
            image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
            g =(Graphics2D)image.getGraphics();
            
            tileMap = new TileMap("maptest.txt",32);
          }
          ///////////////////////////////////
          
          private void update(){
            
            tileMap.update();
            
          }
          private void render(){
            
            tileMap.draw(g);
          }
          private void draw(){
            Graphics g2 = getGraphics();
            g2.drawImage(image,0,0,null);
            g2.dispose();
          }
        }
      
  
  