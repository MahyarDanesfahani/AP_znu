package T_bigjava.t1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name ? ");
        String name = scanner.nextLine();
        System.out.println("welcome " + name);

        System.out.println("please enter the weight (kilograms) : ");
        double m = scanner.nextDouble();
        System.out.println("please enter the height (meter) : ");
        double h = scanner.nextDouble();

        earth(m,h);
    }
    public static void earth(double weight , double height){
        final double g = 9.8d ;
        double result = weight * height * g ;
        System.out.println("the Earth's gravitational potential energy is : " + result);
    }
}
