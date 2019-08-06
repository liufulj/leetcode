public class Solution {

    /**
     *给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
     * @param nums
     * @return
     */
    public  int singleNumber(int[] nums) {
        int value = nums[0];
        for(int i = 1; i<nums.length;i++){
            value ^= nums[i];
        }
        return value;
    }

    /**
     * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
     * 你可以假设数组是非空的，并且给定的数组总是存在众数
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int count = 0;
        int value = 0;
        for(int x:nums) {
            if(count == 0){
                value = x;
                count = 1;
            } else if(value == x){
                count++;
            } else {
                count--;
            }
        }
        return value;
    }
}
