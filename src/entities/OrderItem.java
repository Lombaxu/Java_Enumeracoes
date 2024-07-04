package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	private List<Product> products = new ArrayList<>();

	public OrderItem() {
	}
	
	public OrderItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public List<Product> getProduct() {
		return products;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public void removeProduct(Product product) {
		products.remove(product);
	}
	
	public Double subTotal(int quantity, int price) {
		double totalPrice = 0;
		for (Product p : product) {
			totalPrice += price;
		}
		return totalPrice;
	}

}
