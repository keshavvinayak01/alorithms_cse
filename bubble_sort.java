import java.util.Scanner;

public class bubble_sort {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = new int[n];
		takeinput(arr);
		bubble(arr);
		display(arr);
	}

	public static void takeinput(int arr[]) {
		int i;
		for (i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
	}

	public static void bubble(int arr[]) {
		int i, j;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
	}

	public static void display(int arr[]) {
		int i;
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
