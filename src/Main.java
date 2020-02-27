import java.awt.event.KeyEvent;

public class Main {
    static int playerX = 0;
    static int playerY = 0;
    int[][] player = new int[playerX][playerY];

    public void keyPressed(KeyEvent evt) {
    int key = evt.getKeyCode();


}

    static public void main(String[] args) {
    Maze maze1 = new Maze(4,4);
    maze1.mazeMap[playerX][playerY] = 3;
    maze1.getMap();



    }
}


