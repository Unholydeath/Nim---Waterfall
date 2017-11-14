package group1.csc130.levels;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class EasyLevelTest {
	
	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	/**
	 * Should return 2, the number of rows of an easy level board
	 */
	@Test
	public void TestGetNumRows(){
		Level level = new EasyLevel();
		assertEquals((int)2, level.getNumRows());
	}
	
	/**
	 * Should return 3 as the initial row 1 value
	 */
	@Test
	public void TestInitaialRow1Value(){
		Level level = new EasyLevel();
		assertEquals((int)3, level.getBeadAmount(1));
	}
	
	/**
	 * Should remove 2 beads from row 1, leaving 2 beads on that row
	 */
    @Test
    public void TestRemoveBeadsFromRow1(){
    	Level level = new EasyLevel();
    	level.removeBeads(1, 2);
    	assertEquals((int)1, level.getBeadAmount(1));
    }
    
    /**
     * Should remove all 3 beads from row 1, leaving 0 beads on that row
     */
    @Test
    public void TestRemovingAllBeadsFromRow1(){
    	Level level = new EasyLevel();
    	level.removeBeads(1, 3);
    	assertEquals((int)0, level.getBeadAmount(1));
    }
    
    /**
     * Should remove 0 beads from row 1, leaving all 3 beads on the row
     */
    @Test
    public void TestRemovingZeroBeadsFromRow1(){
    	Level level = new EasyLevel();
    	level.removeBeads(1, 0);
    	assertEquals((int)3, level.getBeadAmount(1));
    }
    
    /**
     * Because it asks to remove too many beads, the function will not remove any beads
     * and will not crash the program
     */
    @Test
    public void TestRemovingTooManyBeadsFromRow1(){
    	Level level = new EasyLevel();
    	level.removeBeads(1, 5);
    	assertEquals((int)3, level.getBeadAmount(1));
    }
    
    /**
     * The function shouldn't remove any beads and should return the current number of beads.
     * The function will not crash the program
     */
    @Test
    public void TestRemovingNegativeBeadsFromRow1(){
    	Level level = new EasyLevel();
    	level.removeBeads(1, -3);
    	assertEquals((int)3, level.getBeadAmount(1));
    }
    
    /**
     * Should return 3, the initial value of beads in row 2
     */
    @Test
    public void TestInitialRow2Value(){
    	Level level = new EasyLevel();
    	assertEquals((int)3, level.getBeadAmount(2));
    }
	
    /**
	 * Should remove 1 bead from row 2, leaving 2 beads on that row
	 */
    @Test
    public void TestRemoveBeadsFromRow2(){
    	Level level = new EasyLevel();
    	level.removeBeads(2, 1);
    	assertEquals((int)2, level.getBeadAmount(2));
    }
    
    /**
     * Should remove all 3 beads from row 2, leaving 0 beads on that row
     */
    @Test
    public void TestRemovingAllBeadsFromRow2(){
    	Level level = new EasyLevel();
    	level.removeBeads(2, 3);
    	assertEquals((int)0, level.getBeadAmount(2));
    }
    
    /**
     * Should remove 0 beads from row 2, leaving all 3 beads on the row
     */
    @Test
    public void TestRemovingZeroBeadsFromRow2(){
    	Level level = new EasyLevel();
    	level.removeBeads(2, 0);
    	assertEquals((int)3, level.getBeadAmount(2));
    }
    
    /**
     * Because it asks to remove too many beads, the function will not remove any beads
     * and will not crash the program
     */
    @Test
    public void TestRemovingTooManyBeadsFromRow2(){
    	Level level = new EasyLevel();
    	level.removeBeads(2, 5);
    	assertEquals((int)3, level.getBeadAmount(2));
    }
    
    /**
     * The function shouldn't remove any beads and should return the current number of beads.
     * The function will not crash the program
     */
    @Test
    public void TestRemovingNegativeBeadsFromRow2(){
    	Level level = new EasyLevel();
    	level.removeBeads(2, -3);
    	assertEquals((int)3, level.getBeadAmount(2));
    }
   
    /**
     * The function should return 3, the new amount that was given
     * The function SHOULD FAIL because the setRow function doesn't clear the list
     */
    @Test
    public void TestSettingRow1To3(){
    	EasyLevel easy = new EasyLevel();
    	easy.setRow1(3);
    	assertEquals((int)3, easy.getBeadAmount(1));
    }
    
    /**
     * The function should return 0, the desired amount
     * The function SHOULD FAIL because the setRow function doesn't clear the list when called
     */
    @Test
    public void TestSettingRow1To0(){
    	EasyLevel easy = new EasyLevel();
    	easy.setRow1(0);
    	assertEquals((int)0, easy.getBeadAmount(1));
    }
    
    /**
     * The function doesn't allow for negatives, so the functions shouldn't change the original value
     */
    @Test
    public void TestSettingRow1ToNegative(){
    	EasyLevel easy = new EasyLevel();
    	int currentBeads = easy.getBeadAmount(1);
    	easy.setRow1(-6);
    	assertEquals(currentBeads, easy.getBeadAmount(1));
    }
    
    /**
     * The function should return 3, the new amount that was given
     * The function SHOULD FAIL because the setRow function doesn't clear the list
     */
    @Test
    public void TestSettingRow2To3(){
    	EasyLevel easy = new EasyLevel();
    	easy.setRow2(3);
    	assertEquals((int)3, easy.getBeadAmount(2));
    }
    
    /**
     * The function should return 0, the desired amount
     * The function SHOULD FAIL because the setRow function doesn't clear the list when called
     */
    @Test
    public void TestSettingRow2To0(){
    	EasyLevel easy = new EasyLevel();
    	easy.setRow2(0);
    	assertEquals((int)0, easy.getBeadAmount(2));
    }
    
    /**
     * The function doesn't allow for negatives, so the functions shouldn't change the original value
     */
    @Test
    public void TestSettingRow2ToNegative(){
    	EasyLevel easy = new EasyLevel();
    	int currentBeads = easy.getBeadAmount(2);
    	easy.setRow2(-6);
    	assertEquals(currentBeads, easy.getBeadAmount(2));
    }
    
    /**
     * WinCheck should return true since both lists are empty
     */
    @Test
    public void TestPositiveWinCheck(){
    	Level level = new EasyLevel();
    	level.removeBeads(1, 3);
    	level.removeBeads(2, 3);
    	assertTrue(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only one list is empty
     */
    @Test
    public void TestWinCheckRow1EmptyRow2HasBeads(){
    	Level level = new EasyLevel();
    	level.removeBeads(1, 3);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only one list is empty
     */
    @Test
    public void TestWinCheckRow1HasBeadsRow2Empty(){
    	Level level = new EasyLevel();
    	level.removeBeads(2, 3);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since neither list is empty
     */
    @Test
    public void TestWinCheckRow1HasBeadsRow2HasBeads(){
    	Level level = new EasyLevel();
    	assertFalse(level.WinCheck());
    }

    /**
     * Sets up for console printing tests
     */
    @Test
    public void setUpStream() {
        System.setOut(new PrintStream(outContent));
    }
    
    /**
     * Clean up for console printing tests
     */
    @Test
    public void cleanUpStream() {
        System.setOut(null);
    }
    
    /**
     * Tests the default printBoard function
     */
    @Test
    public void TestPrintNormalBoard(){
    	setUpStream();
    	Level level = new EasyLevel();
    	String board = "1 - [*, *, *]\n2 - [*, *, *]";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    /**
     * Tests the printBoard function if there are no beads present
     */
    @Test
    public void TestPrintEmptyBoard(){
    	setUpStream();
    	Level level = new EasyLevel();
    	level.removeBeads(1, 3);
    	level.removeBeads(2, 3);
    	String board = "1 - []\n2 - []";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    /**
     * Tests the print function if the first row is empty, but the second is full
     */
    @Test
    public void TestPrintEmptyRow1FullRow2(){
    	setUpStream();
    	Level level = new EasyLevel();
    	level.removeBeads(1, 3);
    	String board = "1 - []\n2 - [*, *, *]";
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    /**
     * Tests the print function if the first row is full, but the second is empty
     */
    @Test
    public void TestPrintFullRow1EmptyRow2(){
    	setUpStream();
    	Level level = new EasyLevel();
    	level.removeBeads(2, 3);
    	String board = "1 - [*, *, *]\n2 - []";
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    /**
     * Tests the print function if the first row is less than full and the second row has all its beads
     */
    @Test
    public void TestPrintPartRow1FullRow2(){
    	setUpStream();
    	Level level = new EasyLevel();
    	level.removeBeads(1, 1);
    	String board = "1 - [*, *]\n2 - [*, *, *]";
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    /**
     * Tests the print function if the first and second rows have less than thier full capacities of beads
     */
    @Test
    public void TestPrintPartRow1PartRow2(){
    	setUpStream();
    	Level level = new EasyLevel();
    	level.removeBeads(1, 1);
    	level.removeBeads(2, 2);
    	String board = "1 - [*, *]\n2 - [*]";
    	assertEquals(board, outContent.toString());
    	cleanUpStream();	
    }
    
    /**
     * Tests the print function if the first row has is partially full and the second row is empty of beads
     */
    @Test
    public void TestPrintPartRow1EmptyRow2(){
    	setUpStream();
    	Level level = new EasyLevel();
    	level.removeBeads(1, 1);
    	level.removeBeads(2, 3);
    	String board = "1 - [*, *]\n2 - []";
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    /**
     * Tests the print function if the first row is full of beads, but the second row has less than full capacity
     */
    @Test
    public void TestPrintFullRow1PartRow2(){
    	setUpStream();
    	Level level = new EasyLevel();
    	level.removeBeads(2, 1);
    	String board = "1 - [*, *, *]\n2 - [*, *]";
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    /**
     * Tests the print function if the first row has no beads and the second row has less than full capacity
     */
    @Test
    public void TestPrintEmptyRow1PartRow2(){
    	setUpStream();
    	Level level = new EasyLevel();
    	level.removeBeads(1, 3);
    	level.removeBeads(2, 1);
    	String board = "1 - []\n2 - [*, *]";
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
}