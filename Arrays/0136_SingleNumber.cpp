class Solution {
public:
    int singleNumber(vector<int>& nums) {//using xor property
        int ans=0;
        for(int i: nums)
        ans=ans^i;
        return ans;
    }
};
