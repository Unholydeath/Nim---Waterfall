package group1.csc130.app;

import java.io.BufferedReader;
import java.io.IOException;

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
	BufferedReader reader;
	
	boolean isWinner = false;
	boolean player1Turn = true;
	
	//Contains game code, returns if the player wants to play another game
	public boolean Run(){
		
		boolean playAgain = false;
		
		return playAgain;
	}
	
	public boolean ValidateUserMove(){
		
		boolean validMove = false;
		
		return validMove;
	}
	
	
	public void PlayerTurn(Player player){
		
	}
	
	//Prompts the first player to choose whether they'll play with another person or a computer
	//Asks for input, parses it, and instantiates player2
	public void setOpponentType(){
		
	}
	
	//Prompts the first player what difficulty of the level they want.
	//Asks for input, parses it, and instantiates level
	public void getDifficutly(){
		
		String input = "";
		int difficutly;
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
		difficutly = Integer.parseInt(input);

		switch(difficutly){
            case 1:
			level = new EasyLevel();
            break;

			case 2:
			level = new MedLevel();
            break;

            case 3:
			level = new HardLevel();
			break;
		}
	}
}
