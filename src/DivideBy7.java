import java.util.Scanner;

/**
 * Created by lisiyang on 17/9/14.
 * 题目描述：
 小萌非常喜欢能被 7 整除的数字，比如 7,21,121996，等等。
 有一天他得到了 n 个正整数，她想用这些数制造出更多的能够被 7 整除的数。
 于是她从这 n 个数中选出两个数，然后将一个数写在另一个数的前面，以此得到一个新的数。
 按这种方法她一共可以得到个数，她想知道在这些数中，有多少个是能被 7 整除的。
 输入
 第一行包含一个整数n。2 ≤n≤ 105
 第二行包含n个正整数ai。1 ≤ai≤109
 输出
 输出对应的答案。

 样例输入
 3
 127 1996 12
 样例输出
 4

 Hint
 一共有 4 种组合方式，其中：把 12 写在 1996 前面得到 121996；
 把 127 写在 12 前面得到12712；把 1996 写在 12 前面得到 199612；
 把 1996 写在 127 前面得到 1996127；都是可以被 7 整除的，其余的组合方式不能被 7 整除。
 */
public class DivideBy7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ai = new int[n];
        for (int i = 0;i<n;i++){
            ai[i]=in.nextInt();
        }
        int count=0;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){

                if (IsD7(ai[i],ai[j])){
                    count++;
//                    System.out.println(ai[i]+""+ai[j]);
                }
                if (IsD7(ai[j],ai[i])){
                    count++;
//                    System.out.println(ai[j]+""+ai[i]);
                }
            }
        }
        System.out.println(count);
    }
    private static boolean IsD7(int a1,int a2){

        String s = ""+a1;
        int len = s.length();
//        long num=0;
//        for(int k=0;k<s.length();k++){
//            num = num*10+s.charAt(k)-'0';
//        }
        long ans = a1+a2* (long)Math.pow(10,len);
        return ans%7==0;
    }
}
