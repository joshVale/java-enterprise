public class Lesson7 {
    public static int indSymbolOccurance(String s,char ch){
        int count =0;
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i)==ch) {
                count++;
            }
        }
        return count;
    }
    public static int findWordPosition(String source,String target){
        for(int i=0;i<source.length();i++){
            String tmp = "";
            for(int j=i;j<source.length();j++){
                tmp+=source.charAt(j);
                if (tmp.equals(target)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static String stringReverse(String s){
        StringBuilder ans = new StringBuilder(s);
        return ans.reverse().toString();
    }

    public static boolean  isPalindrome(String s){
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
}
