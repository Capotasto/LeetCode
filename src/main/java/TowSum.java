import java.util.HashMap;
import java.util.Map;

/**
 * Created by Capotasto on 7/17/17.
 */
public class TowSum {

    public static int[] answer1(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int[] answer2(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < map.size(); i++) {
            int resultNum = target - nums[i];
            if (map.containsKey(resultNum) && map.get(resultNum) != i) {
                result[0] = i;
                result[1] = map.get(resultNum);
                return result;
            }
        }
        return result;
    }
}
