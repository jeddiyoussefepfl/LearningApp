import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class WeatherWordList {
    private final JPanel weatherPanel;
    private final JLabel turkishLabel;
    private final Map<String, String> translations;

    public WeatherWordList() {
        weatherPanel = new JPanel(new GridLayout(0, 2));
        turkishLabel = new JLabel("", SwingConstants.CENTER);
        translations = new HashMap<>();
    }

    public void initializeTimeWords() {
        addTranslationToMap("soleado", "güneşli");
        addTranslationToMap("sol", "güneş");
        addTranslationToMap("lluvioso", "yağmurlu");
        addTranslationToMap("lluvia", "yağmur");
        addTranslationToMap("nevado", "karlı");
        addTranslationToMap("nieve", "kar");
        addTranslationToMap("ventoso", "rüzgarlı");
        addTranslationToMap("viente", "rüzgar");
        addTranslationToMap("frío", "soğuk");
        addTranslationToMap("caliente", "sıcak");
        addTranslationToMap("cálido", "ılık");
        addTranslationToMap("nublado", "bulutlu");
        addTranslationToMap("neblinoso", "sisli");
        addTranslationToMap("tormenta", "gök gürültülü sağanak yağışlı");
        addTranslationToMap("atronador", "gök gürültülü");
        addTranslationToMap("lluvia pesada", "sağanak yağışlı");
        addTranslationToMap("helado", "buzlu");
        addTranslationToMap("ola de calor", "sıcak hava dalgası");
        addTranslationToMap("ola de frio", "soğuk hava dalgası");



        for (String spanishWord : translations.keySet()) {
            JButton spanishButton = new JButton(spanishWord);
            spanishButton.addActionListener(new TranslationActionListener(spanishWord));
            weatherPanel.add(spanishButton);
        }

        weatherPanel.add(turkishLabel);
    }

    public JPanel getWeatherPanel() {
        return weatherPanel;
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
