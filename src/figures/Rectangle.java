package figures;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

 public class Rectangle extends Base 
 {
	 public Rectangle(int X,int Y){
		 super(X,Y);
	 }
	 
	 public void paintComponent(Graphics g){
		// super.paintComponent(g);
		g.setColor(Color.RED);
		 g.fillRect(X, Y, D, D); 
	 }
	 

}
