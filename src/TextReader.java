import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class TextReader {
    public static void main(String[] args) throws IOException, InterruptedException {
        int numberChar = 0;
        boolean MoreText = true;

        //something that reads from a file
        //object: you can think of as a custom type.. but it has its own states and its behavior

        File TextFile = new File("C:\\Users\\noure\\Desktop\\Text1.txt");
        FileReader TextFileReader = new FileReader(TextFile);

        while(MoreText) {
            int readByteFromFile = TextFileReader.read();
            char readCharacterFromByte = (char) readByteFromFile;
            if(readByteFromFile == -1){
                MoreText = false;
            }
            else{
                System.out.print(readCharacterFromByte);
                numberChar = numberChar + 1;
            }
        }
        System.out.println('\n' + "Number of characters: " + numberChar);
    }
}
