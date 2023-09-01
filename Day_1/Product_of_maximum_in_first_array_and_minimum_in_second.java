class Solution
{
    public static long find_multiplication(int [] arr, int [] brr, int n, int m)
    {
        int maxEle = Integer.MIN_VALUE;
        
        for (int ele : arr)
        {
            maxEle = Math.max(ele, maxEle);
        }
        
        int minEle = Integer.MAX_VALUE;
        
        for (int ele : brr)
        {
            minEle = Math.min(ele, minEle);
        }
        
        return maxEle * minEle;
    }
}
