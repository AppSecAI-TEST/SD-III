class DoTaxes {
    float rate;
	float doColorado() {
	  SalesTaxRates str = new SalesTaxRates();
	  rate = str.salesRate; 	//ouch
								//this should be a method call
								// rate = str.getSalesRate("CO");
		// do stuff with rate	
		
	}
}
class SalesTaxRates {
	public float salesRate;				// should be private
	public float adjustedSalesRate;		// should be private
	public float getSalesRate(String region) {
		salesRate = new DoTaxes().doColorado(); // ouch again!
		// do region-based calculations
		return adjustedSalesRate;
	}
}
