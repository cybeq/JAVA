import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TxtReader {

    TxtReader(){
    }
    public String readText() {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            File myObj = new File("C:\\Users\\mat\\Documents\\Moje Projekty\\JAVA\\spring2206\\mutlithread_textReader\\src\\toread.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                stringBuilder.append(data);
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Kapitanie, mamy blad.");
            e.printStackTrace();
        }
        return stringBuilder.toString();

    }
}
