package WelcomeWithDatabase;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		exit.setForeground(Color.RED);
		exit.setFont(new Font("Sans Pro", Font.PLAIN, 15));
        exit.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JButton logout = new JButton("LOGOUT");
		logout.setBounds(165,330,80,20);
		logout.setBorder(BorderFactory.createEmptyBorder());
		logout.setFocusable(false);
		logout.setBackground(Color.red);
		logout.setForeground(Color.black);
        logout.setFont(new Font("Sans Pro", Font.PLAIN, 15));
        logout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apple", "root", "hamid.2022");
					
					String sqlQuery = "SELECT * FROM info WHERE username='"+usertxt.getText()+"' AND password='"+passtxt.getText()+"'";
					PreparedStatement sqlStmt = con.prepareStatement(sqlQuery);
					
					ResultSet rs = sqlStmt.executeQuery(sqlQuery);
					
					if(rs.next()) {
						
						String deleteQuery = "DELETE FROM info WHERE username='"+usertxt.getText()+"' AND password='"+passtxt.getText()+"'";
						PreparedStatement deletestmt = con.prepareStatement(deleteQuery);
						
						int rowsDeleted = deletestmt.executeUpdate();
						
						if(rowsDeleted > 0) {
							JOptionPane.showMessageDialog(null, "user deleted successfully.");
						} else {
							 JOptionPane.showMessageDialog(null, "Failed to delete the record.");
						}
					}
					
				} catch(Exception e1) {
					System.out.println(e1);
				}
				
			}
		});

        JButton back = new JButton("BACK");
		back.setBounds(80,260,80,20);
		back.setBorder(BorderFactory.createEmptyBorder());
		back.setFocusable(false);
		back.setBackground(Color.white);
		back.setForeground(Color.lightGray);
		back.setFont(new Font("Sans Pro", Font.PLAIN, 15));
        back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				signInFrame.dispose();
				new Main();
			}
		});

        JButton check = new JButton("CHECK!");
		check.setBounds(250,260,80,20);
		check.setBorder(BorderFactory.createEmptyBorder());
		check.setFocusable(false);
		check.setBackground(Color.white);
		check.setForeground(new Color(48, 145, 69));
		check.setFont(new Font("Sans Pro", Font.PLAIN, 15));
        check.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apple", "root", "hamid.2022");
					
					java.sql.Statement stmt = con.createStatement();
					
					System.out.println("inseting data");
					String sql = "SELECT * FROM info WHERE username='"+usertxt.getText()+"'AND password='"+passtxt.getText().toString()+"'";
					
					ResultSet rs = stmt.executeQuery(sql);
					
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "User found successfully.", sql, JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Invalid username / password.");
					}
					
					con.close();
						
				} catch(Exception e1) {	System.out.println(e1); }
				
			}
	
		});

        passtxt = new JPasswordField("**********");
		passtxt.setBounds(80, 190, 250, 20);
		passtxt.setForeground(Color.blue);
		passtxt.setBackground(Color.WHITE);
		passtxt.setBorder(BorderFactory.createEmptyBorder());
		passtxt.setFont(new Font("Sans Pro", Font.PLAIN, 25));

        JLabel password = new JLabel("PASSWORD");
		password.setBounds(80, 160, 250, 25);
		password.setForeground(Color.WHITE);
		password.setFont(new Font("Sans Pro", Font.PLAIN, 15));

        usertxt = new JTextField("enter your registered name");
		usertxt.setBounds(80, 100, 250, 20);
		usertxt.setForeground(Color.blue);
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

        panel2.add(username);
		panel2.add(usertxt);
		panel2.add(password);
		panel2.add(passtxt);
		panel2.add(back);
		panel2.add(check);
		panel2.add(logout);
		panel2.add(exit);

        JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		panel1.setPreferredSize(new Dimension(420,50));
		panel1.setLayout(null);

        panel1.add(label);

        signInFrame = new JFrame("sign-in");
		signInFrame.setSize(420,500);
		signInFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		signInFrame.setLocationRelativeTo(null);
		signInFrame.setResizable(false);

		signInFrame.getContentPane().setBackground(Color.lightGray);
		signInFrame.add(panel1, BorderLayout.NORTH);
		signInFrame.add(panel2, BorderLayout.SOUTH);

        signInFrame.setVisible(true);
    }

    public static void main(String[] args) {
    
        new LogIn();

    }
}
