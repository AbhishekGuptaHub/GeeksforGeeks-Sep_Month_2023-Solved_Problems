class Solution
{
    long maxSubarraySum(int [] arr, int n)
    {
        long maxSum = Integer.MIN_VALUE, currSum = 0;
        
        for (int i = 0; i < n; i++)
        {
            currSum += arr[i];
            maxSum = Math.max(currSum, maxSum);
            currSum = Math.max(0, currSum);
        }
        
        return maxSum;
    }
}
