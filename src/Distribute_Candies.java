import java.util.Arrays;

/**
 * Created by lisiyang on 17/6/15.
 */
public class Distribute_Candies {
    public static void main(String[] args) {
        int[] candies = {1000,1000,2,1,2,3};
        System.out.println(distributeCandies(candies));
//        System.out.println(candies.length);
//        System.out.println(Arrays.toString(candies).replace(", ","").substring(1,7));
    }
    public static int distributeCandies(int[] candies) {
        int len = candies.length;
//        String cand = Arrays.toString(candies).replace(", ","").substring(1,len+1);
//        String res = cand.substring(0,1);
        int countDiffNum = (int)Arrays.stream(candies).distinct().count();

//        for(int i =1;i<len;i++){
//            if(!res.contains(cand.substring(i,i+1))){
//                res+=cand.substring(i,i+1);
//                countDiffNum++;
//            }
//        }
        if(countDiffNum>=len/2)
            return len/2;
        return countDiffNum;
    }
}
