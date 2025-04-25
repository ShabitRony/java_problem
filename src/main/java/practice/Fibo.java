package practice;

public class Fibo {
    public static int Fibonacci(int num){
        if(num<=1){
            return num;
        }
        return Fibonacci(num-1)+Fibonacci(num-2);
    }
    public static void main(String[]args){
        int terms =10;
        for(int i =0;i<=terms;i++){
            System.out.println(Fibonacci(i)+" ");
        }
    }
}
