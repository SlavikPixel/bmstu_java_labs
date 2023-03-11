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
            String content = readFile(file.toPath().toString(), StandardCharsets.UTF_8);
            content = content.replaceAll("\\s+", " ");
            content = content.replaceAll("(?<!\\w)\\s++|\\s++(?!\\w)", "");
            content = content.replaceAll("]", "] ");
            content = content.replaceAll(">", "> ");
            try {
                Files.writeString(resultFile.toPath(), content, StandardCharsets.UTF_8);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("Файл успешно обработан.");
        } catch (IOException e) {
            System.err.println("Ошибка при чтении/записи файла: " + e);
        }
    }

    public static String readFile(String path, Charset encoding) throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}