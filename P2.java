import java.io.FileReader;
import java.io.IOException;

public class P2
{
    public static void main(String[] args) throws IOException {
        FileReader sourceStream = null;
        try {
            sourceStream = new FileReader("F:\\java\\PART-5/testdemo.rtf");
            int temp;
            while ((temp = sourceStream.read()) != -1)
                System.out.println((char) temp);
            System.out.println("Program successfully executed");
        }
        finally {
            if (sourceStream != null)
                sourceStream.close();
        }
    }
}
