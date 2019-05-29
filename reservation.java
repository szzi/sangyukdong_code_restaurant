package reservation1;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class reservation extends JFrame {

	private JPanel HcontentPane;
	private JTextField Htextfield;
	private JTable Htable;
	private JTextField Htextfield1;
	private JTextField Htextfield2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reservation frame = new reservation();
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
	public reservation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		HcontentPane = new JPanel();
		HcontentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(HcontentPane);
		HcontentPane.setLayout(null);
		HcontentPane.setBackground(SystemColor.activeCaption);
		Htextfield = new JTextField();
		Htextfield.setBounds(5, 5, 1003, 82);
		Htextfield.setHorizontalAlignment(SwingConstants.CENTER);
		Htextfield.setFont(new Font("³ª´®½ºÄù¾î¶ó¿îµå ExtraBold", Font.BOLD, 48));
		Htextfield.setText("\uC608\uC57D");
		HcontentPane.add(Htextfield);
		Htextfield.setColumns(10);
		
		JPanel HbuttonPanel = new JPanel();
		HbuttonPanel.setBackground(SystemColor.window);
		HbuttonPanel.setBounds(5, 97, 727, 532);
		HcontentPane.add(HbuttonPanel);
		HbuttonPanel.setLayout(null);
		
		JButton Hbutton1 = new JButton("1");
		Hbutton1.setFont(new Font("³ª´®½ºÄù¾î¶ó¿îµå ExtraBold", Font.BOLD, 48));
		Hbutton1.setBackground(Color.LIGHT_GRAY);
		Hbutton1.addMouseListener(new MouseAdapter() {
			int count=0;
			@Override
			
			public void mouseClicked(MouseEvent arg0) {
				count++;
				if(count%2!=0) 
					Hbutton1.setBackground(SystemColor.activeCaption);
				else
					Hbutton1.setBackground(Color.LIGHT_GRAY);
				
			}
		});
		Hbutton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Hbutton1.setForeground(SystemColor.desktop);
		Hbutton1.setBounds(29, 25, 319, 194);
		HbuttonPanel.add(Hbutton1);
		
		JButton Hbutton2 = new JButton("2");
		Hbutton2.setFont(new Font("³ª´®½ºÄù¾î¶ó¿îµå ExtraBold", Font.BOLD, 48));
		Hbutton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Hbutton2.setBackground(Color.LIGHT_GRAY);
		Hbutton2.addMouseListener(new MouseAdapter() {
			int count=0;
			@Override
			public void mouseClicked(MouseEvent arg0) {
				count++;
				if(count%2!=0)
					Hbutton2.setBackground(SystemColor.activeCaption);
				else Hbutton2.setBackground(Color.LIGHT_GRAY);
			}
		});
		Hbutton2.setBounds(398, 25, 289, 194);
		HbuttonPanel.add(Hbutton2);
		
		JButton Hbutton3 = new JButton("3");
		Hbutton3.setFont(new Font("³ª´®½ºÄù¾î¶ó¿îµå ExtraBold", Font.BOLD, 48));
		Hbutton3.setBackground(Color.LIGHT_GRAY);
		Hbutton3.addMouseListener(new MouseAdapter() {
			int count=0;
			@Override
			public void mouseClicked(MouseEvent arg0) {
				count++;
				if(count%2!=0)
					Hbutton3.setBackground(SystemColor.activeCaption);
				else Hbutton3.setBackground(Color.LIGHT_GRAY);
			}
		});
		Hbutton3.setBounds(29, 304, 319, 194);
		HbuttonPanel.add(Hbutton3);
		
		JButton Hbutton4 = new JButton("4");
		Hbutton4.setFont(new Font("³ª´®½ºÄù¾î¶ó¿îµå ExtraBold", Font.PLAIN, 48));
		Hbutton4.setBackground(Color.LIGHT_GRAY);
		Hbutton4.addMouseListener(new MouseAdapter() {
			int count=0;
			@Override
			public void mouseClicked(MouseEvent arg0) {
				count++;
				if(count%2!=0)
					Hbutton4.setBackground(SystemColor.activeCaption);
				else Hbutton4.setBackground(Color.LIGHT_GRAY);
			}
		});
		Hbutton4.setBounds(398, 304, 126, 194);
		HbuttonPanel.add(Hbutton4);
		
		JButton Hbutton5 = new JButton("5");
		Hbutton5.setFont(new Font("³ª´®½ºÄù¾î¶ó¿îµå ExtraBold", Font.BOLD, 48));
		Hbutton5.setBackground(Color.LIGHT_GRAY);
		Hbutton5.addMouseListener(new MouseAdapter() {
			int count=0;
			@Override
			public void mouseClicked(MouseEvent arg0) {
				count++;
				if(count%2!=0)
					Hbutton5.setBackground(SystemColor.activeCaption);
				else Hbutton5.setBackground(Color.LIGHT_GRAY);
				
			}
		});
		Hbutton5.setBounds(568, 304, 119, 194);
		HbuttonPanel.add(Hbutton5);
		
		JPanel HlistPanel = new JPanel();
		HlistPanel.setBackground(SystemColor.text);
		HlistPanel.setBounds(754, 97, 242, 532);
		HcontentPane.add(HlistPanel);
		HlistPanel.setLayout(null);
		
		Htable = new JTable();
		Htable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		Htable.getColumnModel().getColumn(0).setPreferredWidth(140);
		Htable.setBounds(12, 96, 218, 382);
		HlistPanel.add(Htable);
		
		Htextfield1 = new JTextField();
		Htextfield1.setFont(new Font("³ª´®½ºÄù¾î¶ó¿îµå ExtraBold", Font.BOLD, 30));
		Htextfield1.setText("\uC608\uC57D \uBA85\uB2E8");
		Htextfield1.setHorizontalAlignment(SwingConstants.CENTER);
		Htextfield1.setBounds(12, 10, 218, 44);
		HlistPanel.add(Htextfield1);
		Htextfield1.setColumns(10);
		
		JTextField Htextfield3 = new JTextField();
		Htextfield3.setFont(new Font("³ª´®½ºÄù¾î ExtraBold", Font.BOLD, 25));
		Htextfield3.setHorizontalAlignment(SwingConstants.CENTER);
		Htextfield3.setText("\uBC88\uD638");
		Htextfield3.setColumns(10);
		Htextfield3.setBounds(155, 53, 75, 44);
		HlistPanel.add(Htextfield3);
		
		Htextfield2 = new JTextField();
		Htextfield2.setFont(new Font("³ª´®½ºÄù¾î¶ó¿îµå ExtraBold", Font.BOLD, 25));
		Htextfield2.setHorizontalAlignment(SwingConstants.CENTER);
		Htextfield2.setText("\uC774\uB984");
		Htextfield2.setColumns(10);
		Htextfield2.setBounds(12, 53, 142, 44);
		HlistPanel.add(Htextfield2);
		
		JButton HbackButton = new JButton("BACK");
		HbackButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		HbackButton.setBackground(SystemColor.textHighlight);
		HbackButton.setForeground(new Color(0, 0, 128));
		HbackButton.setFont(new Font("³ª´®½ºÄù¾î¶ó¿îµå ExtraBold", Font.BOLD, 20));
		HbackButton.setBounds(30, 645, 106, 74);
		HcontentPane.add(HbackButton);
	}
}
