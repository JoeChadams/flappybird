import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 640;

        // set stage (JFrame)
        JFrame frame = new JFrame("Flappy Bird"); // new window and title
        //frame.setVisible(true); // make window visible
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null); // window in center of screen
        frame.setResizable(false); // window not resizable
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminate app by pressing close button

        // set scene (JPanel)
        FlappyBird flappyBird = new FlappyBird(); // instance of class FlappyBird
        frame.add(flappyBird); // add instance to frame
        frame.pack(); // frame size excludes title bar
        flappyBird.requestFocus();
        frame.setVisible(true); // show window

    }
}
