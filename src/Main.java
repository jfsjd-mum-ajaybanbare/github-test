import java.util.Random;

public class Main {

    public static void main(String[] args) {


        System.out.println("Printing 10 random numbers");

        Random r =new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(10) + 1);
        }

    }
}