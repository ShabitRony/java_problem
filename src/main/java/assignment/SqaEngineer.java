package assignment;

public class SqaEngineer{
    public static void main(String[] args) {
        String str = "I am a SQA Engineer";


        String[] words = str.trim().split("\\s+");
        int wordcount = words.length;


        String nospace = str.replaceAll("\\s+", "");
        int chcount = nospace.length();


        int vowels = 0;
        int consonants = 0;
        for (char ch : nospace.toCharArray()) {
            if (Character.isLetter(ch)) {
                char c = Character.toLowerCase(ch);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Words: " + wordcount);
        System.out.println("Chars: " + chcount);
        System.out.println("Vowel: " + vowels);
        System.out.println("Consonant: " + consonants);
    }
}

