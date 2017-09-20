import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by lisiyang on 17/8/11.
 */
public class MaterialCount {
//    private String strings;
//    public MaterialCount(String strs){
//        strings  = strs;
//    }
//    public int Mcount(){
//        String[] mStrings = strings.split(" ");
//        Set<String> stringSet = new HashSet<>();
//            for (int j = 0;j<mStrings.length;j++){
//                if (!mStrings[j].isEmpty()){
//                    stringSet.add(mStrings[j]);
//                }
//            }
//        return stringSet.size();
////        for (int i = 0;i<strings.length;i++)
//    }
    public static void main(String... args){
        Scanner in = new Scanner(System.in);
        Set<String> stringSet = new HashSet<>();
        while (in.hasNext()){
            stringSet.add(in.next());
        }
        System.out.println(stringSet.size());
    }
}
