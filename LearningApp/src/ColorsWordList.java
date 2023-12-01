import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class ColorsWordList {
    private final JPanel colorsPanel;
    private final JLabel turkishLabel;
    private final Map<String, String> translations;

    public ColorsWordList() {
        colorsPanel = new JPanel(new GridLayout(0, 2));
        turkishLabel = new JLabel("", SwingConstants.CENTER);
        translations = new HashMap<>();
    }

    public void initializeColorsWords() {
        addTranslationToMap("rojo", "kırmızı");
        addTranslationToMap("naranja", "turuncu");
        addTranslationToMap("amarillo", "sarı");
        addTranslationToMap("verde", "yeşil");
        addTranslationToMap("azul", "mavi");
        addTranslationToMap("morado", "mor");
        addTranslationToMap("rosa", "pembe");
        addTranslationToMap("blanco", "beyaz");
        addTranslationToMap("negro", "siyah");
        addTranslationToMap("gris", "gri");

        for (String englishWord : translations.keySet()) {
            JButton englishButton = new JButton(englishWord);
            englishButton.addActionListener(new TranslationActionListener(englishWord));
            colorsPanel.add(englishButton);
        }

        colorsPanel.add(turkishLabel);
    }

    public JPanel getColorsPanel() {
        return colorsPanel;
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
