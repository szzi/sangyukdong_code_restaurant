package restaurant;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class MainScreen extends JFrame {

	JPanel p1, panel_4, panel_5;
	private JTable table;
	int to;	
	public MainScreen(){

		Order order = new Order();
			
		p1 = new JPanel();
		//p1.setBorder(new EmptyBorder(5, 5, 5, 5));
		p1.setLayout(null);
		
		//setContentPane(p1);	
		//getContentPane().setLayout(null);
		p1.setBounds(100,100, 1024, 768);
		
	//JPanel panel = new JPanel();
	//panel.setBounds(14, 12, 317, 382);
		Color color = new Color(254,206,0);
		Color color2 = new Color(235,229,217);
		Color backcolor = new Color(245,245,245);
		panel_4 = new JPanel();
		panel_4.setBackground(backcolor);
		panel_4.setLocation(0, 0);
		panel_4.setSize(1024, 768);
		p1.add(panel_4);
		panel_4.setLayout(null);
		
		String name_count[] = {"이름","판매수량"};
		DefaultTableModel model1 = new DefaultTableModel(name_count,0);
	
		table = new JTable(model1);
		table.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		table.setBackground(backcolor);
		table.setRowHeight(30);
		
		DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();	
		TableColumnModel columnModel = table.getColumnModel();
		TableColumn column0 = columnModel.getColumn(0); 
	    TableColumn column1 = columnModel.getColumn(1);
	    renderer.setHorizontalAlignment(JLabel.CENTER);
	    column0.setCellRenderer(renderer);
	    column1.setCellRenderer(renderer);
	    
		JButton payment = new JButton("결제");
		payment.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		payment.setBounds(267, 594, 159, 75);
		payment.setBackground(color);
		payment.addActionListener(new ActionListener() {
				
			public void actionPerformed(ActionEvent arg0) {
					order.save();
					order.print();
					System.out.printf("\n초기화하면\n");
					model1.setNumRows(0);//화면지우기
					
					for(int i =0;i<13;i++) {
						Order.count[i]=0;
						System.out.printf(" %d ",Order.count[i]);
					}
				}
			});
		
			panel_4.setLayout(null);
			panel_4.add(payment);
			
			
		JButton reservation = new JButton("예약/ 자리 확인");
		reservation.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		reservation.setBounds(768, 594, 159, 75);
		reservation.setBackground(color);
		reservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		panel_4.add(reservation);
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		tabbedPane_1.setBackground(color);
		tabbedPane_1.setBounds(399, 11, 583, 519);
		panel_4.add(tabbedPane_1);
		JPanel panel_2 = new JPanel();
		
		panel_2.setBackground(color2);
		tabbedPane_1.addTab("주 메뉴", panel_2);
		panel_2.setLayout(null);
		panel_2.setBackground(backcolor);
		JButton button_0 = new JButton("불고기버거 2000원");
		button_0.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		
		button_0.setBackground(color);
		Vector<Object> contents1 = new Vector<Object>();
		button_0.setBounds(25, 37, 158, 98);
		
		button_0.addActionListener(new ActionListener() {
					
			public void actionPerformed(ActionEvent arg0) {

				order.setCount(0);
				
				int count0 = order.getCount(0);
				
				for(int i =0;i<table.getRowCount();i++)
				{
									
					if("불고기버거".equals(table.getValueAt(i, 0)))
					{
						table.setValueAt(count0, i, 1);
						return;
					}
					
				}				
				contents1.addElement("불고기버거");
				contents1.addElement(count0);
				model1.addRow(contents1);
		}
			});
		panel_2.add(button_0);
		
		/////////////////////////////////////////////////////////////
		Vector<Object> contents2 = new Vector<Object>();
		JButton button_1 = new JButton("치킨버거 3000원");
		button_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		button_1.setBackground(color);
		button_1.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0) {
				
						order.setCount(1);
						
						int count1 = order.getCount(1);
						
						for(int i =0;i<table.getRowCount();i++)
						{
											
							if("치킨버거".equals(table.getValueAt(i, 0)))
							{
								table.setValueAt(count1, i, 1);
								return;
							}
							
						}				
						contents2.addElement("치킨버거");
						contents2.addElement(count1);
						model1.addRow(contents2);
				}
				
			
		});
		button_1.setBounds(219, 37, 158, 98);
		panel_2.add(button_1);
		
		///////////////////////////////////////////////////////
		Vector<Object> contents3 = new Vector<Object>();
		JButton button_2 = new JButton("치즈버거 2000원");
		button_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		button_2.setBackground(color);
		button_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				order.setCount(2);
				
				int count2 = order.getCount(2);
				
				for(int i =0;i<table.getRowCount();i++)
				{
									
					if("치즈버거".equals(table.getValueAt(i, 0)))
					{
						table.setValueAt(count2, i, 1);
						return;
					}
					
				}				
				contents3.addElement("치즈버거");
				contents3.addElement(count2);
				model1.addRow(contents3);
			}	
		});
		button_2.setBounds(406, 37, 158, 98);
		panel_2.add(button_2);
		
		//////////////////////////////////////////////////
		Vector<Object> contents4 = new Vector<Object>();
		JButton button_3 = new JButton("통새우버거 4000원");
		button_3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		button_3.setBackground(color);
		button_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				order.setCount(3);
				
				int count3 = order.getCount(3);
				
				for(int i =0;i<table.getRowCount();i++)
				{
									
					if("통새우버거".equals(table.getValueAt(i, 0)))
					{
						table.setValueAt(count3, i, 1);
						return;
					}
					
				}				
				contents4.addElement("통새우버거");
				contents4.addElement(count3);
				model1.addRow(contents4);
			}
		});
		button_3.setBounds(25, 176, 158, 98);
		panel_2.add(button_3);
		////////////////////////////////////////////////
		Vector<Object> contents5 = new Vector<Object>();
		JButton button_4 = new JButton("한우버거 4500원");
		button_4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		button_4.setBackground(color);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				order.setCount(4);
				
				int count4 = order.getCount(4);
				
				for(int i =0;i<table.getRowCount();i++)
				{
									
					if("한우버거".equals(table.getValueAt(i, 0)))
					{
						table.setValueAt(count4, i, 1);
						return;
					}
					
				}				
				contents5.addElement("한우버거");
				contents5.addElement(count4);
				model1.addRow(contents5);
				}
		});
		button_4.setBounds(219, 176, 158, 98);
		panel_2.add(button_4);
	//////////////////////////////////////////////////////////////	
		Vector<Object> contents6 = new Vector<Object>();
		JButton button_5 = new JButton("강정버거 4000원");
		button_5.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		button_5.setBackground(color);
		button_5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				order.setCount(5);
				
				int count5 = order.getCount(5);
				
				for(int i =0;i<table.getRowCount();i++)
				{
									
					if("강정버거".equals(table.getValueAt(i, 0)))
					{
						table.setValueAt(count5, i, 1);
						return;
					}
					
				}				
				contents6.addElement("강정버거");
				contents6.addElement(count5);
				model1.addRow(contents6);
			}
		});
		button_5.setBounds(406, 176, 158, 98);
		panel_2.add(button_5);
		
	//////////////////////////////////////////////
		
		JPanel panel_1 = new JPanel();
		tabbedPane_1.addTab("사이드 메뉴", panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(backcolor);
		/////////////////////////////////////////////
		Vector<Object> contents7 = new Vector<Object>();
		JButton button_6 = new JButton("감자튀김 1500원");
		button_6.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		button_6.setBackground(color);
		button_6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				order.setCount(6);
				
				int count6 = order.getCount(6);
				
				for(int i =0;i<table.getRowCount();i++)
				{
									
					if("감자튀김".equals(table.getValueAt(i, 0)))
					{
						table.setValueAt(count6, i, 1);
						return;
					}
					
				}				
				contents7.addElement("감자튀김");
				contents7.addElement(count6);
				model1.addRow(contents7);
			}
		});
		button_6.setBounds(25, 37, 158, 98);
		panel_1.add(button_6);
		////////////////////////////////////////////////
		Vector<Object> contents8 = new Vector<Object>();
		JButton button_7 = new JButton("아이스크림 500원");
		button_7.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		button_7.setBackground(color);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				order.setCount(7);
				
				int count7 = order.getCount(7);
				
				for(int i =0;i<table.getRowCount();i++)
				{
									
					if("아이스크림".equals(table.getValueAt(i, 0)))
					{
						table.setValueAt(count7, i, 1);
						return;
					}
					
				}				
				contents8.addElement("아이스크림");
				contents8.addElement(count7);
				model1.addRow(contents8);
			}
		});
		button_7.setBounds(219, 37, 158, 98);
		panel_1.add(button_7);
		//////////////////////////////////////////////////////
		Vector<Object> contents9 = new Vector<Object>();
		JButton button_8 = new JButton("스낵랩 2500원");
		button_8.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		button_8.setBackground(color);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				order.setCount(8);
				
				int count8 = order.getCount(8);
				
				for(int i =0;i<table.getRowCount();i++)
				{
									
					if("스낵랩".equals(table.getValueAt(i, 0)))
					{
						table.setValueAt(count8, i, 1);
						return;
					}
					
				}				
				contents9.addElement("스낵랩");
				contents9.addElement(count8);
				model1.addRow(contents9);
				
			}
		});
		button_8.setBounds(406, 37, 158, 98);
		panel_1.add(button_8);
		//////////////////////////////////////////////
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("음료", panel_3);
		panel_3.setLayout(null);
		panel_3.setBackground(backcolor);
		Vector<Object> contents10 = new Vector<Object>();
		JButton button_9 = new JButton("콜라 1000원");
		button_9.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		button_9.setBackground(color);
		button_9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				order.setCount(9);
				
				int count9 = order.getCount(9);
				
				for(int i =0;i<table.getRowCount();i++)
				{
									
					if("콜라".equals(table.getValueAt(i, 0)))
					{
						table.setValueAt(count9, i, 1);
						return;
					}
					
				}				
				contents10.addElement("콜라");
				contents10.addElement(count9);
				model1.addRow(contents10);
				 
			}
		});
		button_9.setBounds(25, 37, 158, 98);
		panel_3.add(button_9);
		///////////////////////////////////////////////////
		Vector<Object> contents11 = new Vector<Object>();
		JButton button_10 = new JButton("사이다 1000원");
		button_10.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		button_10.setBackground(color);
		button_10.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				order.setCount(10);
				
				int count10 = order.getCount(10);
				
				for(int i =0;i<table.getRowCount();i++)
				{
									
					if("사이다".equals(table.getValueAt(i, 0)))
					{
						table.setValueAt(count10, i, 1);
						return;
					}
					
				}				
				contents11.addElement("사이다");
				contents11.addElement(count10);
				model1.addRow(contents11);
				
			}
		});
		button_10.setBounds(219, 37, 158, 98);
		panel_3.add(button_10);
		
		////////////////////////////////////////////////
		Vector<Object> contents12 = new Vector<Object>();
		JButton button_11 = new JButton("환타 1000원");
		button_11.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		button_11.setBackground(color);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				order.setCount(11);
				
				int count11 = order.getCount(11);
				
				for(int i =0;i<table.getRowCount();i++)
				{
									
					if("환타".equals(table.getValueAt(i, 0)))
					{
						table.setValueAt(count11, i, 1);
						return;
					}
					
				}				
				contents12.addElement("환타");
				contents12.addElement(count11);
				model1.addRow(contents12);
			}
		});
		button_11.setBounds(406, 37, 158, 98);
		panel_3.add(button_11);
		////////////////////////////////////////
		Vector<Object> contents13 = new Vector<Object>();
		JButton button_12 = new JButton("마운틴듀 1000원");
		button_12.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		button_12.setBackground(color);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				order.setCount(12);
				
				int count12 = order.getCount(12);
				
				for(int i =0;i<table.getRowCount();i++)
				{
									
					if("마운틴듀".equals(table.getValueAt(i, 0)))
					{
						table.setValueAt(count12, i, 1);
						return;
					}
					
				}				
				contents13.addElement("마운틴듀");
				contents13.addElement(count12);
				model1.addRow(contents13);
			}
		});
		button_12.setBounds(25, 176, 158, 98);
		panel_3.add(button_12);
		
		JScrollPane tablePane = new JScrollPane(table);
		tablePane.setBounds(12, 12, 373, 518);
		tablePane.setBackground(color);
		panel_4.add(tablePane);
		panel_4.setBackground(backcolor);
}
}
