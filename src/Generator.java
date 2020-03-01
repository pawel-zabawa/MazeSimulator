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
    static int oldMove;

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
        if (genActualPointX != 0)
        {firstWayState = Main.maze1.mazeMap[genActualPointY][genActualPointX - 1].equals("?");}
        if (genActualPointX < Main.maze1.mazeMap.length-1)
        {secondWayState = Main.maze1.mazeMap[genActualPointY][genActualPointX + 1].equals("?");}
        if (genActualPointY != 0)
        {thirdWayState = Main.maze1.mazeMap[genActualPointY - 1][genActualPointX].equals("?");}
        if (genActualPointY < Main.maze1.mazeMap.length-1)
        {fourthWayState = Main.maze1.mazeMap[genActualPointY + 1][genActualPointX].equals("?");}

        Ways way1 = new Ways(genActualPointY,(genActualPointX-1), firstWayState);
        Ways way2 = new Ways(genActualPointY,(genActualPointX+1), secondWayState);
        Ways way3 = new Ways((genActualPointY-1),genActualPointX, thirdWayState);
        Ways way4 = new Ways((genActualPointY+1),genActualPointX, fourthWayState);

        Random random = new Random();
        randomWaysResult = random.nextInt(4);
        randomCache = randomWaysResult;
        System.out.println(randomWaysResult);
        if (randomWaysResult == 0 && firstWayState == true)
        {
            oldPointX = genActualPointX;
            oldPointY = genActualPointY;
            Main.playerX = way1.x;
            Main.playerY = way1.y;
            genActualPointX = way1.x;
            genActualPointY = way1.y;
            if (genActualPointX < Main.maze1.mazeMap.length-1){if (oldMove != 0 && !Main.maze1.mazeMap[way2.y][way2.x].equals(" ")){Main.maze1.mazeMap[way2.y][way2.x] = "#";}}
            if (genActualPointY != 0){if (!Main.maze1.mazeMap[way3.y][way3.x].equals(" "))Main.maze1.mazeMap[way3.y][way3.x] = "#";}
            if (genActualPointY < Main.maze1.mazeMap.length-1){if (!Main.maze1.mazeMap[way4.y][way4.x].equals(" "))Main.maze1.mazeMap[way4.y][way4.x] = "#";}
            Main.maze1.mazeMap[oldPointY][oldPointX] = " ";
            if ((Main.playerY < 10 && Main.playerY > 0)&&(Main.playerX < 10 && Main.playerX > 0 ))Main.maze1.mazeMap[Main.playerY][Main.playerX] = "O";
            oldMove = randomWaysResult;
        }
        else if (randomWaysResult == 1 && secondWayState == true)
        {
            oldPointX = genActualPointX;
            oldPointY = genActualPointY;
            Main.playerX = way2.x;
            Main.playerY = way2.y;
            genActualPointX = way2.x;
            genActualPointY = way2.y;
            if (genActualPointY != 0){if (!Main.maze1.mazeMap[way3.y][way3.x].equals(" "))Main.maze1.mazeMap[way3.y][way3.x] = "#";}
            if (genActualPointY < Main.maze1.mazeMap.length-1){if (!Main.maze1.mazeMap[way4.y][way4.x].equals(" "))Main.maze1.mazeMap[way4.y][way4.x] = "#";}
            if (genActualPointX != 0){if (oldMove != 1 && !Main.maze1.mazeMap[way1.y][way1.x].equals(" ")){Main.maze1.mazeMap[way1.y][way1.x] = "#";}}
            Main.maze1.mazeMap[oldPointY][oldPointX] = " ";
            if ((Main.playerY < 10 && Main.playerY > 0)&&(Main.playerX < 10 && Main.playerX > 0 ))Main.maze1.mazeMap[Main.playerY][Main.playerX] = "O";
            oldMove = randomWaysResult;
        }
        else if (randomWaysResult == 2 && thirdWayState == true)
        {
            oldPointX = genActualPointX;
            oldPointY = genActualPointY;
            Main.playerX = way3.x;
            Main.playerY = way3.y;
            genActualPointX = way3.x;
            genActualPointY = way3.y;
            if (genActualPointX < Main.maze1.mazeMap.length-1){if (!Main.maze1.mazeMap[way2.y][way2.x].equals(" "))Main.maze1.mazeMap[way2.y][way2.x] = "#";}
            if (genActualPointY < Main.maze1.mazeMap.length-1){if (oldMove != 2 && !Main.maze1.mazeMap[way4.y][way4.x].equals(" ")){Main.maze1.mazeMap[way4.y][way4.x] = "#";}}
            if (genActualPointX != 0){if (!Main.maze1.mazeMap[way1.y][way1.x].equals(" "))Main.maze1.mazeMap[way1.y][way1.x] = "#";}
            Main.maze1.mazeMap[oldPointY][oldPointX] = " ";
            if ((Main.playerY < 10 && Main.playerY > 0)&&(Main.playerX < 10 && Main.playerX > 0 ))Main.maze1.mazeMap[Main.playerY][Main.playerX] = "O";
            oldMove = randomWaysResult;
        }
        else if (randomWaysResult == 3 && fourthWayState == true)
        {
            oldPointX = genActualPointX;
            oldPointY = genActualPointY;
            Main.playerX = way4.x;
            Main.playerY = way4.y;
            genActualPointX = way4.x;
            genActualPointY = way4.y;
            if (genActualPointX < Main.maze1.mazeMap.length-1){if (!Main.maze1.mazeMap[way2.y][way2.x].equals(" "))Main.maze1.mazeMap[way2.y][way2.x] = "#";}
            if (genActualPointY != 0){if (oldMove != 3 && !Main.maze1.mazeMap[way3.y][way3.x].equals(" ")){Main.maze1.mazeMap[way3.y][way3.x] = "#";}}
            if (genActualPointX != 0){if (!Main.maze1.mazeMap[way1.y][way1.x].equals(" "))Main.maze1.mazeMap[way1.y][way1.x] = "#";}
            Main.maze1.mazeMap[oldPointY][oldPointX] =" ";
            if ((Main.playerY < 10 && Main.playerY > 0)&&(Main.playerX < 10 && Main.playerX > 0 ))Main.maze1.mazeMap[Main.playerY][Main.playerX] = "O";
            oldMove = randomWaysResult;
        }
        if (firstWayState == false && secondWayState == false && thirdWayState == false && fourthWayState == false)
        {
            genActualPointX = oldPointX;
            genActualPointY = oldPointY;
            oldPointX--;
            oldPointY--;
        }

    }

}
