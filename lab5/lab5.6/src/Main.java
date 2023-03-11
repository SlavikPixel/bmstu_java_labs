import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> poemLines = readPoemLines(args);

        for (String line : poemLines) {
            String[] words = line.split("\\s+");
            List<String> newWords = new ArrayList<>();
            for (String word : words) {
                newWords.add(word.substring(0,1).toLowerCase() + word.substring(1));
            }
            newWords.forEach(elem -> System.out.print(elem + " "));
            System.out.println();
        }
    }

    private static List<String> readPoemLines(String[] args) {
        String fileName = (args.length > 0) ? args[0] : "poem.txt";
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