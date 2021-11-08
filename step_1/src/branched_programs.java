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
    public static void main(String[] args) {
        // write your code here
        first_task();
    }
}
