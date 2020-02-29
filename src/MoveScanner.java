import java.util.Scanner;

public class MoveScanner {
    final static String input = "Wrowadź kierunek:";
    final static String error = "Ruch nie może zostać wykonany";
    final static String exit = "Opuściłeś program";
    final static String badWord = "Użyłeś niewłaściwej komendy";
    static Boolean right = false;
    static Boolean left = false;
    static Boolean up = false;
    static Boolean down = false;
    static Boolean exitState = false;

        static void resetScan()
        {
            left = false;
            right = false;
            up = false;
            down = false;
            exitState = false;
        }
        static void Scan()
        {
            resetScan();
            System.out.println("");
            Scanner moveScan = new Scanner(System.in);
            System.out.println(input);
            switch (moveScan.nextLine())
            {
                case "right": right = true;
                case "left" : left = true;
                case "up" : up = true;
                case "down" : down = true;
                case "exit" : exitState = true;
            }
        }





}
