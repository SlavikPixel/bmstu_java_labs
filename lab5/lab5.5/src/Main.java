import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws IOException {
        List<String> wordList = readWordList(args);

        List<String> poemLines = readPoemLines("poem.txt");

        for (String line : poemLines) {
            Map<String, Integer> wordFrequency = new HashMap<>();

            String lineClear = line.replaceAll("\\p{Punct}", "").toLowerCase();
            String[] words = lineClear.split("\\s+");
            for (String word : words) {
                if (wordList.contains(word)) {
                    int count = wordFrequency.getOrDefault(word, 0);
                    wordFrequency.put(word, count + 1);
                }
            }
            if (wordFrequency.isEmpty()) {
                continue;
            }
            System.out.println("Строка - '" + line + "', имеет слова: ");
            wordFrequency.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(System.out::println);
            System.out.println();
        }
    }

    private static List<String> readWordList(String[] args) {
        String fileName = (args.length > 0) ? args[0] : "words.txt";
        List<String> wordList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                wordList.add(line);
            }
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return wordList;
    }

    private static List<String> readPoemLines(String fileName) throws IOException {
        List<String> poemLines = new ArrayList<>();
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((line = reader.readLine()) != null) {
                poemLines.add(line);
            }
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return poemLines;
    }
}