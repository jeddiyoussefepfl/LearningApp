import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private final static Map<String, String> translations = new HashMap<>();
    private static JLabel turkishLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Learn Turkish");
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel listeningPanel = new JPanel();
        listeningPanel.add(new JLabel("Listening exercises"));
        tabbedPane.addTab("Écoute", listeningPanel);

        JPanel writingPanel = new JPanel();
        writingPanel.add(new JLabel("Writing exercises"));
        tabbedPane.addTab("Écriture", writingPanel);

        JPanel speakingPanel = new JPanel();
        speakingPanel.add(new JLabel("Speaking exercises"));
        tabbedPane.addTab("Expression Orale", speakingPanel);

        JPanel readingPanel = new JPanel();
        readingPanel.add(new JLabel("Lecture exercises"));
        tabbedPane.addTab("Lecture", readingPanel);

        JTabbedPane learningConceptsTabbedPane = new JTabbedPane();
        JPanel alphabetPanel = new JPanel();
        alphabetPanel.add(new JLabel("Learn Turkish alphabet"));
        learningConceptsTabbedPane.addTab("Alphabet", alphabetPanel);

        JPanel colorsPanel = new JPanel();
        colorsPanel.add(new JLabel("Learn Turkish colors"));
        learningConceptsTabbedPane.addTab("Colors", colorsPanel);
        
        TimeWordList timeWordList = new TimeWordList();
        timeWordList.initializeTimeWords();
        learningConceptsTabbedPane.addTab("Time", timeWordList.getTimePanel());

        WeatherWordList weatherWordList = new WeatherWordList();
        weatherWordList.initializeWeatherWords();
        learningConceptsTabbedPane.addTab("Weather", weatherWordList.getWeatherPanel());

        NumbersWordList numbersWordList = new NumbersWordList();
        numbersWordList.initializeNumberWords();
        learningConceptsTabbedPane.addTab("Numbers", numbersWordList.getNumbersPanel());

        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        tabbedPane.addTab("Learning", learningConceptsTabbedPane);
        
    }

    private static class TranslationActionListener implements ActionListener {
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
