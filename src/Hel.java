import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.*; 

//import javax.swing.JFrame;
import javax.swing.*;
public class Hel {
	public static final int WIDTH=800;	
	public static final int HEIGHT=600;
	//public static int scrW,scrH;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrFrame frame; //окно
		GrPan panel;
		
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		//Image img=kit.getImage("Wave.ico");
		
		frame=new GrFrame(screenSize.width/2,screenSize.height/2);
		//размеры
		
		
		panel=new GrPan();
		
		frame.add(panel);
		//JK1=new figures.Base(100,100);
		//panel.add(JK1);
		//JK2=new figures.Rectangle(150,150);
		//panel.add(JK2);
		
		
		frame.setVisible(true);
		System.out.println("Hellow World!");
		
		
		//File f=new File("C:\\","BROM_DLL.log");
		//System.out.println("File name: "+ f.getName());
	}

}
