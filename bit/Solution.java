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

    /*
     * Complete the 'getOneBits' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER n as parameter.
     */

    public static List<Integer> getOneBits(int n) {
       ArrayList<Integer> list = new ArrayList<>();
        
        // Initialize count and position list
        int count = 0;
        
        // Iterate through each bit for a 32-bit integer
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1) {
                count += 1;
            }
        }
        
        // Add count of 1s to the list at the beginning
        list.add(count);
        
        String binaryString = Integer.toBinaryString(n);
        for (int i = 0; i < binaryString.length(); i++) {
            char bitChar = binaryString.charAt(i);
            int bit = Character.getNumericValue(bitChar);
            if(bit == 1){
                list.add(i+1);
            }
        }

        // Debug print to verify results
        System.out.println("Number: " + n);
        System.out.println("Count of 1s: " + count);
        System.out.println("Binary Representation: " + Integer.toBinaryString(n));
        
        return list;
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = Result.getOneBits(n);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}