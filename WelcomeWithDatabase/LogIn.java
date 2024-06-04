package WelcomeWithDatabase;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogIn {

    JFrame signInFrame;
    JTextField usertxt;
    JPasswordField passtxt;

    LogIn() {

        JButton exit = new JButton("EXIT");
		exit.setBounds(165,360,80,20);
		exit.setBorder(BorderFactory.createEmptyBorder());
		exit.setFocusable(false);
		exit.setBackground(Color.white);
		exit.setForeground(Color.black);
		exit.setFont(new Font("Sans Pro", Font.PLAIN, 15));

        JButton logout = new JButton("LOGOUT");
		logout.setBounds(165,330,80,20);
		logout.setBorder(BorderFactory.createEmptyBorder());
		logout.setFocusable(false);
		logout.setBackground(Color.white);
		logout.setForeground(Color.black);
//		logout.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3));
		logout.setFont(new Font("Sans Pro", Font.PLAIN, 15));

        JButton back = new JButton("BACK");
		back.setBounds(80,260,80,20);
		back.setBorder(BorderFactory.createEmptyBorder());
		back.setFocusable(false);
		back.setBackground(Color.white);
		back.setForeground(Color.black);
		back.setFont(new Font("Sans Pro", Font.PLAIN, 15));

        JButton check = new JButton("CHECK!");
		check.setBounds(250,260,80,20);
		check.setBorder(BorderFactory.createEmptyBorder());
		check.setFocusable(false);
		check.setBackground(Color.white);
		check.setForeground(Color.black);
		check.setFont(new Font("Sans Pro", Font.PLAIN, 15));

        passtxt = new JPasswordField("**********");
		passtxt.setBounds(80, 190, 250, 20);
		passtxt.setForeground(Color.BLACK);
		passtxt.setBackground(Color.WHITE);
		passtxt.setBorder(BorderFactory.createEmptyBorder());
		passtxt.setFont(new Font("Sans Pro", Font.PLAIN, 25));

        JLabel password = new JLabel("PASSWORD");
		password.setBounds(80, 160, 250, 25);
		password.setForeground(Color.WHITE);
		password.setFont(new Font("Sans Pro", Font.PLAIN, 15));

        usertxt = new JTextField("enter your registered name");
		usertxt.setBounds(80, 100, 250, 20);
		usertxt.setForeground(Color.BLACK);
		usertxt.setBackground(Color.WHITE);
		usertxt.setCaretColor(Color.blue);
		usertxt.setBorder(BorderFactory.createEmptyBorder());
		usertxt.setFont(new Font("Sans Pro", Font.PLAIN, 15));

        JLabel username = new JLabel("USERNAME");
		username.setBounds(80, 70, 250, 25);
		username.setForeground(Color.WHITE);
		username.setFont(new Font("Sans Pro", Font.PLAIN, 15));

        JLabel label = new JLabel("SIGNNING IN");
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

        signInFrame = new JFrame("sign-in");
		signInFrame.setSize(420,500);
		signInFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		signInFrame.setLocationRelativeTo(null);
		signInFrame.setResizable(false);

        signInFrame.setVisible(true);
    }
    
}
