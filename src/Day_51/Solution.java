package Day_51;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().lexicalOrder(3));
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> al = new ArrayList<>();
        int curr = 1;
        for(int i=1; i<=n; i++)
        {
            al.add(curr);
            if(curr*10<=n)
                curr = curr*10;
            else
            {
                while(curr%10==9 || curr>=n)
                {
                    curr = curr/10;
                }
                curr += 1;
            }
        }
        return al;

    }
}
