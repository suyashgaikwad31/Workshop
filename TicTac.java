public class TicTac
{
    public static void main(String[] args)
    {
        char[] board = MakeBoard();
    }

    public static char[] MakeBoard()
    {
        char[] board = new char[10];
        for(int i = 0; i < board.length; i++)
        {
            board[i] = ' ';
        }
        return  board;
    }
}
