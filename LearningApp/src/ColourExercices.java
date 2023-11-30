import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColourExercices extends JPanel {
    public ColourExercices() {
        setLayout(new GridLayout(5, 1));

        addExercise("Question 1: ¿Cómo se dice amarilla en turco?",
                "A. Kırmızı",
                "B. Sarı",
                "C. Beyaz",
                "B. Sarı");

        addExercise("Question 2: ¿Cómo se dice blanca en turco?",
                "A. Beyaz",
                "B. Gri",
                "C. Siyah",
                "A. Beyaz");

        addExercise("Question 3: ¿Cómo se dice marrón en turco?",
                "A. Turuncu",
                "B. Kahverengi",
                "C. Mor",
                "B. Kahverengi");

        addExercise("Question 4: ¿Cómo se dice rojo en turco?",
                "A. Mavi",
                "B. Pembe",
                "C. Kırmızı",
                "C. Kırmızı");

        addExercise("Question 5: ¿Cómo se dice naranja en turco?",
                "A. Gri",
                "B. Sarı",
                "C. Turuncu",
                "C. Turuncu");
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

        ColourExercices colourExercise = new ColourExercices();
        frame.getContentPane().add(colourExercise, BorderLayout.CENTER);

        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}
