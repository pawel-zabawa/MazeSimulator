import java.util.Random;

public class Generator {
    static int genActualPointX;
    static int genActualPointY;
    static int oldPointX;
    static int oldPointY;
    static Boolean firstWayState;
    static Boolean secondWayState;
    static Boolean thirdWayState;
    static Boolean fourthWayState;
    static int oldMove;
    static int falseMark = 0;
    static int randomCleanIndicator = 0;
    static int randomCache;


    static void autoStep()
    {
        randomCleanIndicator = 0;
        int randomWaysResult = 5;
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
        {firstWayState = Main.maze1.mazeMap[genActualPointY][genActualPointX - 1].equals(Maze.ground);}
        else firstWayState = false;
        if (genActualPointX < Main.maze1.mazeMap.length-1)
        {secondWayState = Main.maze1.mazeMap[genActualPointY][genActualPointX + 1].equals(Maze.ground);}
        else secondWayState = false;
        if (genActualPointY != 0)
        {thirdWayState = Main.maze1.mazeMap[genActualPointY - 1][genActualPointX].equals(Maze.ground);}
        else thirdWayState = false;
        if (genActualPointY < Main.maze1.mazeMap.length-1)
        {fourthWayState = Main.maze1.mazeMap[genActualPointY + 1][genActualPointX].equals(Maze.ground);}
        else fourthWayState = false;


        Ways way1 = new Ways(genActualPointY,(genActualPointX-1), firstWayState);
        Ways way2 = new Ways(genActualPointY,(genActualPointX+1), secondWayState);
        Ways way3 = new Ways((genActualPointY-1),genActualPointX, thirdWayState);
        Ways way4 = new Ways((genActualPointY+1),genActualPointX, fourthWayState);
        Random  random = new Random();

        /*while (randomCleanIndicator == 0)
        {
            randomCache = random.nextInt(4);
            switch (Generator.randomCache) {
                case 0:

                    if (Generator.firstWayState = true && randomCache == 0)
                {
                    Generator.randomCleanIndicator = 1;
                    randomWaysResult = randomCache;
                    break;
                }


                case 1:

                    if (Generator.secondWayState = true && randomCache == 1)
                {   
                    Generator.randomCleanIndicator = 1;
                    randomWaysResult = randomCache;
                    break;
                }


                case 2: 

                if 
                (Generator.thirdWayState = true && randomCache == 2)
                {   
                    Generator.randomCleanIndicator = 1;
                    randomWaysResult = randomCache;
                    break;
                }

                case 3: 

                if 
                (Generator.fourthWayState = true && randomCache == 3)
                {
                    Generator.randomCleanIndicator = 1;
                    randomWaysResult = randomCache;}
                    break;

            }
        }*/
        int problemik = 0;
       while (problemik == 0 /* problemik != 4*/ ) {
           Random random1 = new Random();
           randomWaysResult = random1.nextInt(4);
           System.out.println(randomWaysResult);
           if (randomWaysResult == 0 && firstWayState == true)
           {System.out.println("1 ok");
           problemik = 1;}
           else if (randomWaysResult == 1 && secondWayState == true) {
               System.out.println("2 ok");

               problemik = 1;}
           else if (randomWaysResult == 2 && thirdWayState == true)
           {System.out.println("3 ok");
               problemik = 1;}
           else if (randomWaysResult == 3 && fourthWayState == true)
           {System.out.println("4 ok");
               problemik = 1;}
           else {System.out.println("problemik");
                    problemik++;}
       }
        if ((randomWaysResult == 0) && (firstWayState == true))
        {
            oldPointX = genActualPointX;
            oldPointY = genActualPointY;
            Main.playerX = way1.x;
            Main.playerY = way1.y;
            genActualPointX = way1.x;
            genActualPointY = way1.y;
            if (genActualPointX < Main.maze1.mazeMap.length-2){if (oldMove != 0 && !Main.maze1.mazeMap[way2.y][way2.x].equals(Maze.tunnel)){Main.maze1.mazeMap[way2.y][way2.x] = Maze.wall;}}
            if (genActualPointY > 1){if (!Main.maze1.mazeMap[way3.y][way3.x].equals(Maze.tunnel))Main.maze1.mazeMap[way3.y][way3.x] = Maze.wall;}
            if (genActualPointY < Main.maze1.mazeMap.length-2){if (!Main.maze1.mazeMap[way4.y][way4.x].equals(Maze.tunnel))Main.maze1.mazeMap[way4.y][way4.x] = Maze.wall;}
            Main.maze1.mazeMap[oldPointY][oldPointX] = Maze.tunnel;
            if (Main.startIndicatior == 0)
            {Main.maze1.mazeMap[way2.y][way2.x] = Maze.ground;}
            oldMove = randomWaysResult;
        }
        else if ((randomWaysResult == 1) && (secondWayState == true))
        {
            oldPointX = genActualPointX;
            oldPointY = genActualPointY;
            Main.playerX = way2.x;
            Main.playerY = way2.y;
            genActualPointX = way2.x;
            genActualPointY = way2.y;
            if (genActualPointY > 1){if (!Main.maze1.mazeMap[way3.y][way3.x].equals(Maze.tunnel))Main.maze1.mazeMap[way3.y][way3.x] = Maze.wall;}
            if (genActualPointY < Main.maze1.mazeMap.length-2){if (!Main.maze1.mazeMap[way4.y][way4.x].equals(Maze.tunnel))Main.maze1.mazeMap[way4.y][way4.x] = Maze.wall;}
            if (genActualPointX > 1){if (oldMove != 1 && !Main.maze1.mazeMap[way1.y][way1.x].equals(Maze.tunnel)){Main.maze1.mazeMap[way1.y][way1.x] = Maze.wall;}}
            Main.maze1.mazeMap[oldPointY][oldPointX] = Maze.tunnel;
            if (Main.startIndicatior == 0)
            {Main.maze1.mazeMap[way1.y][way1.x] = Maze.ground;}
            oldMove = randomWaysResult;
        }
        else if ((randomWaysResult == 2) && (thirdWayState == true))
        {
            oldPointX = genActualPointX;
            oldPointY = genActualPointY;
            Main.playerX = way3.x;
            Main.playerY = way3.y;
            genActualPointX = way3.x;
            genActualPointY = way3.y;
            if (genActualPointX < Main.maze1.mazeMap.length-2){if (!Main.maze1.mazeMap[way2.y][way2.x].equals(Maze.tunnel))Main.maze1.mazeMap[way2.y][way2.x] = Maze.wall;}
            if (genActualPointY < Main.maze1.mazeMap.length-2){if (oldMove != 2 && !Main.maze1.mazeMap[way4.y][way4.x].equals(Maze.tunnel)){Main.maze1.mazeMap[way4.y][way4.x] = Maze.wall;}}
            if (genActualPointX > 1){if (!Main.maze1.mazeMap[way1.y][way1.x].equals(Maze.tunnel))Main.maze1.mazeMap[way1.y][way1.x] = Maze.wall;}
            Main.maze1.mazeMap[oldPointY][oldPointX] = Maze.tunnel;
            if (Main.startIndicatior == 0)
            {Main.maze1.mazeMap[way4.y][way4.x] = Maze.ground;}
            oldMove = randomWaysResult;
        }
        else if ((randomWaysResult == 3) && (fourthWayState == true))
        {
            oldPointX = genActualPointX;
            oldPointY = genActualPointY;
            Main.playerX = way4.x;
            Main.playerY = way4.y;
            genActualPointX = way4.x;
            genActualPointY = way4.y;
            if (genActualPointX < Main.maze1.mazeMap.length-2){if (!Main.maze1.mazeMap[way2.y][way2.x].equals(Maze.tunnel))Main.maze1.mazeMap[way2.y][way2.x] = Maze.wall;}
            if (genActualPointY > 1){if (oldMove != 3 && !Main.maze1.mazeMap[way3.y][way3.x].equals(Maze.tunnel)){Main.maze1.mazeMap[way3.y][way3.x] = Maze.wall;}}
            if (genActualPointX > 1){if (!Main.maze1.mazeMap[way1.y][way1.x].equals(Maze.tunnel))Main.maze1.mazeMap[way1.y][way1.x] = Maze.wall;}
            Main.maze1.mazeMap[oldPointY][oldPointX] = Maze.tunnel;
            if (Main.startIndicatior == 0)
            {Main.maze1.mazeMap[way3.y][way3.x] = Maze.ground;}
            oldMove = randomWaysResult;
        }
        else if (firstWayState == false && secondWayState == false && thirdWayState == false && fourthWayState == false)
        {

            if(Main.stepsCounter < 0) Main.stepsCounter = 0;
            falseMark = 1;
            genActualPointX = StepLog.xStepsLog[Main.stepsCounter-1];
            genActualPointY = StepLog.yStepsLog[Main.stepsCounter-1];
            Main.playerX = genActualPointX;
            Main.playerY = genActualPointY;
            if (Main.stepsCounter > 1)
            {Main.stepsCounter--;}
            else Main.stepsCounter = 1;
            //if (Main.stepsCounter == 0) Main.deadEndIndicator = 1;

        }
        else {
            falseMark = 0;
            problemik = 0;
        }
    }

}
