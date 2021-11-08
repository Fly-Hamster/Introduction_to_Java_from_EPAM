import java.util.Scanner;
public class branched_programs {
    public static void first_task(){
        //given two angles of a triangle. check the triangle or not. if yes - is it rectangular?
        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("First angle: ");
        double first_angle = scanner.nextDouble();
        System.out.print("Second angle: ");
        double second_angle = scanner.nextDouble();
        // calculate
        double third_angle = 180 - first_angle - second_angle;
        if (third_angle <= 0) System.out.println("It's not triangle.");
        else
        {
            System.out.println("It's triangle.");
            if (first_angle == 90 || second_angle == 90 || third_angle == 90)
                System.out.println("This triangle is rectangular.");
        }
    }
    public static void second_task(){
        // find: max{min(a, b), min(c, d)}
        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();
        System.out.print("d = ");
        double d = scanner.nextDouble();
        // calculate
        double min_a_b, min_c_d, max;
        if(a >= b) min_a_b = b;
        else min_a_b = a;
        if(c >= d) min_c_d = d;
        else min_c_d = c;
        if(min_a_b >= min_c_d) max = min_a_b;
        else max = min_c_d;
        System.out.println("max{min(a, b), min(c, d)} = " + max);

        // or

        System.out.println("max{min(a, b), min(c, d)} = "
                + (Math.max(Math.min(a, b), Math.min(c, d))));
    }
    public static void third_task(){
        // Have A(x1, y1), B(x2, y2), C(x3, y3). Check if they are on the same line
        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("x1 = ");
        double x1 = scanner.nextDouble();
        System.out.print("y1 = ");
        double y1 = scanner.nextDouble();
        System.out.print("x2 = ");
        double x2 = scanner.nextDouble();
        System.out.print("y2 = ");
        double y2 = scanner.nextDouble();
        System.out.print("x3 = ");
        double x3 = scanner.nextDouble();
        System.out.print("y3 = ");
        double y3 = scanner.nextDouble();
        // calculate
        // equation of a straight line passing through a point
        // (x - x1) / (x2 - x1) = (y - y1) / (y2 - y1)
        // x = x3, y = y3
        boolean result = ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1));
        if(result) System.out.println("Points on the same line");
        else System.out.println("Points not on the same line");
    }
    public static void main(String[] args) {
        // write your code here
        third_task();
    }
}
