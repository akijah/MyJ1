package figures;

import java.awt.Graphics;

import javax.swing.*;

 public class Rectangle extends Base 
 {
	 public Rectangle(int X,int Y){
		 super(X,Y);
	 }
	 
	 public void paintComponent(Graphics g){
		// super.paintComponent(g);
		g.drawOval(X, Y, D, D); 
	 }
	 

}
