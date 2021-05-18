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
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
      List<Integer> pairs = new ArrayList<>();
      List<Integer> num = new ArrayList<>();
      boolean match = false;
      int sum = 0;
      
      pairs.add(ar.get(0));
      
      for (int i = 1; i <= (ar.size() - 1); i++) {
        match = false;
        for (int j = 0; j <= (pairs.size() - 1); j++) {
          if (ar.get(i) == pairs.get(j)) 
            match = true;
        }
        if (!match)
          pairs.add(ar.get(i));        
      }
      for (int j = 0; j <= (pairs.size() - 1); j++) {
        num.add(0);
      }
      
      for (int k = 0; k <= (ar.size() - 1); k++) {
        for (int m = 0; m <= (pairs.size() - 1); m++) {
          if (ar.get(k) == pairs.get(m))
            num.set(m, num.get(m) + 1);
        }
      }
      
      for (int m = 0; m <= (num.size() - 1); m++) {
        sum += Math.floor(num.get(m) / 2);
      }
      
      return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
