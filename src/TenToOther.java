import java.util.Scanner;

/**
 * Created by lisiyang on 17/8/26.
 * 给定一个十进制数M，以及需要转换的进制数N。将十进制数M转化为N进制数
 */
public class TenToOther {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        StringBuilder sb = new StringBuilder();
        while (m != 0){
            sb.append(m%n);
            m /= n;
        }
        sb = sb.reverse();
        System.out.println(new String(sb));
    }
    /*
    * public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int radix = in.nextInt();
        char[] chars = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        boolean negative = false;
        if (num < 0) negative = true;
        StringBuilder sb = new StringBuilder();
        num = Math.abs(num);
        while (num >= radix) {
            sb.insert(0, chars[num % radix]);
            num /= radix;
        }
        sb.insert(0, chars[num]);
        System.out.println((negative ? "-" : "") + sb.toString());
    }
    * */
}
