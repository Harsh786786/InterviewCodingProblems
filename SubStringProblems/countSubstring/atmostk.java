import java.util.HashMap;

public class atmostk {
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

//     | Problem                                                  | Goal                                              | Approach / Formula                                                 |
// | -------------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------------------------ |
// | **Count substrings with at most K distinct characters**  | How many substrings have ≤ K distinct chars       | Sliding window. At each step: `ans += right - left + 1`            |
// | **Count substrings with exactly K distinct characters**  | How many substrings have exactly K distinct chars | `exactlyK = atMostK(k) - atMostK(k-1)`                             |
// | **Count substrings with at least K distinct characters** | How many substrings have ≥ K distinct chars       | `total substrings = n*(n+1)/2` → `atLeastK = total - atMostK(k-1)` |

}
