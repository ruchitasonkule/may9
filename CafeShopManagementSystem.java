package cafeProject1;

import java.util.Scanner;

public class CafeShopManagementSystem {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);

		        		// Declare menu items and item prices
		        String[] menuItems = {"Cold Coffee", "Tea", "Samosa", "Paneer Balls", "cheese_sandwich"};
		        double[] itemPrices = {30, 10,18, 120, 4.50};

		        			// Prompt user for number of items to order
		        System.out.print("Enter the number of items you want to order: ");
		        int numOfItems = scanner.nextInt();
		        scanner.nextLine(); // 

		        // Initialize variables for total bill and itemized receipt
		        double totalBill = 0.0;
		        System.out.println("\n--- Enter Your Order ---");

		        // Loop through each item to take orders
		        for (int i = 0; i < numOfItems; i++) 
		        {
		            System.out.print("Enter item " + (i + 1) + " name: ");
		            
		            String itemName = scanner.nextLine();
		            
		            System.out.print("Enter quantity for item " + (i + 1) + ": ");
		            
		            int quantity = scanner.nextInt();
		            scanner.nextLine(); 

		            // Find the price of the item from the menu
		            double itemPrice = 0.0;
		            for (int j = 0; j < menuItems.length; j++) 
		            {
		                if (itemName.equalsIgnoreCase(menuItems[j]))// equalsIgnoreCase 
		                											//itemname and menuitem are same i.e true
		                {									//itemname and menuitem both are diffrent i.e false
		                    itemPrice = itemPrices[j];
		                    break;
		                }
		            }

		            // Calculate the subtotal for the current item and add it to the total bill
		            double subtotal = itemPrice * quantity;
		            totalBill += subtotal;

		            // Display itemized receipt
		            System.out.println("Item: " + itemName + ", Quantity: " + quantity + ", Subtotal: " + subtotal);
		        }

		        
		        // Apply discount if total bill exceeds 50
		         double discountTotal = totalBill;	
		       
		        if (totalBill > 50) 
		        {
		            discountTotal = totalBill * 0.9; // Apply 10% discount
		            System.out.println("\nCongratulations! You have got a 10% discount!");
		        }
		        	// Display total bill
		        	System.out.println("\nTotal Bill: " + totalBill);
		        
		        if (totalBill != discountTotal) 
		        {
		            System.out.println("Discounted Total: " + discountTotal);
		        }
		      scanner.close();
	}

}
