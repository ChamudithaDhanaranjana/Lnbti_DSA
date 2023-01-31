class Counting_Sort {  
  
	int getMax(int[] a, int n) {  
	  int max = a[0];  
	  for(int i = 1; i<n; i++) {  
		  if(a[i] > max)  
			 max = a[i];  
	  }  
	  return max; //get maximum element from the array  
	}  
	  
	void countingSort(int[] a, int n)  
	{  
	   int[] output = new int [n+1];  
	   int max = getMax(a, n);  
	   //int max = 42;  
	   int[] count = new int [max+1]; //create count array with size [max+1]  
	  
	  for (int i = 0; i <= max; ++i)   
	  {  
		count[i] = 0; // Initialize count array with all zeros  
	  }  
		
	  for (int i = 0; i < n; i++) // Store the count of each element  
	  {  
		count[a[i]]++; 
	  }  
	  
	  for(int i = 1; i<=max; i++)   
		count[i] += count[i-1]; //find cumulative frequency  
	  
	  
	  for (int i = n - 1; i >= 0; i--) {  
		output[count[a[i]] - 1] = a[i];  
		count[a[i]]--; // decrease count for same numbers  
		}  
	  
	   for(int i = 0; i<n; i++) {  
		  a[i] = output[i]; //store the sorted elements into main array  
		}  
	}  
	  
	/* Function to print the array elements */  
	void printArray(int a[], int n)  
	{  
		int i;  
		for (i = 0; i < n; i++)  
			System.out.print(a[i] + " ");  
	}
	public static void main(String args[])  
	{  
		int a[] = { 658, 533, 458, 5, 1205, 788, 369, 448 };  
		int n = a.length;  
		CountingSort c1 = new CountingSort();  
		System.out.println("\nBefore sorting array - ");  
		c1.printArray(a, n);  
		c1.countSort(a,n);  
		System.out.println("\nAfter sorting array using Counting Sort - ");  
		c1.printArray(a, n);  
		System.out.println();  
	}  
  
} 