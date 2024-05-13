package view;

import javax.swing.*;
import java.awt.*;


public class QuizApp extends JFrame {

    private int score = 0;
    private int questionNumber = 0;

    private JLabel questionLabel;
    private JButton trueButton;
    private JButton falseButton;
    private JLabel resultLabel;

    private Question[] questions;

    public QuizApp() {
        setTitle("English Fluency Quiz");
        setSize(1300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.BLUE.darker());

        initializeQuestions();

        questionLabel = new JLabel();
        setLabelProperties(questionLabel, 30);
        add(questionLabel);

        trueButton = createButton("V", Color.GREEN);
        trueButton.addActionListener(e -> checkAnswer(true));
        add(trueButton);

        falseButton = createButton("F", Color.RED);
        falseButton.addActionListener(e -> checkAnswer(false));
        add(falseButton);

        resultLabel = new JLabel();
        setLabelProperties(resultLabel, 30);
        add(resultLabel);

        updateQuestion();
    }

    private void initializeQuestions() {
        questions = new Question[]{
                new TrueFalseQuestion("Red, white, and blue are the colors of the American flag.", true),
                new TrueFalseQuestion("English is the most spoken language in the world.", false),
                new TrueFalseQuestion("The word 'hello' means goodbye in English.", false),
                new TrueFalseQuestion("The verb 'to be' has only one form in the past tense.", true),
                new TrueFalseQuestion("The word 'cat' is a verb.", false),
                new TrueFalseQuestion("'Apple' is a fruit and also a brand of phone.", true),
                new TrueFalseQuestion("The capital of France is Paris.", true),
                new TrueFalseQuestion("Shakespeare wrote 'Romeo and Juliet'.", true),
                new TrueFalseQuestion("The opposite of 'happy' is 'sad'.", true),
                new TrueFalseQuestion("The English alphabet has 26 letters.", true)
        };
    }

    private void setLabelProperties(JLabel label, int fontSize) {
        label.setFont(new Font("Calisto MT", Font.PLAIN, fontSize));
        label.setForeground(Color.WHITE);
    }

    private JButton createButton(String text, Color color) {
        JButton button = new JButton(text);
        button.setBackground(color);
        button.setFont(new Font("Calisto MT", Font.BOLD, 30));
        return button;
    }

    private void updateQuestion() {
        questionLabel.setText(questions[questionNumber].getQuestion());
    }

    private void checkAnswer(boolean userAnswer) {
        if (questions[questionNumber].checkAnswer(userAnswer)) {
            score++;
            resultLabel.setText("Correct!");
        } else {
            resultLabel.setText("Wrong!");
        }

        questionNumber++;
        if (questionNumber < questions.length) {
            updateQuestion();
        } else {
            showFinalMessage();
        }
    }

    private void showFinalMessage() {
        JOptionPane.showMessageDialog(this, "Parabéns, sua pontuação foi: " + score + "/10");

        int choice = JOptionPane.showConfirmDialog(this, "Gostaria de Aprimorar seu inglês?", "English Lessons", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            Login loginFrame = new Login();
            loginFrame.setVisible(true);
            dispose();
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            QuizApp quizApp = new QuizApp();
            quizApp.setVisible(true);
            quizApp.setLocationRelativeTo(null);
        });
    }
}

abstract class Question {
    private String question;

    public Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public abstract boolean checkAnswer(boolean userAnswer);
}

class TrueFalseQuestion extends Question {
    private boolean correctAnswer;

    public TrueFalseQuestion(String question, boolean correctAnswer) {
        super(question);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean checkAnswer(boolean userAnswer) {
        return userAnswer == correctAnswer;
    }
}
