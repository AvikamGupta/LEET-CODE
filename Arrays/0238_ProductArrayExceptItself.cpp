class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n=nums.size();
        vector<int>ans(n,1);
        vector<int>Prefix(n,1);
        vector<int>Suffix(n,1);
        //prefix
        for(int i=1;i<n;i++)
        {
           int pr=1;
           Prefix[i]=Prefix[i-1]*nums[i-1];
        }
        //suffix
        for(int i=n-2;i>=0;i--)
        {
           int pr=1;
           Suffix[i]=Suffix[i+1]*nums[i+1];
        }
        //ans
        for(int i=0;i<n;i++)
        {
            ans[i]=Prefix[i]*Suffix[i];
        }
    return ans;
    }
};
