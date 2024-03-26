// Хранение и обработка данных, чаcть I
// Приоритетные коллекции

// 1. Разобраться, зачем нужно столько коллекций и JCF
// 2. LinkedList и особенности работы с ним
// 3. Узнать о списках, как об абстрактной структуре
// 4. Проблемы работы со списками и массивами
// 5. Построение разных Queue и как в этом помогает JCF
// 6. Deque и логика использования этой коллекции
// 7. То, что мертво, умереть не может – Stack в контексте JCF
// У меня есть план
// Зачем разные коллекции?
// 1. Способ обработки данных
// 2. Решаемые задачи
// Зачем разные коллекции?
// LinkedList
// Представляет собой двусвязный список.
// LinkedList
// Представляет собой двусвязный список.
// Список – гибкая структура данных, позволяющая легко менять свой
// размер. Элементы доступны для вставки или удаления в любой позиции.
// LinkedList
// Представляет собой двусвязный список.
// Список – гибкая структура данных, позволяющая легко менять свой
// размер. Элементы доступны для вставки или удаления в любой позиции.
// LinkedList
// Массив
// LinkedList. Список
// list
// STACK HEAP
// Связный список
// LinkedList. Список
// list
// STACK HEAP
// Чем такой способ организации лучше? Или хуже?
// Проблема добавления в массив.
// LinkedList. Список
// Массив
// LinkedList. Список
// list d1 d2 d3
// STACK HEAP
// Массив
// LinkedList. Список
// list d1 d2 d3 v1 v2
// STACK HEAP
// Массив
// LinkedList. Список
// list d1 d2 d3 v1 v2 d1 d2 d3
// STACK HEAP
// Массив
// LinkedList. Список
// list d1 d2 d3 v1 v2 d1 d2 d3
// STACK HEAP
// Чем такой способ организации лучше? ли хуже?
// Проблема удаления из массива.
// LinkedList. Список
// Массив
// LinkedList. Список
// list d1 d2 d3 d4 d5 d6
// STACK HEAP
// Массив
// LinkedList. Список
// list d1 d2 d3 d4 d5 d6
// STACK HEAP
// Массив
// LinkedList. Список
// list d1 d3 d3 d4 d5 d6
// STACK HEAP
// Массив
// LinkedList. Список
// list d1 d3 d4 d4 d5 d6
// STACK HEAP
// Массив
// LinkedList. Список
// list d1 d3 d4 d5 d5 d6
// STACK HEAP
// Массив
// LinkedList. Список
// list d1 d3 d4 d5 d6 d6
// STACK HEAP
// Массив
// LinkedList. Список
// list d1 d3 d4 d5 d6 d6
// STACK HEAP
// Чем такой способ организации лучше? Или хуже?
// Попробуйте написать такой код – отсылка к предыдущим лекциям.
// В качестве тренировки попробуйте добавить
// элемент не в хвост.
// LinkedList. Список
// Чем такой способ организации лучше? Или хуже?
// Добавление в конец списка.
// LinkedList. Список
// Связный список
// LinkedList. Список
// list
// STACK HEAP
// Связный список
// LinkedList. Список
// list
// STACK HEAP
// Связный список
// LinkedList. Список
// list
// STACK HEAP
// Связный список
// LinkedList. Список
// list
// STACK HEAP
// Связный список
// LinkedList. Список
// list
// STACK HEAP
// Связный список
// LinkedList. Список
// list
// STACK HEAP
// Связный список
// LinkedList. Список
// list
// STACK HEAP
// Чем такой способ организации лучше? Или хуже?
// Добавление в середину списка.
// LinkedList. Список
// Связный список
// LinkedList. Список
// list d1 d2 d5 d3 d4
// STACK HEAP
// Связный список
// LinkedList. Список
// list d1 T d2 d5 d3 d4
// STACK HEAP
// Связный список
// LinkedList. Список
// list d1 T d2 d5 d3 d4
// STACK HEAP
// Связный список
// LinkedList. Список
// list d1 T d2 d5 d3 d4
// STACK HEAP
// Связный список
// LinkedList. Список
// list d1 T d2 d5 d3 d4
// STACK HEAP
// Чем такой способ организации лучше? Или хуже?
// Удаление из списка списка.
// LinkedList. Список
// Чем такой способ организации лучше? Или хуже?
// Удаление из списка списка.
// Еще пример.
// LinkedList. Список
// Связный список
// LinkedList. Список
// list d1 T d2 d5 d3 d4
// STACK HEAP
// Связный список
// LinkedList. Список
// list d1 T d2 d5 d3 d4
// STACK HEAP
// Связный список
// LinkedList. Список
// list d1 T d2 d5 d3 d4
// STACK HEAP
// Связный список
// LinkedList. Список
// list d1 T d2 d5 d3
// STACK HEAP
// Чем такой способ организации лучше? Или хуже?
// Что нам с этого?
// Количество операций меньше => скорость доступа к данным выше.
// Всегда ли? Доступ к элементу.
// LinkedList. Список
// Массив
// LinkedList. Список
// list d1 d3 d4 d5 d6 d6
// STACK HEAP
// Связный список
// LinkedList. Список
// list d1 T d2 d5 d3 d4
// STACK HEAP
// Чем такой способ организации лучше? Или хуже?
// Односвязный список.
// Двусвязный список.
// LinkedList. Список
// Связный список
// LinkedList. Список
// list d1 d2 d3
// STACK HEAP
// Связный список
// LinkedList. Список
// list d1 d2 d3
// STACK HEAP
// Связный список
// LinkedList. Список
// list d1 d2 d3
// STACK HEAP
// Мотивация.
// LinkedList нужен для небольшого количества
// элементов, в которых операции добавления\удаления
// встречаются чаще операций чтения.
// LinkedList. Список
// Чем такой способ организации лучше? Или хуже?
// Потренируйтесь с операциями добавления\удаление
// в двусвязном и циклическом списках.
// LinkedList. Список
// Object
// Демонстрация
// Queue
// Очередь в магазине
// Queue
// Queue<Integer> queue = new LinkedList<Integer>();
// Queue
// Queue
// 1
// Queue<Integer> queue = new LinkedList<Integer>();
// queue.add(1);
// Queue
// 1 2
// Queue<Integer> queue = new LinkedList<Integer>();
// queue.add(2);
// Queue
// 1 2 3
// Queue<Integer> queue = new LinkedList<Integer>();
// queue.add(3);
// Queue
// 1 2 3 4
// Queue<Integer> queue = new LinkedList<Integer>();
// queue.add(4);
// Queue
// 2 3 4
// Queue<Integer> queue = new LinkedList<Integer>();
// int item = queue.remove();
// Queue
// 3 4
// Queue<Integer> queue = new LinkedList<Integer>();
// int item = queue.remove();
// Queue
// 5 3 4
// Queue<Integer> queue = new LinkedList<Integer>();
// queue.add(5);
// Queue
// 5 3 4 28
// Queue<Integer> queue = new LinkedList<Integer>();
// queue.add(28);
// Queue
// 5 4 28
// Queue<Integer> queue = new LinkedList<Integer>();
// int item = queue.remove();
// Queue
// 5 28
// Queue<Integer> queue = new LinkedList<Integer>();
// int item = queue.remove();
// Queue
// 28
// Queue<Integer> queue = new LinkedList<Integer>();
// int item = queue.remove();
// Queue
// Queue<Integer> queue = new LinkedList<Integer>();
// int item = queue.remove();
// Queue<Integer> queue = new LinkedList<Integer>();
// int item = queue.remove();
// java.util.NoSuchElementException
// Queue
// Queue
// Демонстрация
// Queue
// import java.util.*;
// public class Ex002_Queue {
//  public static void main(String[] args) {
//  Queue<Integer> queue = new LinkedList<Integer>();
//  queue.add(1);
//  queue.add(2);
//  queue.add(3);
//  queue.add(4);
//  System.out.println(queue); // [1, 2, 3, 4]
//  int item = queue.remove();
//  System.out.println(queue); // [2, 3, 4]
//  queue.offer(2809);
//  item = queue.remove();
//  System.out.println(queue); // [3, 4, 2809]
//  item = queue.remove();
//  System.out.println(queue); // [4, 2809]
//  item = queue.poll();
//  System.out.println(queue); // [2809]
//  }
// }
// Queue
// import java.util.*;
// public class Ex002_Queue {
//  public static void main(String[] args) {
//  Queue<Integer> queue = new LinkedList<Integer>();
//  queue.add(1);
//  int item = queue.remove();
//  queue.offer(2809);
//  item = queue.poll();
//  System.out.println(queue);
//  }
// }
// Queue
// import java.util.*;
// public class Ex002_Queue {
//  public static void main(String[] args) {
//  Queue<Integer> queue = new LinkedList<Integer>();
//  queue.add(1);
//  int item = queue.remove();
//  queue.offer(2809);
//  item = queue.poll();
//  System.out.println(queue);
//  queue.element()
//  queue.peek()
//  }
// }
// Queue
// import java.util.*;
// public class Ex002_Queue {
//  public static void main(String[] args) {
//  Queue<Integer> queue = new LinkedList<Integer>();
//  queue.add(1);
//  int item = queue.remove();
//  queue.offer(2809);
//  item = queue.poll();
//  System.out.println(queue);
//  queue.remove(2809); // зачем очередь??
//  queue.element()
//  queue.peek()
//  }
// }
// Иерархия коллекций
// MAP
// Иерархия коллекций
// PriorityQueue
// Наивысший приоритет имеет «наименьший» элемент.
// PriorityQueue
// PriorityQueue
// Демонстрация
// Deque –
// double ended
// queue
// Линейная коллекция, которая поддерживает вставку и удаление
// элементов на обоих концах. | url
// Deque
// import java.util.*;
// public class Ex003_Deque {
//  public static void main(String[] args) {
//  Deque<Integer> deque = new ArrayDeque<>();
//  Deque<Integer> deque = new ArrayDeque<>();
//  deque.addFirst(1); deque.addLast(2);
//  deque.removeLast(); deque.removeLast();
//  deque.offerFirst(1); deque.offerLast(2);
//  deque.pollFirst(); deque.pollLast();
//  deque.getFirst(); deque.getLast();
//  deque.peekFirst(); deque.peekLast();
//  }
// }
// Deque
// Stack
// Иерархия коллекций
// Stack представляет собой обработку данных по принципу LIFO.
// Расширяет Vector пятью операциями, которые позволяют рассматривать
// вектор как стек.
// push(E item)
// pop()
// Stack
// import java.util.*;
// public class Ex004_Stack {
//  public static void main(String[] args) {
//  Stack<Integer> stack = new Stack<>();
//  stack.push(1);
//  stack.push(12);
//  stack.push(123);
//  System.out.println(stack.pop()); // 123
//  System.out.println(stack.pop()); // 12
//  System.out.println(stack.pop()); // 1
//  }
// }
// Stack
// Stack
// Демонстрация
// Stack и Vector не рекомендованы
// к использованию
// Демка
// Stack
// Вычислить значение выражения в постфиксной форме записи
// Stack
// Вычислить значение выражения в постфиксной форме записи
// 1 + 2 * 3 (1 + 2) * 3
// Stack
// Вычислить значение выражения в постфиксной форме записи
// 1 + 2 * 3 (1 + 2) * 3
// 1 2 3 * +
// Stack
// Вычислить значение выражения в постфиксной форме записи
// 1 + 2 * 3 (1 + 2) * 3
// 1 2 3 * + 1 2 + 3 *
// Stack
// Вычислить значение выражения в постфиксной форме записи
// 1 + 2 * 3 (1 + 2) * 3
// 1 2 3 * + 1 2 + 3 *
// 1 2 3 * + СТЕК
// Stack
// Вычислить значение выражения в постфиксной форме записи
// 1 + 2 * 3 (1 + 2) * 3
// 1 2 3 * + 1 2 + 3 *
// 1 2 3 * + СТЕК


