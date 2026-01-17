
public class DataType {

	public static void main(String[] args) {
		int[] arr = { 4, 6, 7 };
		String[] arr2 = { "Hello", "World" };
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
		for (String i : arr2) {
			System.out.println(i);
		}
	}

}
