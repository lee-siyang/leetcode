import java.util.Arrays;

/**
 * Created by lisiyang on 17/8/12.
 */
public class tttt {
    public static void main(String[] args){
        int[] ints = {4,5,6,7,8,6};
        String res = Arrays.toString(ints);
        res = res.replace("[","");
        res =res.replace("]","");
        res =res.replace(",","");
        System.out.println(res);
        for (int i:ints){
            System.out.print(i +" ");
        }
//        System.out.println(Arrays.toString(ints));
    }
}
