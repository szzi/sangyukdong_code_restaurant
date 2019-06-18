package restaurant;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Receipt extends JFrame {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 8154583553222364300L;
	private JPanel contentPane;
	public int total, totalsum=0;	
	
	Receipt() {
	}
	
	public void run() {
		//super("receipt");
		setSize(450,600);
		setVisible(true);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//±âº» ·¹ÀÌ¾Æ¿ô
		JLabel lblNewLabel = new JLabel("»ê°Ýµ¿ ÇÜ¹ö°Å");
		lblNewLabel.setBounds(160, 8, 132, 36);
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("----------------------------------------------------------------------------------------------------");
		label_1.setBounds(12, 54, 456, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("----------------------------------------------------------------------------------------------------");
		label_2.setBounds(12, 108, 500, 15);
		contentPane.add(label_2);
		
		JLabel lblMenu = new JLabel("Name");
		lblMenu.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblMenu.setBounds(22, 79, 50, 20);
		contentPane.add(lblMenu);
		
		JLabel lblSum = new JLabel("Qty");
		lblSum.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblSum.setBounds(220, 79, 50, 20);
		contentPane.add(lblSum);
		
		JLabel lblCost = new JLabel("Total");
		lblCost.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblCost.setBounds(351, 79, 50, 20);
		contentPane.add(lblCost);
		
		JLabel label_3 = new JLabel("-----------------------------------------------------------------------------------------------------");
		label_3.setBounds(12, 475, 500, 15);
		contentPane.add(label_3);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblTotal.setBounds(30, 513, 50, 15);
		contentPane.add(lblTotal);
		
		
		//ÁÖ¹®³»¿ëÃâ·Â
		//ordername
		JTextArea ordername = new JTextArea();
		ordername.setText("");
		ordername.setEditable(false);
		for(int i=0;i<13;i++)
			if(Order.pre_count[i]!=0) {
				ordername.append(String.format("%s\n",MakeMenu.menu[i].name));
				contentPane.add(ordername);
			}
		ordername.setBounds(22, 141, 60, 324);
				
		//ordersum
		JTextArea ordersum = new JTextArea();
		ordersum.setText("");
		ordersum.setEditable(false);
		for(int i=0;i<13;i++)
			if(Order.pre_count[i]!=0) {
				ordersum.append(String.format("%d\n",Order.pre_count[i]));
				contentPane.add(ordersum);
			}
		ordersum.setBounds(235, 141, 30, 324);
		
		
		//ordercost
		JTextArea ordercost = new JTextArea();
		ordercost.setText("");
		ordercost.setEditable(false);
		
		for(int i=0;i<13;i++)
			if(Order.pre_count[i]!=0) {
				total=MakeMenu.menu[i].cost*Order.pre_count[i];
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
