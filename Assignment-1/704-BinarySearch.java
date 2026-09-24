class Solution {
    public int search(int[] nums, int x) {
        int s = 0;
        int e = nums.length - 1;
        while(s <= e){
            int mid = (s + e) / 2;
            if(nums[mid] == x){
                return mid;
            }else if(nums[mid] > x){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return -1;
    }
}