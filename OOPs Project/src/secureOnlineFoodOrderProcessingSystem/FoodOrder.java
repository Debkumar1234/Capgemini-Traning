package secureOnlineFoodOrderProcessingSystem;

public abstract class FoodOrder {
	private int orderId;
	private String customerName;
	private double orderAmount;
	public FoodOrder(int orderId, String customerName, double orderAmount) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.orderAmount = orderAmount;
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public double getOrderAmount() {
		return orderAmount;
	}
	
	protected void validateOrder() {
		if(orderAmount<0) {
			
		}
		
		if(customerName == null || customerName.trim().isEmpty()) {
			
		}
	}
}
