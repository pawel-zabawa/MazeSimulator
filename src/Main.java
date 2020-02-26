import java.util.Arrays;

public class Main {
    static int x = 4;
    static int y = 4;
    static int[][] maze = new int[x][y];
    int[][] pointCoordinates = new int[1][1];

    /*static void getMap(){
        for (int i = 0; i < x ; i++) {
            for (int j = 0; j < y ; j++) {System.out.println(Arrays.deepToString(maze));}
            System.out.println();
        }
    }*/

    static public void main(String[] args)

    {

        maze[0][0] = 1;
        maze[0][1] = 2;
        maze[0][2] = 3;
        maze[0][3] = 4;
        maze[1][0] = 5;
        maze[1][1] = 6;
        maze[1][2] = 7;
        maze[1][3] = 8;
        maze[2][0] = 9;
        maze[2][1] = 10;
        maze[2][2] = 11;
        maze[2][3] = 12;
        maze[3][0] = 13;
        maze[3][1] = 14;
        maze[3][2] = 15;
        maze[3][3] = 16;

        System.out.println(Arrays.deepToString(maze));
        }

    }



