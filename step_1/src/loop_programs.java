import java.util.Scanner;
public class loop_programs {
    public static void first_task(){
        // the user enters a positive integer. the program calculates the amount from 1 to the entered
        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter whole positive number: ");
        int number_from_user = scanner.nextInt();
        while (number_from_user <= 0){
            System.out.print("It's not positive number. Enter number again: ");
            number_from_user = scanner.nextInt();
        }
        // calculate
        int sum = 0;
        for(int i = 1; i <= number_from_user; sum += i, i++);
        System.out.println("Sum from 1 to " + number_from_user + " = " + sum);
    }
    public static void second_task(){
        // have [a, b], step = h, find function values:
        // x>2: y = x
        // x<=2: y = -x
        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start (a): ");
        double a = scanner.nextDouble();
        System.out.print("Enter end (b): ");
        double b = scanner.nextDouble();
        System.out.print("Enter step (h): ");
        double h = scanner.nextDouble();
        // calculate
        double y = 0;
        for (double x = a; x <= b; x+=h){
            if(x > 2.0) y = x;
            if (x <= 2.0) y = -x;
            System.out.println("y = " + y);
        }
    }
    public static void third_task(){
        // find the sum of squares of the first 100 numbers
        // calculate
        int result = 0;
        for (int i = 0; i<100; i++){
            result += Math.pow(i, 2);
        }
        System.out.println("Result = " + result);
    }
    public static void fourth_task(){
        // find the product of the squares of the first 200 numbers
        // calculate
        long result = 1;
        for (int i = 1; i<=200; i++){
            result *= Math.pow(i, 2);
        }
        System.out.println("Result = " + result);
    }
    public static void main(String[] args) {
        fourth_task();
    }
}
