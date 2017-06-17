import java.util.Scanner;

/**
 * Created by lisiyang on 17/6/17.
 * https://leetcode.com/problems/nim-game/#/description
 * 292. Nim Game
 */
public class Nim_Game {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input an Integer,Quit with others");
        while (in.hasNextInt()){
            int n = in.nextInt();
            if(canWinNim(n)) System.out.println("You win!");
            else System.out.println("Try again?");
        }

    }
    public static boolean canWinNim(int n) {
        boolean res = false;
        for(int i = 1;!res && i<4;i++){
            if((n-i)%4==0) res=true;
        }
        return res;
    }
}
