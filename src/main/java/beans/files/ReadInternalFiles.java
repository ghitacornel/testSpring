package beans.files;

import org.springframework.stereotype.Component;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class ReadInternalFiles {

    public String readFileContent() {
        try {
            URL resource = ReadInternalFiles.class.getResource("templates/my_template.txt");
            Path path = Paths.get("src", "main", "resources", "templates", "my_template.txt");
            File file = path.toFile();
            byte[] bytes = Files.readAllBytes(file.toPath());
            return new String(bytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
