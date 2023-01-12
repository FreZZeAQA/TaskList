import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> wordList = new ArrayList<>();
        String word;
        do {
            System.out.print("Word:");
            word = scanner.nextLine().toLowerCase();
            if (word.equals("break")) {
                wordList.remove(word);
            } else {
                wordList.add(word);
            }

        } while (!word.equals("break"));
        System.out.println("Default list:" + wordList);

        System.out.print("Words startsWith < s >: ");
        for (String wordStartsWithS : wordList) {
            Pattern patternStarts = Pattern.compile("^s");
            Matcher matcherS = patternStarts.matcher(wordStartsWithS);
            while (matcherS.find()) {
                System.out.print(wordStartsWithS + ", ");
            }
        }
        System.out.print("\nWords with length more than five: ");
        for (String wordsWithLengthMoreThanFive : wordList) {
            Pattern patternLength = Pattern.compile("[a-zA-Z]{5}");
            Matcher matcherLength = patternLength.matcher(wordsWithLengthMoreThanFive);
            while (matcherLength.find()) {
                System.out.print(wordsWithLengthMoreThanFive + ", ");
            }
        }
    }
}

