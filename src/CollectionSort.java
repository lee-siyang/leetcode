import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by lisiyang on 17/7/2.
 */
public class CollectionSort {
    public static void main(String[] args){
        List<Person> personList = new ArrayList<>();
        Person lee = new Person("Lee",26);
        Person zhou = new Person("Zhou",29);
        Person tian = new Person("Tian",26);
        Person wang = new Person("Wang",32);
        personList.add(lee);
        personList.add(zhou);
        personList.add(tian);
        personList.add(wang);
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int ageCompare = o1.getAge().compareTo(o2.getAge());
                if (ageCompare==0){
                    return o1.getName().compareTo(o2.getName());
                }
                return ageCompare;
            }
        });
        for (Person p:personList){
            System.out.println(p.getName()+" "+p.getAge());
        }
    }
}
