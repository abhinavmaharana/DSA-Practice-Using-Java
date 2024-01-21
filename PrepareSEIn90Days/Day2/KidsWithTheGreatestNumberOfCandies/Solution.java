package PrepareSEIn90Days.Day2.KidsWithTheGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int max = candies[0];

        for (int i = 1; i < candies.length; i++) {
            if (candies[i] >= max){
                max = candies[i];
            }
        }

        for (int value: candies) {
            result.add(value + extraCandies >= max);
        }

        return result;

    }
}
