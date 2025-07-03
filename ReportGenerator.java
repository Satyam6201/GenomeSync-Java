import java.io.FileWriter;
import java.io.IOException;

public class ReportGenerator {
    public static void saveReport(String content, String path) {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(content);
            System.out.println("Report saved to " + path);
        } catch (IOException e) {
            System.out.println("Failed to save report.");
        }
    }
}
