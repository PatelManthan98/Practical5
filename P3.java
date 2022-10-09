import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class P3
{
    public static void copyContent(File p, File q)
            throws Exception {
        FileInputStream in = new FileInputStream(p);
        FileOutputStream out = new FileOutputStream(q);
        try {
            int a;
            while ((a = in.read()) != -1) {
                out.write(a);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println("File Copied");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source filename to read/copy:");
        String a = sc.nextLine();
        File x = new File(a);
        System.out.println("Enter the destination filename to write/paste:");
        String b = sc.nextLine();
        File y = new File(b);
        copyContent(x, y);
        sc.close();
    }
}
