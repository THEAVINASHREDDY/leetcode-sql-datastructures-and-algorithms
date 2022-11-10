class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        ans[0]=searching(nums,target,true);
        if(ans[0]!=-1)
            ans[1]=searching(nums,target,false);
        return ans;
    }
    int searching(int[] nums,int target,boolean findStartIndex){
        int start=0,end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (target<nums[mid])
                end=mid-1;
            else if(target>nums[mid])
                start=mid+1;
            else{
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}