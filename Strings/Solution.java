import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

   private static final int[] VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX",  
    "V", "IV", "I"};

    public static List<String> romanizer(List<Integer> numbers) {
        
        List<String> romanNumerals = new ArrayList<>();
        
        for (int number : numbers) {
            if (number <= 0 || number >= 4000) {
                throw new IllegalArgumentException("Number out of range (1-3999)");
            }

            StringBuilder roman = new StringBuilder();
            
            // Convert the current number to Roman numeral
            for (int i = 0; i < VALUES.length; i++) {
                while (number >= VALUES[i]) {
                    roman.append(SYMBOLS[i]);
                    number -= VALUES[i];
                }
            }
            
            // Add the Roman numeral to the result list
            romanNumerals.add(roman.toString());
        }
        
        return romanNumerals;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<String> result = Result.romanizer(numbers);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
