class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int cursm=0;
        int maxsm=INT_MIN;
        for(int val: nums)
        {
            cursm+=val;
            maxsm=max(cursm,maxsm);
            if(cursm<0)
            cursm=0;
        }
    return maxsm;
    }
};
