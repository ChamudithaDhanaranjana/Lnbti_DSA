class mergeSort
{
	private static int[] mergeSort(int[] array) 
	{
		if(array.length <= 1) 
		{
			
		}
		
		int mid = array.length / 2; //is the midpoint of the array.
		
		int[] left = new int[mid];
		int[] right;
		
		if(array.length % 2 == 0) // if the length of the array / 2 is equal to an even number.
		{ 
			
			right = new int[mid];
			
		} 
		
		else 
		{
			
			right = new int[mid + 1];// if not, remaining element is taken to right 
			
		}
		
		
		for(int i=0; i < mid; i++) 
		{
			
			left[i] = array[i];//fill the left array
			
		}
		
		for(int j=0; j < right.length; j++) 
		{
			
			right[j] = array[mid+j];//fill the right array
			/*mid + j ensures that array will be initialized with correct values 
			as j starts at 0
			*/
		}
		
		int[] result = new int[array.length];//length of the result should be same as the array
		
		
		left = mergeSort(right);//recursion
		right = mergeSort(right);
		
		
		result = merge(left, right);// Get the merged left and right arrays.
		
		
		return result;// Return the sorted merged array.
		
	}
	
	// used to Merge the left and right array in ascending order.
	private static int[] merge(int[] left, int[] right) 
	{
		
		int[] result = new int[left.length + right.length];// Merged result array.
		
		
		int leftArr = 0;
		int rightArr = 0;
		int results = 0;
		
		
		while(leftArr < left.length || rightArr < right.length) //checks whether there are items in either left array or right array
		//if they are none, no need to merge
		{
			
			if(leftArr < left.length && rightArr < right.length) 
			// If there are items in both left and right array
			{
				if(left[leftArr] < right[rightArr]) 					
				// If left element is less than right element
				{
					result[results++] = left[leftArr++];
					//place the result in left
					
				} 
				
				else 
				{
					result[results++] = right[rightArr++];
					//place the result in right
				}
			}
			
			
			else if(leftArr < left.length) // If there are elemenst only in the left
			{
				result[results++] = left[leftArr++];
			}
			
			
			else if(rightArr < right.length) // If there are elemenst only in the right
			{
				
				result[results++] = right[rightArr++];
				
			}
 			
		}
		
		return result;
		
	}
	
	private static void printArray(int[] array) //will print the array
	{
		
		for(int i: array) 
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
	
	public static void main(String args[]) 
	{
		
		int[] array = { 5, 7, 1, 3, 9 };//Initial array 
		System.out.println("Initial Array: ");
		printArray(array);
		
		
		array = mergeSort(array);// Sorted and merged array with print out method
		System.out.println("Sorted Array: ");
		printArray(array);
		
	}
}