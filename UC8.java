public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human Turn");
                // humanMove();
            } else {
                System.out.println("Computer Turn");
                // computerMove();
            }

            // gameOver = checkWin() || checkDraw();

            isHumanTurn = !isHumanTurn;
        }
    }
}
