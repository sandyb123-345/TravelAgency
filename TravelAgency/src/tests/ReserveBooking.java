package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import net.jodah.failsafe.internal.util.Assert;
import pages.Confirmation;
import pages.FindFlights;
import pages.Purchase;
import pages.Reserve;

public class ReserveBooking extends SetupAndTearDown{
	
	

	@Test
	public void VerifyBookFlight() {
		//search flight based on departure city and destination city
		findFlights.findFlights("Boston", "Dublin");
		
		//select flight based on flight number required
		generic.click(reserve.objChooseFlight("43"));
		
		//confirm purchase page displayed, provide valid details for personal details and card
		assertTrue(generic.getText(Purchase.LBL_TITLE_PURCHASE).contains("has been reserved"));
		purchase.enterPersonalDetails("John smith", "street 31", "Houston", "Texas", "77010");
		purchase.enterCardDetails("Visa", "4111111111111111", "10", "2023", "John Smith");
		generic.click(Purchase.BTN_PURCHASE_FLIGHT);
		
		//confirm flight booking order is confirmed
		assertTrue(generic.getText(Confirmation.LBL_TITLE_CONFIRMATION).contains("Thank you for your purchase today!"));
		assertNotEquals("",generic.getText(Confirmation.LBL_ID));		
	}
	
	@Test
	public void VerifyBookFlightWithoutPurchaseData() {
		//search flight based on departure city and destination city
		findFlights.findFlights("Boston", "Dublin");
		
		//select flight based on flight number required
		generic.click(reserve.objChooseFlight("43"));
		
		//confirm purchase page displayed,do not provide valid for personal details and card and try to continue to confirmation page
		assertTrue(generic.getText(Purchase.LBL_TITLE_PURCHASE).contains("has been reserved"));
		generic.click(Purchase.BTN_PURCHASE_FLIGHT);
		
		//flight booking should not be confirmed
		assertFalse(generic.isDsiplayed(Confirmation.LBL_TITLE_CONFIRMATION));	
	}
}
