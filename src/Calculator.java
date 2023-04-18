import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = sc.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = sc.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;

        switch (operator) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> result = firstNumber / secondNumber;
            default -> {
                System.out.println("Error! operator is not correct");
                return;
            }
        }

        System.out.println(firstNumber+" "+operator+" "+secondNumber+" = "+result);
    }

}
