import java.io.*;

/**
 * Created by LordwolF on 8/9/2016.
 */
public class App {
    public static void main(String[] args) {

        File file = new File("test.txt");

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while( (line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found :{" + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to Read File: " + file.toString());
        }
        finally {
            
        }

    }
}
