import java.util.*;

/**
* 部门树结构
时间限制：C/C++语言 2000MS；其他语言 4000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
小A在某公司上班，公司包含的部门比较多，请根据已知的数据对应关系把他们的公司部门关系列出来。
举例说明：
比如公司部门的数据对应关系如下，已按照部门层级排序：
ID        名称          上级部门ID
1         公司A          0
2         人力资源部      1
3         薪酬福利管理部  2
4         招聘部          2
列出部门的关系如下：
公司A---人力资源部---薪酬福利管理部；公司A---人力资源部---招聘部
输入
一行字符串:1,A,0;2,B,1;3,C,2;4,D,2
1,A,0分别表示部门ID、部门名称、上级部门ID；第一层级部门ID固定为1，上级部门ID为0，且只有1个根部门；
 部门数据之间使用分号分隔；部门ID和上级部门ID关联正确
要求至少输入三个部门。
如输入条件不满足，则输出“incorrect data”
输出
A-B-C;A-B-D

样例输入
1,A,0;2,B,1;3,C,1
1,A,0; B,1,2;
1,A,0;2,B,1;3,C,2;4,D,2
2,A,0; 1,B,1;3,C,2
样例输出
A-B;A-C
incorrect data
A-B-C;A-B-D
incorrect data
* */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> Id = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> superId = new ArrayList<>();
        boolean flag = true;
        while (in.hasNext()) {
            if (in.hasNextInt()) {
                Id.add(in.nextInt());
            }
            else{
                flag = false;
                System.out.println("incorrect data");
            }
            if (in.hasNext()){
                name.add(in.next());
            }
            if (in.hasNextInt()) {
                superId.add(in.nextInt());
            }
            else{
                flag = false;
                System.out.println("incorrect data");
            }

        }
        if (Id.size()<3) {
            flag = false;
            System.out.println("incorrect data");
        }

        for (int i=0;i<Id.size();i++){
            for(int j = i+1;i<Id.size();i++) {
                if (Id.get(i) == superId.get(j)) {


                }
            }
        }
//        int[] row = new int[n];
//        int[] col = new int[n];
//        for (int i = 0; i<n;i++){
//            row[i] = in.nextInt();
//        }
//        for (int i = 0;i<n;i++){
//            col[i] = in.nextInt();
//        }
//        Map<Integer,Integer[]> rowMap = new HashMap<>();
//
//        int[] result = new int[n];


//        String res = Arrays.toString(result);
//        res = res.replace("[","");
//        res =res.replace("]","");
//        res =res.replace(",","");
//        System.out.println(res);
//        for (int i:result)
//            System.out.print(i+" ");
//        int xPerDay = in.nextInt();
//        int fFruits = in.nextInt();
//        int dMoney = in.nextInt();
//        int pPerFruit = in.nextInt();
//        int maxDay = 0;
//        maxDay = Math.min(fFruits,dMoney/xPerDay);
//        dMoney -= maxDay*xPerDay;
//        if (dMoney>0) {
//            maxDay += dMoney / (xPerDay + pPerFruit);
//        }
//        System.out.println(maxDay);


//        int[] nums = new int[n];
//        String str = in.next();
//        while (in.hasNext()){
//
//        }
    }

    private int[] avg(int[] nums,int j){
        int len = nums.length;
        int[][] ranks = new int[len][2];
        for (int i=0;i<nums.length;i++){
            ranks[i][0] = i;
            ranks[i][1] = nums[i];
        }
        Arrays.sort(ranks, (a, b) -> (a[1]-b[1]));
        int sum = 0;
        int[] res = new int[j+1];
        for (int i =0;i<j;i++){
            sum+=ranks[i][1];
            res[i] = ranks[i][0];
        }

        res[j] = sum/j;

        return res;
    }
}
