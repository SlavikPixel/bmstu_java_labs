import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Main {
    public static void main(String[] args) throws IOException {
        File directory = new File("db");
        if (!directory.exists()) {
            directory.mkdir();
        }

        String fileName = "test.txt";
        String resultFileName = "resultFileName.txt";

        File file = new File(directory, fileName);
        if (file.createNewFile()) System.out.println("File created");
        else System.out.println("File already exists");

        File resultFile = new File(directory, resultFileName);
        if (resultFile.createNewFile()) System.out.println("File created");
        else System.out.println("File already exists");

        try {
            String content = Files.readString(file.toPath());
            String clearContent = content
                    .replaceAll("[\\t ]+", " ")
                    .replaceAll("\\s*\\(\\s*", "(")
                    .replaceAll("\\s*\\)\\s*", ")");
            try {
                Files.writeString(resultFile.toPath(), clearContent, StandardCharsets.UTF_8);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("Файл успешно обработан.");
        } catch (IOException e) {
            System.err.println("Ошибка при чтении/записи файла: " + e);
        }
    }
}