import javax.swing.JFrame;


public class GrFrame extends JFrame
{   public static int scrW,scrH;
	public GrFrame (int W,int H)
	{	scrW=W; scrH=H;
		setSize(scrW,scrH);
		//frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("������ 1");
		setResizable(true);
		//frame.setUndecorated(true); //��� ����������� ���� ��� ����� � ���������
		//frame.setLocationRelativeTo(null);//�� ������
		setLocationByPlatform(true); //�������������� ��������� �����
		//frame.setIconImage(img);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
