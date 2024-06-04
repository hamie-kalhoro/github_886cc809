package WelcomeWithDatabase;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SignUp {

    JFrame frame;

    SignUp() {

        JLabel label = new JLabel("SIGNNING UP");
		label.setBounds(10, 12, 250, 24);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Sans Pro", Font.BOLD, 25));

        JPanel panel2 = new JPanel();
		panel2.setBackground(Color.BLACK);
		panel2.setPreferredSize(new Dimension(420,405));
		panel2.setLayout(null);

        JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		panel1.setPreferredSize(new Dimension(420,50));
		panel1.setLayout(null);

        frame = new JFrame("sign-up");
		frame.setSize(420,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

        frame.setVisible(true);
    
    }
    
    public static void main(String[] args) {
        new SignUp();
    }
}
