import java.util.Scanner;

public class insertion_sort {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = new int[n];
		takeinput(arr);
		insertion(arr);
		display(arr);
	}

	public static void takeinput(int arr[]) {
		int i;
		for (i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
	}

	public static void insertion(int arr[]) {
		int i, j, t;
		for (i = 1; i < arr.length; i++) {
			t = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > t) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = t;
		}
	}

	public static void display(int arr[]) {
		int i;
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
