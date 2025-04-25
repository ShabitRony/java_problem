package assignment;

import java.util.Arrays;
import java.util.Random;

public class RandomNumber {
    public static void random(int []arr) {
        int max = arr[0];
        int min = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            } else if (n < min) {
                min = n;
            }
        }
        System.out.println("Maximum number : " + max);
        System.out.println("Minimum number : " + min);

    }
    public static void main(String[] args) {
        int [] arr = new int[10];

        Random random = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(100);

        }
        System.out.println(Arrays.toString(arr));
        random(arr);

    }
}
