import java.io.*;

public class ThrowThrows {
    public static void main(String[] args) throws IOException {
        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public static void readFile(String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + filename);
        }
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
