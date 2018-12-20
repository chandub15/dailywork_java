

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class WordFreq {


    public static void main(String[] args) throws IOException {
        // write your code here
        Map<String, Integer> words = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        freq(s,words);
        System.out.println(words);

    }

    static void freq(String fname,Map<String,Integer> words)throws FileNotFoundException {
        Scanner sc = new Scanner((new File(fname)));
        while (sc.hasNext()) {
            String word = sc.next();
            Integer count = words.get(word);
            if (count != null)
                count++;
            else
                count = 1;
            words.put(word, count);
        }
        sc.close();
    }









}
