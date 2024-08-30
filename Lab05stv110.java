// Lab05stv110.java
// Janee Yeak's work
// 15 October 2020
// This program draws curved lines with only straight lines on all four corners of a rectangle  
// and also draws a mini-version inside that bigger rectangle.

import java.awt.*;
import java.applet.*;


public class Lab05stv110 extends Applet
{
	public void init()
   {
      setSize(1000,650);
   }

   public void paint(Graphics g)
	{
		int width = 980;
		int height = 630;
		int x1 = 10;
		int y1 = 640;
		int x2 = 990;
		int y2 = 640;
		g.drawRect(10,10,width,height);
      x1+=5;

      for(int k = 1; k < 50; k++)
      {
         g.drawLine(x1,y1,x2,y2);
         x1+=20;
         y2-=13;
      }
      
      int xa = 10;
		int ya = 640;
		int xb = 990;
		int yb = 640;
      xb-=5;
      
      for(int k = 1; k < 50; k++)
      {
         g.drawLine(xa,ya,xb,yb);
         xb-=20;
         ya-=13;
      }
      
      int xA = 10;
		int yA = 10;
		int xB = 990;
		int yB = 10;
      xB-=5;
      
      for(int k = 1; k < 50; k++)
      {
         g.drawLine(xA,yA,xB,yB);
         xB-=20;
         yA+=13;
      }
      
      int xaa = 10;
		int yaa = 10;
		int xbb = 990;
		int ybb = 10;
      xaa+=5;
      
      for(int k = 1; k < 50; k++)
      {
         g.drawLine(xaa,yaa,xbb,ybb);
         xaa+=20;
         ybb+=13;
      }
      
       
      int width1 = 480;
		int height1 = 310;
		int x11 = 260;
		int y11 = 480;
		int x22 = 740;
		int y22 = 480;
		g.drawRect(260,170,width1,height1);
      x11+=5;

      for(int k = 1; k < 25; k++)
      {
         g.drawLine(x11,y11,x22,y22);
         x11+=20;
         y22-=13;
      }
      int xaA = 260;
		int yaA = 170;
		int xbB = 260;
		int ybB = 480;

      xbB-=2.5;
      
      for(int k = 1; k < 25; k++)
      {
         g.drawLine(xaA,yaA,xbB,ybB);
         xbB+=20;
         yaA+=13;
      }
      
      int xAA = 260;
		int yAA = 170;
		int xBB = 740;
		int yBB = 170;
      xBB-=2.5;
      
      for(int k = 1; k < 25; k++)
      {
         g.drawLine(xAA,yAA,xBB,yBB);
         xBB-=20;
         yAA+=13;
      }
      
      int xAa = 260;
		int yAa = 170;
		int xBb = 740;
		int yBb = 170;
      xAa+=2.5;
      
      for(int k = 1; k < 25; k++)
      {
         g.drawLine(xAa,yAa,xBb,yBb);
         xAa+=20;
         yBb+=13;
      }
        
	}
}

