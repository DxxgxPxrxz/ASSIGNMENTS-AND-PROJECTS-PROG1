public class Board {
    int[][] board;
    char[][] game;
    int size;
    int limit;
    int pos_x;
    int pos_y;
    boolean statusGame = true;
    boolean status_x = false;
    boolean status_y = false;

    public Board(int size){
        this.size = size;
        this.limit = (size * ((size*size)+1))/2;
        this.pos_x = 0;
        this.pos_y = size/2;
        this.board = new int[this.size][this.size];
    }

    void fillMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter the number[" + i + "][" + j + "]");
                int number = Utility.verifyNumber();
                board[i][j] = number;
            }
        }
    }


    public Board(){
        this.size = 3;
        this.game = new char[this.size][this.size];
    }

    void fillGame() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                game[i][j] = '-';
            }
        }
    }
    void Game() {
        while (statusGame){
            Utility.printGame(size, game);
            player1();
            verifyPosLine();
            verifyPosColumn();
            verifyPosDiagonal();
            verifyInverseDiagonal();
            verifyGame();
            if (statusGame){
                Utility.printGame(size, game);
                player2();
                verifyPosLine();
                verifyPosColumn();
                verifyPosDiagonal();
                verifyInverseDiagonal();
                verifyGame();
            }
        }
        Utility.printGame(size, game);
        if (status_x){
            System.out.println("PLAYER 1 WINS");
        } else {
            System.out.println("PLAYER 2 WINS");
        }
    }


    int verifyPos() {
        boolean condition = false;
        int number = 0;
        while (!condition){
            number = Utility.verifyNumber();
            if (number > size){
                System.out.println("Line or column incorrect, Check the matrix: ");
                Utility.printGame(size, game);
            } else {
                condition = true;
            }
        }
        return number;
    }

    int columnMatrix(int number) {
        int result = 0;
        for (int[] ints : board) {
            result += ints[number];
        }
        return result;
    }

    int lineMatrix(int number) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            result += board[number][i];
        }
        return result;
    }

    int principalMatrix() {
        int result = 0;
        for (int i = 0; i < size; i++) {
            result += board[i][i];
        }
        return result;
    }

    int inverseMatrix() {
        int result = 0;
        int limit = size - 1;
        for (int i = 0; i < size; i++){
            result += board[limit][i];
            limit --;
        }
        return result;
    }

    int averageMatrix() {
        int result = 0;
        for (int[] doubles : board) {
            for (int j = 0; j < size; j++) {
                result += doubles[j];
            }
        }
        return result;
    }

    void verifyGame() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (game[i][j] != '-'){
                    count++;
                }
            }
        }
        if (count == (size * size)){
            statusGame = false;
        }
    }

    void player1() {
        System.out.println("\n\tPLAYER1");
        System.out.println("Enter line: ");
        int line = verifyPos();
        line --;
        System.out.println("Enter column: ");
        int column = verifyPos();
        column --;
        if (game[line][column] == 'X' || game[line][column] == 'O'){
            System.out.println("ERROR: Position occupied enter other values!");
            player1();
        } else{
            game[line][column] = 'X';
        }
    }

    void player2() {
        System.out.println("\n\tPLAYER2");
        System.out.println("Enter line: ");
        int line = verifyPos();
        line --;
        System.out.println("Enter column: ");
        int column = verifyPos();
        column --;
        if (game[line][column] == 'X' || game[line][column] == 'O'){
            System.out.println("ERROR: Position occupied enter other values!");
            player2();
        } else{
            game[line][column] = 'O';
        }
    }

    void verifyPosLine(){
        int count_x = 0;
        int count_o = 0;
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if(game[i][j] == 'X'){
                    count_x++;
                }
                if(game[i][j] == 'O'){
                    count_o++;
                }
            }
            if (count_x == 3) {
                status_x = true;
                statusGame = false;
            }
            if (count_o == 3) {
                status_y= true;
                statusGame = false;
            }
            count_x = 0;
            count_o = 0;
        }
    }

    void verifyPosColumn(){
        int count_x = 0;
        int count_o = 0;
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if(game[j][i] == 'X'){
                    count_x++;
                }
                if(game[j][i] == 'O'){
                    count_o++;
                }
            }
            if (count_x == 3) {
                status_x = true;
                statusGame = false;
            }
            if (count_o == 3) {
                status_y= true;
                statusGame = false;
            }
            count_x = 0;
            count_o = 0;
        }
    }

    void verifyPosDiagonal(){
        int count_x = 0;
        int count_o = 0;
        for (int i = 0; i < size; i++){
            if(game[i][i] == 'X'){
                count_x++;
            }
            if(game[i][i] == 'O'){
                count_o++;
            }
        }
        if (count_x == 3) {
            status_x = true;
            statusGame = false;
        }
        if (count_o == 3) {
            status_y= true;
            statusGame = false;
        }
    }

    void verifyInverseDiagonal(){
        int count_x = 0;
        int count_o = 0;
        int limit = size - 1;
        for (int i = 0; i < size; i++){
            if(game[limit][i] == 'X'){
                count_x++;
            }
            if(game[limit][i] == 'O'){
                count_o++;
            }
            limit --;
        }
        if (count_x == 3) {
            status_x = true;
            statusGame = false;
        }
        if (count_o == 3) {
            status_y= true;
            statusGame = false;
        }
    }
}
