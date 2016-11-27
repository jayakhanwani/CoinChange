//*******************************************************************
// NOTE: please read the 'More Info' tab to the right for shortcuts.
//*******************************************************************

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codex
{
	public static void main (String[] args) throws java.lang.Exception, java.lang.StackOverflowError
	{
	    int A[] ={1,2,5,10};
	    int x= coinChange(10,A,4);
	    System.out.print(" "+x);
		
	}
	
	static int coinChange(int value, int []A, int n){
	    if(value==0){ return 0;}
	    int res = 2000;
	    int count=2000;
	    
	    if(value<0){return res;}
	    
	    for(int i=0; i<n; i++){
	        count = Math.min(count,1 + coinChange(value-A[i],A,n));
	        
	    }
	   return count; 
	}
}