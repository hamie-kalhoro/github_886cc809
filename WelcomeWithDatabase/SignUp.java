package WelcomeWithDatabase;

import java.awt.BorderLayout;
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

public class SignUp {

    JFrame frame;
    JTextField usertxt;
    JPasswordField passtxt;
    JPasswordField re_passtxt;

    SignUp() {

        JButton exit = new JButton("EXIT");
		exit.setBounds(165,340,80,20);
		exit.setBorder(BorderFactory.createEmptyBorder());
		exit.setFocusable(false);
		exit.setBackground(Color.white);
		exit.setForeground(Color.black);
		exit.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
		exit.setFont(new Font("Sans Pro", Font.PLAIN, 15));

        JButton back = new JButton("BACK");
		back.setBounds(80,290,80,20);
		back.setBorder(BorderFactory.createEmptyBorder());
		back.setFocusable(false);
		back.setBackground(Color.white);
		back.setForeground(Color.black);
//		back.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3));
		back.setFont(new Font("Sans Pro", Font.PLAIN, 15));

        JButton done = new JButton("DONE!");
		done.setBounds(250,290,80,20);
		done.setBorder(BorderFactory.createEmptyBorder());
		done.setFocusable(false);
		done.setBackground(Color.white);
		done.setForeground(Color.black);
//		done.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3));
		done.setFont(new Font("Sans Pro", Font.PLAIN, 15));

        re_passtxt = new JPasswordField("**********");
		re_passtxt.setBounds(80, 240, 250, 20);
		re_passtxt.setForeground(Color.BLACK);
		re_passtxt.setBackground(Color.WHITE);
		re_passtxt.setBorder(BorderFactory.createEmptyBorder());
//		re_passtxt.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3));
		re_passtxt.setFont(new Font("Sans Pro", Font.PLAIN, 25));

        JLabel re_password = new JLabel("Renter-PASSWORD");
		re_password.setBounds(80, 210, 250, 25);
		re_password.setForeground(Color.WHITE);
		re_password.setFont(new Font("Sans Pro", Font.PLAIN, 15));

        passtxt = new JPasswordField("**********");
		passtxt.setBounds(80, 160, 250, 20);
		passtxt.setForeground(Color.BLACK);
		passtxt.setBackground(Color.WHITE);
		passtxt.setBorder(BorderFactory.createEmptyBorder());
//		passtxt.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3));
		passtxt.setFont(new Font("Sans Pro", Font.PLAIN, 25));

        JLabel password = new JLabel("Enter-PASSWORD");
		password.setBounds(80, 130, 250, 25);
		password.setForeground(Color.WHITE);
		password.setFont(new Font("Sans Pro", Font.PLAIN, 15));

        usertxt = new JTextField("enter your full-name");
		usertxt.setBounds(80, 80, 250, 20);
		usertxt.setForeground(Color.BLACK);
		usertxt.setBackground(Color.WHITE);
		usertxt.setCaretColor(Color.blue);
		usertxt.setBorder(BorderFactory.createEmptyBorder());
//		usertxt.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3));
		usertxt.setFont(new Font("Sans Pro", Font.PLAIN, 15));

        JLabel fullname = new JLabel("FULL-NAME");
		fullname.setBounds(80, 50, 250, 25);
		fullname.setForeground(Color.WHITE);
		fullname.setFont(new Font("Sans Pro", Font.PLAIN, 15));

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

        frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.SOUTH);

        frame.setVisible(true);
    
    }
    
    public static void main(String[] args) {
        new SignUp();
    }
}
