package housebuilder;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HouseTest {


	House basicHouse, customHouse, deluxeHouse, deluxeCustomHouse;
	int budget, basicSize, deluxeSize, customSize, deluxeCustomSize, smallBudget, modestBudget, largeBudget, maxBudget;

	@Before
	public void setUp() throws Exception {
		basicSize = 160;
		deluxeSize = 240;
		customSize = 320;
		deluxeCustomSize = 400;
		smallBudget = 100000;
		modestBudget = 250000;
		largeBudget = 500000;
		maxBudget = 1000000;

		basicHouse = new House(basicSize, "basic");
		deluxeHouse = new House(deluxeSize, "deluxe");
		customHouse = new House(customSize, "custom");
		deluxeCustomHouse = new House(deluxeCustomSize, "deluxe custom");
	}

	@After
	public void tearDown() throws Exception {
		basicHouse = null;
		deluxeHouse = null;
		customHouse = null;
		deluxeCustomHouse = null;
	}

	@Test
	public void testWithinSmallBudget() {
		assertTrue(basicHouse.withinBudget(smallBudget));
		assertFalse(deluxeHouse.withinBudget(smallBudget));
		assertFalse(customHouse.withinBudget(smallBudget));
		assertFalse(deluxeCustomHouse.withinBudget(smallBudget));
	}

	@Test
	public void testWithinModestBudget() {
		assertTrue(basicHouse.withinBudget(modestBudget));
		assertTrue(deluxeHouse.withinBudget(modestBudget));
		assertFalse(customHouse.withinBudget(modestBudget));
		assertFalse(deluxeCustomHouse.withinBudget(modestBudget));
	}

	@Test
	public void testWithinLargeBudget() {
		assertTrue(basicHouse.withinBudget(largeBudget));
		assertTrue(deluxeHouse.withinBudget(largeBudget));
		assertTrue(customHouse.withinBudget(largeBudget));
		assertFalse(deluxeCustomHouse.withinBudget(largeBudget));
	}
	
	@Test
	public void testWithinMaxBudget() {
		assertTrue(basicHouse.withinBudget(maxBudget));
		assertTrue(deluxeHouse.withinBudget(maxBudget));
		assertTrue(customHouse.withinBudget(maxBudget));
		assertTrue(deluxeCustomHouse.withinBudget(maxBudget));
	}

}
