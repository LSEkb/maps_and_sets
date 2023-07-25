import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> numbers = new ArrayList<>(List.of(1, 6, 4, 3, 4, 4, 5, 5, 6, 7));
        List<String> text = new ArrayList<>(List.of("apple", "mango", "lemon", "strawberry", "apple", "lemon",
                "mango", "apple", "mango", "banana"));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        printOddNumbersOfList(nums);
        printEvenNumbersOfList(nums);
        printEvenNumbersOfList(numbers);
        printUniqueWordsOfList(text);
        printCountRepeatedWordsOfList(strings);
        printCountRepeatedWordsOfList(text);
        counterWords(strings);
        counterWords(text);
    }

    public static void printOddNumbersOfList(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        System.out.println(oddNumbers);
    }

    public static void printEvenNumbersOfList(List<Integer> numbers) {
        Set<Integer> evenNumbers = new TreeSet<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println(evenNumbers);
    }

    public static void printUniqueWordsOfList(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    public static void printCountRepeatedWordsOfList(List<String> words) {
        Map<String, Integer> countRepeats = new TreeMap<>();
        System.out.println("Количество повторов уникальных слов (в соответствии с алфавитным порядком):");
        for (String word : words) {
            countRepeats.put(word, Collections.frequency(words, word));
        }
        for (Integer key : countRepeats.values()) {
            System.out.println(key);
        }
    }

    public static void counterWords(List<String> words) {
        Set<String> uniqWords = new HashSet<>(words);
        Map<String, Integer> countRepeats = new TreeMap<>();
        for (String uniqWord : uniqWords) {
            int key = 0;
            for (String word : words) {
                if (word.equals(uniqWord)) {
                    ++key;
                    countRepeats.put(uniqWord, key);
                }
            }
        }
        System.out.println(countRepeats);
    }
}