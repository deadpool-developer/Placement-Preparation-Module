package Week1.FindDuplicate;
class First {
    //Tortoise and Hare algorithm
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        
        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int nums[] = {1,4,2,5,6,9,9,3,7,8};
        First f = new First();
        System.out.println(f.findDuplicate(nums));
        
    }
}