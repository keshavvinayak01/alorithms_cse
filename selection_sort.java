import java.util.Scanner;

public class selection_sort {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = new int[n];
		takeinput(arr);
		selection(arr);
		display(arr);
	}

	public static void takeinput(int arr[]) {
		int i;
		for (i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
	}

	public static void selection(int arr[]) {
		int i, j, min;
		for (i = 0; i < arr.length - 1; i++) {
			min = i;
			for (j = min + 1; j < arr.length  ; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
				int t = arr[i];
				arr[i] = arr[min];
				arr[min] = t;
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
