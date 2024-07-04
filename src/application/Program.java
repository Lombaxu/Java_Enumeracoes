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
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Bith date (DD/MM/YYYY): ");
		Date birthDate = birth.parse(sc.next());
		sc.nextLine();
		Client client = new Client(name, email, birthDate);
		
		System.out.println();
		
		
		
		System.out.println("Enter order data:");
		Date moment = new Date();
		System.out.print("Status: ");
		String status = sc.nextLine();
		Order order = new Order(moment, OrderStatus.valueOf(status));
		
		System.out.print("How many items to this order? ");
		int items = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= item; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			Product product = new Product(productName, price);
			System.out.println("Quantity: ");
			Integer quantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(quantity, price);
			orderItem.addProduct(product);
		}
		
		System.out.println();
		
		System.out.println(order);
		System.out.println(client);
		
		System.out.println(String.format("%.2f", orderItem));
		
		
		sc.close();
		
	}

}
