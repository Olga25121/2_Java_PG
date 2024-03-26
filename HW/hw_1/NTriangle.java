package HW.hw_1;

// Задача 1. N-ое треугольное число

// Вычислить n-ое треугольного число(сумма чисел от 1 до n).
// Внутри класса NTriangle напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
// Если число n < 1 (ненатуральное) метод должен вернуть -1.

// Пример
// n = 4 -> 10
// n = 5 -> 15

//  1

// import java.util.Scanner;


// public class NTriangle {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.println();                             // отступы
//         System.out.printf("Введите число: ");
//         int i = iScanner.nextInt();
//         System.out.printf("Треугольное число: %d\n", countNTriangle(i));
//         iScanner.close();
//         System.out.println();                             // отступы
//     }

//     public static int countNTriangle(int a) {
//         if (a < 1) return -1;
//         return (a * (a + 1)) / 2;
//     }
// }


// 2 Автотест


// package HW.hw_1;

// public class NTriangle {

// public int countNTriangle(int n) {
// if (n < 1)
// return -1;
// int sum = 0;
// for (int i = 1; i <= n; i++) {
// sum += i;
// }
// return sum;
// }
// }

// class Printer {
// public static void main(String[] args) {
// int n = 0;
// if (args.length == 0) {
// n = 4;
// } else {
// n = Integer.parseInt(args[0]);
// }
// NTriangle ans = new NTriangle();
// int itresume_res = ans.countNTriangle(n);
// System.out.println(itresume_res);
// }
// }
