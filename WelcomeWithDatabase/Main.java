package WelcomeWithDatabase;

import javax.swing.JFrame;

public class Main {

    static JFrame frame;

    Main() {

        frame = new JFrame("Application");
		frame.setSize(420,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
        frame.setVisible(true);

    }
    public static void main(String[] args) {

        new Main();

    }
}