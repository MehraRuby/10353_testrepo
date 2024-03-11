package mypack;

public class Product 
{
	private String productName;
	private double price;
	private int quantity;
	private String category;
	private double discountedprice;
	
	public Product() {}
	public Product(String prdtnm , double pr,int qty,String cat,double disprice)
	{
		this.productName = prdtnm;
		this.price = pr;
		this.quantity = qty;
		this.category = cat;
		this.discountedprice = disprice;
	}
	
	

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + ", quantity=" + quantity + ", category="
				+ category + ", discountedprice=" + discountedprice + "]";
	}
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getDiscountedprice() {
		return discountedprice;
	}
	public void setDiscountedprice(double discountedprice) {
		this.discountedprice = discountedprice;
	}
	
	
	
}
