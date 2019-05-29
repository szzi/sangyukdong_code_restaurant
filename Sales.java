package codematzib;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.util.Arrays;
import java.util.Vector;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;

public class Sales extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sales frame = new Sales();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sales() {			
			MakeMenu makemenu = new MakeMenu();
			makemenu.create();
			
			Order order = new Order();
			
			order.setCount(3);
			order.setCount(2);
			order.setCount(3);
			order.setCount(5);
			order.setCount(11);
			order.setCount(3);
			order.setCount(6);
			order.setCount(1);
			order.setCount(2);
			order.setCount(3);
			order.setCount(4);
			order.setCount(4);
			order.setCount(4);
			order.setCount(4);
			order.setCount(5);
			order.setCount(7);
			order.setCount(8);
			order.setCount(9);
			order.setCount(10);
			order.setCount(10);
			order.setCount(10);
			order.setCount(7);
			
			order.save();
			
			
			String header1[]= {"상품명","수량","금액"};

//			매출 순이익 확인 테이블
			DefaultTableModel model1 = new DefaultTableModel(header1,0);
			JTable stable = new JTable(model1);
			int totalsales=0;
			int profitsales=0;
			int pprofit=0;
			stable.setRowHeight(30);
			for(int i = 0; i<makemenu.menu.length;i++) {
				if(makemenu.menu[i].sold!=0) {
					Vector<Object> contents1 = new Vector<Object>();
					contents1.addElement(makemenu.menu[i].name);
					contents1.addElement(makemenu.menu[i].sold);
					contents1.addElement(makemenu.menu[i].cost*makemenu.menu[i].sold);
					totalsales += makemenu.menu[i].cost*makemenu.menu[i].sold;
					profitsales += (makemenu.menu[i].cogs*makemenu.menu[i].sold);
					model1.addRow(contents1);
				}
				pprofit = totalsales - profitsales;
			}
			
			String totalheader[]= {"총 매출"};
			DefaultTableModel totalmodel = new DefaultTableModel(totalheader,0);
			Vector<Object> total = new Vector<Object>();
			total.addElement(totalsales);
			totalmodel.addRow(total);
			JTable totaltable = new JTable(totalmodel);
			
			String profitheader[]= {"순이익"};
			DefaultTableModel profitmodel = new DefaultTableModel(profitheader,0);
			Vector<Object> profit = new Vector<Object>();
			profit.addElement(pprofit);
			profitmodel.addRow(profit);
			JTable profittable = new JTable(profitmodel);
			
			  TableColumnModel columnModel = stable.getColumnModel();
			  TableColumn column0 = columnModel.getColumn(0); 
		      TableColumn column1 = columnModel.getColumn(1); 
		      TableColumn column2 = columnModel.getColumn(2); 
		      DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
		      DefaultTableCellRenderer renderer1 = new DefaultTableCellRenderer();
		      renderer.setHorizontalAlignment(JLabel.RIGHT);
		      renderer1.setHorizontalAlignment(JLabel.CENTER);
		      column0.setCellRenderer(renderer1);
		      column1.setCellRenderer(renderer1);
		      column2.setCellRenderer(renderer1);
		      
		      TableColumnModel columntotalModel = totaltable.getColumnModel();
			  TableColumn tcolumn = columntotalModel.getColumn(0); 
		      tcolumn.setCellRenderer(renderer1);
			      
		      TableColumnModel columnprofitModel = profittable.getColumnModel();
			  TableColumn pcolumn = columnprofitModel.getColumn(0); 
		      pcolumn.setCellRenderer(renderer1);
			
			String mainrank[]= {"순위","수량","주메뉴"};
			DefaultTableModel model2 = new DefaultTableModel(mainrank,0);
			JTable maintable = new JTable(model2);
			maintable.setFont(new Font("굴림", Font.PLAIN, 13));
			maintable.setRowHeight(30);
//			순위 매기기 소팅
			sort(makemenu,0,5);
			int cnt1=1;
			for(int i = 0; i<=5;i++) {
				if(makemenu.menu[i].sold!=0) {
					if(cnt1==3)break;
					Vector<Object> maincontents = new Vector<Object>();
					maincontents.addElement(cnt1);
					maincontents.addElement(makemenu.menu[i].sold);
					maincontents.addElement(makemenu.menu[i].name);	
					model2.addRow(maincontents);
				}
				cnt1++;
			}
			
			String siderank[]= {"순위","수량","사이드메뉴"};
			DefaultTableModel model3 = new DefaultTableModel(siderank,0);
			JTable sidetable = new JTable(model3);
			sidetable.setFont(new Font("굴림", Font.PLAIN, 13));
			sidetable.setRowHeight(30);
//			순위 매기기 소팅
			sort(makemenu,6,8);
			int cnt2=1;
			for(int i = 6; i<=8;i++) {
				if(makemenu.menu[i].sold!=0) {
					if(cnt2==3)break;
					Vector<Object> sidecontents = new Vector<Object>();
					sidecontents.addElement(cnt2);
					sidecontents.addElement(makemenu.menu[i].sold);
					sidecontents.addElement(makemenu.menu[i].name);
					model3.addRow(sidecontents);
				}
				cnt2++;
			}		
			