// Stack
// Вычислить значение выражения в постфиксной форме записи
// 1 + 2 * 3 (1 + 2) * 3
// 1 2 3 * + 1 2 + 3 *
//  2 3 * + СТЕК
//  1

// Stack
// Вычислить значение выражения в постфиксной форме записи
// 1 + 2 * 3 (1 + 2) * 3
// 1 2 3 * + 1 2 + 3 *
//  2 3 * + СТЕК
//  1
// Stack
// Вычислить значение выражения в постфиксной форме записи
// 1 + 2 * 3 (1 + 2) * 3
// 1 2 3 * + 1 2 + 3 *
//  3 * + СТЕК
//  2
//  1
// Stack
// Вычислить значение выражения в постфиксной форме записи
// 1 + 2 * 3 (1 + 2) * 3
// 1 2 3 * + 1 2 + 3 *
//  3 * + СТЕК
//  2
//  1
// Stack
// Вычислить значение выражения в постфиксной форме записи
// 1 + 2 * 3 (1 + 2) * 3
// 1 2 3 * + 1 2 + 3 *
//  * + СТЕК
//  3
//  2
//  1
// Stack
// Вычислить значение выражения в постфиксной форме записи
// 1 + 2 * 3 (1 + 2) * 3
// 1 2 3 * + 1 2 + 3 *
//  * + СТЕК
//  3
//  2
//  1
// Stack
// Вычислить значение выражения в постфиксной форме записи
// 1 + 2 * 3 (1 + 2) * 3
// 1 2 3 * + 1 2 + 3 *
//  * + СТЕК
//  3
//  2
//  1
// Stack
// Вычислить значение выражения в постфиксной форме записи
// 1 + 2 * 3 (1 + 2) * 3
// 1 2 3 * + 1 2 + 3 *
//  * + СТЕК
//  3
//  2
//  1
// Stack
// Вычислить значение выражения в постфиксной форме записи
// 1 + 2 * 3 (1 + 2) * 3
// 1 2 3 * + 1 2 + 3 *
//  + СТЕК
//  6
//  1
// Stack
// Вычислить значение выражения в постфиксной форме записи
// 1 + 2 * 3 (1 + 2) * 3
// 1 2 3 * + 1 2 + 3 *
//  + СТЕК
//  6
//  1
// Stack
// Вычислить значение выражения в постфиксной форме записи
// 1 + 2 * 3 (1 + 2) * 3
// 1 2 3 * + 1 2 + 3 *
//  + СТЕК
//  6
//  1
// Stack
// Вычислить значение выражения в постфиксной форме записи
// 1 + 2 * 3 (1 + 2) * 3
// 1 2 3 * + 1 2 + 3 *
//  СТЕК
//  7
// Итоги
// Долго, много и не все
// нужно

