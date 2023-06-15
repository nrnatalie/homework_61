import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
//Задача 1
//Используйте класс Student из урока 42 (см. Student.java).
//
//Создайте список учеников с баллами.
//
//Попросите пользователя ввести минимальный проходной балл.
//
//Выведите список учеников согласно следующим условиям:
//
//каждый ученик выведен в отдельной строке
//баллы каждого ученика выше минимального проходного
//ученики отсортированы по убыванию среднего балла
//в списке не больше 10 учеников (извините, конкурс)
//Для обработки и вывода результата используйте потоки (Stream).
//
//Примечание
//Cортировка потока выполняется при помощи промежуточного метода sorted(Comparator<? super T> comparator).
//
//В качестве компаратора используйте лямбда-функцию.

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Student> students = new ArrayList<>();
    students.add(new Student("Николай", 25));
    students.add(new Student("Светлана", 45));
    students.add(new Student("Виктория", 5));
    students.add(new Student("Антон", 23));
    students.add(new Student("Борис", 15));

    System.out.println(students);
    Collections.sort(students);
    System.out.println(students);
    System.out.println("Введите минимальны проходной балл:");
    Stream.generate(scanner:: nextInt);
    //int ball = scanner.nextInt();
    //System.out.println(ball);

    Stream.of(25, 45, 5, 23, 15)    // создание
        .map(x -> x * x)                // преобразование
        .forEach(System.out::println);  // потребление - терминальный оператор

// получае список студентов
    List<String> students2 = List.of("Виктория, Борис, Антон, Николай, Светлана");
    //List<Integer> value = students2.stream()
       // .map(b -> new Student(b, "Непонятно", b.length() * 2));
   // students2.stream()
       // .mapToInt(Student :: getName)
       // .summaryStatistics();
    System.out.println();



  }
}

