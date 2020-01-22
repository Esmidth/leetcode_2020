import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_len = 0;
        int len = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++)
        {
            if(map.get(s.charAt(i)) == null)
            {
                map.put(s.charAt(i), i);
                len++;
            }
            else{
                i = map.get(s.charAt(i));
                if(len > max_len)
                {
                    max_len = len;
                }
                len = 0;
                map.clear();
            }
        }
        if(len > max_len)
        {
            max_len = len;
        }
        return max_len;
    }
}
// @lc code=end

