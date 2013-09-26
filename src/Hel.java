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
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame; //окно
		GrPan panel;
		JComponent JK1,JK2,JK3;
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int scrW=screenSize.width/4;
		int scrH=screenSize.height/4;
		Image img=kit.getImage("Wave.ico");
		
		frame=new JFrame();
		//размеры
		frame.setSize(scrW,scrH);
		//frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setTitle("Пример 1");
		frame.setResizable(false);
		//frame.setUndecorated(true); //Для отображения окна без рамки и заголовка
		//frame.setLocationRelativeTo(null);//по центру
		frame.setLocationByPlatform(true); //самостоятельно выбираетя место
		frame.setIconImage(img);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
