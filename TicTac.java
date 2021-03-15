import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TicTac
{
    public static void main(String[] args)
    {
        char[] board = createBoard();
        char UserLetter = chooseLetter();
        char ComputLetter;
        if(UserLetter=='X')
        {
            ComputLetter='O';
        }
        else
        {
            ComputLetter='X';

        }
        System.out.println("Comput Letter is: " + ComputLetter+" User Letter is : " + UserLetter);
        showBoard(board);
        int userMove = UserMove(board);
        showBoard(board);
    }
    public static int UserMove(char[] board)
    {
        Scanner sc = new Scanner(System.in);
        Integer[] validCells = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        while (true)
        {
            System.out.println("What is your next move ? (1-9): ");
            int index = sc.nextInt();
            if (Arrays.asList(validCells).contains(index) && isSpaceFree(board, index))
                return index;

        }

    }
    private static boolean isSpaceFree(char[] board, int index)
    {
        return board[index] == ' ';
    }
    public static char chooseLetter()
    {
        char symbol;
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter your symbol");
        symbol = UserInput.next().toUpperCase().charAt(0);
        return symbol;
    }

    public static void showBoard(char[] board)
    {
        System.out.println(" ");
        System.out.println("\n "+ board[1] + " | "+ board[2] + " | " + board[3]);
        System.out.println("-----------");
        System.out.println(" "+ board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("-----------");
        System.out.println(" "+ board[7] + " | " + board[8] + " | " + board[9]);
        System.out.println(" ");

    }
    public static char[] createBoard()
    {
        char[] board = new char[10];
        for(int i = 1; i < board.length; i++)
        {
            board[i] = ' ';
        }
        return  board;
    }
}

