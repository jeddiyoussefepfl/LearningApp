import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeatherExercices extends JPanel {
    public WeatherExercices() {
        setLayout(new GridLayout(5, 1));

        addExercise("Question 1: ¿Como se dice soleado en turco?",
                "A. Güneşli",
                "B. Güneş",
                "C. Karlı",
                "A. Güneşli");

        addExercise("Question 2: ¿Cómo se dice neblinoso en turco?",
                "A. Buzlu",
                "B. Sağanak Yağışlı",
                "C. Sisli",
                "C. Sisli");

        addExercise("Question 3: ¿Cómo se dice caliente en turco?",
                "A. Soğuk",
                "B. Sıcak",
                "C. Ilık",
                "B. Sıcak");

        addExercise("Question 4: ¿Cómo se dice ola de frio en turco?",
                "A. Sıcak Hava Dalgası",
                "B. Rüzgar",
                "C. Soğuk Hava Dalgası",
                "C. Soğuk Hava Dalgası");

        addExercise("Question 5: ¿Cómo se dice tormenta en turco?",
                "A. Yağmurlu",
                "B. Gök Gürültülü Sağanak Yağışlı",
                "C. Güneş",
                "B. Gök Gürültülü Sağanak Yağışlı");
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

        WeatherExercices weatherExercise = new WeatherExercices();
        frame.getContentPane().add(weatherExercise, BorderLayout.CENTER);

        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}
