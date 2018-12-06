public class Greed{
  public static int greedy(int[] dice){
    int numOnes = 0;	//the number of types of dice in there
    int numTwos = 0;
    int numThrees = 0;
    int numFours = 0;
    int numFives = 0;
    int numSixes = 0;
    
    int numOneTrip = 0;	//the number of triplets for each number
    int numTwoTrip = 0;
    int numThreeTrip = 0;
    int numFourTrip = 0;
    int numFiveTrip = 0;
    int numSixTrip = 0;
    
    int score = 0;
    
    for (int i = 0; i < dice.length; i++) {
    	switch (dice[i]) {
    		case 1: numOnes++;
    			break;
    		case 2: numTwos++;
    			break;
    		case 3: numThrees++;
    			break;
    		case 4: numFours++;
    			break;
    		case 5: numFives++;
    			break;
    		case 6: numSixes++;
    			break;
    	}
    }
    
    if (numOnes >= 3) {
    	numOneTrip++;
    	numOnes -= 3;
    }
	
    if (numTwos >= 3) {
    	numTwoTrip++;
    	numTwos -= 2;
    }
    
    if (numThrees >= 3) {
    	numThreeTrip++;
    	numThrees -= 3;
    }
    
    if (numFours >= 3) {
    	numFourTrip++;
    	numFours -= 3;
    }
    
    if (numFives >= 3) {
    	numFiveTrip++;
    	numFives -= 3;
    }
    
    if (numSixes >= 3) {
    	numSixTrip++;
    	numSixes -= 3;
    }
    
    score = numOnes * 100 + numFives * 50 + numOneTrip * 1000 + numTwoTrip * 200 + numThreeTrip * 300 + numFourTrip * 400 + numFiveTrip * 500 + numSixTrip * 600;
    return score;
  }
}
