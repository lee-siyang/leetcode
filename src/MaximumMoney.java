import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by lisiyang on 17/8/25.
 */
public class MaximumMoney {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int nTables = in.nextInt();
        int mTimes = in.nextInt();
        int[] aMaxClients = new int[nTables];
        for (int i = 0;i<nTables;i++){
            aMaxClients[i] = in.nextInt();
        }
        int[] bClients = new int[mTimes];
        int[] cMoney = new int[mTimes];
        for (int i = 0;i<mTimes;i++){
            bClients[i] = in.nextInt();
            cMoney[i] = in.nextInt();
        }

        Map<Integer,Integer> ClientMoneymap = new HashMap<>();
        for (int i = 0;i<mTimes;i++){

//            ClientMoneymap.put(bClients[i],Math.max(cMoney[i],ClientMoneymap.getOrDefault(bClients[i],cMoney[i])));
//            ClientMoneymap.getOrDefault(bClients[i],cMoney[i]);
        }


    }
}
