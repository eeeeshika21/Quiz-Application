
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 
    JButton rules, back;
    JTextField tfname;
    
    Login() {
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 480);
        add(image);
        
        JLabel heading = new JLabel("BrainWave");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 45));
        heading.setForeground(new Color(255, 204, 255));
        add(heading);
        
        JLabel name = new JLabel("Your name please...");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        name.setForeground(new Color(99, 194, 235));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735, 200, 320, 30);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 22));
        add(tfname);
        
        rules = new JButton("START");
        rules.setBounds(735, 270, 150, 35);
        rules.setBackground(new Color(161, 64, 100));
        rules.setForeground(Color.WHITE);
        rules.setFont(new Font("Times New Roman", Font.BOLD, 15));
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("NOPE");
        back.setBounds(915, 270, 150, 35);
        back.setBackground(new Color(161, 64, 100));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Times New Roman", Font.BOLD, 15));
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 480);
        setLocation(120, 120);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
