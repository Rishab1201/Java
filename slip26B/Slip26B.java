 import java.applet.*;
import java.awt.*;
      public class Slip26B extends Applet
{
      public void paint(Graphics g)
      {     
            g.drawRect(100,150,90,120); //for main building
            g.drawRect(130,230,20,40);  //for door
            g.drawLine(150,100,100,150);  //for left roof
            g.drawLine(150,100,190,150);  //for right roof
            g.drawLine(150,50,150,100); //for flag pole
            g.drawRect(150,50,20,20);  //for flag
      }
}

/*
 <html>
 <applet code=Slip26B height=300 width=300>
 </applet>
 </html>
 */