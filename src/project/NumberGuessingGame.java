package project;


//import java.util.Scanner;
//class NumberGuessing {
//    private int randomNumber;
//    private boolean hasWon;
//    public NumberGuessing() {
//        this.randomNumber = (int) (Math.random() * 100) + 1; //range
//        this.hasWon = false;
//    }
//    public void play() {
//        Scanner scanner = new Scanner(System.in);
//        while (!hasWon) {
//            System.out.print("Guess a number between 1 and 100: ");
//            int guess = scanner.nextInt();
//
//            if (guess < randomNumber) {
//                System.out.println("Too low! Try again.");
//            } else if (guess > randomNumber) {
//                System.out.println("Too high! Try again.");
//            } else {
//                System.out.println("Congratulations! You guessed the number.");
//                hasWon = true;
//            }
//        }
//        scanner.close();
//    }
//}
//public class NumberGuessingGame {
//    public static void main(String[] args) {
//        NumberGuessing game = new NumberGuessing();
//        game.play();
//    }
//}

import javax.swing.*;

public class NumberGuessingGame {
    private int targetNumber = (int)(Math.random() * 100 + 1);

    public NumberGuessingGame() {
        JFrame frame = new JFrame("Guess the Number");
        JTextField input = new JTextField(10);
        JButton guessButton = new JButton("Guess");
        JLabel result = new JLabel("Enter a number between 1 and 100");

        guessButton.addActionListener(e -> {
            try {
                int guess = Integer.parseInt(input.getText());
                if (guess == targetNumber) {
                    result.setText("Correct!"+"Congratulations! You guessed the number.");
                    Timer timer = new Timer(5000, evt -> frame.dispose());
                    timer.setRepeats(false);
                    timer.start();

                } else if (guess < targetNumber) {
                    result.setText("Too low!");
                } else {
                    result.setText("Too high!");
                }
            } catch (NumberFormatException ex) {
                result.setText("Please enter a valid number.");
            }
        });

        JPanel panel = new JPanel();
        panel.add(input);
        panel.add(guessButton);
        panel.add(result);

        frame.add(panel);
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new NumberGuessingGame();
    }
}


