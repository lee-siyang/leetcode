import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by lisiyang on 17/8/24.
 */
public class SetTest {
    public static void main(String args[]){
        Map<String,Integer> map = new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        map.put("Five",5);
        Set<String> set= map.keySet();
        int sum = 0;
        for (String s:set){
            sum+=map.get(s);
        }
        System.out.println(sum);
    }


}
