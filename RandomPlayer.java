import java.util.Scanner;

public class RandomPlayer
{
  private TicTacToe t;
  public RandomPlayer(TicTacToe t)
  {
    this.t = t;
  }
  
  public void makeMove()
  {
    int xVal = (int) (Math.random()*3);
    int yVal = (int) (Math.random()*3);
    boolean filledValidSpot = false;
    while (!filledValidSpot)
    {
      if(t.getBoard().get(xVal,yVal) == '-')
      {
        System.out.println("Player "+t.getPlayer()+" is "+xVal+" "+yVal);
        t.getBoard().set(xVal,yVal,t.getPlayer());
        filledValidSpot=true;
      }
      else{
        xVal = (int) (Math.random()*3);
        yVal = (int) (Math.random()*3);
      }
    }
  }
}