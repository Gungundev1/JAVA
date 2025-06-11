package project;

import java.util.Scanner;
import java.util.Random;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RockPaperScissor extends JFrame implements ActionListener {
    private JLabel statusLabel, scoreLabel, computerMoveLabel;
    private JButton rockButton, paperButton, scissorsButton, quitButton;
    private int userScore = 0;
    private int computerScore = 0;
    private String userName;

    public RockPaperScissor(String userName) {
        this.userName = userName;

        setTitle("Rock Paper Scissors");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        statusLabel = new JLabel("Choose your move:", SwingConstants.CENTER);
        add(statusLabel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        rockButton = new JButton("Rock");
        paperButton = new JButton("Paper");
        scissorsButton = new JButton("Scissors");
        quitButton = new JButton("Quit");

        rockButton.addActionListener(this);
        paperButton.addActionListener(this);
        scissorsButton.addActionListener(this);
        quitButton.addActionListener(this);

        buttonPanel.add(rockButton);
        buttonPanel.add(paperButton);
        buttonPanel.add(scissorsButton);
        buttonPanel.add(quitButton);

        add(buttonPanel);

        computerMoveLabel = new JLabel("Computer played: ", SwingConstants.CENTER);
        add(computerMoveLabel);

        scoreLabel = new JLabel("Score - " + userName + ": 0, Computer: 0", SwingConstants.CENTER);
        add(scoreLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userMove = "";
        if (e.getSource() == rockButton) userMove = "rock";
        else if (e.getSource() == paperButton) userMove = "paper";
        else if (e.getSource() == scissorsButton) userMove = "scissors";
        else if (e.getSource() == quitButton) {
            String winner = (userScore > computerScore) ? userName + " wins!" :
                    (computerScore > userScore) ? "Computer wins!" : "It's a draw!";
            JOptionPane.showMessageDialog(this, "Final Score:\n" + userName + ": " + userScore + "\nComputer: " + computerScore + "\n" + winner);
            System.exit(0);
        }

        // Generate computer move
        String[] moves = {"rock", "paper", "scissors"};
        String computerMove = moves[new Random().nextInt(3)];

        computerMoveLabel.setText("Computer played: " + computerMove);

        // Game logic
        if (userMove.equals(computerMove)) {
            statusLabel.setText("It's a tie!");
        } else if ((userMove.equals("rock") && computerMove.equals("scissors")) ||
                (userMove.equals("scissors") && computerMove.equals("paper")) ||
                (userMove.equals("paper") && computerMove.equals("rock"))) {
            statusLabel.setText("You win this round!");
            userScore++;
        } else {
            statusLabel.setText("Computer wins this round!");
            computerScore++;
        }

        scoreLabel.setText("Score - " + userName + ": " + userScore + ", Computer: " + computerScore);
    }

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter your name:");
        if (name == null || name.trim().isEmpty()) name = "Player";
        new RockPaperScissor(name);
    }
}
