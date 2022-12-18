package TicTacToes;

public class BackEnd 
{
    //2d string array which will act as the board for the game
    private String[] gameArray = new String[9];

    private boolean gameEnd = false;    //true when someone has won the game
    private String winner = "";
    private String hypotheticalWinner = "";
    private String[] secondArr = gameArray;     //clone of the main array, used when checking for potential moves.

    //Constructor
    public BackEnd()
    {
        //Set game board
        for (int i = 0; i < 9; i++)
        {
            gameArray[i] = "" + i;
        }
    }

    //method to show the board in its current state
    public void displayBoard()
    {
        System.out.println(" --- --- ---");
        System.out.println("| " + gameArray[0] + " | " + gameArray[1] + " | "+ gameArray[2] + " |");
        System.out.println(" --- --- ---");
        System.out.println("| " + gameArray[3] + " | " + gameArray[4] + " | "+ gameArray[5] + " |");
        System.out.println(" --- --- ---");
        System.out.println("| " + gameArray[6] + " | " + gameArray[7] + " | "+ gameArray[8] + " |");
        System.out.println(" --- --- ---");
    }

    //Methods to play a move via one of the three options (player, naiveCPU and defensiveCPU)
    public void playerMove(int p)
    {
        //System.out.println("User Move");
        gameArray[p] = "X";

        displayBoard();
    }

    public void naiveCPUMove()
    {
        boolean cpuMoveValid = false;

        //CPU's move
        while (cpuMoveValid == false && gameEnd == false)
        {
            int cpuPos = (int) (Math.random() * 9);
        
            if (cpuPos < 0 || cpuPos > 8)
            {
                continue;
            }

            else if (getBoardValue(cpuPos).equals("X") || getBoardValue(cpuPos).equals("O"))
            {
                continue;
            }
        
            else
            {
                gameArray[cpuPos] = "O";
                cpuMoveValid = true;
            }
        }  

        displayBoard();
    }

    public void defensiveCPUMove()
    {
        int move = findBestMove();
        System.out.println("Enter defensive move method");

        //if there is no move to prevent or get a win, use naive method
        if (move == 9)
        {
            naiveCPUMove();
        }

        else
        {
            System.out.println("Put move in array move");
            gameArray[move] = "O";
        }

        displayBoard();
    }

    //Getters
    public String getBoardValue(int p)
    {
        return gameArray[p];
    }

    public boolean getGameEnd()
    {
        return gameEnd;
    }

    public String getWinner()
    {
        return winner;
    }

    //setter
    public void setGameEnd(boolean e)
    {
        gameEnd = e;
    }

    //checks to see if either player has won
    public void checkForWin()
    {
        //check user win
        if ((gameArray[0] + gameArray[1] + gameArray[2]).equals("XXX"))
        {
            gameEnd = true;
            winner = "User";
        }

        else if ((gameArray[3] + gameArray[4] + gameArray[5]).equals("XXX"))
        {
            gameEnd = true;
            winner = "User";
        }

        else if ((gameArray[6] + gameArray[7] + gameArray[8]).equalsIgnoreCase("XXX"))
        {
            gameEnd = true;
            winner = "User";
        }

        else if ((gameArray[0] + gameArray[3] + gameArray[6]).equalsIgnoreCase("XXX"))
        {
            gameEnd = true;
            winner = "User";
        }

        else if ((gameArray[1] + gameArray[4] + gameArray[7]).equalsIgnoreCase("XXX"))
        {
            gameEnd = true;
            winner = "User";
        }

        else if ((gameArray[2] + gameArray[5] + gameArray[8]).equalsIgnoreCase("XXX"))
        {
            gameEnd = true;
            winner = "User";
        }

        else if ((gameArray[0] + gameArray[4] + gameArray[8]).equalsIgnoreCase("XXX"))
        {
            gameEnd = true;
            winner = "User";
        }

        else if ((gameArray[6] + gameArray[4] + gameArray[2]).equalsIgnoreCase("XXX"))
        {
            gameEnd = true;
            winner = "User";
        }
 

        //check cpu win
        if ((gameArray[0] + gameArray[1] + gameArray[2]).equals("OOO"))
        {
            gameEnd = true;
            winner = "User";
        }

        else if ((gameArray[3] + gameArray[4] + gameArray[5]).equals("OOO"))
        {
            gameEnd = true;
            winner = "User";
        }

        else if ((gameArray[6] + gameArray[7] + gameArray[8]).equalsIgnoreCase("OOO"))
        {
            gameEnd = true;
            winner = "User";
        }

        else if ((gameArray[0] + gameArray[3] + gameArray[6]).equalsIgnoreCase("OOO"))
        {
            gameEnd = true;
            winner = "User";
        }

        else if ((gameArray[1] + gameArray[4] + gameArray[7]).equalsIgnoreCase("OOO"))
        {
            gameEnd = true;
            winner = "User";
        }

        else if ((gameArray[2] + gameArray[5] + gameArray[8]).equalsIgnoreCase("OOO"))
        {
            gameEnd = true;
            winner = "User";
        }

        else if ((gameArray[0] + gameArray[4] + gameArray[8]).equalsIgnoreCase("OOO"))
        {
            gameEnd = true;
            winner = "User";
        }

        else if ((gameArray[6] + gameArray[4] + gameArray[2]).equalsIgnoreCase("OOO"))
        {
            gameEnd = true;
            winner = "User";
        } 
    }

