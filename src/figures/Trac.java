package figures;

import java.awt.Color;
import java.awt.Graphics;

public class Trac 
{ int TX;
  int TW;
  int ScrW;
  
  public Trac(int W)
  { ScrW=W;
  	TW=100;
  	TX=ScrW/2-TW/2;
    
  }
  
  public void paintComponent(Graphics g)
  {
		// super.paintComponent(g);
		 g.setColor(Color.RED);
		 g.fillRect(TX,100,TW,30); 
  }
  
  

}
