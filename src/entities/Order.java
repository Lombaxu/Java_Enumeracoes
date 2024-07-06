package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat time = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> items =  new ArrayList<>();

	public Order() {
	}
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public Date getMoment() {
		return moment;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public List<OrderItem> getItems() {
		return items;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		double totalPrice = 0;
		for (OrderItem p : items) {
			totalPrice += p.subTotal();
		}
		return totalPrice;
	}
	
	public String toString() {
		StringBuilder order = new StringBuilder();
		order.append("ORDER SUMMARY: \n");
		order.append("Order moment: " + time.format(moment) + "\n");
		order.append("Order status: " + status + "\n");
		order.append(client);
		order.append("Order Items: \n");
		for (OrderItem p : items) {
			order.append(p.getProduct() +", $" + String.format("%.2f", p.getPrice()) +
			", Quantity: " + p.getQuantity() + ", Subtotal: $" +  String.format("%.2f", p.subTotal()) + "\n");
		}
		order.append("Total price: $" +  String.format("%.2f", total()));
		return order.toString();
	}

}
