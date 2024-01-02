package com.edu;
class Customer{
	int id;
	String name;
	double walletBalance;
	String address;
	public Customer(int id, String name, double walletBalance, String address) {
		super();
		this.id = id;
		this.name = name;
		this.walletBalance = walletBalance;
		this.address = address;
	}
}

class Item{
	int id;
	String name;
	String companyName;
	double price;
	boolean isInStock;
	public Item(int id, String name, String companyName, double price, boolean isInStock) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.isInStock = isInStock;
	}
	
}

class ShoppingWebsite{
	public String purchaseItem(Item i, Customer c) throws ItemOutOfStockException,
	InsufficientBalanceException{
		if(!i.isInStock) {
			throw new ItemOutOfStockException("item is out of stock");
		}
		
		if(i.price>c.walletBalance) {
			throw new InsufficientBalanceException ("customer wallet balance is not sufficient");
			
		}
		c.walletBalance =c.walletBalance-i.price;
        return "Order Successful";
		
	}
}
class InsufficientBalanceException extends Exception{
	
	public InsufficientBalanceException(String message) {
		super(message);
		
	}
}

class ItemOutOfStockException extends Exception{
	public ItemOutOfStockException(String message) {
		super(message);
		
	}
}

public class Main {

	public static void main(String[] args) {
		
		Customer cusDet = new Customer (927392, "Steve",5000.0, "USA");
		Item itemDet = new Item (27392, "T-Shirt", "US polo", 800, true);
		ShoppingWebsite obj = new ShoppingWebsite(); 
		String out="";
		try {
			 out = obj.purchaseItem(itemDet, cusDet);
		} catch (ItemOutOfStockException e) {
			out=e.getMessage();
		}
		catch(InsufficientBalanceException e){
			out=e.getMessage();
			
		}
		System.out.println("out="+out);

	}

}
