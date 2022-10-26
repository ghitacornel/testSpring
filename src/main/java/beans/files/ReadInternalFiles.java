package beans.files;

import org.springframework.stereotype.Component;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class ReadInternalFiles {

    public String readFileContent() {
        try {
            Path path = Paths.get("src", "main", "resources", "templates", "my_template.txt");
            File file = path.toFile();
            byte[] bytes = Files.readAllBytes(file.toPath());
            return new String(bytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
