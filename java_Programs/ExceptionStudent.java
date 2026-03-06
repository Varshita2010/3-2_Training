import java.io.FileReader;
import java.io.IOException;

public class ExceptionStudent {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("sample.txt");
            System.out.println("File opened successfully");
            fr.close();
            
        } catch(IOException e) {
            System.out.println("An error occurred while opening the file");
        }finally{
            System.out.println("Program Executed succesfully.......");
        }
    }
}