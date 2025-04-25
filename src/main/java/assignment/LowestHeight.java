package assignment;

import java.util.Scanner;

public class LowestHeight {
    public static void height(int [] height){
        int lowest = height[0];
        int secondLowest = height[0];
        for(int h : height){
            if(h<lowest){
                secondLowest = lowest;
                lowest=h;
            }else if(h<secondLowest && h!=lowest){
                secondLowest = h;
            }
        }
        System.out.println("Another lowest height is : "+lowest +"cm");
        System.out.println("Second Lowest Height is : "+secondLowest +"cm");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] height = new int[10];
        for(int i =0;i<height.length;i++){
            System.out.print("Height " + (i + 1) + ": ");
            height[i] = sc.nextInt();
        }
        height(height);
    }
}
