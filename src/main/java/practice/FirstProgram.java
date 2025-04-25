package practice;

public class FirstProgram {

    public static void main(String[] args) {
        int [] numbers = {20,25,23,12,25,12,3,2};
        int max =0;
        int secondMax = 0;
        for(int n : numbers){
            if(n >max){
                secondMax = max;
                max =n;
            }else if(n > max && n<secondMax){
                secondMax =n;
            }
        }
        System.out.println(secondMax);

    }
}

