package group1.csc130.levels;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class HardLevelTest {
	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	/**
	 * Should return 4, the number of rows of a hard level board
	 */
	@Test
	public void TestGetNumRows(){
		Level level = new HardLevel();
		assertEquals(4, level.getNumRows());
	}
	
	/**
	 * Should return 2 as the initial row 1 value
	 */
	@Test
	public void TestInitaialRow1Value(){
		Level level = new HardLevel();
		assertEquals(2, level.getBeadAmount(1));
	}
	
	/**
	 * Should remove 1 bead from row 1, leaving 1 bead on that row
	 */
    @Test
    public void TestRemoveBeadFromRow1(){
    	Level level = new HardLevel();
    	level.removeBeads(1, 1);
    	assertEquals(1, level.getBeadAmount(1));
    }
    
    /**
     * Should remove both beads from row 1, leaving 0 beads on that row
     */
    @Test
    public void TestRemovingAllBeadsFromRow1(){
    	Level level = new HardLevel();
    	level.removeBeads(1, 2);
    	assertEquals(0, level.getBeadAmount(1));
    }
    
    /**
     * Should remove 0 beads from row 1, leaving both beads on the row
     */
    @Test
    public void TestRemovingZeroBeadsFromRow1(){
    	Level level = new HardLevel();
    	level.removeBeads(1, 0);
    	assertEquals(2, level.getBeadAmount(1));
    }
    
    /**
     * Because it asks to remove too many beads, the function will not remove any beads
     * and will not crash the program
     */
    @Test
    public void TestRemovingTooManyBeadsFromRow1(){
    	Level level = new HardLevel();
    	level.removeBeads(1, 5);
    	assertEquals(2, level.getBeadAmount(1));
    }
    
    /**
     * The function shouldn't remove any beads and should return the current number of beads.
     * The function will not crash the program
     */
    @Test
    public void TestRemovingNegativeBeadsFromRow1(){
    	Level level = new HardLevel();
    	level.removeBeads(1, -3);
    	assertEquals(2, level.getBeadAmount(1));
    }
    
    /**
     * Should return 3, the initial value of beads in row 2
     */
    @Test
    public void TestInitialRow2Value(){
    	Level level = new HardLevel();
    	assertEquals(3, level.getBeadAmount(2));
    }
	
    /**
	 * Should remove 2 beads from row 2, leaving 1 bead on that row
	 */
    @Test
    public void TestRemoveBeadsFromRow2(){
    	Level level = new HardLevel();
    	level.removeBeads(2, 2);
    	assertEquals(1, level.getBeadAmount(2));
    }
    
    /**
     * Should remove all 3 beads from row 2, leaving 0 beads on that row
     */
    @Test
    public void TestRemovingAllBeadsFromRow2(){
    	Level level = new HardLevel();
    	level.removeBeads(2, 3);
    	assertEquals(0, level.getBeadAmount(2));
    }
    
    /**
     * Should remove 0 beads from row 2, leaving all 3 beads on the row
     */
    @Test
    public void TestRemovingZeroBeadsFromRow2(){
    	Level level = new HardLevel();
    	level.removeBeads(2, 0);
    	assertEquals(3, level.getBeadAmount(2));
    }
    
    /**
     * Because it asks to remove too many beads, the function will not remove any beads
     * and will not crash the program
     */
    @Test
    public void TestRemovingTooManyBeadsFromRow2(){
    	Level level = new HardLevel();
    	level.removeBeads(2, 8);
    	assertEquals(3, level.getBeadAmount(2));
    }
    
    /**
     * The function shouldn't remove any beads and should return the current number of beads.
     * The function will not crash the program
     */
    @Test
    public void TestRemovingNegativeBeadsFromRow2(){
    	Level level = new HardLevel();
    	level.removeBeads(2, -3);
    	assertEquals(3, level.getBeadAmount(2));
    }
    
    /**
     * Should return 8, the initial value of beads in row 3
     */
    @Test
    public void TestInitialRow3Value(){
    	Level level = new HardLevel();
    	assertEquals(8, level.getBeadAmount(3));
    }
	
    /**
	 * Should remove 5 beads from row 3, leaving 3 beads on that row
	 */
    @Test
    public void TestRemoveBeadsFromRow3(){
    	Level level = new HardLevel();
    	level.removeBeads(3, 5);
    	assertEquals(3, level.getBeadAmount(3));
    }
    
    /**
     * Should remove all 8 beads from row 3, leaving 0 beads on that row
     */
    @Test
    public void TestRemovingAllBeadsFromRow3(){
    	Level level = new HardLevel();
    	level.removeBeads(3, 8);
    	assertEquals(0, level.getBeadAmount(3));
    }
    
    /**
     * Should remove 0 beads from row 3, leaving all 8 beads on the row
     */
    @Test
    public void TestRemovingZeroBeadsFromRow3(){
    	Level level = new HardLevel();
    	level.removeBeads(3, 0);
    	assertEquals(8, level.getBeadAmount(3));
    }
    
    /**
     * Because it asks to remove too many beads, the function will not remove any beads
     * and will not crash the program
     */
    @Test
    public void TestRemovingTooManyBeadsFromRow3(){
    	Level level = new HardLevel();
    	level.removeBeads(3, 12);
    	assertEquals(8, level.getBeadAmount(3));
    }
    
    /**
     * The function shouldn't remove any beads and should return the current number of beads.
     * The function will not crash the program
     */
    @Test
    public void TestRemovingNegativeBeadsFromRow3(){
    	Level level = new HardLevel();
    	level.removeBeads(3, -3);
    	assertEquals(8, level.getBeadAmount(3));
    }
    
    /**
     * Should return 9, the initial value of beads in row 4
     */
    @Test
    public void TestInitialRow4Value(){
    	Level level = new HardLevel();
    	assertEquals(9, level.getBeadAmount(4));
    }
	
    /**
	 * Should remove 6 beads from row 4, leaving 3 beads on that row
	 */
    @Test
    public void TestRemoveBeadsFromRow4(){
    	Level level = new HardLevel();
    	level.removeBeads(4, 6);
    	assertEquals(3, level.getBeadAmount(4));
    }
    
    /**
     * Should remove all 9 beads from row 4, leaving 0 beads on that row
     */
    @Test
    public void TestRemovingAllBeadsFromRow4(){
    	Level level = new HardLevel();
    	level.removeBeads(4, 9);
    	assertEquals(0, level.getBeadAmount(4));
    }
    
    /**
     * Should remove 0 beads from row 4, leaving all 9 beads on the row
     */
    @Test
    public void TestRemovingZeroBeadsFromRow4(){
    	Level level = new HardLevel();
    	level.removeBeads(4, 0);
    	assertEquals(9, level.getBeadAmount(4));
    }
    
    /**
     * Because it asks to remove too many beads, the function will not remove any beads
     * and will not crash the program
     */
    @Test
    public void TestRemovingTooManyBeadsFromRow4(){
    	Level level = new HardLevel();
    	level.removeBeads(4, 12);
    	assertEquals(9, level.getBeadAmount(4));
    }
    
    /**
     * The function shouldn't remove any beads and should return the current number of beads.
     * The function will not crash the program
     */
    @Test
    public void TestRemovingNegativeBeadsFromRow4(){
    	Level level = new HardLevel();
    	level.removeBeads(4, -3);
    	assertEquals(9, level.getBeadAmount(4));
    }
   
    /**
     * The function should return 3, the new amount that was given
     * The function SHOULD FAIL because the setRow function doesn't clear the list
     */
    @Test
    public void TestSettingRow1To3(){
    	HardLevel hardLevel = new HardLevel();
    	hardLevel.setRow1(3);
    	assertEquals(3, hardLevel.getBeadAmount(1));
    }
    
    /**
     * The function should return 0, the desired amount
     * The function SHOULD FAIL because the setRow function doesn't clear the list when called
     */
    @Test
    public void TestSettingRow1To0(){
    	HardLevel hardLevel = new HardLevel();
    	hardLevel.setRow1(0);
    	assertEquals(0, hardLevel.getBeadAmount(1));
    }
    
    /**
     * The function doesn't allow for negatives, so the functions shouldn't change the original value
     */
    @Test
    public void TestSettingRow1ToNegative(){
    	HardLevel hardLevel = new HardLevel();
    	int currentBeads = hardLevel.getBeadAmount(1);
    	hardLevel.setRow1(-6);
    	assertEquals(currentBeads, hardLevel.getBeadAmount(1));
    }
    
    /**
     * The function should return 3, the new amount that was given
     * The function SHOULD FAIL because the setRow function doesn't clear the list
     */
    @Test
    public void TestSettingRow2To3(){
    	HardLevel hardLevel = new HardLevel();
    	hardLevel.setRow2(3);
    	assertEquals(3, hardLevel.getBeadAmount(2));
    }
    
    /**
     * The function should return 0, the desired amount
     * The function SHOULD FAIL because the setRow function doesn't clear the list when called
     */
    @Test
    public void TestSettingRow2To0(){
    	HardLevel hardLevel = new HardLevel();
    	hardLevel.setRow2(0);
    	assertEquals(0, hardLevel.getBeadAmount(2));
    }
    
    /**
     * The function doesn't allow for negatives, so the functions shouldn't change the original value
     */
    @Test
    public void TestSettingRow2ToNegative(){
    	HardLevel hardLevel = new HardLevel();
    	int currentBeads = hardLevel.getBeadAmount(2);
    	hardLevel.setRow2(-6);
    	assertEquals(currentBeads, hardLevel.getBeadAmount(2));
    }
    
    /**
     * The function should return 3, the new amount that was given
     * The function SHOULD FAIL because the setRow function doesn't clear the list
     */
    @Test
    public void TestSettingRow3To3(){
    	HardLevel hardLevel = new HardLevel();
    	hardLevel.setRow3(3);
    	assertEquals(3, hardLevel.getBeadAmount(3));
    }
    
    /**
     * The function should return 0, the desired amount
     * The function SHOULD FAIL because the setRow function doesn't clear the list when called
     */
    @Test
    public void TestSettingRow3To0(){
    	HardLevel hardLevel = new HardLevel();
    	hardLevel.setRow3(0);
    	assertEquals(0, hardLevel.getBeadAmount(3));
    }
    
    /**
     * The function doesn't allow for negatives, so the functions shouldn't change the original value
     */
    @Test
    public void TestSettingRow3ToNegative(){
    	HardLevel hardLevel = new HardLevel();
    	int currentBeads = hardLevel.getBeadAmount(3);
    	hardLevel.setRow3(-6);
    	assertEquals(currentBeads, hardLevel.getBeadAmount(3));
    }
    /**
     * The function should return 4, the new amount that was given
     * The function SHOULD FAIL because the setRow function doesn't clear the list
     */
    @Test
    public void TestSettingRow4To4(){
        HardLevel hardLevel = new HardLevel();
        hardLevel.setRow4(4);
        assertEquals(4, hardLevel.getBeadAmount(4));
    }

    /**
     * The function should return 0, the desired amount
     * The function SHOULD FAIL because the setRow function doesn't clear the list when called
     */
    @Test
    public void TestSettingRow4To0(){
        HardLevel hardLevel = new HardLevel();
        hardLevel.setRow4(0);
        assertEquals(0, hardLevel.getBeadAmount(4));
    }

    /**
     * The function doesn't allow for negatives, so the functions shouldn't change the original value
     */
    @Test
    public void TestSettingRow4ToNegative(){
        HardLevel hardLevel = new HardLevel();
        int currentBeads = hardLevel.getBeadAmount(4);
        hardLevel.setRow4(-6);
        assertEquals(currentBeads, hardLevel.getBeadAmount(4));
    }
    /**
     * WinCheck should return true since all lists are empty
     */
    @Test
    public void TesWinCheckAllRowsEmpty(){
    	Level level = new HardLevel();
    	level.removeBeads(1, 2);
    	level.removeBeads(2, 3);
    	level.removeBeads(3, 8);
    	level.removeBeads(4, 9);
    	assertTrue(level.WinCheck());
    }
    
    /**
     * WinCheck should return false since no lists are empty
     */
    @Test
    public void TestWinCheckAllRowsFull(){
    	Level level = new HardLevel();
    	assertFalse(level.WinCheck());
    }
}