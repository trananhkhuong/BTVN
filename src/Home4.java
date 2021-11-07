import java.util.Random;
import java.util.Scanner;

public class Home4 {
    public static void main(String[] args) {
        Random rd = new Random();
        int value = rd.nextInt(10) + 1;

        while (true) {
            Scanner sr = new Scanner(System.in);
            System.out.println("Enter a number the 1 - 10: ");
            int number1 = sr.nextInt();
            if (number1 > value ){
                System.out.println("nhap so be hon di");
            } else if (number1 < value) {
                System.out.println("nhap so lon hon di ");
            } else {
                System.out.println("dung roi day");
                break;
            }
        }
    }
}
