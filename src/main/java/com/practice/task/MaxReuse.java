package com.practice.task;

public class MaxReuse {

	public static void main(String[] args) {
		int [] intArray = {1,2,5,1,5,2,2,2,2,3,1,4,1,2,4,5,5,5,5};
		int maxReuse = 0;
		int value = 0;
		
		for(int i =0;i<intArray.length;i++) {
			
			int iteration = 1;
			int tempValue = 0;
			for(int j = i+1;j<intArray.length;j++) {
				if(intArray[i] == intArray[j]) {
					iteration++;
				}
				tempValue = intArray[i];
			}
			if(maxReuse < iteration) {
				maxReuse = iteration;
				value = tempValue;
			}
		}
		System.out.println(value +" total iteration "+maxReuse);
	}

}
