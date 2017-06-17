/**
 * Created by lisiyang on 17/6/13.
 */
import java.util.Scanner;
public class doWhileTest {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int inputNum=0;

        // System.out.print("Enter an integer >=1 and <=10: "); //use this for the prompt
        do{
            System.out.print("Enter an integer >=1 and <=10: ");
            inputNum = in.nextInt();

        }while(inputNum<1 || inputNum >10);
        System.out.print(inputNum);

    }
}
