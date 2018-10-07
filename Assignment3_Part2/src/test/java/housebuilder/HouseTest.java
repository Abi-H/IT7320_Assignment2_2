package housebuilder;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import housebuilder.House;

public class HouseTest {


	House basicHouse, customHouse, deluxeHouse, deluxeCustomHouse;
	int basicSize, deluxeSize, customSize, deluxeCustomSize, smallBudget, modestBudget, largeBudget, maxBudget;
	int smallBedrooms, smallBathrooms, mediumBedrooms, mediumBathrooms, largeBedrooms, largeBathrooms;

	@Before
	public void setUp() throws Exception {
		basicSize = 160;
		deluxeSize = 240;
		customSize = 320;
		deluxeCustomSize = 400;
		
		smallBudget = 200000;
		modestBudget = 350000;
		largeBudget = 600000;
		maxBudget = 1200000;
		
		smallBedrooms = 1;
		mediumBedrooms = 3;
		largeBedrooms = 4;
		
		smallBathrooms = 1;
		mediumBathrooms = 1;
		largeBathrooms = 2;

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
		basicHouse.setBedrooms(smallBedrooms);
		basicHouse.setBathrooms(smallBathrooms);
		assertTrue(basicHouse.withinBudget(smallBudget));
				
		basicHouse.setBedrooms(mediumBedrooms);
		basicHouse.setBathrooms(mediumBathrooms);
		assertTrue(basicHouse.withinBudget(smallBudget));
		
		basicHouse.setBedrooms(largeBedrooms);
		basicHouse.setBathrooms(largeBathrooms);
		assertFalse(basicHouse.withinBudget(smallBudget));
		
		deluxeHouse.setBedrooms(smallBedrooms);
		deluxeHouse.setBathrooms(smallBathrooms);
		assertFalse(deluxeHouse.withinBudget(smallBudget));
		
		deluxeHouse.setBedrooms(mediumBedrooms);
		deluxeHouse.setBathrooms(mediumBathrooms);
		assertFalse(deluxeHouse.withinBudget(smallBudget));
		
		deluxeHouse.setBedrooms(largeBedrooms);
		deluxeHouse.setBathrooms(largeBathrooms);
		assertFalse(deluxeHouse.withinBudget(smallBudget));
		
		customHouse.setBedrooms(smallBedrooms);
		customHouse.setBathrooms(smallBathrooms);
		assertFalse(customHouse.withinBudget(smallBudget));
		
		customHouse.setBedrooms(mediumBedrooms);
		customHouse.setBathrooms(mediumBathrooms);
		assertFalse(customHouse.withinBudget(smallBudget));
		
		customHouse.setBedrooms(largeBedrooms);
		customHouse.setBathrooms(largeBathrooms);
		assertFalse(customHouse.withinBudget(smallBudget));
		
		deluxeCustomHouse.setBedrooms(mediumBedrooms);
		deluxeCustomHouse.setBathrooms(mediumBathrooms);
		assertFalse(deluxeCustomHouse.withinBudget(largeBudget));
		
		deluxeCustomHouse.setBedrooms(largeBedrooms);
		deluxeCustomHouse.setBathrooms(largeBathrooms);
		assertFalse(deluxeCustomHouse.withinBudget(largeBudget));	
	}

	@Test
	public void testWithinModestBudget() {
		basicHouse.setBedrooms(smallBedrooms);
		basicHouse.setBathrooms(smallBathrooms);
		assertTrue(basicHouse.withinBudget(modestBudget));
				
		basicHouse.setBedrooms(mediumBedrooms);
		basicHouse.setBathrooms(mediumBathrooms);
		assertTrue(basicHouse.withinBudget(modestBudget));
		
		basicHouse.setBedrooms(largeBedrooms);
		basicHouse.setBathrooms(largeBathrooms);
		assertTrue(basicHouse.withinBudget(modestBudget));
		
		deluxeHouse.setBedrooms(smallBedrooms);
		deluxeHouse.setBathrooms(smallBathrooms);
		assertTrue(deluxeHouse.withinBudget(modestBudget));
		
		deluxeHouse.setBedrooms(mediumBedrooms);
		deluxeHouse.setBathrooms(mediumBathrooms);
		assertTrue(deluxeHouse.withinBudget(modestBudget));
		
		deluxeHouse.setBedrooms(largeBedrooms);
		deluxeHouse.setBathrooms(largeBathrooms);
		assertFalse(deluxeHouse.withinBudget(modestBudget));
		
		customHouse.setBedrooms(smallBedrooms);
		customHouse.setBathrooms(smallBathrooms);
		assertFalse(customHouse.withinBudget(modestBudget));
		
		customHouse.setBedrooms(mediumBedrooms);
		customHouse.setBathrooms(smallBathrooms);
		assertFalse(customHouse.withinBudget(modestBudget));
		
		customHouse.setBedrooms(largeBedrooms);
		customHouse.setBathrooms(smallBathrooms);
		assertFalse(customHouse.withinBudget(modestBudget));
		
		deluxeCustomHouse.setBedrooms(smallBedrooms);
		deluxeCustomHouse.setBathrooms(smallBathrooms);
		assertFalse(deluxeCustomHouse.withinBudget(modestBudget));
		
		deluxeCustomHouse.setBedrooms(mediumBedrooms);
		deluxeCustomHouse.setBathrooms(mediumBathrooms);
		assertFalse(deluxeCustomHouse.withinBudget(modestBudget));
		
		deluxeCustomHouse.setBedrooms(largeBedrooms);
		deluxeCustomHouse.setBathrooms(largeBathrooms);
		assertFalse(deluxeCustomHouse.withinBudget(modestBudget));
	}

