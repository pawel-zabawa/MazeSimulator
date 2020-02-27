import javax.swing.*;
import java.awt.event.KeyListener;

public class Maze {
    int x;
    int y;
    int[][] mazeMap;

    Maze(int x, int y) {
        this.x = x;
        this.y = y;
        this.mazeMap = new int[x][y];
        mazeMap[0][0] = 1;
        mazeMap[0][1] = 0;
        mazeMap[0][2] = 0;
        mazeMap[0][3] = 0;
        mazeMap[1][0] = 1;
        mazeMap[1][1] = 0;
        mazeMap[1][2] = 0;
        mazeMap[1][3] = 0;
        mazeMap[2][0] = 1;
        mazeMap[2][1] = 0;
        mazeMap[2][2] = 0;
        mazeMap[2][3] = 0;
        mazeMap[3][0] = 1;
        mazeMap[3][1] = 1;
        mazeMap[3][2] = 1;
        mazeMap[3][3] = 1;


    }


    void getMap() {
        for (int i = 0; i < x; i++) {
            System.out.println();
            for (int j = 0; j < y; j++) {
                System.out.print("[" + mazeMap[i][j] + "]");
            }
        }

    }
}