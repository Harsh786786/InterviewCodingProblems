import java.util.HashMap;

public class kDistinctCharacter {
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
            if(map.size()==k){

            ans = Math.max(ans,right-left+1);   // just this is changed
            }

            // No atmost k distinct character  without condition
            // ans = Math.max(ans, right - left + 1);   

        }
        return ans;
    }

//     | Problem                                                   | Goal                                                 | Approach                                                                              |
// | --------------------------------------------------------- | ---------------------------------------------------- | ------------------------------------------------------------------------------------- |
// | **Longest substring with at most K distinct characters**  | Find the max length of a substring with ≤ K distinct | Sliding window, update max length every step: `ans = Math.max(ans, right - left + 1)` |
// | **Longest substring with exactly K distinct characters**  | Max length of substring with exactly K distinct      | Sliding window, update max only if `map.size() == K`                                  |
// | **Longest substring with at least K distinct characters** | Max length of substring with ≥ K distinct            | Loop `target = K..totalUnique` → use **exactlyK logic**, take max                     |

}
