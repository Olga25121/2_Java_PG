// Снипеты - быстрые команды, готовые конструкции для точки входа по первым буквам функции...class, main, print etc.
//Базовой единицей является класс, где есть один метод с названием main, в качестве аргумента он должен принимать массив строк, в котором мы можем что-то писать.

package Lectures;

// public class lec_1 {                            //определение класса  снипет - class
//     public static void main(String[] args) {    //точка входа         снипет - main
//         System.out.println("world");          //вывод в консоль     снипет - sysout
//println - переносит на следующую строку 
//print - не переносит на следующую строку
//     }
// }

//Объявление переменной     <тип><имя переменной> 
//Инициализация переменной  <имя переменной> = <значение> 

// public class lec_1 {                           
//     public static void main(String[] args) {    
//        String a = null;    
//        System.out.println(a);
//     }
// }

// Есть Тип данных - есть для него Обертка для доступа к большему функционалу (конвертация строк в числа и тп)
// int  -  Integer

//Арифметические операции: ++ инкремент, -- декремент

// System.out.println(++a); //префиксный инкремент - имеет приоритет выше чем операция вывода в консоль
// System.out.println(a++); //постфиксный инкремент - приоритет ниже вывода

//Вопрос интервьюэра: что выведет в консоль программа ( посчитать в уме)
/**
 * lec_1
 */
// public class lec_1 {

// public static void main(String[] args) {
// int a = 123;
// a = a-- - --a;
// System.out.println(a); // 2

// Логические операции: || - конъюнкция, && - дизъюнкция, ^ - разделительная
// дизъюнкция, ! -инверсия
// Побитовые операции: << >> побитовые сдвиги (используются для оптимизации
// вычисления корней, быстрей чем многие библиотеки)
// public class lec_1 {

// public static void main(String[] args) {
// int a = 8; //1000 бит
// a = a >> 1; //10000 сдвиг на 1 бит вправо
// System.out.println(a); //16
// }

// public class lec_1 {

// public static void main(String[] args) {
// int a = 18; //10010 бит
// a = a << 1; //1001
// System.out.println(a); //9
// }
// }
// Вопрос интервьюэра: что выведет в консоль программа ( посчитать в уме)
// public class lec_1 {

// public static void main(String[] args) {
// int a = 5; //101 бит
// int b = 2; // 10 там где ничего нет, заменяем 0 -> 010
// System.out.println(a | b); //111 -> 7
// System.out.println(a & b); //0 -> 0
// System.out.println(a ^ b); //111 -> 7
// }
// }

// public class lec_1 {

// public static void main(String[] args) {
// String s = "qwer";
// boolean b = s.length() >= 5 && s.charAt(4) == '1'; // длина строки больше или
// равна 5 и 4й символ равен 1
// конъюнкция проверяет только одну часть условия, если она = False, то и другая
// так же.
// boolean b = s.length() >= 5 & s.charAt(4) == '1'; // апперсант проверяет обе
// части условия.
// System.out.println(b); //False

// }
// }

// Массивы - одномерные

// public class lec_1 {
// public static void main(String[] args) {
// int[] arr = new int[10];
// System.out.println(arr.length); //10

// arr = new int[] {1, 2, 3, 4, 5};
// System.out.println(arr.length); //5

// }
// }
// Обратиться к отдельному функционалу массива:

// public class lec_1 {
// public static void main(String[] args) {
// int[] arr = new int[10];
// System.out.println(arr[3]); //0
// }
// }
// // Запись по какому-либо значению:
// public class lec_1 {
// public static void main(String[] args) {
// int[] arr = new int[10];
// arr[3] = 13;
// System.out.println(arr[3]); //13
// }
// }
// Любой функционал через точку
// int[] arr
// arr.

// Массивы - многомерные

// public class lec_1 {
// public static void main(String[] args) {
// int[]arr[] = new int[3][5]; //3 строки 5 столбцов
// for (int[] line : arr ) {
// for(int item : line) {
// System.out.printf("%d", item);
// }
// System.out.println();
// }
// }
// }

// Двумерные массивы [][] (массивы массивов)

// public class lec_1 {
// public static void main(String[] args) {
// int[][] arr = new int[3][5];

// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr[i].length; j++) {
// System.out.printf("%d ", arr[i][j]);
// }
// System.out.println();
// }
// }
// }

// Преобразования - неявные, явные (с указанием типа данных)
// Но! В массивах нельзя int преобразовать в double и тп

// Получение данных из терминала

// Строки

// import java.util.Scanner;
// public class lec_1{
// public static void main(String[] args) {
// Scanner iScanner = new Scanner(System.in);
// System.out.printf("name: ");
// String name = iScanner.nextLine();
// System.out.printf("Привет, %s!\n", name); // \n - эскейп последовательность -
// переход на новую строку, убирают %
// iScanner.close();
// }
// }

// Некоторые примитивы (целые числа, вещественные числа...)

// import java.util.Scanner;
// public class lec_1 {
// public static void main(String[] args) {
// Scanner iScanner = new Scanner(System.in);
// System.out.printf("int a: ");
// int x = iScanner.nextInt();
// System.out.printf("double a: ");
// double y = iScanner.nextDouble();
// System.out.printf("%d + %f = %f", x, y, x + y);
// iScanner.close();
// }}

// Проверка на соответствие получаемого типа

// import java.util.Scanner;
// public class lec_1 {
// public static void main(String[] args) {
// Scanner iScanner = new Scanner(System.in);
// System.out.printf("int a: ");

// boolean flag = iScanner.hasNextInt(); // Проверка на валидность введенных
// данных flag -true/false (hasNextInt)
// System.out.println(flag);

// int i = iScanner.nextInt();
// System.out.println(i);
// iScanner.close();
// } }

// Форматированный вывод

// public class lec_1 {
// public static void main(String[] args) {
// int a = 1, b = 2;
// int c = a + b;
// String res = a + " + " + b + " = " + c; // конкатинация строк - на выходе 4
// строки, нагрузка на производительность!!! Используем sringBuilding
// System.out.println(res);
// }
// }

// public class lec_1 {
// public static void main(String[] args) {
// int a = 1, b = 2;
// int c = a + b;
// String res = String.format("%d + %d = %d \n", a, b, c);
// System.out.printf("%d + %d = %d \n", a, b, c);
// System.out.println(res);
// }
// }

// %d: целочисленных значений
// %x: для вывода шестнадцатеричных чисел
// %f: для вывода чисел с плавающей точкой
// %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
// %c: для вывода одиночного символа
// %s: для вывода строковых значений

// Виды спецификаторов

// public class Program {
// public static void main(String[] args) {

// float pi = 3.1415f;
// System.out.printf("%f\n", pi); // 3,141500
// System.out.printf("%.2f\n", pi); // 3,14
// System.out.printf("%.3f\n", pi); // 3,141
// System.out.printf("%e\n", pi); // 3,141500e+00
// System.out.printf("%.2e\n", pi); // 3,14e+00
// System.out.printf("%.3e\n", pi); // 3,141e+00
// }
// }

// Функции и методы

// public class lec_1 {
//     static void sayHi() {
//         System.out.println("hi!");
//     }

//     static int sum(int a, int b) {
//         return a + b;
//     }

//     static double factor(int n) {       // Рекурсия - обязательное условие для выхода 
//         if (n == 1)
//             return 1;
//         return n * factor(n - 1);
//     }

//     public static void main(String[] args) {
//         sayHi(); // hi!
//         System.out.println(sum(1, 3)); // 4
//         System.out.println(factor(5)); // 120.0
//     }
// }


