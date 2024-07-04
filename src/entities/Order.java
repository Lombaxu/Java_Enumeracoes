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
	
	private List<OrderItem> items =  new ArrayList<>();

	public Order() {
	}
	
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
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
	
	public List<OrderItem> getItems() {
		return items;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public String toString() {
		StringBuilder order = new StringBuilder();
		order.append("ORDER SUMMARY: \n");
		order.append("Order moment: " + time.format(moment) + "\n");
		order.append("Order status: " + status + "\n");
		return order.toString();
	}

}
