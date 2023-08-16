                             # Kadane's Algorithm
To find the sum of the subarray

import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0;
        int maxi = nums[0];
        //int max;

        for(int i=0; i<nums.length; i++){

            sum = sum + nums[i];

            maxi =  Math.max(maxi,sum);

            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
}
