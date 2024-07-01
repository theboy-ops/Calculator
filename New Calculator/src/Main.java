import java.util.Scanner;

    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean continueCalculating = true;

            while (continueCalculating) {

                System.out.println("Choose your operator: (+, -, *, /, %, ^, s)");
                char operator = scanner.next().charAt(0);

                System.out.println("Enter first number:");
                double num1 = scanner.nextDouble();

                double num2 = 0; // Initialize num2 to 0
                if (operator != 's') {
                    System.out.println("Enter second number:");
                    num2 = scanner.nextDouble();
                }
                    double result = calculate(num1, num2, operator);

                    System.out.println("Result:" + result);

                    System.out.println("Do you want to do another operation: (Yes/No)");
                    String response = scanner.next();
                    continueCalculating = response.equalsIgnoreCase("Yes");
                }
                scanner.close();
            }

            public static double calculate ( double num1, double num2, char operator){
                switch (operator) {
                    case '+':
                        return num1 + num2;
                    case '-':
                        return num1 - num2;
                    case '*':
                        return num1 * num2;
                    case '/':
                        if (num2 != 0) {
                            return num1 / num2;
                        } else {
                            System.out.println("Error: Division by Zero");
                            return Double.NaN;
                        }
                    case '%':
                        return num1 * (num2 / 100);
                    case '^':
                        return Math.pow(num1, num2);
                    case 's':
                        if (num1 >= 0) {
                            return Math.sqrt(num1);
                        } else {
                            System.out.println("Error: Cannot take the square root of a negative number");
                            return Double.NaN;
                        }
                        
                    default:
                        System.out.println("Error: Invalid Operator");
                        return Double.NaN;
                }
            }
        }



