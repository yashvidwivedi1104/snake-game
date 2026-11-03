import javax.swing.*;


public class SnakeGame extends JFrame {

    Board board;  //object

    SnakeGame() {     //constructor
        Board board = new Board();
        add(board);
        pack();
        setResizable(false);
        setVisible(true);

    }

    public static void main(String[] args) {
        //Initialize the Snake Game
        SnakeGame snakeGame = new SnakeGame();
    }
}
