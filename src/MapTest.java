import java.util.HashMap;
import java.util.Map;

/**
 * Created by lisiyang on 17/7/2.
 */
public class MapTest {
    public static void main(String[] args){
        String str = "sdfwesdgh";
        char search = 's';
        System.out.println(CountCharTimes(str,search));
    }
    public static int CountCharTimes(String s,char c){
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0;i<s.length();i++){
            Integer charCount = map.get(s.charAt(i));
            if (charCount==null){
                map.put(s.charAt(i),1);
            }
            else {
                charCount++;
                map.put(s.charAt(i),charCount);
            }
        }
        return map.get(c);
    }
}
