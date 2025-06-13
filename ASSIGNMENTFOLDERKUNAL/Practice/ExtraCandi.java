import java.util.ArrayList;
import java.util.List;

public class ExtraCandi {

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example input
        int[] candies = {4,2,1,1,2
        };  // Array of candies each child has
        int extraCandies = 1;             // Extra candies each child can receive

        // Call the method and get the results
        List<Boolean> results = solution.kidsWithCandies(candies, extraCandies);

        // Print the results
        System.out.println("Can kids have the greatest number of candies? " + results);
    }
}

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;

        // Find the maximum number of candies a child currently has
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        // Create a list to store the results
        List<Boolean> result = new ArrayList<>();

        // Check if each child can have the greatest number of candies
        for (int candy : candies) {
            // Check if this child can achieve the max candies
            result.add(candy + extraCandies >= maxCandies);
        }

        return result; // Return the list of results
    }
}
