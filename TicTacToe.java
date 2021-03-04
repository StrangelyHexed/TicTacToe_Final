public class TicTacToe {
    private char player;
    private final int row = 3;
    private final int column = 3;
    private char[][] board = new char[row][column];



    //Setter//
    public void setBoard(char player, int i, int j) {
        this.board[i][j] = player;
    }
    public void setPlayer(char player){
        this.player = player;
    }

    //Accessor//
    public char[][] getBoard() { return board; }

    public char getPlayer() { return player; }


    //Initialize Board//
    public void initializeBoard(){
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++) {
                board[i][j] = ' ';
            }
        }
    }


    //Print Board//
    public void printBoard(){
        int test = 1;
        System.out.println();
        for(int i = 0; i < row; i++) {
            System.out.print("|");
            for (int j = 0; j < column; j++) {
                System.out.print(" " + this.board[i][j] + " |");
            }
            System.out.println();
        }
        System.out.println();
    }


    //Picking Random Player//
    public void pickPlayer(){
        int first = (int) Math.round(Math.random());
        if (first == 0){
            System.out.println("Player X goes first.");
            player = 'X';
        }
        else{
            System.out.println("Player O goes first.");
            player = 'O';
        }
    }


    //Play game//
    public void playGame(char player, int location){
        if (location<0 || location>8){
            System.out.println("Invalid input. Please enter a valid number from 0-8.");
        }
        else {
            int i = location / 3;
            int j = location % 3;

            if(this.getBoard()[i][j] == ' '){
                this.setBoard(player,i,j);
                printBoard();
                if (player == 'O')
                    setPlayer('X');
                else {
                    setPlayer('O');
                }
            }
            else{
                System.out.println("The slot is full. Please enter a valid number from 0-8.");
            }
       }
    }

    //Check for win//
    public boolean checkWin(char player){
        //horizontal win
        for (int i = 0; i<row; i++){
            if (this.board[i][0] == player && this.board[i][1] == player && this.board[i][2]==player){
                    return true;
            }
        }
        //vertical win
        for (int j = 0; j <column; j++){
            if (this.board[0][j] == player && this.board[1][j] == player && this.board[2][j]==player){
                return true;
            }
        }

        //diagonal#1 win
        if (this.board[0][0] == player && this.board[1][1] == player && this.board[2][2] == player){
            return true;
        }

        //diagonal#2 win
        else if (this.board[2][0] == player && this.board[1][1] == player && this.board[0][2] == player){
            return true;
        }

        return false;
    }







}
