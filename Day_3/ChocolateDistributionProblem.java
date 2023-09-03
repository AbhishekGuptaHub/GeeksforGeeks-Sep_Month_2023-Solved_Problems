class Solution
{
    public long findMinDiff(ArrayList<Integer> a, int n, int m)
    {
        int minDiff = Integer.MAX_VALUE;
        
        Collections.sort(a);
        
        int i = 0;
        
        while (m + i - 1 < n)
        {
            minDiff = Math.min((a.get(m + i - 1) - a.get(i)), minDiff);
            i++;
        }
        
        return minDiff;
    }
}
