

public class Main {

    static int playerX = 10;
    static int oldPlayerX = 0;
    static int playerY = 10;
    static int oldPlayerY = 0;
    static Maze maze1 = new Maze(20,20);
    static int exitCondition = 0;
    static int stepsCounter = 0;

    static void startPositionAccess()
    {
        Generator.genActualPointX = playerX;
        Generator.genActualPointY = playerY;

    }
    static void gameRun()
    {   startPositionAccess();
        while(exitCondition < 1)
        {

            maze1.getMap();
            Generator.autoStep();
            maze1.mazeMap[playerY][playerX] = "O";

            if (Generator.falseMark != 1)
            {
                StepLog.yStepsLog[stepsCounter] = playerY;
                StepLog.xStepsLog[stepsCounter] = playerX;
                stepsCounter++;
            }


        }
    }
    static public void main(String[] args)
    {
     gameRun();
    }
}




