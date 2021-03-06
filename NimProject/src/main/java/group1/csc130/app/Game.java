package group1.csc130.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import group1.csc130.levels.EasyLevel;
import group1.csc130.levels.HardLevel;
import group1.csc130.levels.Level;
import group1.csc130.levels.MedLevel;
import group1.csc130.models.Computer;
import group1.csc130.models.Player;
import group1.csc130.models.Player.PlayerType;

/**
 * The game class manages all actions that occur within one play session. The
 * game contains two players, a level that change based on user input at the
 * start of the session, and a bufferedreader to receive player input. The game
 * has two booleans, player1Turn to determine if it’s player one’s turn, and
 * isWinner for if the game has ended. The game also has a run function that
 * holds the game’s logic.
 */

public class Game {
	
	Player player1;
	Player player2;
	
	Level level;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 
	boolean isWinner = false;
	boolean player1Turn = true;
	boolean continueGame = true;

	//Contains game code, returns if the player wants to play another game
    /**
     *The run method holds all the main logic if the game to have the game run
     *@return boolean playAgain -  Returns if the player wants to play another game
     */
	public boolean run(){
		boolean playAgain = false;
		boolean playingGame = true;
		System.out.println("\tWelcome to Nim");
		System.out.println("---------------------------------");
		 
		System.out.println("Choose your opponent player! \n\t1.) Player vs Player\n\t2.) Player vs Computer");
		try {
			setOpponentType();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		getDifficutly();
		level.PrintBoard();
		
		while(playingGame){
			
			if(player1Turn){
				try {
					System.out.println("It's " + player1.getName() + "'s turn");
					PlayerTurn(player1);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else{
				try {
					System.out.println("It's " + player2.getName() + "'s turn");
					PlayerTurn(player2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(level.WinCheck()){
				
				if(player1Turn){
					System.out.println(player2.getName() + " is the winner!");
				} else{
					System.out.println(player1.getName() + " is the winner!");
				}

				while (continueGame) {
                    String choice = "";
                    System.out.println("Would you like to play again? y - yes  n - no");
                    try {
                        choice = reader.readLine();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    if (choice.compareToIgnoreCase("y") == 0) {
                        playAgain = true;
                        continueGame = false;
                        playingGame = false;
                    } else if (choice.compareToIgnoreCase("n") == 0){
                        playAgain = false;
                        continueGame = false;
                        playingGame = false;
                    }
                }
				
			} else{
				level.PrintBoard();
				player1Turn = !player1Turn;
			}
			
		}
		return playAgain;
	}
    /**
     * The run method holds all the main logic if the game to have the game run
     *@return boolean validMove -  Returns if the player gave a row number and number of beads
     */

    public boolean validateUserMove(){
		
		boolean validMove = false;
		String input = "";
		
		try{
			System.out.println("Please input a row number");
			input = reader.readLine();
			
			if(Integer.parseInt(input) <= level.getNumRows() && Integer.parseInt(input) > 0){
				
				int row = Integer.parseInt(input);
				
				System.out.println("Please select a number of beads to remove");
				input = reader.readLine();
				
				if(Integer.parseInt(input) <= level.getBeadAmount(row) && Integer.parseInt(input) > 0){
					
					int numBeads = Integer.parseInt(input);
					level.removeBeads(row, numBeads);
					validMove = true;
				}
			}
			else {
                System.out.println("Enter a valid move \n\t");
                level.PrintBoard();
                System.out.println();
            }
		} catch (Exception e){
			
		}
		
		return validMove;
	}

    /**
     *The playerTurn method takes in a player and run all the method calls for the
     *players turn checks if the players input is valid and if the move they request is
     *valid as well, also checks if there is a winner. It returns void
     *@pram Player player - this is the current player who is taking their turn
     */

    public void PlayerTurn(Player player) throws IOException{
		
		if(player.getType() == PlayerType.PLAYER) {

            boolean makingMove;

            do {
               makingMove = validateUserMove();

            }while (!makingMove);
        }

        else{
			
			boolean choosingBeads = true;
			int rowNum = 0;
			int maxBeads;
			int beadNum = 0;
			
			while(choosingBeads){
				rowNum = player2.makeRowChoice(level.getNumRows());
				maxBeads = level.getBeadAmount(rowNum);
				
				if(maxBeads > 0){
					beadNum = player2.makeBeadChoice(maxBeads);
					level.removeBeads(rowNum, beadNum);
					choosingBeads = false;
				}	
			}
			System.out.println(player2.getName() + " has removed " + beadNum + " beads from row " + rowNum);
		}
	} 
	
	//Prompts the first player to choose whether they'll play with another person or a computer
	//Asks for input, parses it, and instantiates player2
    /**
     *The setOpponetType method sets the player2 variable to a player
     *or computer based on the player1’s choice they pass to the method
     *@pram int typeChoice- the type of player they want to play against
     */

    public void setOpponentType() throws IOException{
		String playerChoice = "";
		boolean isValid = false;  
		
		//Loop to check for valid input from the user, exits when isValid is true
		while(!isValid){
			try {
				playerChoice = reader.readLine();
				if(Integer.parseInt(playerChoice) == 1 || Integer.parseInt(playerChoice) == 2){
					isValid = true; 					
				}
			} catch (IOException e) {System.out.println("Invalid input. Please choose between 1 & 2.");}
			catch (NumberFormatException e){System.out.println("Invalid input. Please choose between 1 & 2.");}
		}
		
		int choice = Integer.parseInt(playerChoice);
		
		//Takes user choice and sets the player name based on choice 
		switch(choice){
			case 1:
				System.out.println("PLAYER VS PLAYER!");
				System.out.println("Enter your name player one: ");
				player1 = new Player();
				player1.setName(reader.readLine()); 
				
				System.out.println("Enter your name player two: ");
				player2 = new Player();
				player2.setName(reader.readLine());
				break;
			case 2:
				System.out.println("PLAYER VS COMPUTER");
				System.out.println("Enter your name player one: ");
				player1 = new Player();
				player1.setName(reader.readLine());
				player2 = new Computer();
				player2.setName("Computer");
				break;
		}
	}
	
	//Prompts the first player what difficulty of the level they want.
	//Asks for input, parses it, and instantiates level
    /**
     * Instantiates level based on the difficulty option.
     * @pram int difficulty - Difficulty the player wants (already parsed).
     */

    public void getDifficutly(){
		
		String input = "";
		int choice = 0;
		boolean makingSelection = true;
		
		while (makingSelection){
			
			System.out.println("Please input 1-3 to choose a difficulty");
			System.out.println("1 - Easy");
			System.out.println("2 - Medium");
			System.out.println("3 - Hard");
			
			try {
				input = reader.readLine();
                choice = Integer.parseInt(input);
			} catch (IOException e){
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (NumberFormatException e){
                System.out.println("Enter a valid input");
                System.out.println();
            }


			if(choice <= 3 &&  choice > 0)

			    if(choice == 1){
				level = new EasyLevel();
				makingSelection = false;
				
			} else if (choice == 2){
				level = new MedLevel();
				makingSelection = false;
				
			} else if (choice == 3){
				level = new HardLevel();
				makingSelection = false;
			}
		}
	}

}
