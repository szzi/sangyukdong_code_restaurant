package restaurant;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("serial")
public class Sales extends JFrame {

	//private JPanel contentPane;
	JPanel p2;
	/**
	 * Launch the application.
	 */
	int[] check = new int[13];
	public Sales(){	
		run();
	}
	
	public void run() {			
		p2 = new JPanel();
			//Order order = new Order();
		Color color = new Color(254,206,0);
		Color color2 = new Color(235,229,217);
		Color backcolor = new Color(245,245,245);
		
		String header1[]= {"상품명","수량","금액"};

//		매출 순이익 확인 테이블
		DefaultTableModel model1 = new DefaultTableModel(header1,0);
		JTable stable = new JTable(model1);
		stable.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		int totalsales=0;
		int profitsales=0;
		int pprofit=0;
		stable.setRowHeight(30);
		
		for(int i = 0; i<13; i++)
		{
			check[i]= MakeMenu.menuSold[i];
		}
		
		for(int i = 0; i<MakeMenu.menu.length;i++) {
			System.out.printf("%s %d\n",MakeMenu.menuName[i],MakeMenu.menuSold[i]);
			if(MakeMenu.menuSold[i]!=0) {
				Vector<Object> contents1 = new Vector<Object>();
				contents1.addElement(MakeMenu.menuName[i]);
				contents1.addElement(MakeMenu.menuSold[i]);
				contents1.addElement(MakeMenu.menuCost[i]*MakeMenu.menuSold[i]);
				totalsales += MakeMenu.menuCost[i]*MakeMenu.menuSold[i];
				profitsales += (MakeMenu.menuCogs[i]*MakeMenu.menuSold[i]);
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
		totaltable.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		totaltable.setRowHeight(50);
		
		String profitheader[]= {"순이익"};
		DefaultTableModel profitmodel = new DefaultTableModel(profitheader,0);
		Vector<Object> profit = new Vector<Object>();
		profit.addElement(pprofit);
		profitmodel.addRow(profit);
		JTable profittable = new JTable(profitmodel);
		profittable.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		profittable.setRowHeight(50);
		
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
		maintable.setRowHeight(30);
		maintable.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		maintable.setRowHeight(30);
//		순위 매기기 소팅
		sort(0,5);
		
		int cnt1=1;
		
		for(int k = 0;k<=5;k++)
		{
			System.out.printf("%d,", check[k]);
		}
		
		for(int i = 0;i<=5;i++) {
			
			int j =check[i];
			if(MakeMenu.menuSold[j]!=0) {
				if(cnt1==3) {
					break;
				}
				int k=0;
				
				for(k = 0;k<=5;k++)
				{
					if(j==MakeMenu.menuSold[k])
					{	
						System.out.printf("%d<=%d,", k,j);
						Vector<Object> maincontents = new Vector<Object>();
						maincontents.addElement(cnt1);
						maincontents.addElement(MakeMenu.menuSold[k]);
						maincontents.addElement(MakeMenu.menuName[k]);	
						model2.addRow(maincontents);
					}
				}
								
			}
			cnt1++;
		}
		
		String siderank[]= {"순위","수량","사이드메뉴"};
		DefaultTableModel model3 = new DefaultTableModel(siderank,0);
		JTable sidetable = new JTable(model3);
		sidetable.setRowHeight(30);
		sidetable.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		sidetable.setRowHeight(30);
//		순위 매기기 소팅
		sort(6,8);
		int cnt2=1;
		for(int i = 6; i<=8;i++) {
			int j2 =check[i];
			if(MakeMenu.menuSold[j2]!=0) {
				if(cnt2==3) {
					break;
				}
				
				
				for(int k2 = 6;k2<=8;k2++)
				{
					if(j2==MakeMenu.menuSold[k2]) {
						System.out.printf("%d<=%d,", k2,j2);
						Vector<Object> sidecontents = new Vector<Object>();
						sidecontents.addElement(cnt2);
						sidecontents.addElement(MakeMenu.menuSold[k2]);
						sidecontents.addElement(MakeMenu.menuName[k2]);	
						model3.addRow(sidecontents);
					}
						
				}
				
			}
			cnt2++;
		}		
		
		String drinkrank[]= {"순위","수량","음료"};
		DefaultTableModel model4 = new DefaultTableModel(drinkrank,0);
		JTable drinktable = new JTable(model4);
		drinktable.setRowHeight(30);
		drinktable.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		drinktable.setRowHeight(30);
//		순위 매기기 소팅
		sort(9,12);
		int cnt3=1;
		
		for(int i = 9; i<=12;i++) {
			int j3 =check[i];
			if(MakeMenu.menuSold[j3]!=0) {
				if(cnt3==3) {
					break;
				}
				
				
				for(int k3 = 9;k3<=12;k3++)
				{
					if(j3==MakeMenu.menuSold[k3]) {
						System.out.printf("%d<=%d,", k3,j3);
						Vector<Object> drinkcontents = new Vector<Object>();
						drinkcontents.addElement(cnt3);
						drinkcontents.addElement(MakeMenu.menuSold[k3]);
						drinkcontents.addElement(MakeMenu.menuName[k3]);	
						model4.addRow(drinkcontents);
					}
						
				}
				
				
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
	      
	      
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 1024, 768);
		//contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		//contentPane.setLayout(new CardLayout(0, 0));
		
		
		p2.setBackground(backcolor);
		p2.setForeground(Color.BLACK);
		//contentPane.add(p2, "name_359157631449594");
		p2.setLayout(null);
		p2.setBounds(100, 100, 1024, 768);
		JPanel Contentspanel = new JPanel();
		Contentspanel.setBounds(0, 0, 996, 534);
		p2.add(Contentspanel);
		
//		content가 들어가는 판은 cardlayout으로 만들거야
		CardLayout card = new CardLayout(0,0);
		Contentspanel.setLayout(card);
		
		JPanel sales_panel = new JPanel();
		JPanel ranking_panel = new JPanel();
		sales_panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(stable);
		scrollPane.setBounds(12, 0, 984, 357);
		sales_panel.add(scrollPane);
		
//		p2판은 gridlayout으로 할게
		ranking_panel.setLayout(new GridLayout(0, 2, 0, 0));
		
//		table을 판 위에 올리기
		JScrollPane scrollPane_1 = new JScrollPane(maintable);
		ranking_panel.add(scrollPane_1);
		
		JScrollPane scrollPane_2 = new JScrollPane(sidetable);
		ranking_panel.add(scrollPane_2);
		
		JScrollPane scrollPane_3 = new JScrollPane(drinktable);
		ranking_panel.add(scrollPane_3);
		
		JLabel label = new JLabel("");
		ranking_panel.add(label);
		
		JPanel Buttonpanel = new JPanel();
		Buttonpanel.setBounds(10, 535, 986, 75);
		p2.add(Buttonpanel);
		
//		Contentspanel에 panel 추가
		Contentspanel.add("aa",sales_panel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 360, 996, 162);
		sales_panel.add(panel);
		
		//		table cell 높이 조정
				totaltable.setRowHeight(30);
				profittable.setRowHeight(30);
				panel.setLayout(null);
				JScrollPane totalscrollPane = new JScrollPane(totaltable);
				totalscrollPane.setBounds(12, 0, 984, 81);
				panel.add(totalscrollPane);
				
				JScrollPane profitscrollPane = new JScrollPane(profittable);
				profitscrollPane.setBounds(12, 81, 984, 81);
				panel.add(profitscrollPane);
		Contentspanel.add("bb",ranking_panel);
		
//		버튼
		JButton Sales = new JButton("매출 / 순이익");
		Sales.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		Sales.setBackground(color);
		Sales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					card.show(Contentspanel,"aa");
			}
		});
		Buttonpanel.setLayout(new GridLayout(0, 2, 0, 0));
		Buttonpanel.add(Sales);
		
		JButton Ranking = new JButton("판매순위");
		Ranking.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		Ranking.setBackground(color);
		Ranking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(Contentspanel,"bb");
			}
		});
		Buttonpanel.add(Ranking);
		
		JButton BackButton = new JButton("뒤로가기");
		BackButton.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		BackButton.setBackground(color);
		BackButton.setForeground(Color.BLACK);
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Test.card.show(Test.f,"main_screen");
			}
		});
		BackButton.setBounds(12, 629, 240, 68);
		p2.add(BackButton);
		
	}
	

	public void sort(int l, int r) {
		int[] arr = new int[r-l +1];
	
		for(int i = l; i<=r; i++)
		{
			arr[i-l] = MakeMenu.menuSold[i];
		}
		
        Arrays.sort(arr);
        
        for(int i = 0; i<=r-l; i++)
		{
			check[i] = arr[r-l-i];
		}
}
	
}

