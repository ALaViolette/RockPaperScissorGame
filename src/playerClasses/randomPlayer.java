package playerClasses;

import java.util.Random;

public class randomPlayer extends Player {
	Random rps = new Random();
	String arr [] = {"rock", "paper" ,"scissor"};
	int roll = rps.nextInt(arr.length);
	

	public randomPlayer() {
		setName("Stewie Griffin");
		setRoshambo(arr[roll]);
	}
	
	@Override 
	public String generateRoshambo(){
		
		return getRoshambo();
		
	}

}
