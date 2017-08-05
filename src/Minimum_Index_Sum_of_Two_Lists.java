import java.util.*;

/**
 * Created by lisiyang on 17/6/21.
 * https://leetcode.com/problems/minimum-index-sum-of-two-lists/description/
 * 599. Minimum Index Sum of Two Lists
 */
public class Minimum_Index_Sum_of_Two_Lists {
    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};
        System.out.println(findRestaurant(list1, list2)[0]);
    }
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> l1 = new HashMap<>();
        List<String> result = new LinkedList<>();
//        Map<String, Integer> l2 = new HashMap<>();
        for (int i = 0;i<list1.length;i++){
            l1.put(list1[i],i);
        }
//        for (int i =0;i<list2.length;i++){
//            l2.put(list2[i],i);
//        }
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i<list2.length;i++){
            Integer j = l1.get(list2[i]);
            if (j != null && i+j<=min){
                if (i+j<min){
                    result = new LinkedList<>();
                    min = i+j;
                }
                result.add(list2[i]);
            }
        }
        return result.toArray(new String[result.size()]);
//        for (Map.Entry<String, Integer> entry1 :l1.entrySet()){
//            for (Map.Entry<String, Integer> entry2 : l2.entrySet()){
//                if (entry1.getKey().equals(entry2.getKey())
//                        && min >= entry1.getValue()+entry2.getValue()){
//                    if (min > entry1.getValue()+entry2.getValue()){
//                        result = new LinkedList<>();
//                        min = entry1.getValue()+entry2.getValue();
//                    }
//                    result.add(entry1.getKey());
//                }
//            }
//        }
//        return result.toArray(new String[result.size()]);
//        ArrayList<String> minList = new ArrayList<>();
////        int findMin = list1.length+list2.length;
////        String[] res = new String[Math.min(list1.length,list2.length)];
//        int findMin = list1.length+list2.length;
//        String[] res = new String[Math.min(list1.length,list2.length)];
//        int count = 0;
//        for (int i = 0 ;i< list1.length;i++){
//            for (int j = 0;j<list2.length;j++){
//                if (list1[i].equals(list2[j]) && Math.min(findMin,i+j)==i+j) {
//                    if (i+j==findMin) {
//                        count++;
//                    }
//                    findMin = i+j;
//                    res[count] = list1[i];
//                }
//
//            }
//        }
//        return res;
    }
}
