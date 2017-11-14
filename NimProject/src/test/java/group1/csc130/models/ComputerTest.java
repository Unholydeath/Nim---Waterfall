package group1.csc130.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerTest {
	
	/**
	 * Returns whether the chooseRow function returned a number within the given range
	 */
	@Test
	public void TestChooseRow(){
		Computer comp = new Computer();
		int maxRows = 3;
		int row = comp.chooseRow(maxRows);
		assertTrue(row >= 1 && row <= maxRows);
	}
	
	/**
	 * Returns whether the chooseRow function returned a number within the given range
	 */
	@Test
	public void Test2ChooseRow(){
		Computer comp = new Computer();
		int maxRows = 6;
		int row = comp.chooseRow(maxRows);
		assertTrue(row >= 1 && row <= maxRows);
	}
	
	/**
	 * Returns whether the chooseBeads function returned a number within the given range
	 */
	@Test
	public void TestChooseBeads(){
		Computer comp = new Computer();
		int range = 5;
		int beads = comp.chooseBeads(range);
		assertTrue(beads >= 1 && beads <= range);
	}
	
	/**
	 * Returns whether the chooseBeads function returned a number within the given range
	 */
	@Test
	public void Test2ChooseBeads(){
		Computer comp = new Computer();
		int range = 7;
		int beads = comp.chooseBeads(range);
		assertTrue(beads >= 1 && beads <= range);
	}
}