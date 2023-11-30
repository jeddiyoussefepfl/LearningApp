import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimeExercices extends JPanel {
    public TimeExercices() {
        setLayout(new GridLayout(5, 1));

        addExercise("Question 1: ¿Cómo se dice mañana en turco?",
                "A. Sabah",
                "B. Akşam",
                "C. Gündüz",
                "A. Sabah");

        addExercise("Question 2: ¿Cómo se dice medianoche en turco?",
                "A. Alacakaranlık",
                "B. Öğleden Sonra",
                "C. Gece Yarısı",
                "C. Gece Yarısı");

        addExercise("Question 3: ¿Cómo se dice tarde en turco?",
                "A. Akşam",
                "B. Öğleden Sonra",
                "C. Şafak",
                "B. Öğleden Sonra");

        addExercise("Question 4: ¿Cómo se dice noche en turco?",
                "A. Gece Yarısı",
                "B. Öğleden Sonra",
                "C. Akşam",
                "C. Akşam");

        addExercise("Question 5: ¿Cómo se dice amanecer en turco?",
                "A. Sabah",
                "B. Şafak",
                "C. Akşam",
                "B. Şafak");
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

        TimeExercices timeExercise = new TimeExercices();
        frame.getContentPane().add(timeExercise, BorderLayout.CENTER);

        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}

