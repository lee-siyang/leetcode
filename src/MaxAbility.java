import java.util.*;

/**
 * Created by lisiyang on 17/8/30.
 * 牛客网编程题
 * n个学生站成一排，每个学生有其各自的能力值，
 * 从中选出k个位置编号相差不超过d的学生，
 * 使其能力值乘积最大。
 */
public class MaxAbility {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] nums = new int[n][2];
        for (int i = 0; i<n; i++){
            nums[i][0] = i;
            nums[i][1] = in.nextInt();
        }
        int k = in.nextInt();
        int d = in.nextInt();

        Arrays.sort(nums, (a, b) -> (b[1]-a[1]));
        for (int i =0;i<n;i++){
            System.out.println(nums[i][0]+" "+nums[i][1]);
        }
//        Map<Integer, Integer> map = new TreeMap<>();
//        for (int i = 0;i<k;i++){
//            map.put(nums[i][0],nums[i][1]);
//        }
//
//        Set<Integer> key = map.keySet();
//
//        int previous = -1;
//        for (int kk:key){
//            System.out.println(kk+" "+map.get(kk));
//            if (previous!=-1){
//                if (kk-previous>d)
//            }
//
//        }
        List<Integer> maxNum = new ArrayList<>();
        maxNum.add(nums[0][1]);
        for (int i = 1;i<k;i++){
            if (nums[i][0]-nums[i-1][0]<=d) {
                maxNum.add(nums[i][1]);
            }
            else {
//                k=k+1;
                k += maxNum.size();
                maxNum = new ArrayList<>();
            }
        }

        int result = 1;
        for (int i : maxNum){
            result *= i;
        }

        System.out.println(result);
    }
}
