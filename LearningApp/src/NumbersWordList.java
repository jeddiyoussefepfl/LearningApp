import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class NumbersWordList {
    private final JPanel numbersPanel;
    private final JLabel turkishLabel;
    private final Map<String, String> translations;

    public NumbersWordList() {
        numbersPanel = new JPanel(new GridLayout(0, 2));
        turkishLabel = new JLabel("", SwingConstants.CENTER);
        translations = new HashMap<>();
    }

    public void initializeNumberWords() {
        addTranslationToMap("one", "bir");
        addTranslationToMap("two", "iki");
        addTranslationToMap("three", "üç");
        addTranslationToMap("four", "dört");
        addTranslationToMap("five", "beş");

        for (String englishWord : translations.keySet()) {
            JButton englishButton = new JButton(englishWord);
            englishButton.addActionListener(new TranslationActionListener(englishWord));
            numbersPanel.add(englishButton);
        }

        numbersPanel.add(turkishLabel);
    }

    public JPanel getNumbersPanel() {
        return numbersPanel;
    }

    private void addTranslationToMap(String english, String turkish) {
        translations.put(english, turkish);
    }

    private class TranslationActionListener implements ActionListener {
        private final String englishWord;

        public TranslationActionListener(String englishWord) {
            this.englishWord = englishWord;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String turkishTranslation = translations.get(englishWord);
            turkishLabel.setText(turkishTranslation);
        }
    }
}
