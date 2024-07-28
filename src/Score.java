import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 700, 500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 300, 300);
        add(image);
        
        JLabel heading = new JLabel("Thankyou " + name + " for playing BrainWave");
        heading.setBounds(60, 50, 700, 35);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 28));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);
        
        JButton submit = new JButton("TRY AGAIN");
        submit.setBounds(380, 270, 130, 35);
        submit.setBackground(new Color(161, 64, 100));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
