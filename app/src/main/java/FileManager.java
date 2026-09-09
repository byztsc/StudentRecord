import java.io.FileWriter;
import java.io.IOException;
public class FileManager {
    public static void saveToFile(StudentRecord record) {
        try (FileWriter writer = new FileWriter("students.txt", true)) {
            writer.write(record.toString() + "\n");
            System.out.println("Record saved to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}