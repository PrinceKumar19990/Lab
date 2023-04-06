package LAB_6_APRIL;
import java.io.*;

public class ReadFileIntoByteArrayExample {
    public static void main(String[] args) {
        String fn = "D:\\4121.txt";
        byte[] fc;
        try (FileInputStream fis = new FileInputStream(fn)) {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            fc = bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        System.out.println("File contents as byte array:");
        for (byte b : fc) {
            System.out.print(b + " ");
        }
    }
}