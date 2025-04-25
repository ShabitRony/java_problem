package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
   public static double binarySearch(double [] score, double target){
       int left =0;
       int right = score.length-1;
       while(left<=right){
           int mid = left+(right-left)/2;
            if(score[mid] == target){
                return mid;
            }else if(score[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
       }
       return -1;
   }

    public static void main(String[] args) {
    double []score ={3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));
        Scanner sc = new Scanner(System.in);
        System.out.println("Input CGPA for search");
        double target = sc.nextDouble();
        int result =(int) binarySearch(score, target);
        System.out.println(result);
    }

}
