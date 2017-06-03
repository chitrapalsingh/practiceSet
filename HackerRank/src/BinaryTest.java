import java.io.*;
import java.util.*;
	
public class BinaryTest {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    	Scanner scan = new Scanner(System.in);
	    	int inputValue = scan.nextInt();
	    	String output = "";
	    	output = Integer.toBinaryString(inputValue);
	    	System.out.println(output);
	    	int countMaxOnes = 0;
	    	int tempCount = 0;
	    	for (int j=0; j< output.length(); j++) {
	    		if (output.charAt(j) == '1') {
	    			tempCount++;
	    		} else {
	    			tempCount = 0;
	    		}
	    		if(tempCount > countMaxOnes) {
	    			countMaxOnes = tempCount;
	    		}
	    	}
	    	System.out.println(countMaxOnes);
	    }
	    }