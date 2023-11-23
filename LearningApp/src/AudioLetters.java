import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 * from a file will play a sound
 */
public interface AudioLetters {
    static void playSound(File file){
        try{
            // Create AudioInputStream from the sound file
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);

            // Get the audio format of the sound file
            AudioFormat format = audioInputStream.getFormat();

            // Create a DataLine.Info object to get the SourceDataLine
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

            // Get the SourceDataLine from the system
            SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);

            // Open the line and start playing the sound
            line.open(format);
            line.start();

            // Read the audio data from the InputStream and write it to the SourceDataLine
            int bufferSize = 1024;
            byte[] buffer = new byte[bufferSize];
            int bytesRead;

            while ((bytesRead = audioInputStream.read(buffer, 0, buffer.length)) != -1) {
                line.write(buffer, 0, bytesRead);
            }

            // Close the line when the sound is finished
            line.drain();
            line.stop();
            line.close();

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

    }
}
/**HOW TO USE ME
 *  // Ç
 *         File soundfileForÇ = new File("resources/LetterC.m4a");
 *
 *         // Ğ
 *         File soundFileForG = new File("src/resources/LetterG.wav");
 *
 *         // Ö
 *         File soundFileForÖ = new File("src/resources/Ö.wav");
 *
 *         // Ü
 *         File soundFileForÜ = new File("src/resources/Ü.wav");
 *
 *         // Ş
 *         File soundFileForŞ = new File("src/resources/Ş.wav");
 *
 *         //Play The Sound For a Letter
 *         AudioLetters.playSound(soundFileForŞ);
 * */
