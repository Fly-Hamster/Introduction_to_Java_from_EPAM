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
    public static void main(String[] args) {
        first_task();
    }
}
