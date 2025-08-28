import java.util.HashMap;

public class kDistinctCharacters {
    public static void main(String[] args) {
        
    }

     public static  int atmostK(String s,int k){
        int n = s.length();
        int ans=0;
        int left=0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int right=0;right<n;right++){
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c,0)+1);

            while(map.size()>k){
                char ch = s.charAt(left);
                map.put(ch, map.get(ch)-1);

                if(map.get(ch)==0){
                map.remove(ch);
                }
                left++;
            }

            ans += right-left+1;

        }
        return ans;
    }
    public static  int countSubstr(String s, int k) {
        int ans = atmostK(s,k)-atmostK(s,k-1);
        
        return ans;
        
    }
}
