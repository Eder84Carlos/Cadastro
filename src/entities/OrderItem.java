package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	private Product product;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Double price, Product product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuatity() {
		return quantity;
	}

	public void setQuatity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subTotal() {
		return 0;
	}

	@Override
	public String toString() {
		return "OrderItem [quantity=" + quantity + ", price=" + price + ", product=" + product + "]";
	}

}
