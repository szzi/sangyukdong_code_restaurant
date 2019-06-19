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
	
	public Sales(){	
		run();
	}
	
	public void run() {			
		p2 = new JPanel();
			//Order order = new Order();
		Color color = new Color(254,206,0);
		Color color2 = new Color(235,229,217);
		Color backcolor = new Color(245,245,245);
		
		String header1[]= {"��ǰ��","����","�ݾ�"};

//		���� ������ Ȯ�� ���̺�
		DefaultTableModel model1 = new DefaultTableModel(header1,0);
		JTable stable = new JTable(model1);
		stable.setFont(new Font("���� ���", Font.PLAIN, 12));
		int totalsales=0;
		int profitsales=0;
		int pprofit=0;
		stable.setRowHeight(30);
		
		for(int i = 0; i<MakeMenu.menu.length;i++) {
			System.out.printf("Sales: %s %d,",MakeMenu.menu[i].name,MakeMenu.menu[i].sold);
			if(MakeMenu.menu[i].sold!=0) {
				Vector<Object> contents1 = new Vector<Object>();
				contents1.addElement(MakeMenu.menu[i].name);
				contents1.addElement(MakeMenu.menu[i].sold);
				contents1.addElement(MakeMenu.menu[i].cost*MakeMenu.menu[i].sold);
				totalsales += MakeMenu.menu[i].cost*MakeMenu.menu[i].sold;
				profitsales += (MakeMenu.menu[i].cogs*MakeMenu.menu[i].sold);
				model1.addRow(contents1);
			}
			pprofit = totalsales - profitsales;
		}
		
		String totalheader[]= {"�� ����"};
		DefaultTableModel totalmodel = new DefaultTableModel(totalheader,0);
		Vector<Object> total = new Vector<Object>();
		total.addElement(totalsales);
		totalmodel.addRow(total);
		JTable totaltable = new JTable(totalmodel);
		totaltable.setFont(new Font("���� ���", Font.PLAIN, 12));
		totaltable.setRowHeight(50);
		
		String profitheader[]= {"������"};
		DefaultTableModel profitmodel = new DefaultTableModel(profitheader,0);
		Vector<Object> profit = new Vector<Object>();
		profit.addElement(pprofit);
		profitmodel.addRow(profit);
		JTable profittable = new JTable(profitmodel);
		profittable.setFont(new Font("���� ���", Font.PLAIN, 12));
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
		
		String mainrank[]= {"����","����","�ָ޴�"};
		DefaultTableModel model2 = new DefaultTableModel(mainrank,0);
		JTable maintable = new JTable(model2);
		maintable.setRowHeight(30);
		maintable.setFont(new Font("���� ���", Font.PLAIN, 13));
		maintable.setRowHeight(30);
//		���� �ű�� ����
		sort(0,5);
		int cnt1=1;
		for(int i = 0; i<=5;i++) {
			if(MakeMenu.menu[i].sold!=0) {
				if(cnt1==3)break;
				Vector<Object> maincontents = new Vector<Object>();
				maincontents.addElement(cnt1);
				maincontents.addElement(MakeMenu.menu[i].sold);
				maincontents.addElement(MakeMenu.menu[i].name);	
				model2.addRow(maincontents);
			}
			cnt1++;
		}
		
		String siderank[]= {"����","����","���̵�޴�"};
		DefaultTableModel model3 = new DefaultTableModel(siderank,0);
		JTable sidetable = new JTable(model3);
		sidetable.setRowHeight(30);
		sidetable.setFont(new Font("���� ���", Font.PLAIN, 13));
		sidetable.setRowHeight(30);
//		���� �ű�� ����
		sort(6,8);
		int cnt2=1;
		for(int i = 6; i<=8;i++) {
			if(MakeMenu.menu[i].sold!=0) {
				if(cnt2==3)break;
				Vector<Object> sidecontents = new Vector<Object>();
				sidecontents.addElement(cnt2);
				sidecontents.addElement(MakeMenu.menu[i].sold);
				sidecontents.addElement(MakeMenu.menu[i].name);
				model3.addRow(sidecontents);
			}
			cnt2++;
		}		
		
		String drinkrank[]= {"����","����","����"};
		DefaultTableModel model4 = new DefaultTableModel(drinkrank,0);
		JTable drinktable = new JTable(model4);
		drinktable.setRowHeight(30);
		drinktable.setFont(new Font("���� ���", Font.PLAIN, 13));
		drinktable.setRowHeight(30);
//		���� �ű�� ����
		sort(9,12);
		int cnt3=1;
		
		for(int i = 9; i<=12;i++) {
			if(MakeMenu.menu[i].sold!=0) {
				if(cnt3==3) break;
				Vector<Object> drinkcontents= new Vector<Object>();
				drinkcontents.addElement(cnt3);
				drinkcontents.addElement(MakeMenu.menu[i].sold);
				drinkcontents.addElement(MakeMenu.menu[i].name);
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
		
//		content�� ���� ���� cardlayout���� ����ž�
		CardLayout card = new CardLayout(0,0);
		Contentspanel.setLayout(card);
		
		JPanel sales_panel = new JPanel();
		JPanel ranking_panel = new JPanel();
		sales_panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(stable);
		scrollPane.setBounds(12, 0, 984, 357);
		sales_panel.add(scrollPane);
		
//		p2���� gridlayout���� �Ұ�
		ranking_panel.setLayout(new GridLayout(0, 2, 0, 0));
		
//		table�� �� ���� �ø���
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
		
//		Contentspanel�� panel �߰�
		Contentspanel.add("aa",sales_panel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 360, 996, 162);
		sales_panel.add(panel);
		
		//		table cell ���� ����
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
		
//		��ư
		JButton Sales = new JButton("���� / ������");
		Sales.setFont(new Font("���� ���", Font.BOLD, 15));
		Sales.setBackground(color);
		Sales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					card.show(Contentspanel,"aa");
			}
		});
		Buttonpanel.setLayout(new GridLayout(0, 2, 0, 0));
		Buttonpanel.add(Sales);
		
		JButton Ranking = new JButton("�Ǹż���");
		Ranking.setFont(new Font("���� ���", Font.BOLD, 15));
		Ranking.setBackground(color);
		Ranking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(Contentspanel,"bb");
			}
		});
		Buttonpanel.add(Ranking);
		
		JButton BackButton = new JButton("�ڷΰ���");
		BackButton.setFont(new Font("���� ���", Font.BOLD, 15));
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
        int left = l;
        int right = r;
        Menu pivot = MakeMenu.menu[(l + r) / 2]; // pivot ��� ���� (�־��� ��� ����)
 
        do {
            while (MakeMenu.menu[left].sold > pivot.sold)
                left++;
            while (MakeMenu.menu[right].sold < pivot.sold)
                right--;
 
            if (left <= right) {
            		Menu temp = MakeMenu.menu[left];
                    MakeMenu.menu[left] = MakeMenu.menu[right];
                    MakeMenu.menu[right] = temp;
                    left++;
                    right--;
                	
            }
        } while (left <= right);
 
        if (l < right) {
            sort( l, right);
        }
        if (r > left) {
            sort(left, r);
 
        }
    }
}

