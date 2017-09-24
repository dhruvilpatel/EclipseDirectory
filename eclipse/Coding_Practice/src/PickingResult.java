
public class PickingResult {

	
	String productId; 
	int amountToPick;
	PickingResult(String productId)
	{
		this.productId=productId;
		
	}
	PickingResult(String productId,int amountToPick)
	{
		this.productId=productId;
		this.amountToPick=amountToPick;

	}
}
