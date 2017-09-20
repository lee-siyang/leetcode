import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lisiyang on 17/9/20.
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
 */
public class TreeStruct {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        boolean flag = true;
        String s = in.next();
        String[] strings = s.split(";");
        if (strings.length<3){
            flag = false;
            System.out.println("incorrect data");
        }
        if(flag) {
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].charAt(4) == 0) {
                    String root = strings[i];
                    System.out.print("" + root.charAt(2));
                    for (int j = 0; j < strings.length; j++) {
                        if (strings[j].charAt(4) == 1) {
                            System.out.print("-" + strings[j].charAt(2) + ";");
                        }
                    }
                }
            }
        }
    }
}
