import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorsExercices extends JPanel {
    public ColorsExercices() {
        setLayout(new GridLayout(5, 1));

        addExercise("Question 1: ¿Cuál es el color del cielo?",
                "A. mavi",
                "B. kırmızı",
                "C. beyaz",
                "A. mavi");

        addExercise("Question 2: ¿Cuál es el color de la fresa?",
                "A. gri",
                "B. kırmızı",
                "C. yeşil",
                "B. kırmızı");

        addExercise("Question 3: ¿De qué color es la hierba?",
                "A. turuncu",
                "B. yeşil",
                "C. pembe",
                "B. yeşil");

        addExercise("Question 4: ¿De qué color es un plátano?",
                "A. pembe",
                "B. mavi",
                "C. amarillo",
                "C. amarillo");

        addExercise("Question 5: ¿De qué color son las hojas en otoño?",
                "A. kırmızı",
                "B. turuncu",
                "C. amarillo",
                "B. turuncu");

        addExercise("Question 6: ¿De qué color es la leche?",
                "A. beyaz",
                "B. gri",
                "C. mor",
                "A. beyaz");

        addExercise("Question 7: ¿De qué color son las nubes cuando llueve?",
                "A. amarillo",
                "B. gri",
                "C. kırmızı",
                "B. gri");

        addExercise("Question 8: ¿De qué color es el cielo por la noche?",
                "A. mavi",
                "B. pembe",
                "C. siyah",
                "C. siyah");

        addExercise("Question 9: ¿De qué color son las flores de lavanda?",
                "A. kırmızı",
                "B. siyah",
                "C. mor",
                "C. mor");
        addExercise("Question 10: ¿De qué color son los flamencos?",
                "A. beyaz",
                "B. pembe",
                "C. turuncu",
                "B. pembe");
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
        JFrame frame = new JFrame("Turkish Colors Exercise");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ColorsExercices weatherExercise = new ColorsExercices();
        frame.getContentPane().add(weatherExercise, BorderLayout.CENTER);

        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}
