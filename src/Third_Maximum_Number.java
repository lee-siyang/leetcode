import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by lisiyang on 17/8/3.
 * https://leetcode.com/problems/third-maximum-number/description/
 * 414. Third Maximum Number
 */
public class Third_Maximum_Number {
    public int thirdMax(int[] nums) {
        if (nums==null) return 0;
        Set<Integer> integers = new TreeSet<>();
        for (Integer i:nums){
            integers.add(i);
        }
        List<Integer> list = new ArrayList<>();
        list.addAll(integers);
//        for (Integer i:list){
//            System.out.println(i);
//        }
//        System.out.println(list.size());
        if (list.size()<3){
            return list.get(list.size()-1);
        }
        else return list.get(list.size()-3);
//        for (Integer i:integers){
//            System.out.println(i);
//        }
//        if (integers.size()<3){
//            return integers.
//        }
//        return 0;
    }
    public static void main(String[] args){
        Third_Maximum_Number third = new Third_Maximum_Number();
        int[] nums = {5,3};

        System.out.println(third.thirdMax(nums));
    }
}
