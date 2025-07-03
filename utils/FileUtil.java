package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtil {
    public static String readSequence(String filePath) {
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)))
                    .replaceAll("\\s+", "").toUpperCase();
        } catch (IOException e) {
            System.out.println("Error reading file: " + filePath);
            return "";
        }
    }
}
