import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Шарль", "Ожье де Бац де Кастельмор", 18));
        persons.add(new Person("Арман", "де Силлег д’Атос д’Отевиль", 25));
        persons.add(new Person("Азиз", "Абдурахман ибн Хаттаб ибн Халил", 100));
        persons.add(new Person("Исаак", "де Порто", 22));
        persons.add(new Person("Aнри", "д’Арамиц", 22));
        persons.add(new Person("Петя", "Васечкин", 12));
        Collections.sort(persons,new NamberWordsComparator(10));
        System.out.println(persons);
    }
}