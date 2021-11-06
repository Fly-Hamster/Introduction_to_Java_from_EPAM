import java.util.Scanner;
public class linear_programs {
    public static double first_task(){
        // Find function value: z = ((a-3)*b/2)+c
        // get options:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        // calculate
        double z = ((a-3)*b/2)+c;
        return z;
    }
    public static double second_task(){
        // Find function value: ((b + sqrt(b^2 + 4ac))/2a) - a^3*c + b^(-2)
        // get options:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        // calculate
        double fraction = (b + Math.sqrt(Math.pow(b, 2) + 4*a*c))/2*a;
        double answer=fraction - Math.pow(a, 3)*c + Math.pow(b, -2);
        return answer;
    }
    public static double third_task(){
        // Find function value: ((sin(x) + cos(y))/(cos(x) - sin(y)))tg(xy)
        // get options:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();
        // calculate
        double answer = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        return answer;
    }
    public static double fourth_task(){
        // R number of nnn.ddd format. swap parts and output.
        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter R of nnn.ddd format: ");
        double R = scanner.nextDouble();
        // calculate
        double nnn_part = Math.floor(R) / 1000; // 0.nnn
        double ddd_part = Math.ceil((R - Math.floor(R)) * 1000); // ddd.0
        R = nnn_part + ddd_part; // ddd.nnn
        System.out.println(R);

        return R;
    }
    public static void fifth_task(){
        // convert time from seconds to format "HHч MMмин SSс"
        // get options
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time in sec: ");
        int T = scanner.nextInt();
        // calculate
        int hours = T / 3600;
        int T_withot_hours = T - hours * 3600;
        int minutes = T_withot_hours / 60;
        int seconds = T_withot_hours - minutes * 60;
        System.out.println(hours + "ч " + minutes + "мин " + seconds + "c ");

    }
    public static void sixth_task(){
        // the program prints true if the point falls within the area of the shape and false if not
        // get options:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();
        // calculate
        boolean first = (x>= -2 && x<=2) && (y>= 0 && y<=4);
        boolean second = (x>= -4 && x<=4) && (y>= -3 && y<=0);
        System.out.println(first||second);
    }
    public static void main(String[] args) {
        // write your code here
        sixth_task();
    }
}
