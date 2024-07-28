

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to BrainWave");
        heading.setBounds(120, 35, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(255, 204, 255));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(25, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 18));
        rules.setForeground(Color.WHITE);
        rules.setText(
            "<html>"+ 
                "1. Answer concisely and directly." + "<br><br>" +
                "2. Focus on your work; avoid distractions." + "<br><br>" +
                "3. All questions are mandatory." + "<br><br>" +
                "4. Stay composed and manage stress quietly." + "<br><br>" +
                "5. Respond wisely to all queries." + "<br><br>" +
                "6. Do not worry about others progress; stay focused." + "<br><br>" +
                "7. Prepare for challenging questions." + "<br><br>" +
                "8. Good luck; aim for thorough knowledge." + "<br><br>"+
            "<html>"
        );
        add(rules);
        
        back = new JButton("BACK");
        back.setBounds(180, 480, 120, 35);
        back.setBackground(new Color(161, 64, 100));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Times New Roman", Font.BOLD, 15));
        back.addActionListener(this);
        add(back);
        
        start = new JButton("GO");
        start.setBounds(420, 480, 120, 35);
        start.setBackground(new Color(161, 64, 100));
        start.setForeground(Color.WHITE);
        start.setFont(new Font("Times New Roman", Font.BOLD, 15));
        start.addActionListener(this);
        add(start);
        
        setSize(720, 640);
        setLocation(350, 50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}