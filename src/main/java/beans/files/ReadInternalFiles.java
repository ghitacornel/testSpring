package beans.files;

import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class ReadInternalFiles {

    public String readFileContent() {
        try {
            Path path = Paths.get("src", "main", "resources", "templates", "internal_file.txt");
            byte[] bytes = Files.readAllBytes(path);
            return new String(bytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
