/**
 * Created by lisiyang on 17/7/1.
 * https://leetcode.com/problems/student-attendance-record-i/#/description
 * 551. Student Attendance Record I
 */
public class Student_Attendance_Record_I {
    public static void main(String[] args){
        String s = "PPLALLP";
        System.out.println(checkRecord(s));
    }
    public static boolean checkRecord(String s) {
//        one line ...T^T
//        return !s.matches(".*LLL.*|.*A.*A.*");
        if (s==null || s.length()==0)
            return false;
        String slow = s.toLowerCase();
        int[] alpCount = new int[2];
        for (int i = 0;i<slow.length();i++){
            switch (slow.charAt(i)){
                case 'a' : {
                    alpCount[0]++;
                    if (alpCount[0]>1)
                        return false;
                    break;
                }
                case 'l' : {
                    if (i>0 && slow.charAt(i-1)=='l') {
                        alpCount[1]++;
                        if (alpCount[1]>2)
                            return false;
                    }
                    else alpCount[1]=1;
                    break;
                }
//                case 'p' : alpCount[2]++;break;
            }
        }
        return true;
    }
}
