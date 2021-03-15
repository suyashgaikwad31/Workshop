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
        move(board,UserLetter);
        showBoard(board);


    }
    public static void move(char[] board,char symbol) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 9 ");
        int index=sc.nextInt();
        if(board[index]==' ')
        {
            board[index]=symbol;
        }
        else
            {
                System.out.println("Invalid Choice");

        }

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

