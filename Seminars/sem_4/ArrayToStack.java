/*
Задание №3
1) Написать метод, который принимает массив элементов, помещает их в стэк
и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в
очередь и выводит на консоль содержимое очереди. 
*/
package sem_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArrayToStack {
    public static void main(String[] args) {
       int[] array = new int[] {1,3,4,5,67,7,8,9};
        StackOut(array);
        System.out.println();
        QueueOut(array);
    }

    public static void StackOut (int[] arr){
        Stack<Integer> stack = new Stack<>();
        for (int item : arr){
            stack.push(item);
        }
        while ( !stack.empty()){
            System.out.print(stack.pop()+" ");
        }
    }

    public static void QueueOut (int[] arr){
        Queue<Integer> queue = new LinkedList<>();
        for (int item : arr){
            queue.add(item);
        }
        while (!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }
    }
}