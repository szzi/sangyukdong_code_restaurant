package restaurant;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Client extends JFrame {

   private JPanel contentPane;
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private JTextField textField_3;
   private JTextField textField_4;
   public static String data;


   /**
    * Create the frame.
    */
     Client() {
   //   super("reservation");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
   //   setSize(400,400);
      setVisible(true);

      setBounds(400, 400, 450, 300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);

      
      
      textField = new JTextField();
      textField.setFont(new Font("±¼¸²", Font.BOLD, 12));
      textField.setHorizontalAlignment(SwingConstants.CENTER);
      textField.setText("\uC608\uC57D\uC790 \uC131\uD568");
      contentPane.add(textField);
      textField.setBounds(133, 99, 96, 21);
      textField.setColumns(10);
      
      textField_1 = new JTextField();
      contentPane.add(textField_1);
      textField_1.setBounds(224, 99, 96, 21);
      textField_1.setColumns(10);
      
      JButton btnNewButton = new JButton("\uC800\uC7A5");
      btnNewButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent arg0) {
            data= textField_1.getText();
            setVisible(false);
            dispose();
         }
      });
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
         }
      });
      contentPane.add(btnNewButton);
      btnNewButton.setBounds(186, 193, 91, 23);
      
      textField_2 = new JTextField();
      textField_2.setFont(new Font("±¼¸²", Font.BOLD, 12));
      textField_2.setText("\uC778\uC6D0\uC218");
      textField_2.setHorizontalAlignment(SwingConstants.CENTER);
      contentPane.add(textField_2);
      textField_2.setColumns(10);
      textField_2.setBounds(133, 121, 96, 21);
      
      textField_3 = new JTextField();
      contentPane.add(textField_3);
      textField_3.setColumns(10);
      textField_3.setBounds(224, 121, 96, 21);
      
      textField_4 = new JTextField();
      textField_4.setHorizontalAlignment(SwingConstants.CENTER);
      textField_4.setFont(new Font("³ª´®½ºÄù¾î Bold", Font.BOLD, 19));
      textField_4.setText("\uACE0\uAC1D \uC815\uBCF4 \uC785\uB825");
      contentPane.add(textField_4);
      textField_4.setBounds(12, 10, 424, 43);
      textField_4.setColumns(10);
   }

}