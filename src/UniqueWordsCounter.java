import java.util.*;

public class UniqueWordsCounter {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "kiwi", "banana", "strawberry",
                "watermelon", "orange", "grape", "peach", "apple", "pear", "kiwi",
                "pineapple", "banana", "orange", "apple", "cherry"};

        Map<String, Integer> wordCountMap = new HashMap<>();
        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
                uniqueWords.add(word);
            }
        }

        System.out.println("Unique words:");
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }

        System.out.println("\nWord count:");
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord + ": " + wordCountMap.get(uniqueWord));
        }
    }
}
