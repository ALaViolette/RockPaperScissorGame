package playerClasses;

public class humanPlayer extends Player {


	
	public humanPlayer( String name, String roshambo) {
		setName(name);
		setRoshambo(roshambo);
	}

	
	@Override 
	public String generateRoshambo(){
		return getRoshambo();
		
		
	}

}
