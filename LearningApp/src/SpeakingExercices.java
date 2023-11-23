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
        JPanel exercisePanel = new JPanel(new GridLayout(4, 1));
        JLabel questionLabel = new JLabel(question);
        JRadioButton optionARadioButton = new JRadioButton(optionA);
        JRadioButton optionBRadioButton = new JRadioButton(optionB);
        JRadioButton optionCRadioButton = new JRadioButton(optionC);

        JButton checkAnswerButton = new JButton("Check Answer");

        checkAnswerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (optionARadioButton.isSelected() && optionA.equals(correctAnswer)) {
                    optionARadioButton.setBackground(Color.GREEN);
                    optionBRadioButton.setBackground(null);
                    optionCRadioButton.setBackground(null);
                } else if (optionBRadioButton.isSelected() && optionB.equals(correctAnswer)) {
                    optionARadioButton.setBackground(null);
                    optionBRadioButton.setBackground(Color.GREEN);
                    optionCRadioButton.setBackground(null);
                } else if (optionCRadioButton.isSelected() && optionC.equals(correctAnswer)) {
                    optionARadioButton.setBackground(null);
                    optionBRadioButton.setBackground(null);
                    optionCRadioButton.setBackground(Color.GREEN);
                } else {
                    optionARadioButton.setBackground(optionA.equals(correctAnswer) ? Color.RED : null);
                    optionBRadioButton.setBackground(optionB.equals(correctAnswer) ? Color.RED : null);
                    optionCRadioButton.setBackground(optionC.equals(correctAnswer) ? Color.RED : null);
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
