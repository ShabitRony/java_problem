package stringmanipulation;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String st = "hello world ";
      char[] ch = st.toCharArray();
      Arrays.sort(ch);
        String str = Arrays.toString(ch);
        System.out.println(str);
        StringBuilder sb = new StringBuilder();
        sb.append(ch);
        System.out.println(sb);

    }
}