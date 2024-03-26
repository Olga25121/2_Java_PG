/*
Задание №4
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().
*/
package sem_4;

public class StackUsArray {
    private static int[] array;
    private static int capacity;
    private static int topIndex;
    public static void main(String[] args) {
        capacity = 5;
        array = new int[capacity];
        topIndex = -1;
        System.out.println(size());
        System.out.println(empty());
        push(1);
        push(2);
        push(3);
        System.out.println(empty());
        System.out.println(size());
        System.out.println(pop());
        System.out.println(size());
        System.out.println(peek());
    }

    public static int size() {
        return topIndex + 1;
    }

    public static boolean empty() {
        return topIndex == -1;
    }

    public static void push(int num) {
        array[++topIndex] = num;
        
    }

    public static int peek(){
        return array[topIndex];
    }

    public static int pop(){
        return array[topIndex--];
    }
}