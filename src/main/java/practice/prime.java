package practice;

public class prime {
    public static boolean findPrime(int num) {
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        for(int i =2; i <=100; i++){
            boolean check = findPrime(i);
            if(check == true)
                System.out.println("Prime number is "+i);

        }
    }
}
