package hus.oop.lab5.ballandplayer;

import java.util.Random;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z;

    public Player() {
        z = 0.0f;
    }

    public Player(int number, float x, float y, float z) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump(float zDisp) {
        this.z += zDisp;
    }

    public boolean near(Ball ball) {
        float distanceXYLegToBall = (float) Math.sqrt((this.x - ball.getX()) * (this.x - ball.getX())
                + (this.y - ball.getY()) * (this.y - ball.getY()));
        float distanceZLegToBall = Math.max(this.z, ball.getZ()) - Math.min(this.z, ball.getZ());

        float distance = distanceXYLegToBall * distanceXYLegToBall
                + distanceZLegToBall * distanceZLegToBall;
        return distance < 8;
    }

    public void kick(Ball ball) {
        Random rand = new Random();
        if (near(ball)) {
            ball.setXYZ(ball.getX() + rand.nextInt(20),
                    ball.getY() + rand.nextInt(20),
                    ball.getZ() + rand.nextInt(5));
        } else {
            System.err.println("Player not near ball");
        }
    }

}
