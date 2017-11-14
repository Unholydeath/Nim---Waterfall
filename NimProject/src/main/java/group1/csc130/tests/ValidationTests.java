package group1.csc130.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import group1.csc130.app.Game;

public class ValidationTests {


	@Test
	//Tests for choosing the opponent 
	public void OpponetTypeTest() { 
		Game gg = new Game(); 
		
	}
	
	//Test for Number Format exception for setOpponentType()
	@Test(expected = NumberFormatException.class)
	public void testForNumException(){
			Game gg = new Game(); 
		try{
			gg.setOpponentType();
			assertEquals();
			fail("expected NumberFormatException");
			
		} catch(NumberFormatException nfe){
			//ignore, this exception is expected.
		}		 
	}
	
	//Test for Exception catch for validateUserMove()
	@Test
	public void testForException(){}
	
	//Test for valid user moves for easy
	@Test
	public void testForValidEasyMoves(){}
	
	//Test for inValid user moves for easy
	@Test
	public void testForInvalidHandleEasy(){}
	
	
	//Test for valid user moves for medium 
	@Test
	public void testForValidMedMoves(){}
	
	//Test for inValid user moves for medium
	@Test
	public void testForInvalidHandleMed(){} 
	
	
	//Test for valid user moves for hard
	@Test
	public void testForValidHardMoves(){}
	
	//Test for inValid user moves for hard
	@Test
	public void testForInvalidHandleHard(){} 
	  

}
