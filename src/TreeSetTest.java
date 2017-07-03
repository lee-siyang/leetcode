import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by lisiyang on 17/7/3.
 */
public class TreeSetTest {
    public static void main(String[] args){
        System.out.println();
        Person lee = new Person("Lee",26);
        Person zhou = new Person("Zhou",29);
        Person tian = new Person("Tian",26);
        Person wang = new Person("Wang",32);
        Set<Person> personTreeSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.getAge().compareTo(o2.getAge());
                if (result==0){
                    result = o1.getName().compareTo(o2.getName());
                }
                return result;
            }
        });
        personTreeSet.add(lee);
        personTreeSet.add(zhou);
        personTreeSet.add(tian);
        personTreeSet.add(wang);

        for (Person p: personTreeSet){
            System.out.println(p.getName() + " "+ p.getAge());
        }
    }

}
