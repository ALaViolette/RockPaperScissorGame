package playerClasses;

public abstract class Player {
	
private String name;
private String roshambo;



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRoshambo() {
	return roshambo;
}
public void setRoshambo(String roshambo) {
	this.roshambo = roshambo;
}

public abstract String generateRoshambo();{
	
}


}
