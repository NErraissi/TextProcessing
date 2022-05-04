import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NumberOfWord {
    public static void main(String[] args) throws IOException, InterruptedException {
        int numberChar = 0;
        boolean MoreText = true;
        int numberWord = 0;
        int numberSentence = 0;
        File TextFile = new File("Text.txt");
        FileReader TextFileReader = new FileReader(TextFile);

        while (MoreText) {
            int readByteFromFile = TextFileReader.read();
            char readCharacterFromByte = (char) readByteFromFile;
            if (readByteFromFile == -1) {
                MoreText = false;
            } else if (readByteFromFile != -1) {
                numberChar = numberChar + 1;
                if (readCharacterFromByte == '_' || readCharacterFromByte == '\n') {
                    numberWord = numberWord + 1;
                }
                if (readCharacterFromByte == '.' || readCharacterFromByte == '\n' || readCharacterFromByte == ',') {
                    numberSentence = numberSentence + 1;
                }
            }
        }

        System.out.println('\n' + "Number of words: " + numberWord);
        System.out.println('\n' + "Number of Sentences: " + numberSentence);
    }
}