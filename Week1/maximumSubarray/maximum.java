package Week1.maximumSubarray;

public class maximum {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        
        for(int el : nums){
            curr_sum += el;
            
            if(curr_sum > max_sum){
                max_sum = curr_sum;
            }
            if(curr_sum < 0){
                curr_sum = 0;
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        maximum m = new maximum();
        System.out.println(m.maxSubArray(nums));
    }
}
