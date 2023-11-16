import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

class TimeWordList {
    private final JPanel timePanel;
    private final JLabel turkishLabel;
    private final Map<String, String> translations;

    public TimeWordList() {
        timePanel = new JPanel(new GridLayout(0, 2));
        turkishLabel = new JLabel("", SwingConstants.CENTER);
        translations = new HashMap<>();
    }

    public void initializeTimeWords() {
        addTranslationToMap("Mañana", "sabah");
        addTranslationToMap("tarde", "öğleden sonra");
        addTranslationToMap("noche", "gece");
        addTranslationToMap("medianoche", "gece yarısı");
        addTranslationToMap("amanecer", "şafak");
        addTranslationToMap("oscuridad", "alacakaranlık");
        addTranslationToMap("noche, tarde", "akşam");
        addTranslationToMap("hora del día", "gündüz");

        for (String spanishWord : translations.keySet()) {
            JButton spanishButton = new JButton(spanishWord);
            spanishButton.addActionListener(new TranslationActionListener(spanishWord));
            timePanel.add(spanishButton);
        }

        timePanel.add(turkishLabel);
    }

    public JPanel getTimePanel() {
        return timePanel;
    }

    private void addTranslationToMap(String spanish, String turkish) {
        translations.put(spanish, turkish);
    }

    private class TranslationActionListener implements ActionListener {
        private final String spanishWord;

        public TranslationActionListener(String spanishWord) {
            this.spanishWord = spanishWord;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String turkishTranslation = translations.get(spanishWord);
            turkishLabel.setText(turkishTranslation);
        }
    }
}