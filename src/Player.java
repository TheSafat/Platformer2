import java.awt.*;

public class Player {
    int x;
    int y;
    GamePanel panel;

    int width;
    int height;

    double xspeed;
    double yspeed;

    Rectangle hitBox;

    boolean keyLeft;
    boolean keyRight;
    boolean keyUp;
    boolean keyDown;

    public Player(int x, int y, GamePanel panel){
        this.x = x;
        this.y = y;
        this.panel = panel;

        width = 50;
        height = 100;
        hitBox = new Rectangle(x,y,width,height);
    }

    public void set(){
        x += xspeed;
        y += yspeed;

        hitBox.x = x;
        hitBox.y = y;
    }

    public void draw(Graphics2D gtd){
        gtd.setColor(Color.BLACK);
        gtd.fillRect(x,y,width,height);
    }

}
