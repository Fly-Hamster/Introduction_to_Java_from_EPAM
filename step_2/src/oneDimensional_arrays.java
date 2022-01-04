
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
    public static void third_task(){
        // array of real numbers
        // count the numbers of positive, negative and zeros
        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N (array size): ");
        int N = scanner.nextInt(); // get array size
        double [] a = new double[N];
        for(int i = 0; i < N; i++){
            System.out.print("Enter a[" + i + "]: ");
            a[i] = scanner.nextDouble();
        }
        int positive = 0, negative = 0, zeros = 0;
        // calculate
        for (int i = 0; i < N; i++){
            if (a[i] > 0) positive += 1;
            else if (a[i] == 0) zeros += 1;
            else negative += 1;
        }
        // print result
        System.out.println("Positive: " + positive);
        System.out.println("Zeros: " + zeros);
        System.out.println("Negative: " + negative);
    }
    public static void four_task(){
        // there is a sequence of real numbers
        // swap max and min places
        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N (array size): ");
        int N = scanner.nextInt(); // get array size
        double [] a = new double[N];
        for(int i = 0; i < N; i++){
            System.out.print("Enter a[" + i + "]: ");
            a[i] = scanner.nextDouble();
        }
        // calculate
        double min = a[0], max = a[0];
        int max_index = 0, min_index = 0;
        for(int i = 0; i < N;  i++){
            if (a[i] > max){
                max = a[i];
                max_index = i;
            }
            if (a[i] < min){
                min = a[i];
                min_index = i;
            }
        }
        // swap max and min
        double temp = a[max_index];
        a[max_index] = a[min_index];
        a[min_index] = temp;
        // print result
        for (int i = 0; i < N; i++)
            System.out.print(a[i] + " ");

    }
    public static void fifth_task () {
        // there is a sequence of real numbers
        // print all a[i] > i
        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N (array size): ");
        int N = scanner.nextInt(); // get array size
        double [] a = new double[N];
        for(int i = 0; i < N; i++){
            System.out.print("Enter a[" + i + "]: ");
            a[i] = scanner.nextDouble();
        }
        // calculate
        for (int i = 0; i < N; i++)
            if (a[i] > i) System.out.print(a[i] + " ");
    }
    public static void sixth_task(){
        // N вещественных чисел
        // натйи сумму тех, порядковые номера которых простые числа
        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N (array size): ");
        int N = scanner.nextInt(); // get array size
        double [] a = new double[N];
        for(int i = 0; i < N; i++){
            System.out.print("Enter a[" + i + "]: ");
            a[i] = scanner.nextDouble();
        }
        double sum = 0;
        // calculate
        sum += a[1];
        for (int i = 2; i < N; i++){
            int count = 1; // because in all cases i%i = 0
            for(int j = 1; j < i; j++)
                if (i % j == 0) count++;
            System.out.println(count);
            if (count == 2) sum += a[i];

        }
        System.out.println("Result: " + sum);
    }
    public static void seventh_task(){
        // Действительные числа a1, a2, ..., an
        // find max(a1 + a2n, a2 + a2n+1, ..., an + an+1)
        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N (array size): ");
        int N = scanner.nextInt(); // get array size
        double [] a = new double[N];
        for(int i = 0; i < N; i++){
            System.out.print("Enter a[" + i + "]: ");
            a[i] = scanner.nextDouble();
        }
        double result = a[0];
        // calculate
        int  [] res_array = new int [N];
        for(int i = 0; i < N; i++){
            res_array[i] += a[i];
            int index = (2*a.length -i - 1) % N;
            res_array[i] += a[index];

            if (res_array[i] > result) result = res_array[i];
        }
        System.out.println("Result: " + result);
    }
    public static void eighth_task(){
        // последовательность целочисленных a1, a2, ..., an
        // составить новую последовательность без чисел =min(a1, a2, ..., an)
        // get options:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N (array size): ");
        int N = scanner.nextInt(); // get array size
        int [] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = (int)(Math.random()*10);
        }
        int min = a[0];
        // calculate
        for(int number : a)
            min = number < min ? number : min;
        int count = N;
        for (int number :a)
            if (number == min) count--;
        int [] res_array = new int[count];
        count = 0;
        for(int i = 0; i < N; i++)
            if(a[i] != min){
                res_array[count] = a[i];
                count++;
            }
        for(int number : a)
            System.out.print(number + " ");
        System.out.println();
        for(int number : res_array)
            System.out.print(number + " ");

    }
    public static void nineth_task(){

    }
    public static void tenth_task(){

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter task number from 1 to 10: ");
        int task_number = scanner.nextInt();
        switch (task_number){
            case 1 -> first_task();
            case 2 -> second_task();
            case 3 -> third_task();
            case 4 -> four_task();
            case 5 -> fifth_task();
            case 6 -> sixth_task();
            case 7 -> seventh_task();
            case 8 -> eighth_task();
            case 9 -> nineth_task();
            case 10 -> tenth_task();
            default -> System.out.println("Error!");
        }
    }
}
