import java.util.Scanner;

public class Control_Structures_If {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your temperature: ");
        double temp = Double.valueOf(scanner.next());
        if (temp < 97.5) {
            System.out.println("Low");
        } else if (temp > 97.5 && temp < 99.5) {
            System.out.println("Normal");
        } else if (temp > 99.5) {
            System.out.println("High");
        }
    }
}
