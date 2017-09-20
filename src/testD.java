/**
 * Created by lisiyang on 17/9/10.
 */
public class testD {
    public static void main(String[] args){
        int[] arr = {3,0,2,2};
        int res = compute(arr);
        System.out.println(res);
    }

    private static int compute(int[] arr){
        int count=0;
        int i=0;
        while (i<arr.length-1){
            if (arr[i]==0){
                count++;
                i++;
                continue;
            }
            else if (arr[i]==arr[i+ 1]){
                count++;
                i+=2;
                continue;
            }
            i++;
        }
        return count;
    }
}
