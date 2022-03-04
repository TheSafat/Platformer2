import javax.swing.*;

public class Game {

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setSize(700,700);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
