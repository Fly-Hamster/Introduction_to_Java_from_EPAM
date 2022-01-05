import java.util.Scanner;
public class multiDimensional_arrays {
    public static void first_task(){
        // есть матрица
        // вывести все нечетные столбцы,
        // у которых первый элемент больше последнего

        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter m-size: ");
        int m = scanner.nextInt();
        System.out.print("Enter n-size: ");
        int n = scanner.nextInt();
        double[][] matrix = new double[m][n];
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                matrix[i][j] = ((int)(Math.random()*100));

        // calculate
        int new_n = 0;
        for (int i = 0; i < n; i += 2){
            if(matrix[0][i] > matrix[m-1][i]) new_n++;
        }
        int index = 0;
        double [][] result = new double [m][new_n];
        for(int i = 0; i < n; i += 2){
            if(matrix[0][i] > matrix[m-1][i]){
                for(int j = 0; j < m; j++){
                    result[j][index] = matrix[j][i];
                }
                index++;
            }
        }
        // show start matrix
        System.out.println("Start matrix: ");
        for( double[] matrix_m : matrix) {
            for (double elem : matrix_m)
                System.out.printf("%-10s", elem + " ");
            System.out.println();
        }
        System.out.println();
        // show result matrix
        System.out.println("Result matrix: ");
        for( double[] matrix_m : result) {
            for (double elem : matrix_m)
                System.out.printf("%-10s", elem + " ");
            System.out.println();
        }

    }
    public static void second_task(){
        // есть квадратная матрица
        // вывести элементы на диагонали
        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter m-size: ");
        int m = scanner.nextInt();
        double[][] matrix = new double[m][m];
        for(int i = 0; i < m; i++)
            for(int j = 0; j < m; j++)
                matrix[i][j] = ((int)(Math.random()*100));

        // show start matrix
        System.out.println("Start matrix: ");
        for( double[] matrix_m : matrix) {
            for (double elem : matrix_m)
                System.out.printf("%-10s", elem + " ");
            System.out.println();
        }
        System.out.println();

        // calculate and show result
        System.out.println("Main diagonal: ");
        for(int i = 0; i < m; i++)
            System.out.print(matrix[i][i] + " ");
        System.out.println();
        System.out.println("Side diagonal: ");
        for(int i = 0, j = m-1; i <m && j >= 0; i++, j--)
                System.out.print(matrix[i][j] + " ");
    }
    public static void third_task(){
        // дана матрица
        // вывести k-строку и р-столбец
        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter m-size: ");
        int m = scanner.nextInt();
        System.out.print("Enter n-size: ");
        int n = scanner.nextInt();
        double[][] matrix = new double[m][n];
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                matrix[i][j] = ((int)(Math.random()*100));

        // get k-param, p-param and chek params
        System.out.print("Enter k: ");
        int k = scanner.nextInt();
        while (k > m){
            System.out.print("K > m-size. Enter k < m-size: ");
            k = scanner.nextInt();
        }
        System.out.print("Enter p: ");
        int p = scanner.nextInt();
        while (p > n){
            System.out.print("p > n-size. Enter p < n-size: ");
            p = scanner.nextInt();
        }
        // show start matrix
        System.out.println("Start matrix: ");
        for( double[] matrix_m : matrix) {
            for (double elem : matrix_m)
                System.out.printf("%-10s", elem + " ");
            System.out.println();
        }
        System.out.println();
        // show k-line
        System.out.println("k-line: ");
        for(int i = 0; i < n; i++)
            System.out.print(matrix[k][i] + " ");
        System.out.println();
        // show p-column
        System.out.println("p-column: ");
        for(int i = 0; i < m; i++)
            System.out.println(matrix[i][p]);
    }
    public static void four_task(){

    }
    public static void fifth_task(){

    }
    public static void sixth_task(){

    }
    public static void seventh_task(){

    }
    public static void eighth_task(){

    }
    public static void ninth_task(){

    }
    public static void tenth_task(){

    }
    public static void eleventh_task(){

    }
    public static void twelfth_task(){

    }
    public static void thirteenth_task(){

    }
    public static void fourteenth_task(){

    }
    public static void fifteenth_task(){

    }
    public static void sixteenth_task(){

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter task number from 1 to 16: ");
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
            case 9 -> ninth_task();
            case 10 -> tenth_task();
            case 11 -> eleventh_task();
            case 12 -> twelfth_task();
            case 13 -> thirteenth_task();
            case 14 -> fourteenth_task();
            case 15 -> fifteenth_task();
            case 16 -> sixteenth_task();
            default -> System.out.println("Error!");
        }
    }
}
