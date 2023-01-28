import java.util.Scanner;

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
					if (matrix[i][k] + matrix[k][j] < matrix[i][j])
					{
						matrix[i][j] = matrix[i][k] + matrix[k][j];
					}
				}
			}
		}
	}
	
	void printMatrix(int matrix[][]) // Adding vertices individually
	{
		for (int i = 0; i < Vertices; ++i) 
		{
			for (int j = 0; j < Vertices; ++j) 
			{
				if (matrix[i][j] == INF)
				{
					System.out.print("INF ");
				}
				else
				{
					System.out.print(matrix[i][j] + "  ");
				}
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//System.out.println("Floyd Warshall Algorithm");
		FloydWarshallAlgorithm a = new FloydWarshallAlgorithm();

		System.out.println("Enter number of vertices\n");//no of vertices
		int vertices = scan.nextInt();

		System.out.println("\nEnter matrix\n")
		int[][] path = new int[vertices][vertices];
		for (int i = 0; i < vertices; i++)
		    for (int j = 0; j < vertices; j++)
			path[i][j] = scan.nextInt();
		
		
		System.out.println("\nOutput matrix\n");
		a.floydWarshallAlgorithm(path);
	}
}
