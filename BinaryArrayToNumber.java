import java.util.List;
import java.lang.Math;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
      int convInt = 0;	//this is the int that will return once the binary array is converted

      int k = 0;	//this is what you will exponentiate the rightmost number by in the array
      for (int i = binary.size() - 1; i >= 0; i--) {  //a for loop going from right to left through the list
    	  convInt += binary.get(i) * Math.pow(2, k);	//convert the number to the power of 2 and add it
    	  k++; //increment k so the number actually changes
      }

      return convInt;
    }

}
