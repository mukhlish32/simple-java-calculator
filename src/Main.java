import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        double num1, num2;
        char operator;

        System.out.println("Enter two numbers:");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        // Parsing the numbers from the input string
        num1 = Double.parseDouble(numbers[0]);
        num2 = Double.parseDouble(numbers[1]);

        System.out.println("Enter an operator (+, -, *, /):");
        operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = calculator.add(num1, num2);
                break;
            case '-':
                result = calculator.subtract(num1, num2);
                break;
            case '*':
                result = calculator.multiply(num1, num2);
                break;
            case '/':
                try {
                    result = calculator.divide(num1, num2);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Error! Invalid operator.");
                return;
        }

        System.out.println("Result: " + result);
    }
}
