import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class Ball extends Rectangle {

    public int xVelocity;
    public int yVelocity;
    Random random;
    int speed = 5;

    public Ball(int x, int y, int WIDTH, int HEIGHT) {
        super(x, y, WIDTH, HEIGHT);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if (randomXDirection == 0) {
            randomXDirection--;
        }
        setXDirection(randomXDirection * speed);
        int randomYDirection = random.nextInt(2);
        if (randomYDirection == 0) {
            randomYDirection--;
        }
        setYDirection(randomYDirection * speed);

    }

    public void setYDirection(int yDirection) {
        yVelocity = yDirection;
    }

    public void setXDirection(int xDirection) {
        xVelocity = xDirection;
    }

    public void move() {
        x = x + xVelocity;
        y = y + yVelocity;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, width, height);

    }
}
