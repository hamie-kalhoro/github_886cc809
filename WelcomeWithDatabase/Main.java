package WelcomeWithDatabase;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

    static JFrame frame;
	ImageIcon icon  = new ImageIcon("logOUT.png");
	
    Main() {

        JButton button4 = new JButton("EXIT");
		button4.setBounds(150,300,100,25);
		button4.setBorder(BorderFactory.createEtchedBorder());
		button4.setFocusable(false);
		button4.setBackground(Color.black);
		button4.setForeground(Color.red);
		button4.setFont(new Font("Sans Pro", Font.PLAIN, 15));
        button4.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JButton button3 = new JButton("SIGN UP");
		button3.setBounds(200,200,60,25);
		button3.setBorder(BorderFactory.createEmptyBorder());
		button3.setFocusable(false);
		button3.setBackground(Color.white);
		button3.setForeground(Color.blue);
		button3.setFont(new Font("Sans Pro", Font.BOLD, 13));
        button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new SignUp();
			}
		});

        JLabel label1 = new JLabel("New user, ");
		label1.setBounds(145, 200, 250, 25);
		label1.setForeground(Color.blue);
		label1.setFont(new Font("Sans Pro", Font.PLAIN, 13));

        JButton signInbtn = new JButton("SIGN IN");
		signInbtn.setBounds(150,160,100,25);
		signInbtn.setBorder(BorderFactory.createEtchedBorder());
		signInbtn.setFocusable(false);
		signInbtn.setBackground(Color.black);
		signInbtn.setForeground(Color.white);
		signInbtn.setFont(new Font("Sans Pro", Font.PLAIN, 15));
        signInbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == signInbtn) {
					frame.dispose();
					new LogIn();
				}
			}
		});

        JButton button1 = new JButton("SIGN UP");
		button1.setBounds(150,120,100,25);
		button1.setBorder(BorderFactory.createEtchedBorder());
		button1.setFocusable(false);
		button1.setBackground(Color.black);
		button1.setForeground(Color.white);
		button1.setFont(new Font("Sans Pro", Font.PLAIN, 15));
        button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new SignUp();
			}
		});

        JLabel label = new JLabel("FOUNDATIONS");
		label.setBounds(120, 37, 250, 24);
		label.setForeground(Color.white);
		label.setFont(new Font("Sans Pro", Font.BOLD, 25));

        JPanel panel2 = new JPanel();
		panel2.setBackground(Color.white);
		panel2.setPreferredSize(new Dimension(420,355));
		panel2.setLayout(null);
        panel2.add(label1);
		panel2.add(button1);
		panel2.add(signInbtn);
		panel2.add(button3);
		panel2.add(button4);
	

        JPanel panel1 = new JPanel();
		panel1.setBackground(Color.black);
		panel1.setPreferredSize(new Dimension(420,100));
		panel1.setLayout(null);
        panel1.add(label);

        frame = new JFrame("Application");
		frame.setSize(420,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		frame.getContentPane().setBackground(Color.lightGray);
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.SOUTH);
        
        frame.setVisible(true);

    }

    public static void main(String[] args) {

        new Main();

    }
}