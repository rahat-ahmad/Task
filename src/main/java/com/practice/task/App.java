package com.practice.task;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	int [] intArray = {1,10,13,2,13,40,4,5,9,6,7,8,20};
    	int max = 0;
    	for(int i =0; i< intArray.length -1;i++) {
    		for(int j =  i;j <intArray.length -1 ; j++) {
    			int mul = intArray[i]*intArray[j+1];
        		if(mul > max) {
        			max = mul;
        		}
    		}
    	}
    	System.out.println(max);
    }
}
