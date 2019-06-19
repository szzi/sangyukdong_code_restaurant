package restaurant1;
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
import javax.swing.JTextArea;


public class reservation extends JFrame {

   private JPanel Panel3;
   private JTextField Htextfield;
   private JTextField Htextfield1;
   private JTextField Htextfield2;
   private JPanel contentPane;
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private JTextField textField_3;
   private JTextField textField_4;
   public static String name;

   reservation() {
	      super("reservation");
	   Color color = new Color(254,206,0);
	   Color backcolor = new Color(245,245,245);

      setSize(1024,768);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //setBounds(100, 100, 1024, 768);
      
      Panel3 = new JPanel();
      Panel3.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(Panel3);
      Panel3.setLayout(null);
      Panel3.setBackground(backcolor);
   
      Htextfield = new JTextField();
      Htextfield.setHorizontalAlignment(SwingConstants.CENTER);
      Htextfield.setFont(new Font("³ª´®½ºÄù¾î¶ó¿îµå ExtraBold", Font.BOLD, 48));
      Htextfield.setText("\uC608\uC57D");
      Panel3.add(Htextfield);
      Htextfield.setColumns(10);
      Htextfield.setBounds(5, 5, 1003, 82);
      
      
      JPanel HbuttonPanel = new JPanel();
      HbuttonPanel.setBackground(SystemColor.window);
      Panel3.add(HbuttonPanel);
      HbuttonPanel.setLayout(null);
      JPanel HlistPanel = new JPanel();
      HlistPanel.setBackground(SystemColor.text);
      Panel3.add(HlistPanel);
      HlistPanel.setLayout(null);
      HbuttonPanel.setBounds(5, 97, 727, 532);
      HlistPanel.setBounds(754, 97, 242, 532);
      
      JTextArea num = new JTextArea();
      reservation4 r = new reservation4();
      
      
      JButton Hbutton1 = new JButton("1");
      Hbutton1.setFont(new Font("³ª´®½ºÄù¾î¶ó¿îµå ExtraBold", Font.BOLD, 48));
      Hbutton1.setBackground(Color.LIGHT_GRAY);
      Hbutton1.addMouseListener(new MouseAdapter() {
         int count=0;
         @Override
         
         public void mouseClicked(MouseEvent arg0) {
            count++;
            if(count%2!=0) 
               Hbutton1.setBackground(color);
            else
               Hbutton1.setBackground(Color.LIGHT_GRAY);
            num.append(String.format("1\n"));
            HlistPanel.add(num);
            num.setBounds(165, 107, 65, 225);
         }
      });
      Hbutton1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
      
         }
      });
      Hbutton1.setForeground(SystemColor.desktop);
      HbuttonPanel.add(Hbutton1);
      Hbutton1.setBounds(29, 25, 319, 194);
      
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
               Hbutton2.setBackground(color);
            else Hbutton2.setBackground(Color.LIGHT_GRAY);
            
            num.append(String.format("2\n"));
            HlistPanel.add(num);
            num.setBounds(165, 107, 65, 225);
         }
      });
   
      HbuttonPanel.add(Hbutton2);
      Hbutton2.setBounds(398, 25, 289, 194);
      
      JButton Hbutton3 = new JButton("3");
      Hbutton3.setFont(new Font("³ª´®½ºÄù¾î¶ó¿îµå ExtraBold", Font.BOLD, 48));
      Hbutton3.setBackground(Color.LIGHT_GRAY);
      Hbutton3.addMouseListener(new MouseAdapter() {
         int count=0;
         @Override
         public void mouseClicked(MouseEvent arg0) {
            count++;
            if(count%2!=0)
               Hbutton3.setBackground(color);
            else Hbutton3.setBackground(Color.LIGHT_GRAY);
            
            num.append(String.format("3\n"));
            HlistPanel.add(num);
            num.setBounds(165, 107, 65, 225);
         }
      });
      HbuttonPanel.add(Hbutton3);
      Hbutton3.setBounds(29, 304, 319, 194);
      
      JButton Hbutton4 = new JButton("4");
      Hbutton4.setFont(new Font("³ª´®½ºÄù¾î¶ó¿îµå ExtraBold", Font.PLAIN, 48));
      Hbutton4.setBackground(Color.LIGHT_GRAY);
      Hbutton4.addMouseListener(new MouseAdapter() {
         int count=0;
         @Override
         public void mouseClicked(MouseEvent arg0) {
            count++;
            if(count%2!=0)
               Hbutton4.setBackground(color);
            else Hbutton4.setBackground(Color.LIGHT_GRAY);
            
            num.append(String.format("4\n"));
            HlistPanel.add(num);
            num.setBounds(165, 107, 65, 225);
         }
      });
      HbuttonPanel.add(Hbutton4);
      Hbutton4.setBounds(398, 304, 126, 194);
      
      JButton Hbutton5 = new JButton("5");
      Hbutton5.setFont(new Font("³ª´®½ºÄù¾î¶ó¿îµå ExtraBold", Font.BOLD, 48));
      Hbutton5.setBackground(Color.LIGHT_GRAY);
      Hbutton5.addMouseListener(new MouseAdapter() {
         int count=0;
         @Override
         public void mouseClicked(MouseEvent arg0) {
            count++;
            if(count%2!=0)
               Hbutton5.setBackground(color);
            else Hbutton5.setBackground(Color.LIGHT_GRAY);
            
            num.append(String.format("5\n"));
            HlistPanel.add(num);
            num.setBounds(165, 107, 65, 225);
         }
      });
      HbuttonPanel.add(Hbutton5);
      Hbutton5.setBounds(568, 304, 119, 194);
      
      
      Htextfield1 = new JTextField();
      Htextfield1.setFont(new Font("³ª´®½ºÄù¾î¶ó¿îµå ExtraBold", Font.BOLD, 30));
      Htextfield1.setText("\uC608\uC57D \uBA85\uB2E8");
      Htextfield1.setHorizontalAlignment(SwingConstants.CENTER);
      HlistPanel.add(Htextfield1);
      Htextfield1.setBounds(12, 10, 218, 44);
      Htextfield1.setColumns(10);
      
      JTextField Htextfield3 = new JTextField();
      Htextfield3.setFont(new Font("³ª´®½ºÄù¾î ExtraBold", Font.BOLD, 25));
      Htextfield3.setHorizontalAlignment(SwingConstants.CENTER);
      Htextfield3.setText("\uBC88\uD638");
      Htextfield3.setColumns(10);
      HlistPanel.add(Htextfield3);
      Htextfield3.setBounds(155, 53, 75, 44);
      
      Htextfield2 = new JTextField();
      Htextfield2.setFont(new Font("³ª´®½ºÄù¾î¶ó¿îµå ExtraBold", Font.BOLD, 25));
      Htextfield2.setHorizontalAlignment(SwingConstants.CENTER);
      Htextfield2.setText("\uC774\uB984");
      Htextfield2.setColumns(10);
      HlistPanel.add(Htextfield2);
      Htextfield2.setBounds(12, 53, 142, 44);
      
      JButton HbackButton = new JButton("BACK");
      HbackButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent arg0) {
            
         }
      });
      HbackButton.setBackground(color);
      HbackButton.setForeground(new Color(0, 0, 128));
      HbackButton.setFont(new Font("³ª´®½ºÄù¾î¶ó¿îµå ExtraBold", Font.BOLD, 20));
      Panel3.add(HbackButton);
      HbackButton.setBounds(30, 645, 106, 74);
      
      try {
          Thread.sleep(10000);
      }catch(InterruptedException e){
      }
      name=r.data;
      System.out.println(name);
      
      JTextArea nname = new JTextArea();//name
      nname.setEditable(false);
      nname.append(String.format("%s\n",name));
      HlistPanel.add(nname);
      nname.setBounds(12, 107, 142, 242);
      
   }
}