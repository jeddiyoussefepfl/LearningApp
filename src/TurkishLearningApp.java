import javax.swing.*;
import java.awt.*;

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

        JTabbedPane learningTabbedPane = new JTabbedPane();
        JPanel alphabetPanel = new JPanel();
        alphabetPanel.add(new JLabel("Learn turkish alphabet"));
        learningTabbedPane.addTab("Alphabet", alphabetPanel);

        JPanel colorsPanel = new JPanel();
        colorsPanel.add(new JLabel("learn turkish colors"));
        learningTabbedPane.addTab("Colors", colorsPanel);

        JPanel numbersPanel = new JPanel();
        numbersPanel.add(new JLabel("learn turkish numbers"));
        learningTabbedPane.addTab("Numbers", numbersPanel);

        JPanel timePanel = new JPanel();
        timePanel.add(new JLabel("learn the hour in turkish"));
        learningTabbedPane.addTab("Hour", timePanel);

        JPanel weatherPanel = new JPanel();
        weatherPanel.add(new JLabel("learn the weather vocabulary in turkish"));
        learningTabbedPane.addTab("Weather", weatherPanel);

        tabbedPane.addTab("learning", learningTabbedPane);

        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        colorsPanel.setLayout(new GridLayout(12, 1));
        colorsPanel.add(new JLabel("learn colors in turkish and spanish"));

        addColorToPanel(colorsPanel, "red", "kırmızı", "rojo");
        addColorToPanel(colorsPanel, "orange", "turuncu", "naranjo");
        addColorToPanel(colorsPanel, "yellow", "sarı", "amarillo");
        addColorToPanel(colorsPanel, "green", "yeşil", "verde");
        addColorToPanel(colorsPanel, "blue", "mavi", "azul");
        addColorToPanel(colorsPanel, "purple", "mor", "morado");
        addColorToPanel(colorsPanel, "pink", "pembe", "rosa");
        addColorToPanel(colorsPanel, "white", "beyaz", "blanco");
        addColorToPanel(colorsPanel, "black", "siyah", "negro");
        addColorToPanel(colorsPanel, "grey", "gri", "gris");
        addColorToPanel(colorsPanel, "brown", "kahverengi", "castaño");

        learningTabbedPane.addTab("Colors", colorsPanel);

    }
    private static void addColorToPanel(JPanel panel, String english, String turkish, String spanish) {
        JPanel colorPanel = new JPanel(new GridLayout(1, 3));
        colorPanel.add(new JLabel(english));
        colorPanel.add(new JLabel(turkish));
        colorPanel.add(new JLabel(spanish));
        panel.add(colorPanel);
    }

}
