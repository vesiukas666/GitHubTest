import java.net.SocketTimeoutException;
import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<Integer> number = new HashSet<>();
        number.add(12);
        number.add(34);
        number.add(54);
        number.add(123);


        number.forEach(System.out :: println);

        Person p = new Person("Darius", "Vesa", 39);

        Set<Person> persons = new HashSet<>();
        persons.add(p);
        persons.add(new Person("Jonas","Jonaitis", 32));
        persons.add(p);

        persons.forEach(a -> System.out.println(a.getName() + " " + a.getSurname() + " " +a.getAge()));
    }
}
