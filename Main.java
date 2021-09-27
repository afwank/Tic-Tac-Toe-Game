class Main {
  public static void main(String[] args) {
    TicTacToe t0 = new TicTacToe();
    //HumanPlayer player1 = new HumanPlayer(t0);
    //HumanPlayer player2 = new HumanPlayer(t0);
    RandomPlayer player1 = new RandomPlayer(t0);
    //RandomPlayer player2 = new RandomPlayer(t0);
    HumanPlayer player2 = new HumanPlayer(t0);


    for(int turns = 1; turns<= 9; turns++){
      if(t0.getPlayer()=='X'){
        player1.makeMove();
      }
      else{
        player2.makeMove();
      }
      System.out.println(t0);
      if(t0.winner() != '-'){
        System.out.println("Player "+t0.getPlayer()+" wins!");
        break;
      }
      t0.switchPlayer();
      }
      if(t0.winner()=='-'){
        System.out.println("TIE!");
      }
    }
}