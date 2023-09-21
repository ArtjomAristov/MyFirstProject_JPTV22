package myfirstproject;

import java.util.Scanner;

public class Calculator {
    private final Scanner scanner;

    public Calculator(){
        this.scanner = new Scanner(System.in);
    }

    public void calc(){
        System.out.print("Введите первое число: ");
        int firstNum = scanner.nextInt(); scanner.nextLine();

        System.out.print("\nВведите знак действия (+,-,*,/): ");
        String action = scanner.nextLine();

        System.out.print("\nВведите второе число: ");
        int secondNum = scanner.nextInt(); scanner.nextLine();

        switch (action) {
            case "+":
                System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
                break;
            case "-":
                System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
                break;
            case "*":
                System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
                break;
            case "/":
                System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
                break;
            default:
                System.out.println("Вы ввели не верный знак действия!");
        }
    }
}
