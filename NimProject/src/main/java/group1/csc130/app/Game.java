package group1.csc130.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import group1.csc130.levels.EasyLevel;
import group1.csc130.levels.HardLevel;
import group1.csc130.levels.Level;
import group1.csc130.levels.MedLevel;
import group1.csc130.models.Player;
 
/** 
 * 
 * @author Unholydeath
 *
 */ 
public class Game {
	
	Player player1;
	Player player2;
	
	Level level;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 
	boolean isWinner = false;
	boolean player1Turn = true;
	
	//Contains game code, returns if the player wants to play another game
	public void run(){
		boolean playAgain = false;
		System.out.println("\tWelcome to Nim");
		System.out.println("---------------------------------");
		 
		do{ 
			System.out.println("Choose your opponent player! \n\t1.) Player vs Player\n\t2.) Player vs Computer");
			try {
				setOpponentType();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			getDifficutly(); 
	
		}while(!playAgain); 
	}
	
	public boolean validateUserMove(){
		
		boolean validMove = false;
		
		return validMove;
	}
	
	
	public void PlayerTurn(Player player){
		
	} 
	
	//Prompts the first player to choose whether they'll play with another person or a computer
	//Asks for input, parses it, and instantiates player2
	public void setOpponentType() throws IOException{
		int playerChoice = 0;
		boolean isValid = false;  
		
		//Loop to check for valid input from the user, exits when isValid is true
		while(isValid){
			try {
				playerChoice = reader.read();
				if(playerChoice > 2 || playerChoice < 1){}
				else{
					isValid = true; 					
				}
			} catch (IOException e) {System.out.println("Invalid input. Please choose between 1 & 2.");} 			
		}
		
		//Takes user choice and sets the player name based on choice 
		switch(playerChoice){
			case 1:
				System.out.println("PLAYER VS PLAYER!");
				System.out.println("Enter your name player one: ");
					player1.setName(reader.readLine()); 
				System.out.println("Enter your name player two: ");
				 	player2.setName(reader.readLine()); 
				break;
			case 2:
				System.out.println("PLAYER VS COMPUTER");
				System.out.println("Enter your name player one: ");
				player1.setName(reader.readLine());  
				break;
		}
		
		
	}
	
	//Prompts the first player what difficulty of the level they want.
	//Asks for input, parses it, and instantiates level
	public void getDifficutly(){
		
		String input = "";
		
		System.out.println("Please input 1-3 to choose a difficulty");
		System.out.println("1 - Easy");
		System.out.println("2 - Medium");
		System.out.println("3 - Hard");
		try {
			input = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(Integer.parseInt(input) == 1){
			level = new EasyLevel();
			
		} else if (Integer.parseInt(input) == 2){
			level = new MedLevel();
			
		} else if (Integer.parseInt(input) == 3){
			level = new HardLevel();
			
		}
	}
}
