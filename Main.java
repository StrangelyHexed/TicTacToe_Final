import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        boolean gameOver = false;

        //Instructions For Players//
        System.out.println("The board is labeled 0-8. Row major order. ");

        //print & initialize board//
        TicTacToe game = new TicTacToe();
        game.initializeBoard();
        game.printBoard();

        Scanner input= new Scanner(System.in);


        //Pick Random Player//
        game.pickPlayer();


        char current;
        //Simulation//
        while (!gameOver){
            if (game.getPlayer() == 'O'){
                    System.out.print("Player 0, please enter a number from 0-8: ");
                    int location = input.nextInt();
                    game.playGame(game.getPlayer(), location);


                    if (game.getPlayer() == 'O'){
                        current = 'X';
                    }
                    else{
                        current = 'O';
                    }

                    if (game.checkWin(current)){
                        gameOver = true;
                        System.out.println("Congratulations Player O.");
                    }
            }

            else{
                System.out.print("Player X, please enter a number from 0-8: ");
                int location = input.nextInt();
                game.playGame(game.getPlayer(), location);


                if (game.getPlayer() == 'O'){
                    current = 'X';
                }
                else{
                    current = 'O';
                }

                if (game.checkWin(current)){
                    gameOver = true;
                    System.out.println("Congratulations Player X.");
                }
            }


        }
    }
}
