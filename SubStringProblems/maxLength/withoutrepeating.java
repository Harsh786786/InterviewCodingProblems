import java.util.HashSet;

public class withoutrepeating {
    public static void main(String[] args) {
        
    }
      public static  int longestUniqueSubstr(String s) {
        int n = s.length();
        int left=0;
        int max=0;
        HashSet<Character> set = new HashSet<>();
        
        for(int right =0;right<n;right++){
            char ch = s.charAt(right);
            
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch); 
            max = Math.max(max,right-left+1); // count += right - left + 1;  if we want to count 
        }
        
        return max;
        
    }
}
