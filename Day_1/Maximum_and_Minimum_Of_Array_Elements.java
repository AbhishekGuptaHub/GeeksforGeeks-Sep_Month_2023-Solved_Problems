import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    static int minimumElement(int [] arr)
    {
        int minEle = Integer.MAX_VALUE;
        
        for (int ele : arr)
        {
            minEle = Math.min(ele, minEle);
        }
        
        return minEle;
    }
    
    static int maximumElement(int [] arr)
    {
        int maxEle = Integer.MIN_VALUE;
        
        for (int ele : arr)
        {
            maxEle = Math.max(ele, maxEle);
        }
        
        return maxEle;
    }
    
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    
	    int t;
	    t = sc.nextInt();
	    
	    for (int i = 0; i < t; i++)
	    {
	        int n;
	        n = sc.nextInt();
	    
	        int [] arr = new int[n];
	    
	        for (int j = 0; j < n; j++)
	        {
	            arr[j] = sc.nextInt();
	        }
	    
	        System.out.println(maximumElement(arr) + " " + minimumElement(arr));
	    }
	}
}
