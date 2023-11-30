import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpeakingExercices extends JPanel {
    public SpeakingExercices() {
        setLayout(new GridLayout(5, 1));

        addExercise("Question 1: ¿Cómo se dice 45 en turco?",
                "A. Kırk",
                "B. Elli",
                "C. Kırkbeş",
                "C. Kırkbeş");

        addExercise("Question 2: ¿Cómo se dice 50 en turco?",
                "A. Otuzbeş",
                "B. Kırk",
                "C. Elli",
                "C. Elli");

        addExercise("Question 3: ¿Cómo se dice 25 en turco?",
                "A. Kırkbeş",
                "B. Yirmibeş",
                "C. Doksanbeş",
                "B. Yirmibeş");

        addExercise("Question 4: ¿Cómo se dice 62 en turco?",
                "A. Otuz bir",
                "B. Altmış iki",
                "C. Altmış dört",
                "B. Altmış iki");

        addExercise("Question 5: ¿Cómo se dice 77 en turco?",
                "A. Yetmiş yedi",
                "B. Seksen iki",
                "C. Doksan",
                "A. Yetmiş yedi");
    }

    private void addExercise(String question, String optionA, String optionB, String optionC, String correctAnswer) {
        JPanel exercisePanel = new JPanel(new GridLayout(6, 1));
        JLabel questionLabel = new JLabel(question);
        JRadioButton optionARadioButton = new JRadioButton(optionA);
        JRadioButton optionBRadioButton = new JRadioButton(optionB);
        JRadioButton optionCRadioButton = new JRadioButton(optionC);

        JLabel correctAnswerLabel = new JLabel("The correct answer is: " + correctAnswer);
        correctAnswerLabel.setVisible(false);
        
        JButton checkAnswerButton = new JButton("Check Answer");

        checkAnswerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                correctAnswerLabel.setVisible(true);
                if (optionARadioButton.isSelected() && optionA.equals(correctAnswer)) {
                    optionARadioButton.setBackground(Color.GREEN);
                }
                else if (optionBRadioButton.isSelected() && optionB.equals(correctAnswer)) {
                    optionBRadioButton.setBackground(Color.GREEN);
                }
                else if (optionCRadioButton.isSelected() && optionC.equals(correctAnswer)) {
                    optionCRadioButton.setBackground(Color.GREEN);
                }
            }    
        });

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(optionARadioButton);
        buttonGroup.add(optionBRadioButton);
        buttonGroup.add(optionCRadioButton);

        exercisePanel.add(questionLabel);
        exercisePanel.add(optionARadioButton);
        exercisePanel.add(optionBRadioButton);
        exercisePanel.add(optionCRadioButton);
        exercisePanel.add(correctAnswerLabel);
        exercisePanel.add(checkAnswerButton);

        add(exercisePanel);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Turkish Numbers Exercise");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SpeakingExercices numbersExercise = new SpeakingExercices();
        frame.getContentPane().add(numbersExercise, BorderLayout.CENTER);

        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}
