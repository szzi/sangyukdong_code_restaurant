import javax.swing.DropMode;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

public class receipt extends JFrame {

	private JPanel contentPane;
	public int total, totalsum=0;
	
	//합칠때 메인 클래스 이름으로 바꾸기//
	se testorder=new se();
	
	receipt() {
		
		super("receipt");
		setSize(450,600);
		setVisible(true);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//기본 레이아웃
		JLabel lblNewLabel = new JLabel("\uACBD\uBD81\uB300 \uB9C8\uCE74\uB871");
		lblNewLabel.setBounds(169, 8, 132, 36);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("----------------------------------------------------------------------------------------------------");
		label_1.setBounds(12, 54, 456, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("----------------------------------------------------------------------------------------------------");
		label_2.setBounds(12, 108, 500, 15);
		contentPane.add(label_2);
		
		JLabel lblMenu = new JLabel("menu");
		lblMenu.setFont(new Font("굴림", Font.PLAIN, 20));
		lblMenu.setBounds(22, 79, 50, 15);
		contentPane.add(lblMenu);
		
		JLabel lblSum = new JLabel("sum");
		lblSum.setFont(new Font("굴림", Font.PLAIN, 20));
		lblSum.setBounds(220, 79, 50, 15);
		contentPane.add(lblSum);
		
		JLabel lblCost = new JLabel("cost");
		lblCost.setFont(new Font("굴림", Font.PLAIN, 20));
		lblCost.setBounds(351, 79, 50, 15);
		contentPane.add(lblCost);
		
		JLabel label_3 = new JLabel("-----------------------------------------------------------------------------------------------------");
		label_3.setBounds(12, 475, 500, 15);
		contentPane.add(label_3);
		
		JLabel lblTotal = new JLabel("total");
		lblTotal.setFont(new Font("굴림", Font.PLAIN, 18));
		lblTotal.setBounds(30, 513, 50, 15);
		contentPane.add(lblTotal);
		
		
		//주문내용출력
		//ordername
		JTextArea ordername = new JTextArea();
		ordername.setText("");
		ordername.setEditable(false);
		for(int i=0;i<13;i++)
			if(testorder.order.count[i]!=0) {
				ordername.append(String.format("%s\n",testorder.makemenu.menuName[i]));
				contentPane.add(ordername);
			}
		ordername.setBounds(22, 141, 60, 324);
				
		//ordersum
		JTextArea ordersum = new JTextArea();
		ordersum.setText("");
		ordersum.setEditable(false);
		for(int i=0;i<13;i++)
			if(testorder.order.count[i]!=0) {
				ordersum.append(String.format("%d\n",testorder.order.count[i]));
				contentPane.add(ordersum);
			}
		ordersum.setBounds(235, 141, 30, 324);
		
		
		//ordercost
		JTextArea ordercost = new JTextArea();
		ordercost.setText("");
		ordercost.setEditable(false);
		
		for(int i=0;i<13;i++)
			if(testorder.order.count[i]!=0) {
				total=testorder.makemenu.menuCost[i]*testorder.order.count[i];
				ordercost.append(String.format("%d\n",total));
				contentPane.add(ordercost);
				totalsum+=total;
			}		
		ordercost.setBounds(360, 141, 40, 324);
		
		//total
		JTextArea ordertotal = new JTextArea();
		ordertotal.setText("");
		ordertotal.setEditable(false);
		ordertotal.append(String.format("%d", totalsum));
		contentPane.add(ordertotal);
		ordertotal.setBounds(350, 509, 79, 24);
	}
	
}
