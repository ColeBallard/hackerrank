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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
      char c0 = s.charAt(0);
      char c1 = s.charAt(1);
      String hours0 = String.valueOf(c0) + String.valueOf(c1);
      
      if (s.contains("PM")) {
        if (!hours0.equals("12")) {
          int hours1 = Integer.parseInt(hours0) + 12;
          System.out.print(hours1);
          s = s.replace(hours0, String.valueOf(hours1));
        }
      }
      else if (s.contains("AM")) {
        if (hours0.equals("12")) {
          s = s.replace(hours0, "00");
        }
      }
      
      s = s.substring(0, s.length() - 2);
      
      return s;
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
