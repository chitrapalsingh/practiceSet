import java.io.*;
import java.util.*;

public class StringLoop {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	int stringsCount = scan.nextInt();
    	for (int i=0; i < stringsCount; i++) {
    		String s1 = scan.next();
    		char[] charArray = s1.toCharArray();
    		String oddString = "";
    		String evenString = "";
    		for(int j=0; j < charArray.length; j++) {
    			if (j==0) {
    				evenString+=charArray[j];
    			} else if (j%2 == 0) {
    				evenString += charArray[j];
    			} else if (j%2 == 1) {
    				oddString += charArray[j];
    			}
    		}
    		System.out.println(evenString + " " + oddString);
    	}
    }
}