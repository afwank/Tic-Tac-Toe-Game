/**
 * A class for managing all the rules of TicTacToe and keeping track of the
 * current player, who, the number of 'moves,' who is the winner and clearing
 * the board when it's time to switch players.
 */
public class TicTacToe {
  /**
   * a 3x3 board for tic tac toe Note: it's a board of type char Something new for
   * us.
   */
  private Board board;

  /**
   * curPlayer can be the character 'X' or 'Y' starts as an 'X' and gets swapped
   */
  private char player = 'X';

  /**
   * This Constructor is more for testing.
   * 
   * @param b The Board object keeps track of the 'X' and 'O' placement and the
   *          dimensions of the board
   */
  public TicTacToe(Board b) {
    this.board = b;
  }

  /**
   * Default Constructor sets all spots to '-';
   */
  public TicTacToe() {
    board = new Board(3,3);
    clearBoard();

  }

  /**
   * Resets the board to start over when it's time start a new game
   */
  public void clearBoard() {
    for(int x = 0; x<board.getWidth(); x++){
       for(int y = 0; y<board.getHeight(); y++)
       {
         board.set(x,y,'-');
       }
    }

  }

  /**
   * Check if each item in the rows, columns and diagonals to to see if they equal
   * the current player
   */
  public char winner() 
  {
     for(int a = 0; a < board.getHeight(); a++)
     {
       if(board.get(0,a)==player &&
          board.get(1,a)==player &&
          board.get(2,a)==player)
          {
            return player;
          }
     }
     for(int b = 0; b < board.getHeight(); b++)
     {
       if(board.get(b,0)==player &&
          board.get(b,1)==player &&
          board.get(b,2)==player)
          {
            return player;
          }
     }
     if(board.get(0,0)==player &&
     board.get(1,1)==player &&
     board.get(2,2)==player)
     {
       return player;
     }
     if(board.get(2,0)==player &&
     board.get(1,1)==player &&
     board.get(0,2)==player)
     {
       return player;
     }
     return '-';
  }

  /**
   * gets the current board and all it's data
   */
  public Board getBoard() 
  {
    return board;
  }

  /**
   * get the current player - can be either 'X' or 'Y'
   */
  public char getPlayer() 
  {
    return player;
  }

  /**
   * Swaps between 'X' and 'Y'
   */
  public void switchPlayer() {
    if(player=='X')
    {
      player = 'Y';
    }
    else{
      player = 'X';
    }
 
  }

  public String toString() 
  {
      return board.toString();
  }
}
