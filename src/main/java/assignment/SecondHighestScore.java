package assignment;

public class SecondHighestScore {
    public static void main(String[] args) {
        double [] score ={3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double highest = score[0];
        double secondHighest =score[0];

        for(double n : score){
            if(n>highest){
                secondHighest = highest;
                highest = n;
            }else if(n < highest && n>secondHighest){
                secondHighest = n;
            }
        }
        System.out.println("Second Highest Score is : "+secondHighest);
    }
}
