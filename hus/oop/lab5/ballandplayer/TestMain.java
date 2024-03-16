package hus.oop.lab5.ballandplayer;

public class TestMain {
    public static void main(String[] args) {
        Ball ball = new Ball(2, 4, 0);
        System.out.println("Area ball: " + ball);
        Player player = new Player(5, 2, 4, 0);
        System.out.println("Distance person to ball: " + player.near(ball));
        player.move(2, 2);
        System.out.println("Distance person to ball: " + player.near(ball));
        player.jump(3);
        System.out.println("Distance person to ball: " + player.near(ball));
        player.jump(-3);
        System.out.println("Distance person to ball: " + player.near(ball));
        player.kick(ball);
        System.out.println("Area ball: " + ball);

    }
}
