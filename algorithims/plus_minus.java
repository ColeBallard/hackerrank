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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        DecimalFormat df = new DecimalFormat("#.######");
        df.setRoundingMode(RoundingMode.CEILING);
        float p = 0, z = 0, n = 0;
        int length = arr.size();
        
        for (int i = 0; i <= (length - 1); i++) {
            if (arr.get(i) > 0)
                p += 1;
            else if (arr.get(i) == 0)
                z += 1;
            else
                n += 1;
        }
        
        int total = (int)p + (int)z + (int)n;
        p /= total;
        z /= total;
        n /= total;
        
        System.out.println(df.format(p));
        System.out.println(df.format(n));
        System.out.println(df.format(z));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
