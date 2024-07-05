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
	
	public Double subTotal() {
		double totalProduct = 0;
		for (Product p : products) {
			price = p.getPrice() * quantity;
			totalProduct += price;
		}
		return totalProduct;
	}
	
	public String toString() {
		StringBuilder orderItem = new StringBuilder();
		orderItem.append("Order items:\n");
		for (Product p : products) {
			orderItem.append(p.getName() + ", $" + p.getPrice());
		}
		
		return orderItem.toString();
	}

}
