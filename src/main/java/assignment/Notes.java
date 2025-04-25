package assignment;

import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        int [] notes = {1000,500,200,100,50,20,10,5,2,1};
        System.out.println("Enter Amount");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        for(int note : notes){
            if(amount>=note){
                int count = amount/note;
                amount %= note;
                System.out.println(note +" X "+count);
            }
        }
    }
}
