package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat birth = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = birth.parse(sc.next());
		sc.nextLine();
		Client client = new Client(clientName, email, birthDate);
		
		System.out.println();
		
		System.out.println("Enter order data:");
		Date moment = new Date();
		System.out.print("Status: ");
		String status = sc.nextLine();
		Order order = new Order(moment, OrderStatus.valueOf(status), client);
		
		System.out.print("How many items to this order? ");
		int i = sc.nextInt();
		sc.nextLine();
		
		for (int c = 1; c <= i; c++) {
			System.out.println("Enter #" + c + " item data:");
			System.out.print("Product name: ");
			String name = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			sc.nextLine();
			OrderItem orderItem = new OrderItem(quantity, price, new Product(name, price));
			order.addItem(orderItem);
		}
		
		System.out.println();
		
		System.out.println(order);
			
		sc.close();
		
	}

}
