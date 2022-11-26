import java.util.Comparator;

public class NamberWordsComparator implements Comparator<Person> {
    int maxWords;

    public NamberWordsComparator(int maxWords) {
        this.maxWords = maxWords;//максимально кол-во слов в фамилии
    }

    @Override
    public int compare(Person o2, Person o1) {
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
    }
}
