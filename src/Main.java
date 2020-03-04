

public class Main {

    static int playerX = 10;
    static int oldPlayerX = 0;
    static int playerY = 10;
    static int oldPlayerY = 0;
    static Maze maze1 = new Maze(50,50);
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
    static void gameRun() throws InterruptedException {   startPositionAccess();
        while(exitCondition < 1)
        {

            maze1.getMap();
            Generator.autoStep();
            startIndicatior = 1;
            maze1.mazeMap[playerY][playerX] = Maze.tunnel;
            System.out.println(stepsCounter);
            if (Generator.falseMark != 1)
            {
                StepLog.yStepsLog[stepsCounter] = playerY;
                StepLog.xStepsLog[stepsCounter] = playerX;
                stepsCounter++;
            }


        }
    }
    static public void main(String[] args) throws InterruptedException {
     gameRun();
    }
}




