import java.util.Scanner;

public class TheaterKiosk {
    static void main() {
        int age;
        String trash;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        if (in.hasNextInt()) {
            age = in.nextInt();
            if (age >= 21) {
                System.out.println("You get a wristband!");
            }
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid age. Run the program again and enter a valid value!");
        }
    }
}
