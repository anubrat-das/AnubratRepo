package languagefundamentals;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr[2]);
		
		arr[2] = 4;
		arr[0] = 2;
		arr[1] = 6;
		arr[3]  = -23;
		arr[4] = 5;
		
		System.out.println(arr[3]);
		
		int[] arr2 = {2, 6, 4, -23, 5};
		
		String[][] posss = new String[5][4];
		
		System.out.println(posss[2][2]);
		
	}

}
