package vendormachine;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import vendormachine.users.Person;
import vendormachine.vendors.DrinkVendingMachine;
import vendormachine.vendors.enums.BRANDS;

public class DrinkVendingMachineTEST {
	
	/** 
	 * Task 2:
	 * 	Objective:
	 * 		Test the Wallet class from:
	 * 		'vendormachine.vendors.DrinkVendingMachine'
	 * 
	 * 	Goal: 
	 * 		80% code/line coverage
	 * 		TDD: analyse code and add missing methods.
	 * */
	
	DrinkVendingMachine sample = new DrinkVendingMachine();
	
	@BeforeEach
	public void beforeTest() {
		sample = new DrinkVendingMachine();
	}
	

	@Test
	public void selectDrinkTest() {
		assertEquals(null, sample.selectDrink(1));
		
		sample = new DrinkVendingMachine(100, BRANDS.EnergyMax);
		assertEquals("VanillaBurst", sample.selectDrink(1).name);
		
		assertEquals(null, sample.selectDrink(-1));
	}
	
	
//	@Test
//	public void giveCreditTest() {
//		sample.giveCredit(null, 0);
//		
//		sample = new DrinkVendingMachine(100, BRANDS.EnergyMax);
//		assertEquals("VanillaBurst", sample.selectDrink(1).name);
//		
//		assertEquals(null, sample.selectDrink(-1));
//	}
}
