package WelcomeWithDatabase;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LogIn {

    JFrame signInFrame;

    LogIn() {

        JPanel panel2 = new JPanel();
		panel2.setBackground(Color.BLACK);
		panel2.setPreferredSize(new Dimension(420,405));
		panel2.setLayout(null);

        JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		panel1.setPreferredSize(new Dimension(420,50));
		panel1.setLayout(null);

        signInFrame = new JFrame("sign-in");
		signInFrame.setSize(420,500);
		signInFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		signInFrame.setLocationRelativeTo(null);
		signInFrame.setResizable(false);

        signInFrame.setVisible(true);
    }
    
}
