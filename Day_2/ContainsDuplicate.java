class Solution
{
    public boolean containsDuplicate(int [] nums)
    {
        if (nums.length == 1)
        {
            return false;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int ele : nums)
        {
            set.add(ele);
        }

        return !(nums.length == set.size());
    }
}
