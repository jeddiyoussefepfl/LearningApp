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
    

        addTranslationToMap("cero", "sıfır");
        addTranslationToMap("uno", "bir");
        addTranslationToMap("dos", "iki");
        addTranslationToMap("tres", "üç");
        addTranslationToMap("cuatro", "dört");
        addTranslationToMap("cinco", "beş");

        addTranslationToMap("seis", "altı");
        addTranslationToMap("siete", "yedi");
        addTranslationToMap("ocho", "sekiz");
        addTranslationToMap("nueve", "dokuz");
        addTranslationToMap("on", "diez");

        addTranslationToMap("veinte", "yirmi");
        addTranslationToMap("treinta", "otuz");
        addTranslationToMap("cuarenta", "kırk");
        addTranslationToMap("cincuenta", "elli");
        addTranslationToMap("sesenta", "altmış");
        addTranslationToMap("setenta", "yetmiş");

        addTranslationToMap("ochenta", "seksen");
        addTranslationToMap("noventa", "doksan");
        addTranslationToMap("cien", "yüz");
        addTranslationToMap("mil", "bin");
        addTranslationToMap("millón", "milyon");
        addTranslationToMap("mil millones", "milyar");

        for (String spanishWord : translations.keySet()) {
            JButton spanishButton = new JButton(spanishWord);
            spanishButton.addActionListener(new TranslationActionListener(spanishWord));
            numbersPanel.add(spanishButton);
        }

        numbersPanel.add(turkishLabel);
    }

    public JPanel getNumbersPanel() {
        return numbersPanel;
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
