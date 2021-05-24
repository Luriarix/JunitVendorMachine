package vendormachine.users.util;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class WalletTEST {

	Wallet sample = new Wallet();		
	
	@BeforeEach
	public void setup() {
		sample = new Wallet(50);
	}
	
    @Test
    public void addCreditTest(){
    	sample.addCredit(25);
    	assertEquals(75, sample.getAllCredit());
    }
    
    @Test
    public void brandTest(){
    	assertEquals("Generic", sample.getBrand(null));
    	
    	sample.setBrand("Coke");
    	assertEquals("Coke",sample.getBrand(null));
    	
    	sample = new Wallet("Pepsi", 0);
    	assertEquals("Pepsi",sample.getBrand(null));
    }
    
    @Test
    public void creditTest(){
    	sample.setCredit(75);
    	assertEquals(75, sample.getAllCredit());
    	
    	assertEquals(25, sample.getCredit(25));
    	assertEquals(50, sample.getAllCredit());
    	
    	
    	assertEquals(0, sample.getCredit(100));
    }
}
