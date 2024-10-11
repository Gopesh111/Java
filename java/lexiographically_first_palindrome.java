import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main
{
    // This method will attempt to form a palindrome using the characters from the string
    static String makePalindrome(TreeMap<Character, Integer> charCountMap)
    {
        // We will count how many characters have odd frequencies
        int oddCount = 0;
        // This will store the first half of the palindrome
        String prefix = "";
        // This will store the character that can appear in the middle (if there is any)
        String middleChar = "";

        // Loop through the characters and their counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();

            // Add half of the characters to the prefix to form the first half of the palindrome
            for (int i = 0; i < count / 2; i++) {
                prefix = prefix + character;
            }

            // If the character appears an odd number of times, it can only appear in the middle
            if (count % 2 == 1) {
                middleChar = String.valueOf(character);
                oddCount++;
            }

            // If more than one character has an odd count, it's impossible to form a palindrome
            if (oddCount > 1) {
                return "Can't make a palindrome";
            }
        }

        // The second half of the palindrome is the reverse of the first half
        String suffix = new StringBuilder(prefix).reverse().toString();

        // The final palindrome is the first half + middle character (if any) + second half
        return prefix + middleChar + suffix;
    }

    public static void main(String[] args) {
        // Reading input from the user
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        // Creating a map to store the frequency of each character
        TreeMap<Character, Integer> charCountMap = new TreeMap<>();

        // Count the frequency of each character in the input string
        for (char character : inputString.toCharArray()) {
            charCountMap.put(character, charCountMap.getOrDefault(character, 0) + 1);
        }

        // Try to make a palindrome and print the result
        System.out.println(makePalindrome(charCountMap));
    }
}
