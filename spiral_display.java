
import java.util.Scanner;

public class spiral_display {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();

		int[][] arr = new int[n][];
		takeinput(arr);
		display(arr);
		System.out.println();
		sd1(arr);

	}

	public static void takeinput(int[][] arr) {
		int k, i, j;
		for (i = 0; i < arr.length; i++) {
			System.out.println("Enter number of columns for row index " + i);

			k = scn.nextInt();
			arr[i] = new int[k];
			for (j = 0; j < k; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
	}

	public static void display(int arr[][]) {
		int i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + "\t");

			System.out.print("\n");
		}
	}

		public static void sd1(int [][]arr)
	{
		int rowmin=0;
		int colmin=0;
		int rowmax=arr.length-1;
		int colmax=arr[0].length-1;
		int row,col;
		while(rowmin<=rowmax && colmin <=colmax)
		{
			for(row=rowmin;row<=rowmax;row++)
			{
				System.out.print(arr[row][colmin] + "\t");
			}
			colmin++;
			for(col=colmin;col<=colmax;col++)
			{
				System.out.print(arr[rowmax][col] + "\t");
			}
			rowmax--;
			
			for(row=rowmax;row>=rowmin;row--)
			{
				System.out.print(arr[row][colmax] + "\t");
			}
			colmax--;
			for(col=colmax;col>=colmin;col--)
			{
				System.out.print(arr[rowmin][col] + "\t");
			}
			rowmin++;
			
		}
		
	}
}