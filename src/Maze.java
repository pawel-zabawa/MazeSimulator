import javax.swing.*;
import java.awt.event.KeyListener;

public class Maze {
    int x;
    int y;
    public final static String wall = "#";
    public final static String tunnel = " ";
    public final static String player = "O";
    public final static String ground = "!";
    public String[][] mazeMap;

    Maze(int y, int x) {
        this.x = x;
        this.y = y;
        this.mazeMap = new String[y][x];
        for (int i = 0; i < y ; i++) {
            for (int j = 0; j < x ; j++) {
                this.mazeMap[i][j] = ground;
            }
        }



    }


    void getMap() throws InterruptedException {
        for (int i = 0; i < y; i++) {
            System.out.println();
            for (int j = 0; j < x; j++) {
                System.out.print("[" + mazeMap[i][j] + "]");
            }
        }

    }

    void resetPath()
    {
        Main.oldPlayerX = Main.playerX;
        Main.oldPlayerY = Main.playerY;
    }
}