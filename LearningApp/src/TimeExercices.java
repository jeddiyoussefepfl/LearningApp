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
        JPanel exercisePanel = new JPanel(new GridLayout(5, 1));
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

        TimeExercices timeExercise = new TimeExercices();
        frame.getContentPane().add(timeExercise, BorderLayout.CENTER);

        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}

