package why;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JMenu;
import javax.swing.BoxLayout;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultCellEditor;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;


public class Che extends JFrame {

	
	int to[]= new int[13];
	private JPanel contentPane;
	int[] list=new int[13];
	/**
	 * Launch the application.
	 *//**
		 * Create the panel.
		 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Che frame = new Che();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}
	//Jtable 값 중간으로 옮기기
	private JTable table;
	
	public Che() {
		
		MakeMenu makemenu = new MakeMenu();
		makemenu.create();
		Order order1 = new Order();
		
			getContentPane().setLayout(null);
			int n=1;//수량을 나타냄
			
			
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
			
			 String name_count[] = {"이름","판매수량"};
			 DefaultTableModel model1 = new DefaultTableModel(name_count,0);

			 table = new JTable(model1);
			
			 JComboBox<String> comboBox = new JComboBox();
			 
			JButton payment = new JButton("결제");
			payment.setBounds(267, 594, 159, 75);
			payment.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					order1.save();
					order1.print();
					model1.setNumRows(0);//화면지우기
				}
			});
			panel_4.setLayout(null);
			panel_4.add(payment);
			
			JButton receiptPrint = new JButton("영수증 출력");
			receiptPrint.setBounds(47, 594, 159, 75);
			receiptPrint.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			panel_4.add(receiptPrint);
			
			JButton total_count = new JButton("정산");
			total_count.setBounds(521, 594, 159, 75);
			panel_4.add(total_count);
			
			JButton reservation = new JButton("예약/ 자리 확인");
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
			tabbedPane_1.addTab("주 메뉴", panel_2);
			panel_2.setLayout(null);
		
			
			Vector<Object> contents1 = new Vector<Object>();
		    JButton button_0 = new JButton("불고기버거 2000원");
			button_0.addActionListener(new ActionListener() {
				int count =1;
				
				public void actionPerformed(ActionEvent arg0) {
					JComboBox<String> comboBox = new JComboBox();
					 comboBox.addItem("1"); comboBox.addItem("2");comboBox.addItem("3");comboBox.addItem("4");comboBox.addItem("5");
					 comboBox.addItem("6");comboBox.addItem("7");comboBox.addItem("8");comboBox.addItem("9");comboBox.addItem("10");
					 
					 comboBox.setMaximumRowCount(10);
					 TableCellEditor editor = new DefaultCellEditor(comboBox);
					 table.getColumnModel().getColumn(1).setCellEditor(editor);
					 
					if((JButton) arg0.getSource() == button_0 && count==1) {
						 contents1.addElement("불고기버거");
			             contents1.addElement(count);  
					}
					 comboBox.addActionListener(new ActionListener() {
						 public void actionPerformed(ActionEvent e) {
							 String selnum1 = (String)comboBox.getSelectedItem().toString();
							 int n=1;
				
							 int ton = Integer.parseInt(selnum1);
							System.out.printf("num =%d\n",ton);
							
							 for(int i=0; i <ton ; i++) {
									order1.setCount(0);
									
							 System.out.printf("\n");
							 }
						 }
					 });
					model1.addRow(contents1);
			}
				});
			button_0.setBounds(25, 37, 158, 98);
			panel_2.add(button_0);
			
			/////////////////////////////////////////////////////////////
			Vector<Object> contents2 = new Vector<Object>();
			JButton button_1 = new JButton("치킨버거 3000원");
			button_1.addActionListener(new ActionListener() {
				int count = 1;
				public void actionPerformed(ActionEvent arg0) {
					JComboBox<String> comboBox2 = new JComboBox();
					 comboBox2.addItem("1"); comboBox2.addItem("2");comboBox2.addItem("3");comboBox2.addItem("4");comboBox2.addItem("5");
					 comboBox2.addItem("6");comboBox2.addItem("7"); comboBox2.addItem("8");comboBox2.addItem("9");  comboBox2.addItem("10");
					 
					 comboBox2.setMaximumRowCount(10);
					 TableCellEditor editor2 = new DefaultCellEditor(comboBox2);
					 table.getColumnModel().getColumn(1).setCellEditor(editor2);
					 
					if((JButton) arg0.getSource() == button_1 && count==1) {
						contents2.addElement("치킨버거");
						contents2.addElement(count);
					}
					comboBox2.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e) {
						String selnum = (String)comboBox2.getSelectedItem().toString();
						int to = Integer.parseInt(selnum);
						System.out.printf("num2 = %d\n", to);

						for (int i = 0; i < to; i++) {
							order1.setCount(1);
						}
					}
					});
					
					model1.addRow(contents2);
				}
			});
			button_1.setBounds(219, 37, 158, 98);
			panel_2.add(button_1);
			
			///////////////////////////////////////////////////////
			Vector<Object> contents3 = new Vector<Object>();
			JButton button_2 = new JButton("치즈버거 2000원");
			button_2.addActionListener(new ActionListener() {
				int count=1;
				public void actionPerformed(ActionEvent arg0) {
					JComboBox<String> comboBox3 = new JComboBox();
					comboBox3.addItem("1"); comboBox3.addItem("2"); comboBox3.addItem("3"); comboBox3.addItem("4"); comboBox3.addItem("5");
					comboBox3.addItem("6"); comboBox3.addItem("7"); comboBox3.addItem("8"); comboBox3.addItem("9");  comboBox3.addItem("10");

					comboBox3.setMaximumRowCount(10);
					TableCellEditor editor3 = new DefaultCellEditor(comboBox3);
					table.getColumnModel().getColumn(1).setCellEditor(editor3);

					if((JButton) arg0.getSource() == button_2 && count == 1) {
						contents3.addElement("치즈버거");
						contents3.addElement(count);
					}
					comboBox3.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e) {
						String selnum3 = (String)comboBox3.getSelectedItem().toString();
						int to = Integer.parseInt(selnum3);
						System.out.printf("num3 = %d\n", to);

						for (int i = 0; i < to; i++) {
							order1.setCount(2);
						}
					}
					});
					model1.addRow(contents3);
					}
			});
			button_2.setBounds(406, 37, 158, 98);
			panel_2.add(button_2);
			
			//////////////////////////////////////////////////
			Vector<Object> contents4 = new Vector<Object>();
			JButton button_3 = new JButton("통새우버거 4000원");
			button_3.addActionListener(new ActionListener() {
				int count = 1;
				public void actionPerformed(ActionEvent arg0) {
					JComboBox<String> comboBox5 = new JComboBox();
					 comboBox5.addItem("1"); comboBox5.addItem("2");comboBox5.addItem("3");comboBox5.addItem("4");comboBox5.addItem("5");
					 comboBox5.addItem("6");comboBox5.addItem("7"); comboBox5.addItem("8");comboBox5.addItem("9");  comboBox5.addItem("10");
					 
					 comboBox5.setMaximumRowCount(10);
					 TableCellEditor editor5 = new DefaultCellEditor(comboBox5);
					 table.getColumnModel().getColumn(1).setCellEditor(editor5);
					 
					if((JButton) arg0.getSource() == button_3 && count ==1 ) {
						contents4.addElement("통새우버거");
						contents4.addElement(count);
					}
					comboBox5.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e) {
						String selnum4 = (String)comboBox5.getSelectedItem().toString();
						int to = Integer.parseInt(selnum4);
						System.out.printf("num4 = %d\n", to);

						for (int i = 0; i < to; i++) {
							order1.setCount(3);
						}
					}
					});
					
					model1.addRow(contents4);
				}
			});
			button_3.setBounds(25, 176, 158, 98);
			panel_2.add(button_3);
			////////////////////////////////////////////////
			Vector<Object> contents5 = new Vector<Object>();
			JButton button_4 = new JButton("한우버거 4500원");
			button_4.addActionListener(new ActionListener() {
				int count = 1;
				public void actionPerformed(ActionEvent arg0) {
					JComboBox<String> comboBox5 = new JComboBox();
					 comboBox5.addItem("1"); comboBox5.addItem("2");comboBox5.addItem("3");comboBox5.addItem("4");comboBox5.addItem("5");
					 comboBox5.addItem("6");comboBox5.addItem("7"); comboBox5.addItem("8");comboBox5.addItem("9");  comboBox5.addItem("10");
					 
					 comboBox5.setMaximumRowCount(10);
					 TableCellEditor editor5 = new DefaultCellEditor(comboBox5);
					 table.getColumnModel().getColumn(1).setCellEditor(editor5);
					if((JButton) arg0.getSource() == button_4 && count ==1 ) {
						contents5.addElement("한우버거");
						contents5.addElement(count);
					}
					comboBox5.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e) {
						String selnum5 = (String)comboBox5.getSelectedItem().toString();
						int to = Integer.parseInt(selnum5);
						System.out.printf("num5 = %d\n", to);

						for (int i = 0; i < to; i++) {
							order1.setCount(4);
						}
					}
					});
					model1.addRow(contents5);
					}
			});
			button_4.setBounds(219, 176, 158, 98);
			panel_2.add(button_4);
		//////////////////////////////////////////////////////////////	
			Vector<Object> contents6 = new Vector<Object>();
			JButton button_5 = new JButton("강정버거 4000원");
			button_5.addActionListener(new ActionListener() {
				int count = 1;
				public void actionPerformed(ActionEvent arg0) {
					JComboBox<String> comboBox6 = new JComboBox();
					 comboBox6.addItem("1"); comboBox6.addItem("2");comboBox6.addItem("3");comboBox6.addItem("4");comboBox6.addItem("5");
					 comboBox6.addItem("6");comboBox6.addItem("7"); comboBox6.addItem("8");comboBox6.addItem("9");comboBox6.addItem("10");
					 
					 comboBox6.setMaximumRowCount(10);
					 TableCellEditor editor2 = new DefaultCellEditor(comboBox6);
					 table.getColumnModel().getColumn(1).setCellEditor(editor2);
					if((JButton) arg0.getSource() == button_5 && count ==1 ) {
						contents6.addElement("강정버거");
						contents6.addElement(count);	
					}
					comboBox6.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e) {
						String selnum6 = (String)comboBox6.getSelectedItem().toString();
						int to = Integer.parseInt(selnum6);
						System.out.printf("num2 = %d\n", to);

						for (int i = 0; i < to; i++) {
							order1.setCount(5);
						}
					}
					});
					
					model1.addRow(contents6);	
				}
			});
			button_5.setBounds(406, 176, 158, 98);
			panel_2.add(button_5);
			
		//////////////////////////////////////////////
			
			JPanel panel_1 = new JPanel();
			tabbedPane_1.addTab("사이드 메뉴", panel_1);
			panel_1.setLayout(null);
			
			/////////////////////////////////////////////
			Vector<Object> contents7 = new Vector<Object>();
			JButton button_6 = new JButton("감자튀김 1500원");
			button_6.addActionListener(new ActionListener() {
				int count = 1;
				public void actionPerformed(ActionEvent arg0) {
					JComboBox<String> comboBox7 = new JComboBox();
					 comboBox7.addItem("1"); comboBox7.addItem("2");comboBox7.addItem("3");comboBox7.addItem("4");comboBox7.addItem("5");
					 comboBox7.addItem("6");comboBox7.addItem("7"); comboBox7.addItem("8");comboBox7.addItem("9");comboBox7.addItem("10");
					 
					 comboBox7.setMaximumRowCount(10);
					 TableCellEditor editor7 = new DefaultCellEditor(comboBox7);
					 table.getColumnModel().getColumn(1).setCellEditor(editor7);
					 
					if((JButton) arg0.getSource() == button_6 &&count == 1) {
						contents7.addElement("감자튀김");
						contents7.addElement(count);
					}
					comboBox7.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e) {
						String selnum7 = (String)comboBox7.getSelectedItem().toString();
						int to7 = Integer.parseInt(selnum7);
						System.out.printf("num7 = %d\n", to7);

						for (int i = 0; i < to7; i++) {
							order1.setCount(6);
						}
					}
					});
					
					model1.addRow(contents7);
				}
			});
			button_6.setBounds(25, 37, 158, 98);
			panel_1.add(button_6);
			////////////////////////////////////////////////
			Vector<Object> contents8 = new Vector<Object>();
			JButton button_7 = new JButton("아이스크림 500원");
			button_7.addActionListener(new ActionListener() {
				int count = 1;
				public void actionPerformed(ActionEvent arg0) {
					JComboBox<String> comboBox8 = new JComboBox();
					 comboBox8.addItem("1");comboBox8.addItem("2");comboBox8.addItem("3");comboBox8.addItem("4");comboBox8.addItem("5");
					 comboBox8.addItem("6");comboBox8.addItem("7"); comboBox8.addItem("8");comboBox8.addItem("9");comboBox8.addItem("10");
					 
					 comboBox8.setMaximumRowCount(10);
					 TableCellEditor editor8 = new DefaultCellEditor(comboBox8);
					 table.getColumnModel().getColumn(1).setCellEditor(editor8);
					if((JButton) arg0.getSource() == button_7 &&count ==1) {
						contents8.addElement("아이스크림");
						contents8.addElement(count);
					}
					comboBox8.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e) {
						String selnum8 = (String)comboBox8.getSelectedItem().toString();
						int to = Integer.parseInt(selnum8);
						System.out.printf("num2 = %d\n", to);

						for (int i = 0; i < to; i++) {
							order1.setCount(7);
						}
					}
					});
					
					model1.addRow(contents8);
				}
			});
			button_7.setBounds(219, 37, 158, 98);
			panel_1.add(button_7);
			//////////////////////////////////////////////////////
			Vector<Object> contents9 = new Vector<Object>();
			JButton button_8 = new JButton("스낵랩 2500원");
			button_8.addActionListener(new ActionListener() {
				int count = 1;
				public void actionPerformed(ActionEvent arg0) {
					JComboBox<String> comboBox9 = new JComboBox();
					 comboBox9.addItem("1");comboBox9.addItem("2");comboBox9.addItem("3");comboBox9.addItem("4");comboBox9.addItem("5");
					 comboBox9.addItem("6");comboBox9.addItem("7"); comboBox9.addItem("8");comboBox9.addItem("9");comboBox9.addItem("10");
					 
					 comboBox9.setMaximumRowCount(10);
					 TableCellEditor editor9 = new DefaultCellEditor(comboBox9);
					 table.getColumnModel().getColumn(1).setCellEditor(editor9);
					if((JButton) arg0.getSource() == button_8 && count ==1 ) {
						contents9.addElement("스낵랩");
						contents9.addElement(count);
					}
					comboBox9.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e) {
						String selnum9 = (String)comboBox9.getSelectedItem().toString();
						int to = Integer.parseInt(selnum9);
						System.out.printf("num9 = %d\n", to);

						for (int i = 0; i < to; i++) {
							order1.setCount(8);
						}
					}
					});
					
					model1.addRow(contents9);
					
				}
			});
			button_8.setBounds(406, 37, 158, 98);
			panel_1.add(button_8);
			//////////////////////////////////////////////
			
			JPanel panel_3 = new JPanel();
			tabbedPane_1.addTab("음료", panel_3);
			panel_3.setLayout(null);
			
			Vector<Object> contents10 = new Vector<Object>();
			JButton button_9 = new JButton("콜라 1000원");
			button_9.addActionListener(new ActionListener() {
				int count = 1;
				public void actionPerformed(ActionEvent arg0) {
					JComboBox<String> comboBox10 = new JComboBox();
					 comboBox10.addItem("1");comboBox10.addItem("2");comboBox10.addItem("3");comboBox10.addItem("4");comboBox10.addItem("5");
					 comboBox10.addItem("6");comboBox10.addItem("7"); comboBox10.addItem("8");comboBox10.addItem("9");comboBox10.addItem("10");
					 
					 comboBox10.setMaximumRowCount(10);
					 TableCellEditor editor10 = new DefaultCellEditor(comboBox10);
					 table.getColumnModel().getColumn(1).setCellEditor(editor10);
					 
					if((JButton) arg0.getSource() == button_9 && count == 1) {
						contents10.addElement("콜라");
						contents10.addElement(count);
					}
					comboBox10.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e) {
						String selnum10 = (String)comboBox10.getSelectedItem().toString();
						int to = Integer.parseInt(selnum10);
						System.out.printf("num2 = %d\n", to);

						for (int i = 0; i < to; i++) {
							order1.setCount(9);
						}
					}
					});
					
					model1.addRow(contents10);
					 
				}
			});
			button_9.setBounds(25, 37, 158, 98);
			panel_3.add(button_9);
			///////////////////////////////////////////////////
			Vector<Object> contents11 = new Vector<Object>();
			JButton button_10 = new JButton("사이다 1000원");
			button_10.addActionListener(new ActionListener() {
				int count = 1;
				public void actionPerformed(ActionEvent arg0) {
					JComboBox<String> comboBox11 = new JComboBox();
					 comboBox11.addItem("1");comboBox11.addItem("2");comboBox11.addItem("3");comboBox11.addItem("4");comboBox11.addItem("5");
					 comboBox11.addItem("6");comboBox11.addItem("7"); comboBox11.addItem("8");comboBox11.addItem("9");comboBox11.addItem("10");
					 
					 comboBox11.setMaximumRowCount(10);
					 TableCellEditor editor11 = new DefaultCellEditor(comboBox11);
					 table.getColumnModel().getColumn(1).setCellEditor(editor11);
					 
					if((JButton) arg0.getSource() == button_10 && count ==1 ) {
						contents11.addElement("사이다");
						contents11.addElement(count);
					}
					comboBox11.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e) {
						String selnum11 = (String)comboBox11.getSelectedItem().toString();
						int to = Integer.parseInt(selnum11);
						System.out.printf("num11 = %d\n", to);

						for (int i = 0; i < to; i++) {
							order1.setCount(10);
						}
					}
					});
					
					model1.addRow(contents11);
					
				}
			});
			button_10.setBounds(219, 37, 158, 98);
			panel_3.add(button_10);
			
			////////////////////////////////////////////////
			Vector<Object> contents12 = new Vector<Object>();
			JButton button_11 = new JButton("환타 1000원");
			button_11.addActionListener(new ActionListener() {
				int count=1;
				public void actionPerformed(ActionEvent arg0) {
					JComboBox<String> comboBox12 = new JComboBox();
					 comboBox12.addItem("1");comboBox12.addItem("2");comboBox12.addItem("3");comboBox12.addItem("4");comboBox12.addItem("5");
					 comboBox12.addItem("6");comboBox12.addItem("7"); comboBox12.addItem("8");comboBox12.addItem("9");comboBox12.addItem("10");
					 
					 comboBox12.setMaximumRowCount(10);
					 TableCellEditor editor12 = new DefaultCellEditor(comboBox12);
					 table.getColumnModel().getColumn(1).setCellEditor(editor12);
					 
				if((JButton) arg0.getSource() == button_11 && count ==1) {
					contents12.addElement("환타");
					contents12.addElement(count);
				}
				comboBox12.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
					String selnum12 = (String)comboBox12.getSelectedItem().toString();
					int to = Integer.parseInt(selnum12);
					System.out.printf("num12 = %d\n", to);

					for (int i = 0; i < to; i++) {
						order1.setCount(11);
					}
				}
				});
				
				model1.addRow(contents12);
				}
			});
			button_11.setBounds(406, 37, 158, 98);
			panel_3.add(button_11);
			////////////////////////////////////////
			Vector<Object> contents13 = new Vector<Object>();
			JButton button_12 = new JButton("마운틴듀 1000원");
			button_12.addActionListener(new ActionListener() {
				int count = 1;
				public void actionPerformed(ActionEvent arg0) {
					JComboBox<String> comboBox13 = new JComboBox();
					 comboBox13.addItem("1");comboBox13.addItem("2");comboBox13.addItem("3");comboBox13.addItem("4");comboBox13.addItem("5");
					 comboBox13.addItem("6");comboBox13.addItem("7"); comboBox13.addItem("8");comboBox13.addItem("9");comboBox13.addItem("10");
					 
					 comboBox13.setMaximumRowCount(10);
					 TableCellEditor editor13 = new DefaultCellEditor(comboBox13);
					 table.getColumnModel().getColumn(1).setCellEditor(editor13);
					if((JButton) arg0.getSource() == button_12 && count ==1) {
						contents13.addElement("마운틴듀");
						contents13.addElement(count);
					}
					comboBox13.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e) {
						String selnum13 = (String)comboBox13.getSelectedItem().toString();
						int to = Integer.parseInt(selnum13);
						System.out.printf("num13 = %d\n", to);

						for (int i = 0; i < to; i++) {
							order1.setCount(12);
						}
					}
					});
					
					model1.addRow(contents13);
				}
			});
			button_12.setBounds(25, 176, 158, 98);
			panel_3.add(button_12);
			
			JScrollPane tablePane = new JScrollPane(table);
			tablePane.setBounds(0, 12, 385, 518);
			panel_4.add(tablePane);	
			
			
		
			
}
}


