import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;


public class Main {
    private static int maxWords = 10;

    public static void main(String[] args) {
        Comparator<Person> numWordCom = ((o2, o1) -> {
            String arrWords1[] = o1.getSurname().split(" ");
            String arrWords2[] = o2.getSurname().split(" ");
            if (arrWords1.length <= maxWords && arrWords2.length <= maxWords) {
                if (arrWords1.length > arrWords2.length) {
                    return 1;
                }
                if (arrWords1.length < arrWords2.length) {
                    return -1;
                }
            }
            return Integer.compare(o1.getAge(), o2.getAge());
        });
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Шарль", "Ожье де Бац де Кастельмор", 18));
        persons.add(new Person("Арман", "де Силлег д’Атос д’Отевиль", 25));
        persons.add(new Person("Азиз", "Абдурахман ибн Хаттаб ибн Халил", 100));
        persons.add(new Person("Исаак", "де Порто", 22));
        persons.add(new Person("Aнри", "д’Арамиц", 22));
        persons.add(new Person("Петя", "Васечкин", 12));
        persons.add(new Person("Алиса","Селезнева",11));
        Collections.sort(persons, numWordCom);
        System.out.println(persons);
        Predicate<Person>owerAge=person ->person.getAge()<18;
        persons.removeIf(owerAge);
        System.out.println(persons);
    }
}