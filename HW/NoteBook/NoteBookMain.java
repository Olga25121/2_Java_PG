package HW.NoteBook;

/*
Задание

-Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
методы. Реализовать в java.
-Создать множество ноутбуков.
-Написать метод, который будет запрашивать у пользователя критерий (или критерии)
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
-Далее нужно запросить минимальные значения для указанных критериев - сохранить
параметры фильтрации можно также в Map.
-Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
условиям.


Здравствуйте!
Такое решение уже было на проверке, здесь оно только перекомпановано.
Рабочее решение, но не полностью соответствует заданию.
Не создано множество (Set) ноутбуков и необходимое для него переопределение методов equals и hashCode.
Также недостаток - магазин ноутбуков пустой, нечего искать.
Не предусматривается, что покупатель должен сам наполнять магазин товаром.
Сканнер нужно закрывать, а не игнорировать предупреждения.

Оценка:
Удовлетворительно
*/
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NoteBookMain {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        NoteBook notebook1 = new NoteBook("Lenovo", "Black", 8, "Intel Core i5", "GeForse 550M", "Windows 10");
        noteBook.add(notebook1);
        
        NoteBook notebook2 = new NoteBook("Asus", "White", 8, "Intel Core i7", "GeForse 440M", "Windows 10");
        noteBook.add(notebook2);

        NoteBook notebook3 = new NoteBook("Aser", "Silver", 16, "Intel Core i5", "GeForse 560M", "Windows XP))");
        noteBook.add(notebook3);

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер команды:");
            System.out.println("0. Вывести данные по ноутбукам");
            System.out.println("1. Добавить данные по ноутбуку");
            System.out.println("2. Изменить данные по ноутбуку");
            System.out.println("3. Удалить данные по ноутбуку");
            System.out.println("4. Задать фильтр");
            System.out.println("5. Выход");
            int indexComand =  scan.nextInt();

            switch (indexComand){
                case 0:{
                    printNotebook();
                    break;
                }
                case 1:{
                    addNoteBook();
                    break;
                }
                case 2:{
                    editNoteBook();
                    break;
                }
                case 3:{
                    deleteNoteBook();
                    break;
                }
                case 4:{
                    setFilter();
                    break;
                }
                case 5:{
                    return;
                }

                default:{
                    System.out.println("Вы ввели неверный номер команды!");
                    break;
                }
            }
        }
    }

    public static List<NoteBook> noteBook = new LinkedList<NoteBook>();

    private static NoteBook findNoteBook(String model){
        for (NoteBook item: noteBook){
            if (item.getModel().equals(model)) {
                return item;
            }
        }
        return null;
    }

    @SuppressWarnings("resource")
    public static void addNoteBook(){
        Scanner scn = new Scanner(System.in, "ibm866");

        String model;
        String color;
        int ram;
        String processor;
        String videocard;
        String oc;

        System.out.println("[ДОБАВЛЕНИЕ НОУТБУКА]");

        System.out.println(" >>> Введите модель:");
        model = scn.nextLine();

        System.out.println(" >>> Введите цвет:");
        color = scn.nextLine();

        System.out.println(" >>> Введите модель процессора:");
        processor = scn.nextLine();

        System.out.println(" >>> Введите модель видеокарты:");
        videocard = scn.nextLine();

        System.out.println(" >>> Введите операционную систему:");
        oc = scn.nextLine();

        System.out.println(" >>> Введите объем ОЗУ:");
        ram = scn.nextInt();

        if (findNoteBook(model) != null) {
            System.out.println("Ноутбук с такой моделью уже существует!");
        }
        else {
            NoteBook notebook = new NoteBook(model, color, ram, processor, videocard, oc);
            noteBook.add(notebook);
        }
    }

    @SuppressWarnings("resource")
    public static void editNoteBook(){
        System.out.println("[ИЗМЕНЕНИЕ НОУТБУКА]");
        System.out.println(" Введите модель ноутбука:");
        Scanner scn = new Scanner(System.in);

        String model = scn.nextLine();
        String color;
        int ram;
        String processor;
        String videocard;
        String oc;

        NoteBook notebook = findNoteBook(model);

        if (notebook == null) {
            System.out.println("Ноутбук с такой моделью не найден!");
        }
        else {
            System.out.println(" >>> Введите цвет (если не нужно редактировать данный параметр поставьте символ -):");
            color = scn.nextLine();
            if (!color.equals("-")) notebook.setColor(color);

            System.out.println(" >>> Введите модель процессора (если не нужно редактировать данный параметр поставьте символ -):");
            processor = scn.nextLine();
            if (!processor.equals("-")) notebook.setProcessor(processor);

            System.out.println(" >>> Введите модель видеокарты (если не нужно редактировать данный параметр поставьте символ -):");
            videocard = scn.nextLine();
            if (!videocard.equals("-")) notebook.setVideocard(videocard);

            System.out.println(" >>> Введите операционную систему (если не нужно редактировать данный параметр поставьте символ -):");
            oc = scn.nextLine();
            if (!oc.equals("-")) notebook.setOc(oc);

            System.out.println(" >>> Введите объем ОЗУ (если не нужно редактировать данный параметр введите -1):");
            ram = scn.nextInt();
            if (ram != -1) notebook.setRam(ram);
        }
    }

    @SuppressWarnings("resource")
    public static void deleteNoteBook(){
        System.out.println("[УДАЛЕНИЕ НОУТБУКА]");
        System.out.println(" Введите модель ноутбука:");
        Scanner scn = new Scanner(System.in);

        String model = scn.nextLine();

        NoteBook notebook = findNoteBook(model);


        if (notebook == null) {
            System.out.println("Ноутбук с такой моделью не найден!");
            return;
        }
        noteBook.remove(notebook);
    }

    public static void printNotebook(){
        System.out.println("\n" + "[СПИСОК НОУТБУКОВ]" + "\n");

        for (NoteBook item: noteBook){
            System.out.println(item.toString()+"\n");
            }
    }

    @SuppressWarnings("resource")
    public static void setFilter(){

        String model = "";
        String color = "";
        int ram = -1;
        String processor = "";
        String videocard = "";
        String oc = "";

        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);

        System.out.println("[ФИЛЬТР ДАННЫХ]");
        System.out.println(" Выберете критерий фильтра:");
        System.out.println("  >>0. Модель");
        System.out.println("  >>1. Цвет");
        System.out.println("  >>2. ОЗУ");
        System.out.println("  >>3. Процессор");
        System.out.println("  >>4. Видеокарта");
        System.out.println("  >>5. Операционная система");
        int indexComand =  scn.nextInt();
        switch (indexComand){
            case 0:{
                System.out.println("    >>>Введите модель ноутбука:");
                model = scn2.nextLine();
                break;
            }
            case 1:{
                System.out.println("    >>>Введите цвет ноутбука:");
                color = scn2.nextLine();
                break;
            }
            case 2:{
                System.out.println("    >>>Введите ОЗУ ноутбука:");
                ram = scn2.nextInt();
                break;
            }
            case 3:{
                System.out.println("    >>>Введите наименование процессора ноутбука:");
                processor = scn2.nextLine();
                break;
            }
            case 4:{
                System.out.println("    >>>Введите наименование видеокарты ноутбука:");
                videocard = scn2.nextLine();
                break;
            }
            case 5:{
                System.out.println("    >>>Введите операционную систему ноутбука:");
                oc = scn2.nextLine();
                break;
            }
            default:{
                System.out.println("Вы ввели неверный номер команды!");
                break;
            }
        }

        for (NoteBook item : noteBook){
            if (!model.equals("") && item.getModel().equals(model)) System.out.println(item.toString()+"\n");
            else
            if (!color.equals("") && item.getColor().equals(color)) System.out.println(item.toString()+"\n");
            else
            if (ram != -1 && item.getRam() == ram) System.out.println(item.toString()+"\n");
            else
            if (!processor.equals("") && item.getProcessor().equals(processor)) System.out.println(item.toString()+"\n");
            else
            if (!videocard.equals("") && item.getColor().equals(videocard)) System.out.println(item.toString()+"\n");
            else
            if (!oc.equals("") && item.getOc().equals(oc)) System.out.println(item.toString()+"\n");
        }
    }
}
