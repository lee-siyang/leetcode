import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lisiyang on 17/6/21.
 */
public class Minimum_Index_Sum_of_Two_Lists {
    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};
        System.out.println(findRestaurant(list1, list2)[0]);
    }
    public static String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> minList = new ArrayList<>();
//        int findMin = list1.length+list2.length;
//        String[] res = new String[Math.min(list1.length,list2.length)];
        int findMin = list1.length+list2.length;
        String[] res = new String[Math.min(list1.length,list2.length)];
        int count = 0;
        for (int i = 0 ;i< list1.length;i++){
            for (int j = 0;j<list2.length;j++){
                if (list1[i].equals(list2[j]) && Math.min(findMin,i+j)==i+j) {
                    if (i+j==findMin) {
                        count++;
                    }
                    findMin = i+j;
                    res[count] = list1[i];
                }

            }
        }
        return res;
    }
}
