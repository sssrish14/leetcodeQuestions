class Solution {
    public int removeElement(int[] nums, int val) {
        int l=nums.length;
        int i=0;
        int temp;
        for(int j=0; j<l;j++)
        {
            if(nums[j]!=val)
            {
                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }

        }
        return i;
    }
}