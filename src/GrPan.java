import java.awt.*;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

import figures.*;
import figures.Rectangle;


public class GrPan extends JPanel
{	Base[]  GrMas;		
	Random rnd;
	public GrPan()
	{	super();
		setBackground(Color.blue);
		rnd=new Random();
		GrMas=new Base[30];
		for(int i=0;i<GrMas.length;i++)
		{GrMas[i]=new Rectangle(rnd.nextInt(GrFrame.scrW-30),rnd.nextInt(GrFrame.scrH-30));
		  	
		}
		JButton yB=new JButton("Pusk");
		add(yB);
	}
	
	public void paintComponent(Graphics g)
	{ super.paintComponent(g);
	   for(int i=0;i<GrMas.length;i++)
	   { GrMas[i].paintComponent(g);
	   
	   }
	}

}


