import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
/** class HumanPlayer manages the moves for making a move */

public class HumanPlayer
{
  private TicTacToe t;
  public HumanPlayer(TicTacToe t)
  {
    this.t = t;
  }
  /**
   * makeMove reads in two integers using Scanner and places either an 'X'
   * or a 'Y' onto the board.  If the spot is not open, it makes
   * the player try again until he/she enters a correct move
   */
  public void makeMove()
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Player "+t.getPlayer()+": ");
    int xVal = s.nextInt();
    int yVal = s.nextInt();
    boolean filledValidSpot = false;
    while(!filledValidSpot)
    {
      if(t.getBoard().get(xVal,yVal) == '-')
      {
        t.getBoard().set(xVal,yVal,t.getPlayer());
        filledValidSpot = true;
      }
      else{
        System.out.println(xVal+" ,"+yVal+" is taken, try a different spot.");
        System.out.print("Player "+t.getPlayer()+",   ");
        xVal = s.nextInt();
        yVal = s.nextInt();
      }
    }
  }
}