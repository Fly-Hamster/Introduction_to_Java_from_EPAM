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
    public static void fifth_task(){
        // there is a number series and a number e.
        // output the sum of those terms that modulo> = e.
        // Common member of the series: a_n = 1/2^n + 1/3^n
        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter e: ");
        double e = scanner.nextDouble();
        // calculate
        double result = 0;
        for (int n = 1; ; n++){
            double a_n = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            if (Math.abs(a_n) >= e) result += a_n;
            else break;
        }
        System.out.println("Result: " + result);
    }
    public static void sixth_task(){
        // display the correspondence between characters and their numerical representation
        // calculate
        for (int i = 0; i <256; i++){
            char symbol = (char) i;
            System.out.println(symbol + " - " + i);
        }
    }
    public static void seventh_task(){
        // for natural numbers in the range from m to n,
        // print a list of divisors other than 1 and itself.
        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start (m): ");
        int m = scanner.nextInt();
        while (m <= 0){
            System.out.print("It's not positive number. Enter number again: ");
            m = scanner.nextInt();
        }
        System.out.print("Enter start (n): ");
        int n = scanner.nextInt();
        while (n <= 0){
            System.out.print("It's not positive number. Enter number again: ");
            n = scanner.nextInt();
        }
        // calculate
        for (int i = m; i <= n; i++){
            System.out.print(i + ": ");
            for (int j = 2; j < i; j++){
                if (i % j == 0) System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void eighth_task(){
        // 2 numbers are given.
        // determine the numerals included in both numbers.
        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start (a): ");
        double a = scanner.nextDouble();
        System.out.print("Enter end (b): ");
        double b = scanner.nextDouble();
        // calculate
        // chek int or double:
        boolean chek = false; // 2 number int - chek = true, else chek = false
        if (a - (int) a == 0 && b - (int) b == 0) chek = true;
        String str_a = Double.toString(a);
        String str_b = Double.toString(b);
        String str_preresult = "";
        for (int i = 0; i < str_a.length(); i++){
            for (int j = 0; j < str_b.length(); j++){
                if (str_a.charAt(i) == (str_b.charAt(j))) {
                    if (chek && (str_a.charAt(i) == ',' || str_a.charAt(i) =='.')) {
                        // int number - nnn, int number in double - nnn.0
                        // if user write int number he don't use 0
                        // exit from all cycles
                        i = str_a.length() + 1;
                        break;
                    }
                    else if (str_a.charAt(i) != ',' && str_a.charAt(i) !='.')
                        str_preresult += str_a.charAt(i) + " ";

                }
            }
        }
        // check for repeating the same numbers
        char[] array_preanswer = str_preresult.toCharArray();
        String str_result = "";
        for (int i = 0; i < str_preresult.length(); i++){
            if (str_result.indexOf(str_preresult.charAt(i)) == -1)
                str_result += str_preresult.charAt(i) + " ";
        }
        System.out.println(str_result);
    }
    public static void main(String[] args) {
        eighth_task();
    }
}
