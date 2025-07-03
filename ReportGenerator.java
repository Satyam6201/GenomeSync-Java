import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReportGenerator {

    public static void saveReport(String content, String path) {
        try {
            File file = new File(path);
            File parentDir = file.getParentFile();

            // Ensure parent directory exists
            if (parentDir != null && !parentDir.exists()) {
                boolean created = parentDir.mkdirs();
                if (!created) {
                    System.out.println("❌ Failed to create directory: " + parentDir.getAbsolutePath());
                    return;
                }
            }

            // Write to file
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();

            System.out.println("✅ Report saved to: " + file.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("❌ Error saving report: " + e.getMessage());
        }
    }
}
