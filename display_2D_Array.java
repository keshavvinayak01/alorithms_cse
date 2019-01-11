import java.util.Scanner;

public class display_2D_Array {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();

		int[][] arr = new int[n][];
		takeinput(arr);
		display(arr);

	}

	public static void takeinput(int[][] arr) {
		int k, i, j;
		for (i = 0; i < arr.length; i++) {
			System.out.println("Enter number of columns for row index " + i);

			k = scn.nextInt();
			arr[i]=new int[k];
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

}
