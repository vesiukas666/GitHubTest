import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Uzduotis1 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Darius");
        names.add("Kestas");
        names.add("Paulius");
        names.add("Justina");
        names.add("Inga");

        names.stream().filter(a -> a.length() > 6).forEach(System.out ::println);
        getFirst(names);
        System.out.println(getFirst(names));
        getFirst(names);
        System.out.println(getLast(names));

        }
     private static String getFirst(List<String> names){
        return names.get(0);
    }

    private static String getLast(List<String> names){
        return names.get(names.size() - 1);
    }





    }

