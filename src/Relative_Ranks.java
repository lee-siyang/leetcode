import java.util.Arrays;

/**
 * Created by lisiyang on 17/6/26.
 * https://leetcode.com/problems/relative-ranks/#/description
 * 506. Relative Ranks
 */
public class Relative_Ranks {
    public static void main(String[] args) {
        int[] nums = {10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeRanks(nums)));
    }
    public static String[] findRelativeRanks(int[] nums) {
        int[][] ranks=new int[nums.length][2];
        for (int i=0;i<nums.length;i++){
            ranks[i][0] = i;
            ranks[i][1] = nums[i];
        }
        Arrays.sort(ranks, (a, b) -> (b[1] - a[1]));
        for (int i=0;i<nums.length;i++)
            System.out.println(Arrays.toString(ranks[i]));

        String[] res = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            switch (i){
                case 0:res[ranks[i][0]]="Gold Medal";break;
                case 1:res[ranks[i][0]]="Silver Medal";break;
                case 2:res[ranks[i][0]]="Bronze Medal";break;
                default:res[ranks[i][0]]=""+(i+1);break;
            }

//            if (i==0)
//                res[ranks[i][0]]="Gold Medal";
//            else if (i==1)
//                res[ranks[i][0]]="Silver Medal";
//            else if (i==2)
//                res[ranks[i][0]]="Bronze Medal";
//            else res[ranks[i][0]]=""+(i+1);
        }
        return res;
    }
}