	@Test
	public void testWithinLargeBudget() {
		basicHouse.setBedrooms(smallBedrooms);
		basicHouse.setBathrooms(smallBathrooms);
		assertTrue(basicHouse.withinBudget(largeBudget));
				
		basicHouse.setBedrooms(mediumBedrooms);
		basicHouse.setBathrooms(mediumBathrooms);
		assertTrue(basicHouse.withinBudget(largeBudget));
		
		basicHouse.setBedrooms(largeBedrooms);
		basicHouse.setBathrooms(largeBathrooms);
		assertTrue(basicHouse.withinBudget(largeBudget));
		
		deluxeHouse.setBedrooms(smallBedrooms);
		deluxeHouse.setBathrooms(smallBathrooms);
		assertTrue(deluxeHouse.withinBudget(largeBudget));
		
		deluxeHouse.setBedrooms(mediumBedrooms);
		deluxeHouse.setBathrooms(mediumBathrooms);
		assertTrue(deluxeHouse.withinBudget(largeBudget));
		
		deluxeHouse.setBedrooms(largeBedrooms);
		deluxeHouse.setBathrooms(largeBathrooms);
		assertTrue(deluxeHouse.withinBudget(largeBudget));
		
		customHouse.setBedrooms(smallBedrooms);
		customHouse.setBathrooms(smallBathrooms);
		assertTrue(customHouse.withinBudget(largeBudget));
		
		customHouse.setBedrooms(mediumBedrooms);
		customHouse.setBathrooms(smallBathrooms);
		assertTrue(customHouse.withinBudget(largeBudget));
		
		customHouse.setBedrooms(largeBedrooms);
		customHouse.setBathrooms(smallBathrooms);
		assertTrue(customHouse.withinBudget(largeBudget));
		
		deluxeCustomHouse.setBedrooms(smallBedrooms);
		deluxeCustomHouse.setBathrooms(smallBathrooms);
		assertFalse(deluxeCustomHouse.withinBudget(largeBudget));
		
		deluxeCustomHouse.setBedrooms(mediumBedrooms);
		deluxeCustomHouse.setBathrooms(mediumBathrooms);
		assertFalse(deluxeCustomHouse.withinBudget(largeBudget));
		
		deluxeCustomHouse.setBedrooms(largeBedrooms);
		deluxeCustomHouse.setBathrooms(largeBathrooms);
		assertFalse(deluxeCustomHouse.withinBudget(largeBudget));
	}
	
	@Test
	public void testWithinMaxBudget() {
		basicHouse.setBedrooms(smallBedrooms);
		basicHouse.setBathrooms(smallBathrooms);
		assertTrue(basicHouse.withinBudget(maxBudget));
				
		basicHouse.setBedrooms(mediumBedrooms);
		basicHouse.setBathrooms(mediumBathrooms);
		assertTrue(basicHouse.withinBudget(maxBudget));
		
		basicHouse.setBedrooms(largeBedrooms);
		basicHouse.setBathrooms(largeBathrooms);
		assertTrue(basicHouse.withinBudget(maxBudget));
		
		deluxeHouse.setBedrooms(smallBedrooms);
		deluxeHouse.setBathrooms(smallBathrooms);
		assertTrue(deluxeHouse.withinBudget(maxBudget));
		
		deluxeHouse.setBedrooms(mediumBedrooms);
		deluxeHouse.setBathrooms(mediumBathrooms);
		assertTrue(deluxeHouse.withinBudget(maxBudget));
		
		deluxeHouse.setBedrooms(largeBedrooms);
		deluxeHouse.setBathrooms(largeBathrooms);
		assertTrue(deluxeHouse.withinBudget(maxBudget));
		
		customHouse.setBedrooms(smallBedrooms);
		customHouse.setBathrooms(smallBathrooms);
		assertTrue(customHouse.withinBudget(maxBudget));
		
		customHouse.setBedrooms(mediumBedrooms);
		customHouse.setBathrooms(smallBathrooms);
		assertTrue(customHouse.withinBudget(maxBudget));
		
		customHouse.setBedrooms(largeBedrooms);
		customHouse.setBathrooms(smallBathrooms);
		assertTrue(customHouse.withinBudget(maxBudget));
		
		deluxeCustomHouse.setBedrooms(smallBedrooms);
		deluxeCustomHouse.setBathrooms(smallBathrooms);
		assertTrue(deluxeCustomHouse.withinBudget(maxBudget));
		
		deluxeCustomHouse.setBedrooms(mediumBedrooms);
		deluxeCustomHouse.setBathrooms(mediumBathrooms);
		assertTrue(deluxeCustomHouse.withinBudget(maxBudget));
		
		deluxeCustomHouse.setBedrooms(largeBedrooms);
		deluxeCustomHouse.setBathrooms(largeBathrooms);
		assertTrue(deluxeCustomHouse.withinBudget(maxBudget));
	}

}
