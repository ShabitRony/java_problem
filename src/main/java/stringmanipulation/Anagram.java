package stringmanipulation;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String word1 = "race";
        String word2 = "care";
        char [] w1 = word1.toCharArray();
        char [] w2 = word2.toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);
        if(Arrays.equals(w1,w2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not anagram");
        }
    }
}
