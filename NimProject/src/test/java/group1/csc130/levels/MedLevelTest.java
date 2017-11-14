package group1.csc130.levels;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MedLevelTest {
	
	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	/**
	 * Should return 3, the number of rows of a medium level board
	 */
	@Test
	public void TestGetNumRows(){
		Level level = new MedLevel();
		assertEquals((int)3, level.getNumRows());
	}
	
	/**
	 * Should return 2 as the initial row 1 value
	 */
	@Test
	public void TestInitaialRow1Value(){
		Level level = new MedLevel();
		assertEquals((int)2, level.getBeadAmount(1));
	}
	
	/**
	 * Should remove 1 bead from row 1, leaving 1 bead on that row
	 */
    @Test
    public void TestRemoveBeadFromRow1(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 1);
    	assertEquals((int)1, level.getBeadAmount(1));
    }
    
    /**
     * Should remove both beads from row 1, leaving 0 beads on that row
     */
    @Test
    public void TestRemovingAllBeadsFromRow1(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 2);
    	assertEquals((int)0, level.getBeadAmount(1));
    }
    
    /**
     * Should remove 0 beads from row 1, leaving both beads on the row
     */
    @Test
    public void TestRemovingZeroBeadsFromRow1(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 0);
    	assertEquals((int)2, level.getBeadAmount(1));
    }
    
    /**
     * Because it asks to remove too many beads, the function will not remove any beads
     * and will not crash the program
     */
    @Test
    public void TestRemovingTooManyBeadsFromRow1(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 5);
    	assertEquals((int)2, level.getBeadAmount(1));
    }
    
    /**
     * The function shouldn't remove any beads and should return the current number of beads.
     * The function will not crash the program
     */
    @Test
    public void TestRemovingNegativeBeadsFromRow1(){
    	Level level = new MedLevel();
    	level.removeBeads(1, -3);
    	assertEquals((int)2, level.getBeadAmount(1));
    }
    
    /**
     * Should return 5, the initial value of beads in row 2
     */
    @Test
    public void TestInitialRow2Value(){
    	Level level = new MedLevel();
    	assertEquals((int)5, level.getBeadAmount(2));
    }
	
    /**
	 * Should remove 4 bead from row 2, leaving 1 bead on that row
	 */
    @Test
    public void TestRemoveBeadsFromRow2(){
    	Level level = new MedLevel();
    	level.removeBeads(2, 4);
    	assertEquals((int)1, level.getBeadAmount(2));
    }
    
    /**
     * Should remove all 5 beads from row 2, leaving 0 beads on that row
     */
    @Test
    public void TestRemovingAllBeadsFromRow2(){
    	Level level = new MedLevel();
    	level.removeBeads(2, 5);
    	assertEquals((int)0, level.getBeadAmount(2));
    }
    
    /**
     * Should remove 0 beads from row 2, leaving all 5 beads on the row
     */
    @Test
    public void TestRemovingZeroBeadsFromRow2(){
    	Level level = new MedLevel();
    	level.removeBeads(2, 0);
    	assertEquals((int)5, level.getBeadAmount(2));
    }
    
    /**
     * Because it asks to remove too many beads, the function will not remove any beads
     * and will not crash the program
     */
    @Test
    public void TestRemovingTooManyBeadsFromRow2(){
    	Level level = new MedLevel();
    	level.removeBeads(2, 8);
    	assertEquals((int)5, level.getBeadAmount(2));
    }
    
    /**
     * The function shouldn't remove any beads and should return the current number of beads.
     * The function will not crash the program
     */
    @Test
    public void TestRemovingNegativeBeadsFromRow2(){
    	Level level = new MedLevel();
    	level.removeBeads(2, -3);
    	assertEquals((int)5, level.getBeadAmount(2));
    }
    
    /**
     * Should return 7, the initial value of beads in row 3
     */
    @Test
    public void TestInitialRow3Value(){
    	Level level = new MedLevel();
    	assertEquals((int)7, level.getBeadAmount(3));
    }
	
    /**
	 * Should remove 5 bead from row 3, leaving 2 beads on that row
	 */
    @Test
    public void TestRemoveBeadsFromRow3(){
    	Level level = new MedLevel();
    	level.removeBeads(3, 5);
    	assertEquals((int)2, level.getBeadAmount(3));
    }
    
    /**
     * Should remove all 7 beads from row 3, leaving 0 beads on that row
     */
    @Test
    public void TestRemovingAllBeadsFromRow3(){
    	Level level = new MedLevel();
    	level.removeBeads(3, 7);
    	assertEquals((int)0, level.getBeadAmount(3));
    }
    
    /**
     * Should remove 0 beads from row 3, leaving all 7 beads on the row
     */
    @Test
    public void TestRemovingZeroBeadsFromRow3(){
    	Level level = new MedLevel();
    	level.removeBeads(3, 0);
    	assertEquals((int)7, level.getBeadAmount(3));
    }
    
    /**
     * Because it asks to remove too many beads, the function will not remove any beads
     * and will not crash the program
     */
    @Test
    public void TestRemovingTooManyBeadsFromRow3(){
    	Level level = new MedLevel();
    	level.removeBeads(3, 9);
    	assertEquals((int)7, level.getBeadAmount(3));
    }
    
    /**
     * The function shouldn't remove any beads and should return the current number of beads.
     * The function will not crash the program
     */
    @Test
    public void TestRemovingNegativeBeadsFromRow3(){
    	Level level = new MedLevel();
    	level.removeBeads(3, -3);
    	assertEquals((int)7, level.getBeadAmount(3));
    }
    
    /**
     * WinCheck should return true since all lists are empty
     */
    @Test
    public void TesWinCheckAllRowsEmpty(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 2);
    	level.removeBeads(2, 5);
    	level.removeBeads(3, 7);
    	assertTrue(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since no lists are empty
     */
    @Test
    public void TestWinCheckAllRowsFull(){
    	Level level = new MedLevel();
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since no lists are empty
     */
    @Test
    public void TestWinCheckRow1FullRow2FullRow3Partial(){
    	Level level = new MedLevel();
    	level.removeBeads(3, 4);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only one list is empty
     */
    @Test
    public void TestWinCheckRow1FullRow2FullRow3Empty(){
    	Level level = new MedLevel();
    	level.removeBeads(3, 7);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since no lists are empty
     */
    @Test
    public void TestWinCheckRow1FullRow2PartialRow3Full(){
    	Level level = new MedLevel();
    	level.removeBeads(2, 3);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since no lists are empty
     */
    @Test
    public void TestWinCheckRow1FullRow2PartialRow3Partial(){
    	Level level = new MedLevel();
    	level.removeBeads(2, 3);
    	level.removeBeads(3, 4);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only one list is empty
     */
    @Test
    public void TestWinCheckRow1FullRow2PartialRow3Empty(){
    	Level level = new MedLevel();
    	level.removeBeads(2, 2);
    	level.removeBeads(3, 7);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only one list is empty
     */
    @Test
    public void TestWinCheckRow1FullRow2EmptyRow3Full(){
    	Level level = new MedLevel();
    	level.removeBeads(2, 5);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only one list is empty
     */
    @Test
    public void TestWinCheckRow1FullRow2EmptyRow3Parital(){
    	Level level = new MedLevel();
    	level.removeBeads(2, 5);
    	level.removeBeads(3, 4);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only two lists are empty
     */
    @Test
    public void TestWinCheckRow1FullRow2EmptyRow3Empty(){
    	Level level = new MedLevel();
    	level.removeBeads(2, 5);
    	level.removeBeads(3, 7);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since no lists are empty
     */
    public void TestWinCheckRow1PartialRow2FullRow3Full(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 1);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since no lists are empty
     */
    @Test
    public void TestWinCheckRow1PartialRow2FullRow3Partial(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 1);
    	level.removeBeads(3, 4);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only one list is empty
     */
    @Test
    public void TestWinCheckRow1PartialRow2FullRow3Empty(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 1);
    	level.removeBeads(3, 7);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since no lists are empty
     */
    @Test
    public void TestWinCheckRow1PartialRow2PartialRow3Full(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 1);
    	level.removeBeads(2, 3);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since no lists are empty
     */
    @Test
    public void TestWinCheckRow1PartialRow2PartialRow3Partial(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 1);
    	level.removeBeads(2, 3);
    	level.removeBeads(3, 4);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only one list is empty
     */
    @Test
    public void TestWinCheckRow1PartialRow2PartialRow3Empty(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 1);
    	level.removeBeads(2, 2);
    	level.removeBeads(3, 7);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only one list is empty
     */
    @Test
    public void TestWinCheckRow1PartialRow2EmptyRow3Full(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 1);
    	level.removeBeads(2, 5);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only one list is empty
     */
    @Test
    public void TestWinCheckRow1PartialRow2EmptyRow3Parital(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 1);
    	level.removeBeads(2, 5);
    	level.removeBeads(3, 4);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only two lists are empty
     */
    @Test
    public void TestWinCheckRow1PartialRow2EmptyRow3Empty(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 1);
    	level.removeBeads(2, 5);
    	level.removeBeads(3, 7);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only one list is empty
     */
    @Test
    public void TestWinCheckRow1EmptyRow2FullRow3Full(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 2);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only one list is empty
     */
    @Test
    public void TestWinCheckRow1EmptyRow2FullRow3Partial(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 2);
    	level.removeBeads(3, 4);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only two lists are empty
     */
    @Test
    public void TestWinCheckRow1EmptyRow2FullRow3Empty(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 2);
    	level.removeBeads(3, 7);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only one list is empty
     */
    @Test
    public void TestWinCheckRow1EmptyRow2PartialRow3Full(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 2);
    	level.removeBeads(2, 2);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only one list is empty
     */
    @Test
    public void TestWinCheckRow1EmptyRow2PartialRow3Partial(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 2);
    	level.removeBeads(2, 2);
    	level.removeBeads(3, 4);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only two lists are empty
     */
    @Test
    public void TestWinCheckRow1EmptyRow2PartialRow3Empty(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 2);
    	level.removeBeads(2, 3);
    	level.removeBeads(3, 7);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only two lists are empty
     */
    @Test
    public void TestWinCheckRow1EmptyRow2EmptyRow3Full(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 2);
    	level.removeBeads(2, 5);
    	assertFalse(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since only two lists are empty
     */
    public void TestWinCheckRow1EmptyRow2EmptyRow3Partial(){
    	Level level = new MedLevel();
    	level.removeBeads(1, 2);
    	level.removeBeads(2, 5);
    	level.removeBeads(3, 4);
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
    	Level level = new MedLevel();
    	String board = "1 - [*, *]\n2 - [*, *, *, *, *]\n3 - [*, *, *, *, *, *, *]";
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
    	Level level = new MedLevel();
    	level.removeBeads(1, 2);
    	level.removeBeads(2, 5);
    	level.removeBeads(3, 7);
    	String board = "1 - []\n2 - []\n3 - []";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1FullRow2FullRow3Partial(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(3, 3);
    	String board = "1 - [*, *]\n2 - [*, *, *, *, *]\n3 - [*, *, *, *]";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1FullRow2FullRow3Empty(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(3, 7);
    	String board = "1 - [*, *]\n2 - [*, *, *, *, *]\n3 - []";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1FullRow2PartialRow3Full(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(2, 2);
    	String board = "1 - [*, *]\n2 - [*, *, *]\n3 - [*, *, *, *, *, *, *]";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1FullRow2PartialRow3Partial(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(2, 2);
    	level.removeBeads(3, 3);
    	String board = "1 - [*, *]\n2 - [*, *, *]\n3 - [*, *, *, *]";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1FullRow2PartialRow3Empty(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(2, 2);
    	level.removeBeads(3, 7);
    	String board = "1 - [*, *]\n2 - [*, *, *]\n3 - []";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1FullRow2EmptyRow3Full(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(2, 5);
    	String board = "1 - [*, *]\n2 - []\n3 - [*, *, *, *, *, *, *]";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1FullRow2EmptyRow3Partial(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(2, 5);
    	level.removeBeads(3, 3);
    	String board = "1 - [*, *]\n2 - []\n3 - [*, *, *, *]";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1FullRow2EmptyRow3Empty(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(2, 5);
    	level.removeBeads(3, 7);
    	String board = "1 - [*, *]\n2 - []\n3 - []";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1PartialRow2FullRow3Full(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(1, 1);
    	String board = "1 - [*]\n2 - [*, *, *, *, *]\n3 - [*, *, *, *, *, *, *]";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1PartialRow2FullRow3Partial(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(1, 1);
    	level.removeBeads(3, 3);
    	String board = "1 - [*]\n2 - [*, *, *, *, *]\n3 - [*, *, *, *]";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1PartialRow2FullRow3Empty(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(1, 1);
    	level.removeBeads(3, 7);
    	String board = "1 - [*]\n2 - [*, *, *, *, *]\n3 - []";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1PartialRow2PartialRow3Full(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(1, 1);
    	level.removeBeads(2, 2);
    	String board = "1 - [*]\n2 - [*, *, *]\n3 - [*, *, *, *, *, *, *]";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1PartialRow2PartialRow3Partial(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(1, 1);
    	level.removeBeads(2, 2);
    	level.removeBeads(3, 3);
    	String board = "1 - [*]\n2 - [*, *, *]\n3 - [*, *, *, *]";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1PartialRow2PartialRow3Empty(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(1, 1);
    	level.removeBeads(2, 2);
    	level.removeBeads(3, 7);
    	String board = "1 - [*]\n2 - [*, *, *]\n3 - []";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1PartialRow2EmptyRow3Full(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(1, 1);
    	level.removeBeads(2, 5);
    	String board = "1 - [*]\n2 - []\n3 - [*, *, *, *, *, *, *]";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1PartialRow2EmptyRow3Partial(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(1, 1);
    	level.removeBeads(2, 5);
    	level.removeBeads(3, 3);
    	String board = "1 - [*]\n2 - []\n3 - [*, *, *, *]";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1PartialRow2EmptyRow3Empty(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(1, 1);
    	level.removeBeads(2, 5);
    	level.removeBeads(3, 7);
    	String board = "1 - [*]\n2 - []\n3 - []";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1EmptyRow2FullRow3Full(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(1, 2);
    	String board = "1 - []\n2 - [*, *, *, *, *]\n3 - [*, *, *, *, *, *, *]";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1EmptyRow2FullRow3Partial(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(1, 2);
    	level.removeBeads(3, 3);
    	String board = "1 - []\n2 - [*, *, *, *, *]\n3 - [*, *, *, *]";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1EmptyRow2FullRow3Empty(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(1, 2);
    	level.removeBeads(3, 7);
    	String board = "1 - []\n2 - [*, *, *, *, *]\n3 - []";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1EmptyRow2PartialRow3Full(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(1, 2);
    	level.removeBeads(2, 2);
    	String board = "1 - []\n2 - [*, *, *]\n3 - [*, *, *, *, *, *, *]";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1EmptyRow2PartialRow3Partial(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(1, 2);
    	level.removeBeads(2, 2);
    	level.removeBeads(3, 3);
    	String board = "1 - []\n2 - [*, *, *]\n3 - [*, *, *, *]";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1EmptyRow2PartialRow3Empty(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(1, 2);
    	level.removeBeads(2, 2);
    	level.removeBeads(3, 7);
    	String board = "1 - []\n2 - [*, *, *]\n3 - []";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1EmptyRow2EmptyRow3Full(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(1, 2);
    	level.removeBeads(2, 5);
    	String board = "1 - []\n2 - []\n3 - [*, *, *, *, *, *, *]";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
    
    @Test
    public void TestPrintRow1EmptyRow2EmptyRow3Partial(){
    	setUpStream();
    	Level level = new MedLevel();
    	level.removeBeads(1, 2);
    	level.removeBeads(2, 5);
    	level.removeBeads(3, 3);
    	String board = "1 - []\n2 - []\n3 - [*, *, *, *]";
    	level.PrintBoard();
    	assertEquals(board, outContent.toString());
    	cleanUpStream();
    }
}