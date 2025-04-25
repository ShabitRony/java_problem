package assignment;

import java.util.Random;

public class RandomPassword {
    public static void generatePassword(int length){
        String chars ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwx1234567890!@#$%^&*_";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<length;i++){
            char ch = chars.charAt(random.nextInt(chars.length()));
            sb.append(ch);
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        RandomPassword randomPassword = new RandomPassword();
        generatePassword(8);
    }
}
