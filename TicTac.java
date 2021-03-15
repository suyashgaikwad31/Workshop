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
    }
    public static char chooseLetter(){
        char symbol;
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter your symbol");
        symbol=UserInput.next().toUpperCase().charAt(0);
        return symbol;
    }
    public static char[] createBoard()
    {
        char[] board = new char[10];
        for(int i = 0; i < board.length; i++)
        {
            board[i] = ' ';
        }
        return  board;
    }
}
