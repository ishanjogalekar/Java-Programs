import java.util.*;
class Findduplicate {
    public int findDuplicate(int[] nums) {
         int n = nums.length-1, res = 0;
        for (int p = 0; p < 32; ++ p) {
            int bit = (1 << p), a = 0, b = 0;
            for (int i = 0; i <= n; ++ i) {
                if (i > 0 && (i & bit) > 0) ++a;
                if ((nums[i] & bit) > 0) ++b;
            }
            if (b > a) res += bit;
        }
        return res;
    }
}
