import java.util.Scanner;

public class BubbleSort {
	
	public static void mail(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arrayCount = scan.nextInt();
		int[] inputArray = new int[arrayCount];
		for (int i = 0; i < arrayCount; i++) {
			inputArray[i] = scan.nextInt();
		}
		
		int totalSwap = 0;
		int lengthOfArray = inputArray.length;
		
		for (int i=0; i<lengthOfArray; i++) {
			int numberOfSwap = 0;
			for (int j=0; j<lengthOfArray-1; j++) {
				if (inputArray[j] > inputArray[j+1]) {
					int temp = inputArray[j];
					inputArray[j] = inputArray[j+1];
					inputArray[j+1] = temp;
					numberOfSwap++;
					totalSwap++;
				}
			}
			if (numberOfSwap == 0) {
				System.out.println("Array is sorted in "+totalSwap+" swaps.");
				System.out.println("First Element: "+ inputArray[0]);
				System.out.println("Last Element: "+ inputArray[inputArray.length - 1]);
				break;
			}
		}
		
		scan.close();
	}

}
