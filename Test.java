package restaurant;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.CardLayout;

@SuppressWarnings("serial")
public class Test extends Frame implements ActionListener{
	
	static Frame f;
	public static CardLayout card;
	//JPanel contentPane;
	//private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					@SuppressWarnings("unused")
					Test frame = new Test();
					
					//frame.setSize(1024,768);
					//frame.setVisible(true);
					MakeMenu makemenu = new MakeMenu();
					makemenu.create();
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	Test(){
		
	f = new Frame();
	card = new CardLayout(0,0);
	
	JPanel p3;	
	
	
	f.setLayout(card);
	
	MainScreen mainscreen = new MainScreen();
	Sales sales = new Sales();
	//p1 = new JPanel();
	//p2 = new JPanel();
	p3 = new JPanel();
	
	JButton btn1,btn2,btn3;
	
	btn2= new JButton("영수증 출력");	
	btn3 = new JButton("예약/자리 확인");
	btn1 = new JButton("정산");
	
	
	btn1.addActionListener(this);
	btn2.addActionListener(this);
	btn3.addActionListener(this);
	
	//mainscreen.add("a",btn1);
	
	btn1.setBounds(521,594,159,75);
	//total_count.addActionListener(new ActionListener());
	
	
	mainscreen.panel_4.add(btn1);
	
	//p2.add("b",btn2);
	p3.add("c",btn3);
	
	
	
	//p2.setLayout(new FlowLayout(FlowLayout.CENTER));
	p3.setLayout(new FlowLayout(FlowLayout.CENTER));
	
	f.add("main_screen",mainscreen.p1);
	f.add("reservation",sales.p2);
	f.add("sales",sales.p2);
	
	card.show(f, "main_screen");
	
	f.setSize(1024,768);
	f.setVisible(true);
	
	f.addWindowListener(new WindowAdapter(){
		   public void windowClosing (WindowEvent  e) {
		    System.exit(1);
		   }
		  });
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str = e.getActionCommand();
		  if(str.equals("영수증 출력")){
		   card.show(f,"receipt"); //이와같은 방법으로 다른 카드(Panel)로의 변환이 가능하다.
		  }
		  else if(str.equals("결제")){
		   card.show(f,"");
		  }
		  else if(str.equals("정산")){
		   Sales sales1 = new Sales();
		   f.add("sales",sales1.p2);
		   card.show(f,"sales");
		  }
		  else if(str.equals("예약/자리 확인")) {
			  card.show(f,"reservation");
	}


}
}

