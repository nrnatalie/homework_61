import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
      List<Student> students = new ArrayList<>();
      students.add(new Student("Николай", 25));
      students.add(new Student("Виктория", 45));
      students.add(new Student("Виктория", 5));
      students.add(new Student("Антон", 25));
      students.add(new Student("Борис", 15));

      System.out.println(students);
      Collections.sort(students);
      System.out.println(students);
    }
  }
