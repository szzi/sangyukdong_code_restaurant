package restaurant;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.Color;

@SuppressWarnings("serial")
public class Test extends Frame implements ActionListener{
	
	static Frame f;
	public static CardLayout card;
	MainScreen mainscreen;
	Sales sales;
	Receipt receipt;
//	Reservation reservation;
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
		Color color = new Color(254,206,0);	
	f = new Frame();
	card = new CardLayout(0,0);
	MakeMenu makemenu = new MakeMenu();
	makemenu.create();
	
	f.setLayout(card);
	
	mainscreen = new MainScreen();
	sales = new Sales();
	receipt = new Receipt();
//	reservation = new Reservation();
	
	JButton btn1,btn2,btn3;
	
	btn1 = new JButton("정산");
	btn2= new JButton("영수증 출력");	
	btn3 = new JButton("예약/자리 확인");
		
	btn1.addActionListener(this);
	btn2.addActionListener(this);
	btn3.addActionListener(this);

	btn1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
	btn2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
	btn3.setFont(new Font("맑은 고딕", Font.BOLD, 15));
	
	btn1.setBackground(color);
	btn2.setBackground(color);
	btn3.setBackground(color);
	btn1.setBounds(521,594,159,75);
	btn2.setBounds(47, 594, 159, 75);
	btn3.setBounds(768, 594, 159, 75);
	
	mainscreen.panel_4.add(btn1);
	mainscreen.panel_4.add(btn2);
	mainscreen.panel_4.add(btn3);
	
	f.add("main_screen",mainscreen.p1);

	
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
			  receipt.run();
			  //이와같은 방법으로 다른 카드(Panel)로의 변환이 가능하다.
		  }
		  else if(str.equals("정산")){
			  
			  sales.run();
			  f.add("sales",sales.p2);
			  card.show(f,"sales");
		  }
		  else if(str.equals("예약/자리 확인")) {
//			  @SuppressWarnings("unused")
//			  Client client = new Client();
			  Reservation reservation = new Reservation();  
			  f.add("reservation",reservation.p3);
			  reservation.run();
			  card.show(f,"reservation");
	}


}
}

