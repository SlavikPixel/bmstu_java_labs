import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        File directory = new File("db");
        if (!directory.exists()) {
            directory.mkdir();
        }

        File file = new File(directory, "db.txt");
        if (file.createNewFile()) System.out.println("File created");
            else System.out.println("File already exists");

        File resultFile = new File(directory, "result.txt");
        if (resultFile.createNewFile()) System.out.println("File created");
            else System.out.println("File already exists");

        List<String> lines = Files.readAllLines(file.toPath());
        List<String> resultLines = new ArrayList<>();

        String regex = "\\b\\w{3,5}\\b";

        Pattern pattern = Pattern.compile(regex);

        for (String line : lines) {
            List<String> wordsToRemove = new ArrayList<>();

            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                String word = matcher.group();
                wordsToRemove.add(word);
            }

            int maxWordsToRemove = wordsToRemove.size() % 2 == 0 ? wordsToRemove.size() : wordsToRemove.size() - 1;
            for (int i = 0; i < maxWordsToRemove; i++) {
                line = line.replaceFirst(wordsToRemove.get(i), "");
            }
            String resultLine = line.replaceAll("\\s+", " ").trim();
            resultLines.add(resultLine);
        }
        Files.write(resultFile.toPath(), resultLines);
    }
}