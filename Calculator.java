package Java.HomeWork2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class Calculator {
    static File logFile = null;
    static FileWriter fileWriter = null;
    

    public static void main(String[] args) {

        try{
            
            logFile = new File("logCalc.txt");
            fileWriter = new FileWriter(logFile);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            double x = Double.parseDouble(scanner.nextLine());
            System.out.print("Введите операцию (+ - / *): ");
            char operation = scanner.nextLine().charAt(0);
            System.out.print("Введите второе число: ");
            double y = Double.parseDouble(scanner.nextLine());

            if (operation == '+'){
                System.out.printf("%.2f + %.2f = %.2f\n", x, y, plus(x, y));
            }
            if (operation == '-'){
                System.out.printf("%.2f - %.2f = %.2f\n", x, y, minus(x, y));
            }
            if (operation == '*'){
                System.out.printf("%.2f * %.2f = %.2f\n", x, y, multiply(x, y));
            }
            if (operation == '/'){
                System.out.printf("%.2f / %.2f = %.2f\n", x, y, divide(x, y));
            }

            fileWriter.close();
        }
        catch(Exception e){
            System.out.println("Ошибка, введите правильные данные");
        }
        System.out.println("Завершение работы");
    }

    static double plus(double a, double b){
        try{
            fileWriter.write("Сложение");
        }
        catch(Exception ex){

        }
        return a + b;
    }

    static double minus(double a, double b){
        try{
            fileWriter.write("Вычитание");
        }
        catch(Exception ex){

        }
        return a - b;
    }

    static double multiply(double a, double b){
        try{
            fileWriter.write("Сложение");
        }
        catch(Exception ex){

        }
        return a * b;
    }
    static double divide(double a, double b){
        try{
            fileWriter.write("Деление");
        }
        catch(Exception ex){

        }
                
        return a / b;
    }
    
}