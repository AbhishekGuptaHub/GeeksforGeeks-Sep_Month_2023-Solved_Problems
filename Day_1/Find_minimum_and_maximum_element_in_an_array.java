class Compute
{
    static Pair getMinMax(long [] a, long n)
    {
        Pair ans = new Pair(Long.MAX_VALUE, Long.MIN_VALUE);
        
        for (long ele : a)
        {
            ans.first = Math.min(ele, ans.first);
            ans.second = Math.max(ele, ans.second);
        }
        
        return ans;
    }
}
