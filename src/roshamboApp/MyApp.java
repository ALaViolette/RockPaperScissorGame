package roshamboApp;
import java.util.Scanner;
import playerClasses.*;

public class MyApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name, option, opp;
		String cont = "yes";
		int counter = 0;
		
	
		System.out.println("Welcome to the Rock Paper Scissor game");
		System.out.println("What is you name?");
		name = scan.nextLine();
	
	while(cont.equalsIgnoreCase("yes")||cont.equalsIgnoreCase("y"))	{
		System.out.println("Hello "+ name +", who would you like to play with? Stewie Griffin(s) or My little pony(p)?  s/p");
		option = scan.nextLine();

		System.out.println("rock, paper, scissor,enter r/s/p");
		String input = scan.nextLine();
		humanPlayer p2 = new humanPlayer(name,input);
		
		if(option.equalsIgnoreCase("p")){ // my little pony is consistent rock
			rock p1 = new rock();
			System.out.println("My Little pony choose " + p1.generateRoshambo());
			opp = p1.generateRoshambo();
			counter = play(opp, counter, p2);
		}
		else if(option.equalsIgnoreCase("s")){ // Stewie is random
			
			randomPlayer p3 = new randomPlayer();
			System.out.println("Stewie Griffin choose " + p3.generateRoshambo());
			opp= p3.generateRoshambo();
			counter = play(opp, counter, p2);
		}
		System.out.println("would you like to play again? yes/no");
		cont = scan.nextLine();
	}

System.out.println("You won "+ counter +" times! Goodbye!");

	
	}

	public static int play(String opp, int counter, humanPlayer p2) {
		switch(p2.generateRoshambo()){
		case"p": 
			if (opp.equalsIgnoreCase("p"))
			System.out.println("We have a draw");
			else if(opp.equalsIgnoreCase("r")){
			System.out.println(p2.getName()+" won!");
			counter++;
			}
			else
				System.out.println("you lose");
			break;
		case"r": 
			if (opp.equalsIgnoreCase("r"))
			System.out.println("We have a draw");
			else if(opp.equalsIgnoreCase("s")){
			System.out.println(p2.getName()+" won!");
			counter++;
			}else
				System.out.println("you lose");
			break;
		case"s": 
			if (opp.equalsIgnoreCase("s"))
			System.out.println("We have a draw");
			else if(opp.equalsIgnoreCase("p")){
			System.out.println(p2.getName()+" won!");
			counter++;
			}else
				System.out.println("you lose");
		break;
		}
		return counter;
	}

}