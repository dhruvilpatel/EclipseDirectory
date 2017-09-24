
public class RestockingResult {

	String productId; 
	int amountToRestock;
	
	RestockingResult(String productId)
	{
		this.productId=productId;
		
	}
	RestockingResult(String productId ,int amountToRestock)
	{
		this.productId=productId;
		this.amountToRestock =amountToRestock;
	}
}
