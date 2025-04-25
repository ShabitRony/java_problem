package assignment;

public class RemoveVowels {
    public static void main(String[] args) {
        String st = "I am a SQA Engineer";

        String output = st.replaceAll("(?i)[aeiou]","");
        System.out.println(output);
    }
}
