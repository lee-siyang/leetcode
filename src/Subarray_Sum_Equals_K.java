import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by lisiyang on 17/7/3.
 */
public class Subarray_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {
        if (nums.length<2){
            if (nums.length==0) {
                return 0;
            }
            if (nums.length==1){
                return nums[0]==k?1:0;
            }
        }
        List<Integer> numsList=new ArrayList<>();
        Map<Integer,Integer> map= new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            numsList.add(nums[i]);
        }
        for (int i=0;i<nums.length;i++){
            for (int j =i+1;j<=nums.length;j++){
                List<Integer> sub = numsList.subList(i,j);
                int sum = sum(sub);
                if (map.get(sum)==null){
                    map.put(sum,1);
                }
                else {
                    Integer count = map.get(sum);
                    count++;
                    map.put(sum,count);
                }
            }
        }
        return map.get(k)==null?0:map.get(k);
    }

    private int sum(List<Integer> list){
        int sum = 0;
        for(Integer i: list){
            sum+=i;
        }
        return sum;
    }
}
