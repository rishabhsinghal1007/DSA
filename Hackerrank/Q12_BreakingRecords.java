// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> ans = new ArrayList<>();
        int maxCount = 0, minCount = 0;
        int maxEle = scores.get(0), minEle = scores.get(0);

        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > maxEle) {
                maxEle = scores.get(i);
                maxCount++;
            }

            if (scores.get(i) < minEle) {
                minEle = scores.get(i);
                minCount++;
            }
        }
        ans.add(maxCount);
        ans.add(minCount);

        return ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String[] scoresTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresTemp[i]);
            scores.add(scoresItem);
        }

        List<Integer> result = Result.breakingRecords(scores);
        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
