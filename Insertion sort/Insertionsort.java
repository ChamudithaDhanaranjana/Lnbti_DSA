class Insertionsort {
	
	public static void main (String[]args){
		
		int arr[];
		arr = new int [5];
		arr [0] = 7;
		arr [1] = 8;
		arr [2] = 1;
		arr [3] = 3;
		arr [4] = 2;
		
		
		 for (int i=1;i<arr.length;i++)
		{
			int temp = arr [i];
			int j = i - 1 ;
			while (j >=0 && temp < arr[j])
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr [j+1] = temp;
		}
		for (int i = 0; i<arr.length; ++i)
		{
			System.out.println(arr[i] + " ");
		}
		
	}
}