package assignment;

public class QuestionPaper {
    public static void question(int value) {
        for (int x = 0; x <= value; x++) {
            int y = value - x;


            if ((10 * x + 5 * y) == 100) {
                System.out.println("Number of 10-mark questions: " + x);
                System.out.println("Number of 5-mark questions: " + y);


            }
        }
    }

    public static void main(String[] args) {
        new QuestionPaper();
        question(13);

    }
}