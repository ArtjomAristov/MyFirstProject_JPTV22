/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstproject;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    private final Scanner scanner;
    private boolean repeat = true;
    public App() {
        this.scanner = new Scanner(System.in);
        
    }
    public void run() {
        do {
            System.out.println("Choose a task from the list");
            System.out.println("0. Leave From Program");
            System.out.println("1. Демонстрация работы со строками");
            System.out.println("2. Демонстрация работы с массивами");
            System.out.print("Number of a task: ");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("0. Leave From Program");
                    repeat = false;

                    break;
                case 1:
                    System.out.println("1. Выбрана Демонстрация работы со строками");

                    break;
                case 2:
                    System.out.println("1. Выбрана Демонстрация работы с массивами");

                    break;
                default:
                    System.out.println("Please choose number from the list");
        }}while(repeat);
        }
    }
    
    
    
    private boolean active = false;

    @Override
    public String toString() {
        return "App{" + "active=" + active + '}';
    
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    
    
}
