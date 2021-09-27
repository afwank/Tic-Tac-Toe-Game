/**
 * A class for representing a generic board
 * Originally used for tic-tac-toe, but hoping to
 * expand to other games
 */
 public class Board 
 {
   /**
   * Keeping track of all the values on the current board.
   */ 
   private char[][] boardAr;
   /**
   * The width of the board.
   */
   private int width;
   /** 
   * The height of the board.
   */
 
   private int height;
   
   /**
   * Alocate all the spaces and dimensions for the game.
   * @param width the width of the game board
   * @param height the height of the game board
   */
   public Board(int width, int height)
   {
     this.width=width;
     this.height=height;
     boardAr = new char[width][height];
   }
   
   /**
   * Construct using 2d character array - While 2d arrys are column major,
   * this will accept the array to look as it looks -
   * char[3][3] = {{1,2,3},
   *               {4,5,6},
   *               {7,8,9}}
   * For example get(2,0) is '2', get(2,1) is '6' and get(0,2) is '7'
   * @param b a 2d array of char values.  Can be 'X','Y' or '-'
   */
   public Board(char[][] b)
   { 
     this.height = b.length;
     this.width = b[0].length;
     boardAr = new char[width][height];
     for(int x = 0; x < width; x++)
     {
       for(int y = 0;y < height; y++)
       {
         boardAr[x][y] = b[y][x];
       }
     }
   }
   
   /**
   * Standard mutator or setter
   * @param x the x value to be set
   * @param y the y value to be set
   * @param val the char that is setting 'X','Y' or '-'
   */
   public void set(int x, int y, char val)
   {
     boardAr[x][y] = val;
   }
   
  /**
   * Standard accessor or getter
   * @param x the x-coordinate
   * @param y the y-coordinate
   * @return char 'X' or 'Y'
   */
   public char get(int x, int y)
   {
     return boardAr[x][y];
   }
   /**
     * Get the width
     * @return int the width
     */
   public int getWidth()
   { 
     return width;
   }
    
   /**
    * Get the height
    * @return int the height
    */
    public int getHeight()
    { 
      return height;
    }
    
    /**
    * Easy way to look at the data
    * @return String the location of the 'X','Y' and '-' for the game
    */
    public String toString()
    {
      String outStr ="";
      for(int y = 0; y<boardAr[0].length;y++)
      {
        for(int x =0; x<boardAr.length; x++)
        {
          outStr += Character.toString(boardAr[x][y]);
        }
        outStr += "\n";
      }
      return outStr;
    }

    public static void main(String[] args)
    {
      char[][] tempAr0 = {{'-','x','-'},
      {'-','x','-'},
      {'-','x','-'}};
      Board t0 = new Board(tempAr0);
      System.out.println("t0 =\n"+t0);

      char[][] tempAr1 = {{'1','2','3'},
      {'4','5','6'},
      {'7','8','9'}};
      Board t1 = new Board(tempAr1);
      System.out.println("t1 = \n"+t1);
    }
  }