import java.util.Random;

public class Generator {
    static int genActualPointX;
    static int genActualPointY;
    static int oldPointX;
    static int oldPointY;
    static int randomCache;
    static Boolean firstWayState;
    static Boolean secondWayState;
    static Boolean thirdWayState;
    static Boolean fourthWayState;

    static void autoStep()
    {
        int randomWaysResult;
        class Ways
        {
            int x;
            int y;
            Boolean state;

            Ways(int y,int x,Boolean state)
            {
                this.x = x;
                this.y = y;
                this.state = state;
            }
        }

        firstWayState = Main.maze1.mazeMap[genActualPointY][genActualPointX - 1] != " ";
        secondWayState = Main.maze1.mazeMap[genActualPointY][genActualPointX + 1] != " ";
        thirdWayState = Main.maze1.mazeMap[genActualPointY - 1][genActualPointX] != " ";
        fourthWayState = Main.maze1.mazeMap[genActualPointY + 1][genActualPointX] != " ";

        Ways way1 = new Ways(genActualPointY,(genActualPointX-1), firstWayState);
        Ways way2 = new Ways(genActualPointY,(genActualPointX+1), secondWayState);
        Ways way3 = new Ways((genActualPointY-1),genActualPointX, thirdWayState);
        Ways way4 = new Ways((genActualPointY+1),genActualPointX, fourthWayState);

        Random random = new Random();
        randomWaysResult = random.nextInt(4);
        randomCache = randomWaysResult;
        if (randomWaysResult == 0)
        {
            oldPointX = genActualPointX;
            oldPointY = genActualPointY;
            Main.playerX = way1.x;
            Main.playerY = way1.y;
            genActualPointX = way1.x;
            genActualPointY = way1.y;
            //Main.maze1.mazeMap[way2.y][way2.x] = 0;
            Main.maze1.mazeMap[way3.y][way3.x] = "#";
            Main.maze1.mazeMap[way4.y][way4.x] = "#";
            Main.maze1.mazeMap[oldPointY][oldPointX] = " ";
            Main.maze1.mazeMap[Main.playerY][Main.playerX] = "O";

        }
        else if (randomWaysResult == 1)
        {
            oldPointX = genActualPointX;
            oldPointY = genActualPointY;
            Main.playerX = way2.x;
            Main.playerY = way2.y;
            genActualPointX = way2.x;
            genActualPointY = way2.y;
            Main.maze1.mazeMap[way4.y][way4.x] = "#";
            Main.maze1.mazeMap[way3.y][way3.x] = "#";
            //Main.maze1.mazeMap[way1.y][way1.x] = 0;
            Main.maze1.mazeMap[oldPointY][oldPointX] = " ";
            Main.maze1.mazeMap[Main.playerY][Main.playerX] = "O";
        }
        else if (randomWaysResult == 2)
        {
            oldPointX = genActualPointX;
            oldPointY = genActualPointY;
            Main.playerX = way3.x;
            Main.playerY = way3.y;
            genActualPointX = way3.x;
            genActualPointY = way3.y;
            Main.maze1.mazeMap[way2.y][way2.x] = "#";
            //Main.maze1.mazeMap[way4.y][way4.x] = 0;
            Main.maze1.mazeMap[way1.y][way1.x] = "#";
            Main.maze1.mazeMap[oldPointY][oldPointX] = " ";
            Main.maze1.mazeMap[Main.playerY][Main.playerX] = "O";

        }
        else if (randomWaysResult == 3)
        {
            oldPointX = genActualPointX;
            oldPointY = genActualPointY;
            Main.playerX = way4.x;
            Main.playerY = way4.y;
            genActualPointX = way4.x;
            genActualPointY = way4.y;
            Main.maze1.mazeMap[way2.y][way2.x] = "#";
            //Main.maze1.mazeMap[way3.y][way3.x] = 0;
            Main.maze1.mazeMap[way1.y][way1.x] = "#";
            Main.maze1.mazeMap[oldPointY][oldPointX] =" ";
            Main.maze1.mazeMap[Main.playerY][Main.playerX] = "O";
        }
        else System.out.println("Problemik");


    }

}
