import javax.swing.JFrame;


public class GrFrame extends JFrame
{   public static int scrW,scrH;
	public GrFrame (int W,int H)
	{	scrW=W; scrH=H;
		setSize(scrW,scrH);
		//frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Пример 1");
		setResizable(true);
		//frame.setUndecorated(true); //Для отображения окна без рамки и заголовка
		//frame.setLocationRelativeTo(null);//по центру
		setLocationByPlatform(true); //самостоятельно выбираетя место
		//frame.setIconImage(img);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
