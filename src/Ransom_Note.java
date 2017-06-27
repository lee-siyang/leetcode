/**
 * Created by lisiyang on 17/6/25.
 * https://leetcode.com/problems/ransom-note/#/description
 * 383. Ransom Note
 */
public class Ransom_Note {
    public static void main(String[] args) {
        String ransomNote = "fihjjjjei";
//        String[] res = new String[10];
        String magazine = "hjibagacbhadfaefdjaeaebgi";
        System.out.println(canConstruct(ransomNote,magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] alpha = new int[26];
        for (int i=0;i<magazine.length();i++){
            alpha[magazine.charAt(i)-'a']++;
        }
        for (int i=0;i<ransomNote.length();i++){
            if (--alpha[ransomNote.charAt(i)-'a']<0)
                return false;
        }
        return true;
        //        LOSE
//        int count=0;
//        for (int i = 0;i<magazine.length()&& count<ransomNote.length();){
//            if (ransomNote.contains(magazine.substring(i,i+1))){
//                magazine = magazine.substring(i+1);
//                count++;
//                i=0;
//            }
//            else i++;
//        }
//        return count==ransomNote.length();
    }
}
