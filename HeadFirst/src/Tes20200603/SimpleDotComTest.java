package Tes20200603;

public class SimpleDotComTest {

	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		//int[] loc = new int[]{2,3,4};
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		
		String userGuess = "5";
		String result = dot.checkYourself(userGuess);
		String testResult = "failed";
		if (result.equals("hit")){
			testResult = "passed";
		}
		System.out.println(testResult);

	}

}
