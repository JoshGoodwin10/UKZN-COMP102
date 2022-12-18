package TicTacToes;

import java.util.*;

public class TicTacToe
{
    public static void main(String[] args) 
    {
        //Create backend object to use backend's methods
        BackEnd BE = new BackEnd();

        //Scanner to read in user's inputs
        Scanner scLine = new Scanner(System.in);

        //Variables used
        int userMove;        //row value inputted by user
        int numMoves = 0;   //number of total moves played
        int strat;          //user's strategy choice

        boolean userMoveValid = false;

        System.out.println("Choose a strategy to play against: 1 (Naive) or 2 (Defensive)");
        strat = scLine.nextInt();

        BE.displayBoard();

        while (BE.getGameEnd() == false && numMoves < 9)
        {
            //true when move from player or cpu is valid
            userMoveValid = false;

            //Naive strategy
            if (strat == 1)
            {
                //User's move
                while (userMoveValid == false)
                {
                    System.out.println("Choose your move: ");
                    userMove = scLine.nextInt();
                
                    if (userMove < 0 || userMove > 8)
                    {
                        System.out.println("Invalid input: Place on board does not exist. Re-enter inputs ");
                        continue;
                    }

                    else if (BE.getBoardValue(userMove).equals("X") || BE.getBoardValue(userMove).equals("O"))
                    {
                        System.out.println("Invalid input: Place on board is already taken. Choose another spot on the board");
                        continue;
                    }
                
                    else
                    {
                        BE.playerMove(userMove);
                        BE.checkForWin();
                        userMoveValid = true;
                        numMoves++;
                    }
                }
                                
                BE.naiveCPUMove();
                numMoves++;
                
                BE.checkForWin();
            }

            //Defensive strategy
            else if (strat == 2)
            {
                //User's move
                while (userMoveValid == false)
                {
                    System.out.println("Enter row: ");
                    userMove = scLine.nextInt();

                    if (userMove < 0 || userMove > 8)
                    {
                        System.out.println("Invalid input: Place on board does not exist. Re-enter inputs ");
                        continue;
                    }

                    else if (BE.getBoardValue(userMove).equals("X") || BE.getBoardValue(userMove).equals("O"))
                    {
                        System.out.println("Invalid input: Place on board is already taken. Choose another spot on the board");
                        continue;
                    }
                
                    else
                    {
                        BE.playerMove(userMove);
                        BE.checkForWin();
                        userMoveValid = true;
                        numMoves++;
                    }
                }
                                
                BE.defensiveCPUMove();
                numMoves++;
                
                BE.checkForWin();
            }

            //Error in user's strategy choice
            else
            {
                System.out.println("Invalid entry. Choose a strategy to play against: 1 (Naive) or 2 (Defensive)");
                strat = scLine.nextInt();
            }
        }
        
        BE.checkForWin();

        if (BE.getWinner().equals("User") && BE.getGameEnd() == true)
        {
            System.out.println("Congratulations, you won!");
        }
        
        else if (BE.getWinner().equals("CPU") && BE.getGameEnd() == true)
        {
            System.out.println("The CPU won, you suck!");
        }

        else 
        {
            System.out.println("Tie game, you both suck!");
        }
        
        scLine.close();
    }
}
