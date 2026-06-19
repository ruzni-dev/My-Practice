import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("\n=== Java Operators and Control Flow Tasks ===");
            System.out.println("1.  Addition, Subtraction, Multiplication, Division");
            System.out.println("2.  Even or Odd");
            System.out.println("3.  Largest of Two Numbers");
            System.out.println("4.  Voting Eligibility");
            System.out.println("5.  Positive, Negative, or Zero");
            System.out.println("6.  Pass or Fail Based on Marks");
            System.out.println("7.  Bigger Number Using if-else");
            System.out.println("8.  Grade Calculator");
            System.out.println("9.  Day Name from Day Number (switch)");
            System.out.println("10. Simple Calculator (switch)");
            System.out.println("11. Vowel or Consonant");
            System.out.println("12. Divisible by Both 3 and 5");
            System.out.println("13. Smallest of Three Numbers");
            System.out.println("14. Month Name from Month Number (switch)");
            System.out.println("0.  Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    performArithmeticOperations(scanner);
                    break;
                case 2:
                    checkEvenOrOdd(scanner);
                    break;
                case 3:
                    findLargestOfTwoNumbers(scanner);
                    break;
                case 4:
                    checkVotingEligibility(scanner);
                    break;
                case 5:
                    checkNumberSign(scanner);
                    break;
                case 6:
                    checkPassOrFail(scanner);
                    break;
                case 7:
                    findBiggerNumberIfElse(scanner);
                    break;
                case 8:
                    calculateGrade(scanner);
                    break;
                case 9:
                    displayDayName(scanner);
                    break;
                case 10:
                    simpleSwitchCalculator(scanner);
                    break;
                case 11:
                    checkVowelOrConsonant(scanner);
                    break;
                case 12:
                    checkDivisibleByThreeAndFive(scanner);
                    break;
                case 13:
                    findSmallestOfThreeNumbers(scanner);
                    break;
                case 14:
                    displayMonthName(scanner);
                    break;
                case 0:
                    continueProgram = false;
                    System.out.println("Exiting program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 14.");
            }
        }

        scanner.close();
    }

    private static void performArithmeticOperations(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;

        System.out.println("\nResults:");
        System.out.println("Addition: " + firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println("Subtraction: " + firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println("Multiplication: " + firstNumber + " * " + secondNumber + " = " + product);

        if (secondNumber != 0) {
            double quotient = firstNumber / secondNumber;
            System.out.println("Division: " + firstNumber + " / " + secondNumber + " = " + quotient);
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }
    }

    private static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    private static void findLargestOfTwoNumbers(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is larger than " + secondNumber + ".");
        } else if (secondNumber > firstNumber) {
            System.out.println(secondNumber + " is larger than " + firstNumber + ".");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    private static void checkVotingEligibility(Scanner scanner) {
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote yet.");
        }
    }

    private static void checkNumberSign(Scanner scanner) {
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    private static void checkPassOrFail(Scanner scanner) {
        System.out.print("Enter your marks out of 100: ");
        int marks = scanner.nextInt();
        if (marks >= 40) {
            System.out.println("Congratulations! You passed.");
        } else {
            System.out.println("You failed. Better luck next time.");
        }
    }

    private static void findBiggerNumberIfElse(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is bigger than " + secondNumber + ".");
        } else if (secondNumber > firstNumber) {
            System.out.println(secondNumber + " is bigger than " + firstNumber + ".");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    private static void calculateGrade(Scanner scanner) {
        System.out.print("Enter percentage marks (0 to 100): ");
        double percentage = scanner.nextDouble();

        if (percentage >= 90 && percentage <= 100) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else if (percentage >= 0) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid percentage entered.");
        }
    }

    private static void displayDayName(Scanner scanner) {
        System.out.print("Enter a day number (1 to 7): ");
        int dayNumber = scanner.nextInt();
        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = null;
                break;
        }

        if (dayName != null) {
            System.out.println("Day " + dayNumber + " is " + dayName + ".");
        } else {
            System.out.println("Invalid day number. Please enter a number from 1 to 7.");
        }
    }

    private static void simpleSwitchCalculator(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.print("Choose an operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result: " + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("Result: " + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("Result: " + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                break;
            case '/':
                if (secondNumber != 0) {
                    System.out.println("Result: " + firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator selected. Use +, -, *, or /.\n");
        }
    }

    private static void checkVowelOrConsonant(Scanner scanner) {
        System.out.print("Enter a single alphabet character: ");
        char character = scanner.next().toLowerCase().charAt(0);

        if (!Character.isLetter(character)) {
            System.out.println("Invalid input. Please enter an alphabet character.");
            return;
        }

        switch (character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(character + " is a vowel.");
                break;
            default:
                System.out.println(character + " is a consonant.");
        }
    }

    private static void checkDivisibleByThreeAndFive(Scanner scanner) {
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is divisible by both 3 and 5.");
        } else {
            System.out.println(number + " is not divisible by both 3 and 5.");
        }
    }

    private static void findSmallestOfThreeNumbers(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double thirdNumber = scanner.nextDouble();

        double smallest = firstNumber;
        if (secondNumber < smallest) {
            smallest = secondNumber;
        }
        if (thirdNumber < smallest) {
            smallest = thirdNumber;
        }

        System.out.println("The smallest number is " + smallest + ".");
    }

    private static void displayMonthName(Scanner scanner) {
        System.out.print("Enter a month number (1 to 12): ");
        int monthNumber = scanner.nextInt();
        String monthName;

        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = null;
                break;
        }

        if (monthName != null) {
            System.out.println("Month " + monthNumber + " is " + monthName + ".");
        } else {
            System.out.println("Invalid month number. Please enter a number from 1 to 12.");
        }
    }
}
