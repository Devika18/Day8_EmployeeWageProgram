import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Program");
        Random random = new Random();
        int employeeCheck = random.nextInt(3);
        if(employeeCheck >=2) {
            System.out.println("Employee is Present");
        }
        else
            System.out.println("Employee is Absent");
    }
}