import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {
    public static void main(String[] args) throws IOException {
        File TextFile = new File("Text.txt");
        FileReader TextFileReader = new FileReader(TextFile);
        char[] charArray = new char[1008];
        int numberChar = 0;
        boolean MoreText = true;
        File fixedFile = new File("fixedText1.txt");
        FileWriter fixedFileWriter = new FileWriter(fixedFile);

        while(MoreText){
            int readByteFromFile = TextFileReader.read();
            if (readByteFromFile == -1){
                MoreText = false;
            }
            else if (readByteFromFile != -1){
                if (readByteFromFile == '_'){
                    readByteFromFile = ' ';
                }
                charArray[numberChar] = (char) readByteFromFile;
                numberChar++;
            }
        }
        for(int i = 0; i < numberChar; i++){
            fixedFileWriter.append(charArray[i]);
            System.out.print(charArray[i]);
        }
        fixedFileWriter.close();
    }
}
