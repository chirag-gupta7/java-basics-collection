
import java.util.Scanner;

public class Trianglepattern {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("How Many Lines of Triangle you want : ");
        int rows = myObj.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
