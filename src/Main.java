

public class Main {

    static int playerX = 10;
    static int oldPlayerX = 0;
    static int playerY = 10;
    static int oldPlayerY = 0;
    static Maze maze1 = new Maze(20,20);
    static int exitCondition = 0;
    static void startPositionAccess()
    {
        Generator.genActualPointX = playerX;
        Generator.genActualPointY = playerY;

    }
    static void gameRun()
    {   startPositionAccess();
        while(exitCondition < 1)
        {


            Generator.autoStep();
            maze1.getMap();
            System.out.println("");

            System.out.println("---------------------------------------------");
            //MoveScanner.Scan();
            //maze1.resetPath();
            //RunExecution.runExe();


        }
    }
    static public void main(String[] args) {
     gameRun();
    }
}




