/*Array Manipulation | HacerRank

    Sample Input
    5 3
    1 2 100
    2 5 100
    3 4 100

    Sample Output
    200
*/

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
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
    // Write your code here
        //long[] arr=new long[n];
        // for(int i=0;i<queries.size();i++){
        //     for(int j=queries.get(i).get(0);j<=queries.get(i).get(1);j++){
        //         arr[j-1]+=queries.get(i).get(2);
        //     }
        // }
        // long l=arr[0];
        // for(int i=0;i<n;i++)
        //     if(l<arr[i])
        //         l=arr[i];
        // return l;
        long[] a=new long[n];
        for(int i=0;i<queries.size();i++){
            int start=queries.get(i).get(0);
            int end=queries.get(i).get(1);
            int add=queries.get(i).get(2);
            a[start-1]+=add;
            if(end<n)
                a[end]-=add;
        }
        long max=Long.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            a[i+1]+=a[i];
            if(a[i+1]>max)
                max=a[i+1];
        }
        return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        long result = Result.arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