			String drinkrank[]= {"순위","수량","음료"};
			DefaultTableModel model4 = new DefaultTableModel(drinkrank,0);
			JTable drinktable = new JTable(model4);
			drinktable.setFont(new Font("굴림", Font.PLAIN, 13));
			drinktable.setRowHeight(30);
//			순위 매기기 소팅
			sort(makemenu,9,12);
			int cnt3=1;
			for(int i = 9; i<=12;i++) {
				if(makemenu.menu[i].sold!=0) {
					if(cnt3==3) break;
					Vector<Object> drinkcontents= new Vector<Object>();
					drinkcontents.addElement(cnt3);
					drinkcontents.addElement(makemenu.menu[i].sold);
					drinkcontents.addElement(makemenu.menu[i].name);
					model4.addRow(drinkcontents);
				}
				cnt3++;
			}
			
			  TableColumnModel mcolumnModel = maintable.getColumnModel();
			  TableColumn mcolumn0 = mcolumnModel.getColumn(0); 
		      TableColumn mcolumn1 = mcolumnModel.getColumn(1); 
		      TableColumn mcolumn2 = mcolumnModel.getColumn(2); 
		      mcolumn0.setCellRenderer(renderer);
		      mcolumn1.setCellRenderer(renderer);
		      mcolumn2.setCellRenderer(renderer);
		      
		      TableColumnModel scolumnModel = sidetable.getColumnModel();
			  TableColumn scolumn0 = scolumnModel.getColumn(0); 
		      TableColumn scolumn1 = scolumnModel.getColumn(1); 
		      TableColumn scolumn2 = scolumnModel.getColumn(2); 
		      scolumn0.setCellRenderer(renderer);
		      scolumn1.setCellRenderer(renderer);
		      scolumn2.setCellRenderer(renderer);
		      
		      TableColumnModel dcolumnModel = drinktable.getColumnModel();
			  TableColumn dcolumn0 = dcolumnModel.getColumn(0); 
		      TableColumn dcolumn1 = dcolumnModel.getColumn(1); 
		      TableColumn dcolumn2 = dcolumnModel.getColumn(2); 
		      dcolumn0.setCellRenderer(renderer);
		      dcolumn1.setCellRenderer(renderer);
		      dcolumn2.setCellRenderer(renderer);
		      
		      
		
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1024, 768);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(new CardLayout(0, 0));
			
			JPanel Mainpanel = new JPanel();
			contentPane.add(Mainpanel, "name_359157631449594");
			Mainpanel.setLayout(null);
			
			JPanel Contentspanel = new JPanel();
			Contentspanel.setBounds(0, 0, 996, 394);
			Mainpanel.add(Contentspanel);
			
//			content가 들어가는 판은 cardlayout으로 만들거야
			CardLayout card = new CardLayout(0,0);
			Contentspanel.setLayout(card);
			
			JPanel p1 = new JPanel();
			JPanel p2 = new JPanel();
			p1.setLayout(null);
			
			JScrollPane scrollPane = new JScrollPane(stable);
			scrollPane.setBounds(0, 0, 996, 268);
			p1.add(scrollPane);
			
//			p2판은 gridlayout으로 할게
			p2.setLayout(new GridLayout(0, 2, 0, 0));
			
//			table을 판 위에 올리기
			JScrollPane scrollPane_1 = new JScrollPane(maintable);
			p2.add(scrollPane_1);
			
			JScrollPane scrollPane_2 = new JScrollPane(sidetable);
			p2.add(scrollPane_2);
			
			JScrollPane scrollPane_3 = new JScrollPane(drinktable);
			p2.add(scrollPane_3);
			
			JLabel label = new JLabel("");
			p2.add(label);
			
			JPanel Buttonpanel = new JPanel();
			Buttonpanel.setBounds(0, 394, 996, 75);
			Mainpanel.add(Buttonpanel);
			
//			Contentspanel에 panel 추가
			Contentspanel.add("aa",p1);
			
			JPanel panel = new JPanel();
			panel.setBounds(0, 267, 996, 127);
			p1.add(panel);
			
			//		table cell 높이 조정
					totaltable.setRowHeight(30);
					profittable.setRowHeight(30);
					panel.setLayout(new GridLayout(0, 1, 0, 0));
					JScrollPane totalscrollPane = new JScrollPane(totaltable);
					panel.add(totalscrollPane);
					
					JScrollPane profitscrollPane = new JScrollPane(profittable);
					panel.add(profitscrollPane);
			Contentspanel.add("bb",p2);
			
//			버튼
			JButton Sales = new JButton("매출 / 순이익");
			Sales.setFont(new Font("굴림", Font.PLAIN, 15));
			Sales.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						card.show(Contentspanel,"aa");
				}
			});
			Buttonpanel.setLayout(new GridLayout(0, 2, 0, 0));
			Buttonpanel.add(Sales);
			
			JButton Ranking = new JButton("판매순위");
			Ranking.setFont(new Font("굴림", Font.PLAIN, 15));
			Ranking.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					card.show(Contentspanel,"bb");
				}
			});
			Buttonpanel.add(Ranking);
		}
	public void sort(MakeMenu data, int l, int r) {
        int left = l;
        int right = r;
        Menu pivot = data.menu[(l + r) / 2]; // pivot 가운데 설정 (최악의 경우 방지)
 
        do {
            while (data.menu[left].sold > pivot.sold)
                left++;
            while (data.menu[right].sold < pivot.sold)
                right--;
 
            if (left <= right) {
            		Menu temp = data.menu[left];
                    data.menu[left] = data.menu[right];
                    data.menu[right] = temp;
                    left++;
                    right--;
                	
            }
        } while (left <= right);
 
        if (l < right) {
            sort(data, l, right);
        }
        if (r > left) {
            sort(data, left, r);
 
        }
    }

}
