public class RunExecution {
static void runExe()
{
    if (MoveScanner.right == true) Main.playerX++;
    if (MoveScanner.left == true) Main.playerX--;
    if (MoveScanner.up == true) Main.playerY--;
    if (MoveScanner.down == true) Main.playerY++;
    if (MoveScanner.exitState == true)
    {
        System.out.println(MoveScanner.exit);
        Main.exitCondition = 5;
    }
    Main.maze1.mazeMap[Main.oldPlayerY][Main.oldPlayerX] = 1;
    Main.maze1.mazeMap[Main.playerY][Main.playerX] = 3;



}

}
