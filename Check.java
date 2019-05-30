package why;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JMenu;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JTextArea;


public class Check extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Check frame = new Check();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		/**
		 * Create the panel.
		 */
	
	
	public Check() {
		
		MakeMenu makemenu = new MakeMenu();
		makemenu.create();
		Order order1 = new Order();
		
			getContentPane().setLayout(null);
			int n=1;//������ ��Ÿ��
			
			
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 1024, 768);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				contentPane.setLayout(new BorderLayout(0, 0));
				setContentPane(contentPane);	
			
			JPanel panel = new JPanel();
			panel.setBounds(14, 12, 317, 382);
			getContentPane().add(panel);
			
			JPanel panel_4 = new JPanel();
			panel.setBounds(5, 12, 317, 382);
			panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
			panel.add(panel_4);
			panel_4.setLayout(null);
			
			JPanel panel_5 = new JPanel();
			panel_5.setBounds(26, 38, 347, 483);
			panel_4.add(panel_5);
			panel_5.setLayout(null);
			
			JTextArea textArea = new JTextArea();
			textArea.setEditable(false);
			textArea.setBounds(14, 12, 319, 459);
			panel_5.add(textArea);
			
			//makemenu.create();
			makemenu.printMenu();
			JButton payment = new JButton("����");
			payment.setBounds(267, 594, 159, 75);
			payment.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					order1.save();
					order1.print();
					textArea.setText(null);//�� �����
					
				}
			});
			panel_4.add(payment);
			
			JButton receiptPrint = new JButton("������ ���");
			receiptPrint.setBounds(47, 594, 159, 75);
			receiptPrint.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			panel_4.add(receiptPrint);
			
			JButton total_count = new JButton("����");
			total_count.setBounds(521, 594, 159, 75);
			panel_4.add(total_count);
			
			JButton reservation = new JButton("����/ �ڸ� Ȯ��");
			reservation.setBounds(768, 594, 159, 75);
			reservation.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			
			
			panel_4.add(reservation);
			JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane_1.setBounds(399, 11, 583, 519);
			panel_4.add(tabbedPane_1);
			JPanel panel_2 = new JPanel();
			tabbedPane_1.addTab("�� �޴�", panel_2);
			panel_2.setLayout(null);
			
			
			textArea.append(String.format(" "));
			textArea.append(String.format("  �޴�        ����       ����\n"));
			textArea.append(String.format("-----------------------------------------------\n"));
			
			JButton button_0 = new JButton("�Ұ����� 2000��");
			button_0.setBounds(25, 37, 158, 98);
			button_0.addActionListener(new ActionListener() {
				int count=1;
				public void actionPerformed(ActionEvent arg0) {
					if((JButton) arg0.getSource() == button_0&& count==1) {
						(order1).setCount(0);
						textArea.append(String.format("�Ұ����� 2000��  %d��\n",n));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					
					if(count>1) {
						//���� �ִ� �ܹ��� ���ֿ� string�� ���ְ� �Ǹ������� append�ؼ� ������ �߰��� ������ ����ϱ�
						int start = textArea.getSelectionStart(); //���úκ��� ������
						int end = textArea.getSelectionEnd(); //���úκ��� ����
						textArea.replaceRange("", start, end); //���ۺκа� ���� ���̸� �������� ��ü

						textArea.append(String.format("�Ұ����� 2000��  %d��\n",count));
						textArea.append(String.format("-----------------------------------------------\n"));
				}
					count++;
				}
				
			});
			panel_2.add(button_0);
			
			JButton button_1 = new JButton("ġŲ���� 3000��");
			button_1.setBounds(219, 37, 158, 98);
			button_1.addActionListener(new ActionListener() {
				int count=1;
				public void actionPerformed(ActionEvent arg0) {
					if((JButton) arg0.getSource() == button_1 && count==1) {
						order1.setCount(1);
						textArea.append(String.format("ġŲ����    3000��  %d��\n", n));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					if(count>1) {
						
						int start = textArea.getSelectionStart(); //���úκ��� ������
						int end = textArea.getSelectionEnd(); //���úκ��� ����
						textArea.replaceRange(null, start, end); //���ۺκа� ���� ���̸� �������� ��ü
						textArea.append(String.format("ġŲ����    3000��  %d��\n", count));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					count++;	
				}
			});
	
			panel_2.add(button_1);
			
			JButton button_2 = new JButton("ġ����� 2000��");
			button_2.addActionListener(new ActionListener() {
				int count=1;
				public void actionPerformed(ActionEvent arg0) {
					if((JButton) arg0.getSource() == button_2 && count == 1) {
						order1.setCount(2);
						textArea.append(String.format("ġ�����    2000�� %d��\n", n));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					if (count>1) {
						//���� �ִ� �ܹ��� ���ֿ� string�� ���ְ� �Ǹ������� append�ؼ� ������ �߰��� ������ ����ϱ�
						int start = textArea.getSelectionStart(); //���úκ��� ������
						int end = textArea.getSelectionEnd(); //���úκ��� ����
						textArea.replaceRange("", start, end); //���ۺκа� ���� ���̸� �������� ��ü

						textArea.append(String.format("ġ�����    2000�� %d��\n", count));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					count++;
				}
			});
			button_2.setBounds(406, 37, 158, 98);
			panel_2.add(button_2);
			
			JButton button_3 = new JButton("�������� 4000��");
			button_3.addActionListener(new ActionListener() {
				int count = 1;
				public void actionPerformed(ActionEvent arg0) {
					if((JButton) arg0.getSource() == button_3 && count ==1 ) {
						order1.setCount(3);
						textArea.append(String.format("�������� 4000��  %d��\n",n));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					if (count>1) {
						//���� �ִ� �ܹ��� ���ֿ� string�� ���ְ� �Ǹ������� append�ؼ� ������ �߰��� ������ ����ϱ�
						int start = textArea.getSelectionStart(); //���úκ��� ������
						int end = textArea.getSelectionEnd(); //���úκ��� ����
						textArea.replaceRange("", start, end); //���ۺκа� ���� ���̸� �������� ��ü

						textArea.append(String.format("�������� 4000��  %d��\n",count));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					count++;
				}
			});
			button_3.setBounds(25, 176, 158, 98);
			panel_2.add(button_3);
			
			JButton button_4 = new JButton("�ѿ���� 4500��");
			button_4.addActionListener(new ActionListener() {
				int count = 1;
				public void actionPerformed(ActionEvent arg0) {
					if((JButton) arg0.getSource() == button_4 && count ==1 ) {
						order1.setCount(4);
						textArea.append(String.format("�ѿ����    4500��   %d��\n",n));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					if (count>1) {
						//���� �ִ� �ܹ��� ���ֿ� string�� ���ְ� �Ǹ������� append�ؼ� ������ �߰��� ������ ����ϱ�
						int start = textArea.getSelectionStart(); //���úκ��� ������
						int end = textArea.getSelectionEnd(); //���úκ��� ����
						textArea.replaceRange("", start, end); //���ۺκа� ���� ���̸� �������� ��ü

						textArea.append(String.format("�ѿ����    4500��   %d��\n",count));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					count++;
				}
			});
			button_4.setBounds(219, 176, 158, 98);
			panel_2.add(button_4);
			
			JButton button_5 = new JButton("�������� 4000��");
			button_5.addActionListener(new ActionListener() {
				int count = 1;
				public void actionPerformed(ActionEvent arg0) {
					if((JButton) arg0.getSource() == button_5 && count ==1 ) {
						order1.setCount(5);
						textArea.append(String.format("��������    4000��  %d��\n",n));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					if (count>1) {
						//���� �ִ� �ܹ��� ���ֿ� string�� ���ְ� �Ǹ������� append�ؼ� ������ �߰��� ������ ����ϱ�
						int start = textArea.getSelectionStart(); //���úκ��� ������
						int end = textArea.getSelectionEnd(); //���úκ��� ����
						textArea.replaceRange("", start, end); //���ۺκа� ���� ���̸� �������� ��ü

						textArea.append(String.format("��������    4000��  %d��\n",count));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					count++;
				}
			});
			button_5.setBounds(406, 176, 158, 98);
			panel_2.add(button_5);
			
			
			JPanel panel_1 = new JPanel();
			tabbedPane_1.addTab("���̵� �޴�", panel_1);
			panel_1.setLayout(null);
			
			JButton button_6 = new JButton("����Ƣ�� 1500��");
			button_6.addActionListener(new ActionListener() {
				int count = 1;
				public void actionPerformed(ActionEvent arg0) {
					if((JButton) arg0.getSource() == button_6 &&count == 1) {
						order1.setCount(6);
						textArea.append(String.format("����Ƣ��    1500��   %d��\n",n));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					if (count>1) {
						//���� �ִ� �ܹ��� ���ֿ� string�� ���ְ� �Ǹ������� append�ؼ� ������ �߰��� ������ ����ϱ�
						int start = textArea.getSelectionStart(); //���úκ��� ������
						int end = textArea.getSelectionEnd(); //���úκ��� ����
						textArea.replaceRange("", start, end); //���ۺκа� ���� ���̸� �������� ��ü
						textArea.append(String.format("����Ƣ��    1500��   %d��\n",count));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					count++;
				}
			});
			button_6.setBounds(25, 37, 158, 98);
			panel_1.add(button_6);
			
			JButton button_7 = new JButton("���̽�ũ�� 500��");
			button_7.addActionListener(new ActionListener() {
				int count = 1;
				public void actionPerformed(ActionEvent arg0) {
					if((JButton) arg0.getSource() == button_7 &&count ==1) {
						order1.setCount(7);
						textArea.append(String.format("���̽�ũ��   500��    %d��\n",n));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					if (count>1) {
						//���� �ִ� �ܹ��� ���ֿ� string�� ���ְ� �Ǹ������� append�ؼ� ������ �߰��� ������ ����ϱ�
						int start = textArea.getSelectionStart(); //���úκ��� ������
						int end = textArea.getSelectionEnd(); //���úκ��� ����
						textArea.replaceRange("", start, end); //���ۺκа� ���� ���̸� �������� ��ü

						textArea.append(String.format("���̽�ũ��   500��    %d��\n",count));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					count++;
				}
			});
			button_7.setBounds(219, 37, 158, 98);
			panel_1.add(button_7);
			
			JButton button_8 = new JButton("������ 2500��");
			button_8.addActionListener(new ActionListener() {
				int count = 1;
				public void actionPerformed(ActionEvent arg0) {
					if((JButton) arg0.getSource() == button_8 && count ==1 ) {
						order1.setCount(8);
						textArea.append(String.format("������        2500��      %d��\n",n));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					if (count>1) {
						//���� �ִ� �ܹ��� ���ֿ� string�� ���ְ� �Ǹ������� append�ؼ� ������ �߰��� ������ ����ϱ�
						int start = textArea.getSelectionStart(); //���úκ��� ������
						int end = textArea.getSelectionEnd(); //���úκ��� ����
						textArea.replaceRange("", start, end); //���ۺκа� ���� ���̸� �������� ��ü

						textArea.append(String.format("������        2500��      %d��\n",count));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					count++;
				}
			});
			button_8.setBounds(406, 37, 158, 98);
			panel_1.add(button_8);
			
			JPanel panel_3 = new JPanel();
			tabbedPane_1.addTab("����", panel_3);
			panel_3.setLayout(null);
			
			JButton button_9 = new JButton("�ݶ� 1000��");
			button_9.addActionListener(new ActionListener() {
				int count = 1;
				public void actionPerformed(ActionEvent arg0) {
					if((JButton) arg0.getSource() == button_9 && count == 1) {
						order1.setCount(9);
						textArea.append(String.format("�ݶ�            1000��     %d��\n", n));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					if (count>1) {
						//���� �ִ� �ܹ��� ���ֿ� string�� ���ְ� �Ǹ������� append�ؼ� ������ �߰��� ������ ����ϱ�
						int start = textArea.getSelectionStart(); //���úκ��� ������
						int end = textArea.getSelectionEnd(); //���úκ��� ����
						textArea.replaceRange("", start, end); //���ۺκа� ���� ���̸� �������� ��ü

						textArea.append(String.format("�ݶ�            1000��     %d��\n", count));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					count++;
				}
			});
			button_9.setBounds(25, 37, 158, 98);
			panel_3.add(button_9);
			
			JButton button_10 = new JButton("���̴� 1000��");
			button_10.addActionListener(new ActionListener() {
				int count = 1;
				public void actionPerformed(ActionEvent arg0) {
					if((JButton) arg0.getSource() == button_10 && count ==1 ) {
						order1.setCount(10);
						textArea.append(String.format("���̴�         1000��      %d��\n",n));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					if (count>1) {
						//���� �ִ� �ܹ��� ���ֿ� string�� ���ְ� �Ǹ������� append�ؼ� ������ �߰��� ������ ����ϱ�
						int start = textArea.getSelectionStart(); //���úκ��� ������
						int end = textArea.getSelectionEnd(); //���úκ��� ����
						textArea.replaceRange("", start, end); //���ۺκа� ���� ���̸� �������� ��ü

						textArea.append(String.format("���̴�         1000��      %d��\n",count));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					count++;
				}
			});
			button_10.setBounds(219, 37, 158, 98);
			panel_3.add(button_10);
			
			JButton button_11 = new JButton("ȯŸ 1000��");
			button_11.addActionListener(new ActionListener() {
				int count=1;
				public void actionPerformed(ActionEvent arg0) {
				
				if((JButton) arg0.getSource() == button_11 && count ==1) {
					order1.setCount(11);
					textArea.append(String.format("ȯŸ            1000��    %d��\n",n));
					textArea.append(String.format("-----------------------------------------------\n"));
				}
				if (count>1) {
					//���� �ִ� �ܹ��� ���ֿ� string�� ���ְ� �Ǹ������� append�ؼ� ������ �߰��� ������ ����ϱ�
					int start = textArea.getSelectionStart(); //���úκ��� ������
					int end = textArea.getSelectionEnd(); //���úκ��� ����
					textArea.replaceRange("", start, end); //���ۺκа� ���� ���̸� �������� ��ü

					textArea.append(String.format("ȯŸ            1000��    %d��\n",count));
					textArea.append(String.format("-----------------------------------------------\n"));
				}
				count++;
				}
			});
			button_11.setBounds(406, 37, 158, 98);
			panel_3.add(button_11);
			
			JButton button_12 = new JButton("����ƾ�� 1000��");
			button_12.addActionListener(new ActionListener() {
				int count = 1;
				public void actionPerformed(ActionEvent arg0) {
					if((JButton) arg0.getSource() == button_12 && count ==1) {
						order1.setCount(12);
						textArea.append(String.format("����ƾ��     1000��    %d��\n",n));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					if (count>1) {
						//���� �ִ� �ܹ��� ���ֿ� string�� ���ְ� �Ǹ������� append�ؼ� ������ �߰��� ������ ����ϱ�
						int start = textArea.getSelectionStart(); //���úκ��� ������
						int end = textArea.getSelectionEnd(); //���úκ��� ����
						textArea.replaceRange("", start, end); //���ۺκа� ���� ���̸� �������� ��ü

						textArea.append(String.format("����ƾ��     1000��     %d��\n",count));
						textArea.append(String.format("-----------------------------------------------\n"));
					}
					count++;
				}
			});
			button_12.setBounds(25, 176, 158, 98);
			panel_3.add(button_12);
		
			
}
}
	/**
	 * Create the frame.
	 */


