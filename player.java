import arc.*;
public class player{
 
    double dblx;
    double dbly;
    double dbldx;
    
    int intwidth;
    int intheight;
    
    boolean blnleft;
    boolean blnright;
    boolean blnjumping;
    boolean blnfalling;
    
    double dblmovespeed;
    double dblmaxsspeed;
    double dblmaxfallspd;
    double dblstopspeed;
    double dbljumpStart;
    double dblgravity;
    
    Tilemap tilemap;
    
    public Player(Tilemap tm){
      tilemap = tm;
      
      width = 10;
      height = 20;
      
      dblmovespeed = 0.6;
      dblmaxsspeed = 4.2;
      dblmaxfallspd = 12;
      dblstopspeed = 0.30;
      dbljumpStart = -11.0;
      dblgravity = 0.64;
  }
    public void setLeft(boolean blnb){
      left = blnb;
    }
     public void setRight(boolean blnb){
      right = blnb;
    }
     public void setJumping(boolean blnb){
       if(!falling){
         jumping = true;
    }
       private void update(){
       }
       public void draw(Graphics2D g){
         int tx = Tilemap.
}