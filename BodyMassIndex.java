import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        int weight = scanner.nextInt();

        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble();

        double bodyMassIndex = weight / (height * height);
        System.out.println("Your body mass index: " + bodyMassIndex);

        scanner.close();
    }
}
