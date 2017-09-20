import java.util.Scanner;

/**
 * Created by lisiyang on 17/9/10.
 */
public class UncoverDistance {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int count = 0;
        int length=0;
        boolean isSame=false ;
        int[] save = new int[n];
        int k=0;
        for (int i=0;i<n;i++){
            a[i] = in.nextInt();
//            if (a[i]==0){
//                count++;
//            }

            if (i>0 && a[i]==a[i-1]){
                    isSame = true;
                    length++;

            }
            else if (isSame){
                isSame = false;
                save[k++]=length;
                length = 0;
            }

        }
        for (int i=0;i<n;i++){
            if (save[i]!=0){
                count++;
            }
            if (i>0 && i<n-1){
                if (a[i-1]!=0 && a[i]==0 && a[i+1]!=0){
                    count++;
                }
            }
            if (i==1 && a[0]==0 && a[i]!=0||i==n-1 && a[i]==0 && a[i-1]!=0){
                count++;
            }
        }

        System.out.println(count);
    }
}
