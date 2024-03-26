// Задача 3. Реализуйте простой калькулятор

// В методе calculate класса Calculator реализовать калькулятор, который будет выполнять математические операции (+, -, *, /) над двумя целыми числами и возвращать результат вещественного типа.
// В классе Printer необходимо реализовать проверку переданного оператора, при некорректном операторе программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".

// Аргументы, передаваемые в метод/функцию:
// '3'
// '+'
// '7'
// На выходе:
// 10.0

package HW.hw_1;

import java.util.Scanner;

class Calculator {
    public double calculate(char op, int a, int b) {
           
        Scanner iScanner = new Scanner(System.in);
        System.out.println();                             // отступы
        System.out.print("Введите первое число: ");
        a = iScanner.nextInt();
        System.out.print("\nВведите оператор (+, -, , /): ");
        op = iScanner.next().charAt(0);
        System.out.print("\nВведите второе число: ");
        b = iScanner.nextInt();
        iScanner.close();
        System.out.println();                             // отступы

        double result = 0;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Деление на ноль невозможно");
                }
                result = (double) a / b;
                break;
            default:
                throw new IllegalArgumentException("Некорректный оператор: '" + op + "'");
        }

        return result;
    }
}

class Printer {
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            a = 3;
            op = '+';
            b = 7;
        } else {
            try {
                a = Integer.parseInt(args[0]);
                op = args[1].charAt(0);
                b = Integer.parseInt(args[2]);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный формат аргументов");
                return;
            }
        }

        Calculator calculator = new Calculator();
        double result;

        try {
            result = calculator.calculate(op, a, b);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

// 2 Автотест

// class Calculator {
// public double calculate(char op, int a, int b) {
// // Введите свое решение ниже
// double result = 0;
// switch (op) {
// case '+':
// result = add(a, b);
// break;
// case '-':
// result = minus(a, b);
// break;
// case '*':
// result = mult(a, b);
// break;
// case '/':
// result = divide(a, b);
// break;
// }
// return result;
// }

// private double divide(int a, int b) {
// if (b != 0)
// return (double) a / b;
// return -1;
// }

// private int mult(int a, int b) {
// return a * b;
// }

// private int minus(int a, int b) {
// return a - b;
// }

// private int add(int a, int b) {
// return a + b;
// }
// }

// // Не удаляйте этот класс!
// // Он нужен для вывода результатов на экран и проверки
// class Printer {
// public static void main(String[] args) {
// int a = 0;
// char op = ' ';
// int b = 0;

// if (args.length == 0) {
// // При отправке кода на Выполнение, вы можете варьировать эти параметры
// a = 7;
// op = '+';
// b = 3;
// } else {
// a = Integer.parseInt(args[0]);
// op = args[1].charAt(0);
// b = Integer.parseInt(args[2]);
// }

// // Ниже добавить проверку оператора на корректность
// if (op != '+' && op != '-' && op != '*' && op != '/') {
// System.out.println("Некорректный оператор: " + op);
// return;
// }

// Calculator calculator = new Calculator();
// double result = calculator.calculate(op, a, b);
// System.out.println(result);
// }
// }

// 3

// import java.util.Scanner;

// class Calculator {
// public static void main(String[] args) {
// int a; int b; int ans; char op;
// Scanner iScanner = new Scanner(System.in);
// System.out.print("Введите первое число: ");
// a = iScanner.nextInt();
// System.out.print("\nВведите оператор (+, -, , /): ");
// op = iScanner.next().charAt(0);
// System.out.print("Введите второе число: ");
// b = iScanner.nextInt();
// switch (op) {
// case '+':
// ans = a + b;
// break;
// case '-':
// ans = a - b;
// break;
// case '*':
// ans = a * b;
// break;
// case '/':
// ans = a / b;
// break;
// default:
// System.out.printf("Ошибка! Введите правильный оператор");
// return;
// }
// System.out.print("\nРезультат:\n");
// System.out.printf(a + " " + op + " " + b + " = " + ans);
// }
// }