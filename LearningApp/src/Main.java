import javax.swing.*;
import java.awt.*;
import java.io.File;

public class TurkishLearningApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("learn turkish");
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel listeningPanel = new JPanel();
        listeningPanel.add(new JLabel("Listening exercices"));
        tabbedPane.addTab("Écoute", listeningPanel);

        JPanel writingPanel = new JPanel();
        writingPanel.add(new JLabel("writing exercices"));
        tabbedPane.addTab("Écriture", writingPanel);

        JPanel speakingPanel = new JPanel();
        speakingPanel.add(new JLabel("Speaking exercices"));
        tabbedPane.addTab("Expression Orale", speakingPanel);

        JPanel readingPanel = new JPanel();
        readingPanel.add(new JLabel("Lecture exercices"));
        tabbedPane.addTab("Lecture", readingPanel);

        JTabbedPane learningConceptsTabbedPane = new JTabbedPane();
        JPanel alphabetPanel = new JPanel();
        alphabetPanel.add(new JLabel("Learn turkish alphabet"));
        learningConceptsTabbedPane.addTab("Alphabet", alphabetPanel);

        JPanel colorsPanel = new JPanel();
        colorsPanel.add(new JLabel(""));
        ColorsWordList colorsWordList = new ColorsWordList();
        colorsWordList.initializeColorsWords();
        learningConceptsTabbedPane.addTab("Colors", colorsWordList.getColorsPanel());

        JPanel numbersPanel = new JPanel();
        numbersPanel.add(new JLabel("learn turkish numbers"));
        learningConceptsTabbedPane.addTab("Numbers", numbersPanel);

        JPanel timePanel = new JPanel();
        timePanel.add(new JLabel("learn the hour in turkish"));
        learningConceptsTabbedPane.addTab("Hour", timePanel);

        JPanel weatherPanel = new JPanel();
        weatherPanel.add(new JLabel("learn the weather vocabulary in turkish"));
        learningConceptsTabbedPane.addTab("Weather", weatherPanel);

        NumbersWordList numbersWordList = new NumbersWordList();
        numbersWordList.initializeNumberWords();
        learningConceptsTabbedPane.addTab("Numbers", numbersWordList.getNumbersPanel());

        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        tabbedPane.addTab("Learning", learningConceptsTabbedPane);

        tabbedPane.addTab("learning", learningConceptsTabbedPane);




    }
}

