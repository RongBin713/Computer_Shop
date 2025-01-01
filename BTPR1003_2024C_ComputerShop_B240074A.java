/*NAME		  : CHEW RONG BIN
 *STUDENT ID  : B240074A
 *BATCH		  : BoS24-A1
 *SUBMIT DATE : 2/1/2025
 
 *PROJECT: COMPUTER SHOP
*/

import java.util.ArrayList;
import java.util.Scanner;

public class BTPR1003_2024C_ComputerShop_B240074A{
	
	private static void displayWelcomeMessage() {
   	 	System.out.println("***********************************");
    	System.out.println("   Welcome to Computer Shop   ");
    	System.out.println("***********************************");
	}
	
	 private static String[] getCustomerInformation(Scanner input) {
        String[] customerInfo = new String[5];
        System.out.print("Name: ");
        customerInfo[0] = input.nextLine();
        System.out.print("Email: ");
        customerInfo[1] = input.nextLine();
        System.out.print("Phone Number: ");
        customerInfo[2] = input.nextLine();
        System.out.print("Address: ");
        customerInfo[3] = input.nextLine();
        System.out.print("Payment Method (Online transfer/TNG): ");
        customerInfo[4] = input.nextLine();
        return customerInfo;
    }

    private static void displayReceipt(ArrayList<String> items,double subtotal,double tax,double shippingFee,double totalPrice,String[] customerInfo) {
        System.out.println("\n***********************************");
        System.out.println("             RECEIPT             ");
        System.out.println("***********************************");

        System.out.println("Items Purchased:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }

		System.out.printf("\nSubtotal (before tax): MYR %.2f\n", subtotal);
		System.out.printf("Tax (6%%): MYR %.2f\n", tax);
		System.out.printf("Shipping Fee: MYR %.2f\n", shippingFee);
		System.out.printf("Total Price (after tax): MYR %.2f\n", totalPrice + shippingFee);

        System.out.println("\nCustomer Information:");
        System.out.println("Name: " + customerInfo[0]);
        System.out.println("Email: " + customerInfo[1]);
        System.out.println("Phone Number: " + customerInfo[2]);
        System.out.println("Address: " + customerInfo[3]);
        System.out.println("Payment Method: " + customerInfo[4]);

        System.out.println("\nThank you for shopping with us! Come again!");
        System.out.println("***********************************");
    }

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
		
			int gaming = 0;
			int business = 0;
			int everyday = 0;
			int packages = 0;
			double price = 0;
			double shippingFee = 5.5;
			double totalPrice = 0;
			double tax = 0;
			double subtotal = 0;
			String ansagain;
			String computer = "Not selected";
			ArrayList<String>items = new ArrayList<>();
			
			//start
			displayWelcomeMessage();
						
			//Stock
			int[] gamingStock = {10, 10, 10};
        	int[] businessStock = {10, 10, 10};
      	  	int[] everydayStock = {10, 10, 10};
      	  					        
	        while(true){
	        System.out.println("1.Gaming Laptop");
	        System.out.println("2.Business Laptop");
	        System.out.println("3.Everyday Laptop");
	        
	        //chooose computer
	        System.out.print("Press the number to choose the types of computer : ");
	        	while(true){
	        		int type = input.nextInt();
	        		input.nextLine();
	        			if(type == 1){
	        				System.out.println("");
	        				System.out.println(" 1. ROG Strix Scar 16 (2024) [Intel Core i9-13980HX, 32GB, 1TB SSD, 16-inch QHD 240Hz] MYR 13,000 {Stock:" + gamingStock[0] + "}");
		        			System.out.println(" 2. ROG Zephyrus G14 [AMD Ryzen 9 7940HS, 16GB, 1TB SSD, 14-inch QHD 165Hz] MYR 8,500 {Stock:" + gamingStock[1] + "}");
		        			System.out.println(" 3. ROG Strix G17 [AMD Ryzen 7 6800H, 16GB, 512GB SSD, 17.3-inch FHD 144Hz] MYR 6,000 {Stock:" + gamingStock[2] + "}");
			        			while(true){
			        				System.out.print("Press the number to choose the computer(1/2/3) : ");
			        				gaming = input.nextInt();
			        				input.nextLine();
			        				if(gaming >= 1 && gaming <= 3){
	        							gamingStock[gaming - 1]--;
			        					break;
			        				}else{
			        					System.out.println("Please choose again");	
			        				}        					
		        				}
		        				break;
	        				
	        			}else if(type == 2){
	        				System.out.println("");
	        				System.out.println(" 1. ASUS ExpertBook B9 (B9400) [Intel Core i7-1260P, 16GB, 1TB SSD, 14-inch FHD] MYR 6,800 {Stock:" + businessStock[0] + "}");
		        			System.out.println(" 2. ASUS ZenBook 14 OLED (UX3402) [Intel Core i5-1240P, 8GB, 512GB SSD, 14-inch 2.8K OLED] MYR 5,500 {Stock:" + businessStock[1] + "}");
		        			System.out.println(" 3. ASUS VivoBook S15 (K3502) [Intel Core i7-12700H, 16GB, 512GB SSD, 15.6-inch FHD] MYR 4,200 {Stock:" + businessStock[2] + "}");
		        				while(true){
			        				System.out.print("Press the number to choose the computer(1/2/3) : ");
			        				business = input.nextInt();
			        				input.nextLine();
			        				if(business >= 1 && business <= 3){
			        					businessStock[business - 1]--;
			        					break;
			        				}else{
			        					System.out.println("Please choose again");	
			        				}        					
		        				}
		        				break;
		        			
	        			}else if(type == 3){
	        				System.out.println("");
	        				System.out.println(" 1. ASUS VivoBook 15 [Intel Core i5-1235U, 8GB, 512GB SSD, 15.6-inch FHD] MYR 2,800 {Stock:" + everydayStock[0] + "}");
		        			System.out.println(" 2. ASUS aDot 14 Air [Intel Core i3-1215U, 8GB, 256GB SSD, 14-inch FHD]  MYR 2,500 {Stock:" + everydayStock[1] + "}");
		        			System.out.println(" 3. ASUS VivoBook Go 12 [ Intel Celeron N4020, 4GB, 128GB eMMC, 11.6-inch HD] MYR 1,800 {Stock:" + everydayStock[2] + "}");
		        				while(true){
			        				System.out.print
			        					("Press the number to choose the computer(1/2/3) : ");
			        				everyday = input.nextInt();
			        				input.nextLine();
			        				if(everyday >= 1 && everyday <= 3){
			        					everydayStock[everyday - 1]--;
			        					break;
			        				}else{
			        					System.out.println("Please choose again");	
			        				}        					
		        				}
		        				break;
	        			}
	        					
	        			else{ 
	        				System.out.println("Have somethings wrong~ Please choose again(1/2/3)");
	        			}
	        	}
	        	
	        //choose package
	         	System.out.println("");
	           	System.out.println("1. Microsoft Software MYR 300");
	        	System.out.println("2. Antivirus Software MYR 200");
	        	System.out.println("3. Microsoft + Antivirus Software MYR 450");
	        	System.out.println("4. No");
	        	System.out.print("Press the number to choose the package(1/2/3/4) : ");
	        while(true){
	        	packages = input.nextInt();
	        	input.nextLine();
	        		if (packages >=1 && packages <=4){
	        			break;
	        		 }else{
	        		 	System.out.println("Have somethings wrong~ Please choose again(1/2/3/4)");
	        		 }
	        	}    
	        
	        
				//packages prices
				int[] packagePrices = {300, 200, 450, 0};
				String[] packageNames = {
				    " + Microsoft Software",
				    " + Antivirus Software",
				    " + Microsoft Software + Antivirus Software",
				    " only"
				};
				
				//computer names and prices
				String[][] computerNames = {
				    {"ROG Strix Scar 16 (2024)", "ROG Zephyrus G14", "ROG Strix G17"},
				    {"ASUS ExpertBook B9 (B9400)", "ASUS ZenBook 14 OLED (UX3402)", "ASUS VivoBook S15 (K3502)"},
				    {"ASUS VivoBook 15", "ASUS aDot 14 Air", "ASUS VivoBook Go 12"}
				};
				int[][] computerPrices = {
				    {13000, 8500, 6000},  // Gaming laptops
				    {6800, 5500, 4200},   // Business laptops
				    {2800, 2500, 1800}    // Everyday laptops
				};
				
				// determine selected computer and package
				if (gaming > 0) {
				    price = computerPrices[0][gaming - 1] + packagePrices[packages - 1];
				    computer = computerNames[0][gaming - 1] + packageNames[packages - 1];
				} else if (business > 0) {
				    price = computerPrices[1][business - 1] + packagePrices[packages - 1];
				    computer = computerNames[1][business - 1] + packageNames[packages - 1];
				} else if (everyday > 0) {
				    price = computerPrices[2][everyday - 1] + packagePrices[packages - 1];
				    computer = computerNames[2][everyday - 1] + packageNames[packages - 1];
				}
				
				//add computer iin list after buying
	        	items.add(computer);
	        		        	
	        	//total price
	        	price = price * 1.06;
				totalPrice += price;
				subtotal = totalPrice / 1.06;
				tax = totalPrice - subtotal;
	        
	        	//continue shopping?
	        	System.out.print("Want to buy again? Y/N: ");
					ansagain = input.next();
					input.nextLine();
					if(!ansagain.equalsIgnoreCase("Y")){
						break; 	
				}
	        }					
	    
	    //input customer information   	
        String[] customerInfo = getCustomerInformation(input);
        
        //show receipt
        displayReceipt(items, subtotal, tax, shippingFee, totalPrice, customerInfo);
        input.close();
    }
}