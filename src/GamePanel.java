import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class GamePanel extends JPanel implements ActionListener {

    Player player;

    Timer gameTimer;

    public GamePanel(){

        player = new Player(400,300, this);

        gameTimer = new Timer();
        gameTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                player.set();
                repaint();
            }
        }, 0, 17);
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D gtd = (Graphics2D) g;
        player.draw(gtd);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
