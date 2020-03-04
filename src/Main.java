import java.io.IOException;

public class Main {

    public static int deadEndIndicator = 0;
    static int playerX = 10;
    static int oldPlayerX = 0;
    static int playerY = 10;
    static int oldPlayerY = 0;
    static Maze maze1 = new Maze(25,25);
    static int exitCondition = 0;
    static int stepsCounter = 1;
    static int startIndicatior = 0;

    static void startPositionAccess()
    {
        Generator.genActualPointX = playerX;
        Generator.genActualPointY = playerY;
        StepLog.yStepsLog[0] = playerY;
        StepLog.xStepsLog[0] = playerX;
    }
    static void gameRun()
    {
        startPositionAccess();
        while(exitCondition < 1)
        {
            //while(deadEndIndicator == 0) {

                Generator.autoStep();
                startIndicatior = 1;
                maze1.mazeMap[playerY][playerX] = Maze.tunnel;
                System.out.println();


                System.out.println("--------------------------------------------------------------------------------------");
                if (Generator.falseMark != 1) {
                    maze1.getMap();
                    StepLog.yStepsLog[stepsCounter] = playerY;
                    StepLog.xStepsLog[stepsCounter] = playerX;
                    stepsCounter++;
                }
                //System.out.println(stepsCounter);
        //    }
         //break;
        }
    }
    static public void main(String[] args)
    {
     gameRun();
    }
}




