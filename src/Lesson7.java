public class Lesson7 {
    public static int indSymbolOccurance(String s,char ch){
        int count =0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==ch)count++;
        }
        return count;
    }
    public static int findWordPosition(String source,String target){
        for(int i=0;i<source.length();i++){
            String tmp = "";
            for(int j=i;j<source.length();j++){
                tmp+=source.charAt(j);
                if(tmp.equals(target))return i;
            }
        }
        return -1;
    }
    public static String stringReverse(String s){
        String ans = "";
        for(int i=s.length()-1;i>-1;i--){
            ans+=s.charAt(i);
        }
        return ans;
    }

    public static boolean  isPalindrome(String s){
        if(s.equals(stringReverse(s)))return true;
        return false;
    }
}
