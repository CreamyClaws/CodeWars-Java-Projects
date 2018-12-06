//A method to do a tribonacci sequence, which includes the signature array fed into it
public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {

    if (s.length < 3) { //check if the array is less than length 3
      return s;
    }

    if (n < 1) { //return an empty array if the length is 0
      double[] emptyArray = new double[0];
      return emptyArray;
    }

    double[] trib = new double[n];	//this is the new array that will return so s doesn't have a fit with out of bounds exceptions

    trib[0] = s[0];
    
    if (n > 1) {
    	trib[1] = s[1];
    }
    
    if (n > 2) {
    	trib[2] = s[2];
    }
    
    if (n > 3) {
    	for (int i = 3; i < n; i++) {
    		trib[i] = trib[i - 1] + trib[i - 2] + trib[i - 3];
    	}
    }
    
    return trib;
  }

}
