package 1-D_DP;

public class HouseRobbers2 {
    public int rob(int[] nums) {
        int n= nums.length;
        if(n==0)return 0;
        if(n==1) return nums[0];
        return Math.max(robingAlgo(nums,1,n-1),robingAlgo(nums,0,n-2));
    }

    public int robingAlgo(int[] nums,int start, int end){
        int prev =0;
        int curr =0;
        for(int i= start;i<=end;i++){
            int temp=Math.max(prev+nums[i],curr);
            prev=curr;
            curr=temp;
        }
        return curr;
    }
}
