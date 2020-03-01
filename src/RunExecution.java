public class RunExecution {
static void runExe()
{
    if (MoveScanner.right == true)
    {

        if ((Main.playerX < Main.maze1.mazeMap.length - 1) && Main.maze1.mazeMap[Main.playerY][Main.playerX + 1] == " ")
        Main.playerX++;
        else System.out.println(MoveScanner.error);

    }

    else if (MoveScanner.left == true)

    {

        if ((Main.playerX != 0) && Main.maze1.mazeMap[Main.playerY][Main.playerX - 1] == " ")
        Main.playerX--;
        else System.out.println(MoveScanner.error);

    }

    else if (MoveScanner.up == true)

    {

        if ((Main.playerY != 0) && Main.maze1.mazeMap[Main.playerY - 1][Main.playerX] == " ")
        Main.playerY--;
        else System.out.println(MoveScanner.error);

    }

    else if (MoveScanner.down == true)

    {

        if ((Main.playerY < Main.maze1.mazeMap.length - 1) && Main.maze1.mazeMap[Main.playerY + 1][Main.playerX] == " ")
        Main.playerY++;
        else System.out.println(MoveScanner.error);

    }

    else if (MoveScanner.exitState == true)
    {
        System.out.println(MoveScanner.exit);
        Main.exitCondition = 5;
    }
    else
        {
            System.out.println(MoveScanner.badWord);
        }
    Main.maze1.mazeMap[Main.oldPlayerY][Main.oldPlayerX] = " ";
    Main.maze1.mazeMap[Main.playerY][Main.playerX] = "O";



}

}
