import java.sql.SQLOutput;

public class Main {

    static int playerX = 0;
    static int oldPlayerX = 0;
    static int playerY = 0;
    static int oldPlayerY = 0;
    static Maze maze1 = new Maze(4,4);
    static int exitCondition = 0;
    static public void main(String[] args) {
       while(exitCondition < 1)
       {
           maze1.mazeMap[playerY][playerX] = 3;
           maze1.getMap();
           MoveScanner.Scan();
           maze1.resetPath();
           RunExecution.runExe();

       }




    }
}




