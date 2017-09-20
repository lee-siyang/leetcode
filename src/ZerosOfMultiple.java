import java.util.Scanner;

/**
 * Created by lisiyang on 17/8/26.
 */
public class ZerosOfMultiple {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int number5 = 0;
        while (n>=5){
            n /= 5;
            number5++;
        }
        System.out.println();
    }
}
