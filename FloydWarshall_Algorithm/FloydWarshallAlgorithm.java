class FloydWarshallAlgorithm
{
	public static final int INF = 999, Vertices = 4; //static int - variable remains in memory while the program is running
	//999 is the value given to the infinite values
  
	void floydWarshallAlgorithm(int path[][]) // Implementing the algorithm
	{
		int matrix[][] = new int[Vertices][Vertices];
		int i, j, k;
		
		for (i = 0; i < Vertices; i++)
			for (j = 0; j < Vertices; j++)
				matrix[i][j] = path[i][j];

		
		for (k = 0; k < Vertices; k++) 
		{
			for (i = 0; i < Vertices; i++) 
			{
				for (j = 0; j < Vertices; j++) 
				{
					if (matrix[j][k] + matrix[k][j] < matrix[i][j])
					{
						matrix[i][j] = matrix[i][k] + matrix[k][j];
					}
				}
			}
		}
	}
}