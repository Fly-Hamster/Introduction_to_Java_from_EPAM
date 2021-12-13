import java.util.Scanner;
public class oneDimensional_arrays {
    public static void first_task(){
        // Array of natural numbers A[N]
        // Find the sum of multiples of K
        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        int[] A = new int [N];
        for (int i = 0; i < N; i++){
            System.out.print("Enter A[" + i +"] = ");
            A[i] = scanner.nextInt();
        }
        System.out.print("Enter K: ");
        int K = scanner.nextInt();
        int sum_result = 0;
        // calculate
        for (int i = 0; i < N; i++){
            if (A[i] % K == 0){
                sum_result += A[i];
            }
        }
        System.out.println(sum_result);
    }
    public static void second_task() {
        // there is a sequence of real numbers
        // Find numbers greater than Z
        // count the number of replacements
        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Z: ");
        int Z = scanner.nextInt();
        int number_of_replacement = 0;
        System.out.print("Enter N (array size): ");
        int N = scanner.nextInt(); // get array size
        double [] a = new double[N];
        for(int i = 0; i < N; i++){
            System.out.print("Enter a[" + i + "]: ");
            a[i] = scanner.nextDouble();
        }
        // calculate
        for (int i = 0; i < N; i++){
            if (a[i] > Z){
                a[i] = Z;
                number_of_replacement += 1;
            }
        }
        System.out.println(number_of_replacement);
    }

    public static void main(String[] args) {
        second_task();
    }
}
