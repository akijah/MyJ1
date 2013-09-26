package figures;
import java.awt.*;
import javax.swing.*;

public class Base
{ 	int X,Y; 
	int D; //диаметр
	 
	public Base (int X, int Y)
	{
		 this.X=X;
		 this.Y=Y;
		 D=30;
	}
	 
	public void paintComponent(Graphics g)
	{
		 //super.paintComponent(g);
		 g.drawString("Base", X,Y);
	}
	 
}
