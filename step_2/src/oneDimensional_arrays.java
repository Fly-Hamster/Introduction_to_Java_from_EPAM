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
    public static void main(String[] args) {
        first_task();
    }
}
