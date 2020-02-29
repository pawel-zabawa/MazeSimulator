public class RunExecution {
static void runExe()
{
    if (MoveScanner.right == true) Main.playerX++;
    else if (MoveScanner.left == true) Main.playerX--;
    else if (MoveScanner.up == true) Main.playerY--;
    else if (MoveScanner.down == true) Main.playerY++;
    else if (MoveScanner.exitState == true)
    {
        System.out.println(MoveScanner.exit);
        Main.exitCondition = 5;
    }
    else
        {
            System.out.println(MoveScanner.badWord);
        }
    Main.maze1.mazeMap[Main.oldPlayerY][Main.oldPlayerX] = 1;
    Main.maze1.mazeMap[Main.playerY][Main.playerX] = 3;



}

}
