import java.util.Scanner;

public class matrix_multiplication {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] ar1 = new int[n][];
		int[][] ar2 = new int[m][];
		int[][] arr;
		takeinput(ar1);
		System.out.println("Enter Second Array : \n");
		takeinput(ar2);
		arr = mm(ar1, ar2);
		display(arr);
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


	public static int[][] mm(int[][] ar1, int[][] ar2) {
		int[][] arr = new int[ar1.length][ar2[0].length];

		int i, j, k, sum = 0;
		for (i = 0; i < ar1.length; i++) {
			for (j = 0; j < ar2[0].length; j++) {
				for (k = 0; k < ar2.length; k++) {
					sum += ar1[i][k] * ar2[k][j];
				

				}
				arr[i][j] = sum;

				sum = 0;
			}
			
		}
		return arr;

	}

}
