import java.awt.event.KeyEvent;

public class Main {

    static int playerX = 0;
    static int playerY = 0;
    int[][] player = new int[playerX][playerY];
    static Maze maze1 = new Maze(4,4);
    public static void keyPressed(KeyEvent evt) {
    int key = evt.getKeyCode();
    if (key == KeyEvent.VK_LEFT)
    {
    playerX--;
    maze1.getMap();
    }
    if (key == KeyEvent.VK_RIGHT)
    {playerX++;
    maze1.getMap();
    }
    if (key == KeyEvent.VK_UP)
    {playerY--;
    maze1.getMap();
    }
    if (key == KeyEvent.VK_DOWN)
    {playerY++;
    maze1.getMap();
    }


    }

    static public void main(String[] args) throws InterruptedException {

    maze1.mazeMap[playerX][playerY] = 3;
    maze1.getMap();
        Thread.currentThread().join();




    }
}