    //Finds ai's best move
    public int findBestMove()
    {
        System.out.println("Begin best move finder");
        secondArr = gameArray;
        int bMove = 9;   //set to 9 initially because 9 isnt in the game board

        //loop through game array
        for (int i = 0; i < 9; i++)
        {
            System.out.println("In loop for best move");
            //if position is occupied, then continue
            if (getBoardValue(i).equals("X") || getBoardValue(i).equals("O"))
            {
                continue;
            }

            //if not occupied, run hypothetical scenarios
            else
            {
                //place O in position i of second array, check for win
                secondArr[i] = "O";
                checkForPossibleWin();

                //if win by placing hypotheical O in pos i, then move = i, break the loop, will cause cpu to win
                if (hypotheticalWinner.equals("CPU"))
                {
                    bMove = i;
                    System.out.println("Possible CPU win, move: " + bMove);
                    return bMove;
                }    

                //place X in position i of second array, check for win
                secondArr[i] = "X";
                checkForPossibleWin();

                //if win by placing hypotheical X in pos i, then move = i, break the loop, will block user from winning
                if (hypotheticalWinner.equals("User"))
                {
                    bMove = i;
                    System.out.println("Possible User win, move: " + bMove);
                    return bMove;
                }

                //reset game array to original state before the hypotheicals
                secondArr[i] = "" + i;   
                hypotheticalWinner = "";             
            }

            
        }
        System.out.println("SHould return cpu move");
        //return value of best move
        return bMove;
    }

    //checks for a possible win when using the defensive strat
    public void checkForPossibleWin()
    {
        //check user win
        if ((secondArr[0] + secondArr[1] + secondArr[2]).equals("XXX"))
        {
            hypotheticalWinner = "User";
        }

        else if ((secondArr[3] + secondArr[4] + secondArr[5]).equals("XXX"))
        {
            hypotheticalWinner = "User";
        }

        else if ((secondArr[6] + secondArr[7] + secondArr[8]).equalsIgnoreCase("XXX"))
        {
            hypotheticalWinner = "User";
        }

        else if ((secondArr[0] + secondArr[3] + secondArr[6]).equalsIgnoreCase("XXX"))
        {
            hypotheticalWinner = "User";
        }

        else if ((secondArr[1] + secondArr[4] + secondArr[7]).equalsIgnoreCase("XXX"))
        {
            hypotheticalWinner = "User";
        }

        else if ((secondArr[2] + secondArr[5] + secondArr[8]).equalsIgnoreCase("XXX"))
        {
            hypotheticalWinner = "User";
        }

        else if ((secondArr[0] + secondArr[4] + secondArr[8]).equalsIgnoreCase("XXX"))
        {
            hypotheticalWinner = "User";
        }

        else if ((secondArr[6] + secondArr[4] + secondArr[2]).equalsIgnoreCase("XXX"))
        {
            hypotheticalWinner = "User";
        }
 

        //check cpu win
        if ((secondArr[0] + secondArr[1] + secondArr[2]).equals("OOO"))
        {
            hypotheticalWinner = "User";
        }

        else if ((secondArr[3] + secondArr[4] + secondArr[5]).equals("OOO"))
        {
            hypotheticalWinner = "User";
        }

        else if ((secondArr[6] + secondArr[7] + secondArr[8]).equalsIgnoreCase("OOO"))
        {
            hypotheticalWinner = "User";
        }

        else if ((secondArr[0] + secondArr[3] + secondArr[6]).equalsIgnoreCase("OOO"))
        {
            hypotheticalWinner = "User";
        }

        else if ((secondArr[1] + secondArr[4] + secondArr[7]).equalsIgnoreCase("OOO"))
        {
            hypotheticalWinner = "User";
        }

        else if ((secondArr[2] + secondArr[5] + secondArr[8]).equalsIgnoreCase("OOO"))
        {
            hypotheticalWinner = "User";
        }

        else if ((secondArr[0] + secondArr[4] + secondArr[8]).equalsIgnoreCase("OOO"))
        {
            hypotheticalWinner = "User";
        }

        else if ((secondArr[6] + secondArr[4] + secondArr[2]).equalsIgnoreCase("OOO"))
        {
            hypotheticalWinner = "User";
        } 
    }
}