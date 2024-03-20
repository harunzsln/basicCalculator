import java.util.Scanner;

public class basicCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1, num2;
        int select;
        System.out.println("Enter the first value: ");
        num1 = scan.nextDouble();
        System.out.println("\nEnter the second value: ");
        num2 = scan.nextDouble();
        System.out.println("\nPlease select the operation: ");
        System.out.println("1- Addition\n2- Substraction\n3- Multiplication\n4- Division");
        System.err.println("Your selection : ");
        select = scan.nextInt();

        if (select == 1) {
            System.out.println("Addition is: " + (num1 + num2));
        } else if (select == 2) {
            System.out.println("Substraction is: " + (num1 - num2));
        } else if (select == 3) {
            System.out.println("Multiplication is: " + (num1 * num2));
        } else if (select == 4) {
            if (num1 == 0 && num2 == 0) {
                System.out.println("Both number is 0 so result is undefined");
            } else if (num2 == 0) {
                System.out.println("Second number is 0 so result is indeterminate");
            } else {
                System.out.println("Division is: " + (num1 / num2));
            }
        } else {
            System.out.println("You made the invalid selection, please select again.");
        }
        scan.close();

    }
}
