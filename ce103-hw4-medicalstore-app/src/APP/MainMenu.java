package APP;
import java.util.Date;
import java.util.Scanner;

import DLL.MenuDesign;
import DLL.FileOperations;
import DLL.MainFunctions;
import DLL.CustomerFeature;
import DLL.SupplierFeature;
import DLL.MedicineFeature;
import DLL.SaleMedicineFeature;

import static java.lang.System.exit;

import java.io.IOException;
import java.text.SimpleDateFormat;



public class MainMenu {
	
	
	   
	    @SuppressWarnings({ "resource" })
		public static void main(String[] args) {
	    	
	    	
	    	
	    	
	        String[] options = {"|  Supplier Info  |   Customer Info  |   Medicine  |   Report  |   Bill   |  About  |   Exit  |"};
	                            
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        int option = 1;
	        String input;
	                
	        
	        
         
	        
	       
	       
	        while (option!=2){
	            MenuDesign.printMenu(options);
	            try {
	            	for(int i=0;i<=7;i++) {
	            		System.out.println("|                                                                                             |");
	            	}
	            	System.out.println("|                                  Welcome to Medical Store                                   |");
	            	for(int i=0;i<=7;i++) {
	            		System.out.println("|                                                                                             |");
	            	}
	            	System.out.println("-----------------------------------------------------------------------------------------------");
	            	System.out.print("|    Enter Operations Character Which You Want:");
	            	
	                input = scanner.next();
	                
	                switch (input){
	                    case "s","S": option1();option=1; break;
	                    case "c","C": option2();option=1; break;
	                    case "m","M": option3();option=1; break;
	                    case "r","R": option4();option=1; break;
	                    case "b","B": option5();option=1; break;
	                    case "a","A": option6();option=1; break;
	                    case "e","E": exit(0);option=2;
	                }
	            }
	            catch (Exception ex){
	                System.out.println("Please enter an integer value between 0 and 6");
	                break;
	                
	            	}
	        	}
	        }
	    
	// Options
	    private static void option1() {
	    	
	    	
	    	@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
	    	String supplierInput;
	    	int supplierId;
	    	long contactNum;
	    	String supplierName;
	    	String cityName;
	    	String email;
	    	String SupInput;
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	System.out.println("|                                       Supplier Info                                         |");
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	for(int i=0;i<=2;i++) {
        		System.out.println("|                                                                                             |");
        	}
	    	
	        System.out.println("|                                      Add New Supplier                                       |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                       Update Supplier                                       |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                       Search Supplier                                       |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                        List Supplier                                        |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                          Main Menu                                          |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("-----------------------------------------------------------------------------------------------");
	        try {
	        	
	        	System.out.print("|    Enter Operations Character Which You Want:");
	        supplierInput = scanner.next();
	         
            switch (supplierInput){
                case "a","A":
                	//To append, we convert the bytes to write data to the .dat file and then write it according to ASCII characters (Ex. A as 10)

                	System.out.println("-----------------------------------------------------------------------------------------------");
                	System.out.println("|                                       Add New Supplier                                      |");
                	System.out.println("-----------------------------------------------------------------------------------------------");
                	for(int i=0;i<=1;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	System.out.print("|  Supplier ID:");
                	supplierId = scanner.nextInt();
                	System.out.println("|                                                                                             |");
                	
                	System.out.print("|  Supplier Name:");
        	    	supplierName=scanner.next();
        	    	System.out.println("|                                                                                             |");
  
                	System.out.print("|  Contact Number:");
                	contactNum = scanner.nextLong();
        	    	System.out.println("|                                                                                             |");
        	    	
        	    	System.out.print("|  City Name:");
        	    	cityName=scanner.next();
        	    	System.out.println("|                                                                                             |");
        	    	
        	    	System.out.print("|  Email:");
        	    	email=scanner.next();
        	    	System.out.println("|                                                                                             |");
        	    	
        	    	System.out.print("|                           <<Press s for Save,Press c for Cancel[s/c]>>");
        	    	SupInput=scanner.next();
        	    	switch(SupInput) {
        	    	case "s","S":
        	    		MainFunctions.AddSupplier(supplierId, contactNum, supplierName, cityName, email);
        	    		for(int i=0;i<=2;i++) {
                    		System.out.println("|                                                                                             |");
                    	}
        	    		System.out.println("-----------------------------------------------------------------------------------------------");
                    	System.out.println("|                               Supplier Added Successfully                                   |");
                    	System.out.println("-----------------------------------------------------------------------------------------------");
                    	
                    	Thread.sleep(2500);
                    	break;
                    	
                    	
        	    	case "c","C":
        	    		
        	    		break;
        	    	}
                	
                	break;
                	
                	
                case "u","U": 
                	
                	//To update, we first generate the bytes of the data from the file and then read it.

                	int supplierUptadeId;
                	System.out.println("-----------------------------------------------------------------------------------------------");
	            	System.out.println("|                                       Update Supplier                                      |");
	            	System.out.println("-----------------------------------------------------------------------------------------------");
	            	for(int i=0;i<=1;i++) {
	            		System.out.println("|                                                                                             |");
	            	}
	            	System.out.print("|  Supplier ID:");
	            	supplierUptadeId = scanner.nextInt();
	                	
	            	try {
	            	for(int c =1 ; c<5 ;c++)
	        		{
            		
            		
	        			byte[] supplierWrittenBytes = FileOperations.readBlock(c, SupplierFeature.SUPPLIER_DATA_BLOCK_SIZE, "supplier.dat");
	        			
	        			
	        			
	        				
	        				SupplierFeature supplierWrittenObject = SupplierFeature.ByteArrayBlockToBook(supplierWrittenBytes);
	        				
	        			
	        			if(supplierUptadeId==supplierWrittenObject.getId()) {
						
						
						System.out.println(" Supplier Num: " + supplierWrittenObject.getContactNum());
						System.out.println(" Supplier Name: " + supplierWrittenObject.getSupplierName());
						System.out.println(" Suppliers City: " + supplierWrittenObject.getCityName());
						System.out.println(" Supplier Mail: " + supplierWrittenObject.getEmail());
						System.out.println("|---------------------------------------------------------------------------------------------|");
						
						if(c==1)
						{
							FileOperations.deleteBlock2(SupplierFeature.SUPPLIER_DATA_BLOCK_SIZE, 0,"supplier.dat");
							for(int i=0;i<=1;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
		                	System.out.print("|  Supplier ID:");
		                	supplierId = scanner.nextInt();
		                	System.out.println("|                                                                                             |");
		                	
		                	System.out.print("|  Supplier Name:");
		        	    	supplierName=scanner.next();
		        	    	System.out.println("|                                                                                             |");
		  
		                	System.out.print("|  Contact Number:");
		                	contactNum = scanner.nextLong();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  City Name:");
		        	    	cityName=scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  Email:");
		        	    	email=scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    		
		        	    	SupplierFeature supplier = new SupplierFeature();

		        			supplier.setId(supplierId);
		        			supplier.setContactNum(contactNum);
		        			supplier.setSupplierName(supplierName);
		        			supplier.setCityName(cityName);
		        			supplier.setEmail(email);
		        			

		        			byte[] supplierBytes = SupplierFeature.BookToByteArrayBlock(supplier);
		        			
		        			FileOperations.updateBlock(supplierBytes,0, SupplierFeature.SUPPLIER_DATA_BLOCK_SIZE ,"supplier.dat");
		        			
		        			
		    	    		for(int i=0;i<=2;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
		    	    		
		    	    		System.out.println("-----------------------------------------------------------------------------------------------");
		                	System.out.println("|                              Supplier Updated Successfully                                  |");
		                	System.out.println("-----------------------------------------------------------------------------------------------");
		                	Thread.sleep(3000);
							
							
							break;
							
						}
						if(c==2) 
						{
							FileOperations.deleteBlock2(SupplierFeature.SUPPLIER_DATA_BLOCK_SIZE, 0,"supplier.dat");
							for(int i=0;i<=1;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
		                	System.out.print("|  Supplier ID:");
		                	supplierId = scanner.nextInt();
		                	System.out.println("|                                                                                             |");
		                	
		                	System.out.print("|  Supplier Name:");
		        	    	supplierName=scanner.next();
		        	    	System.out.println("|                                                                                             |");
		  
		                	System.out.print("|  Contact Number:");
		                	contactNum = scanner.nextLong();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  City Name:");
		        	    	cityName=scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  Email:");
		        	    	email=scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    		
		        	    	SupplierFeature supplier = new SupplierFeature();

		        			supplier.setId(supplierId);
		        			supplier.setContactNum(contactNum);
		        			supplier.setSupplierName(supplierName);
		        			supplier.setCityName(cityName);
		        			supplier.setEmail(email);
		        			

		        			byte[] supplierBytes = SupplierFeature.BookToByteArrayBlock(supplier);
		        			
		        			FileOperations.updateBlock(supplierBytes,174, SupplierFeature.SUPPLIER_DATA_BLOCK_SIZE ,"supplier.dat");
		        			
		        			
		    	    		for(int i=0;i<=2;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
		    	    		System.out.println("-----------------------------------------------------------------------------------------------");
		                	System.out.println("|                              Supplier Updated Successfully                                  |");
		                	System.out.println("-----------------------------------------------------------------------------------------------");
		                	Thread.sleep(3000);
							
							
							break;
							
						}
						if(c==3) 
						{
							FileOperations.deleteBlock2(SupplierFeature.SUPPLIER_DATA_BLOCK_SIZE, 0,"supplier.dat");
							for(int i=0;i<=1;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
		                	System.out.print("|  Supplier ID:");
		                	supplierId = scanner.nextInt();
		                	System.out.println("|                                                                                             |");
		                	
		                	System.out.print("|  Supplier Name:");
		        	    	supplierName=scanner.next();
		        	    	System.out.println("|                                                                                             |");
		  
		                	System.out.print("|  Contact Number:");
		                	contactNum = scanner.nextLong();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  City Name:");
		        	    	cityName=scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  Email:");
		        	    	email=scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    		
		        	    	SupplierFeature supplier = new SupplierFeature();

		        			supplier.setId(supplierId);
		        			supplier.setContactNum(contactNum);
		        			supplier.setSupplierName(supplierName);
		        			supplier.setCityName(cityName);
		        			supplier.setEmail(email);
		        			

		        			byte[] supplierBytes = SupplierFeature.BookToByteArrayBlock(supplier);
		        			
		        			FileOperations.updateBlock(supplierBytes,348, SupplierFeature.SUPPLIER_DATA_BLOCK_SIZE ,"supplier.dat");
		        			
		        			
		    	    		for(int i=0;i<=2;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
		    	    		System.out.println("-----------------------------------------------------------------------------------------------");
		                	System.out.println("|                              Supplier Updated Successfully                                  |");
		                	System.out.println("-----------------------------------------------------------------------------------------------");
		                	Thread.sleep(3000);
							
							
							break;
							
						}
						if(c==4) 
						{
							FileOperations.deleteBlock2(SupplierFeature.SUPPLIER_DATA_BLOCK_SIZE, 0,"supplier.dat");
							for(int i=0;i<=1;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
		                	System.out.print("|  Supplier ID:");
		                	supplierId = scanner.nextInt();
		                	System.out.println("|                                                                                             |");
		                	
		                	System.out.print("|  Supplier Name:");
		        	    	supplierName=scanner.next();
		        	    	System.out.println("|                                                                                             |");
		  
		                	System.out.print("|  Contact Number:");
		                	contactNum = scanner.nextLong();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  City Name:");
		        	    	cityName=scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  Email:");
		        	    	email=scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    		
		        	    	SupplierFeature supplier = new SupplierFeature();

		        			supplier.setId(supplierId);
		        			supplier.setContactNum(contactNum);
		        			supplier.setSupplierName(supplierName);
		        			supplier.setCityName(cityName);
		        			supplier.setEmail(email);
		        			

		        			byte[] supplierBytes = SupplierFeature.BookToByteArrayBlock(supplier);
		        			
		        			FileOperations.updateBlock(supplierBytes,522, SupplierFeature.SUPPLIER_DATA_BLOCK_SIZE ,"supplier.dat");
		        			
		        			
		    	    		for(int i=0;i<=2;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
		    	    		System.out.println("-----------------------------------------------------------------------------------------------");
		                	System.out.println("|                              Supplier Updated Successfully                                  |");
		                	System.out.println("-----------------------------------------------------------------------------------------------");
		                	Thread.sleep(3000);
							
							
							break;
							
						}
						if(c==5)
						{
							FileOperations.deleteBlock2(SupplierFeature.SUPPLIER_DATA_BLOCK_SIZE, 0,"supplier.dat");
							for(int i=0;i<=1;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
		                	System.out.print("|  Supplier ID:");
		                	supplierId = scanner.nextInt();
		                	System.out.println("|                                                                                             |");
		                	
		                	System.out.print("|  Supplier Name:");
		        	    	supplierName=scanner.next();
		        	    	System.out.println("|                                                                                             |");
		  
		                	System.out.print("|  Contact Number:");
		                	contactNum = scanner.nextLong();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  City Name:");
		        	    	cityName=scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  Email:");
		        	    	email=scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    		
		        	    	SupplierFeature supplier = new SupplierFeature();

		        			supplier.setId(supplierId);
		        			supplier.setContactNum(contactNum);
		        			supplier.setSupplierName(supplierName);
		        			supplier.setCityName(cityName);
		        			supplier.setEmail(email);
		        			

		        			byte[] supplierBytes = SupplierFeature.BookToByteArrayBlock(supplier);
		        			
		        			FileOperations.updateBlock(supplierBytes,696, SupplierFeature.SUPPLIER_DATA_BLOCK_SIZE ,"supplier.dat");
		        			
		        			
		    	    		for(int i=0;i<=2;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
		    	    		System.out.println("-----------------------------------------------------------------------------------------------");
		                	System.out.println("|                              Supplier Updated Successfully                                  |");
		                	System.out.println("-----------------------------------------------------------------------------------------------");
		                	Thread.sleep(3000);
							
							
							break;
							
						}
						
						
						
						
						break;
        			}
        		}
                	}
            	catch(Exception e) {
            		
            	}
	            	
                	
                	
                	
                	break;
                case "s","S": 
                	String searchSupplierInput;
                	int searchId;
                	String searchName;
                	System.out.println("-----------------------------------------------------------------------------------------------");
                	System.out.println("|                                       Search Supplier                                       |");
                	System.out.println("-----------------------------------------------------------------------------------------------");
                	for(int i=0;i<=1;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	System.out.println("|                                          Search By ID                                       |");
                	for(int i=0;i<=1;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	System.out.println("|                                         Search By Name                                      |");
        	    	System.out.println("|                                                                                             |");
                	
        	    	for(int i=0;i<=3;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	
        	    
        	    	System.out.println("-----------------------------------------------------------------------------------------------");
                	System.out.print("                      <<Press ı for Search By Id,Press n for Search By Name>>");
                	searchSupplierInput=scanner.next();
                	switch(searchSupplierInput) {
                	
                	case "ı","I":
                		System.out.println("-----------------------------------------------------------------------------------------------");
                		System.out.println("|                                        Search By ID                                         |");
                		System.out.println("-----------------------------------------------------------------------------------------------");
                		for(int i=0;i<=1;i++) {
                			System.out.println("|                                                                                             |");
                		}
                		System.out.print("Supplier ID:");
                		searchId=scanner.nextInt();
                		
                		
                        	for(int c =1 ; c<5 ;c++)
                    		{
                        		
                        		
                    			byte[] supplierWrittenBytes = FileOperations.readBlock(c, SupplierFeature.SUPPLIER_DATA_BLOCK_SIZE, "supplier.dat");
                    			
                    			
                    			
                    				
                    				SupplierFeature supplierWrittenObject = SupplierFeature.ByteArrayBlockToBook(supplierWrittenBytes);
                    				
                    			
                    			if(searchId==supplierWrittenObject.getId()) {
            					
            					
            					System.out.println(" Supplier Num: " + supplierWrittenObject.getContactNum());
            					System.out.println(" Supplier Name: " + supplierWrittenObject.getSupplierName());
            					System.out.println(" Suppliers City: " + supplierWrittenObject.getCityName());
            					System.out.println(" Supplier Mail: " + supplierWrittenObject.getEmail());
            					System.out.println("|---------------------------------------------------------------------------------------------|");
                    			}
                    			
                    				
                    			
                    		}
                        	
                        	
                        		
                        	String searchExit="";	
                        	System.out.print("|                               <Press m For Return Main Menu>");
                			searchExit=scanner.next();
                			switch(searchExit) {
                			
                			case "m","M":break;
                			}
                        		


                        		break;
                	
                	case "n","N":
                		
                		System.out.println("-----------------------------------------------------------------------------------------------");
            		System.out.println("|                                       Search By Name                                        |");
            		System.out.println("-----------------------------------------------------------------------------------------------");
            		for(int i=0;i<=1;i++) {
            			System.out.println("|                                                                                             |");
            		}
            		System.out.print(" Supplier Name:");
            		searchName=scanner.next();
            		
            		
                    	for(int c =1 ; c<5 ;c++)
                		{
                    		
                    		
                			byte[] supplierWrittenBytes = FileOperations.readBlock(c, SupplierFeature.SUPPLIER_DATA_BLOCK_SIZE, "supplier.dat");
                			
                			
                			
                				
                				SupplierFeature supplierWrittenObject = SupplierFeature.ByteArrayBlockToBook(supplierWrittenBytes);
                				
                			
                			if(searchName.equals(supplierWrittenObject.getSupplierName())) {
        					
                			System.out.println(" Supplier ID: " + supplierWrittenObject.getId());
        					System.out.println(" Supplier Num: " + supplierWrittenObject.getContactNum());
        					System.out.println(" Suppliers City: " + supplierWrittenObject.getCityName());
        					System.out.println(" Supplier Mail: " + supplierWrittenObject.getEmail());
        					System.out.println("|---------------------------------------------------------------------------------------------|");
                			}
                			
                				
                			
                		}
                    	
                    	
                    		
                    	String searchExit2="";	
                    	System.out.print("|                               <Press m For Return Main Menu>");
            			searchExit=scanner.next();
            			switch(searchExit2) {
            			
            			case "m","M":break;
            			}
                    		


                    		break;
  
                	}
                	
                	
                	
                	break;
                case "l","L": 
                	String searchSupplierInput1;
                	System.out.println("-----------------------------------------------------------------------------------------------");
                	System.out.println("|                                       List Supplier                                         |");
                	System.out.println("-----------------------------------------------------------------------------------------------");
                	for(int i=0;i<=1;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	System.out.println("|                                     List By Letter(a)                                       |");
                	for(int i=0;i<=1;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	System.out.println("|                                        List all(n)                                          |");
        	    	System.out.println("|                                                                                             |");
                	
        	    	for(int i=0;i<=3;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	
        	    
        	    	System.out.println("-----------------------------------------------------------------------------------------------");
                	System.out.print("                       <<Press a for List By Letter,Press n for List All>>");
                	searchSupplierInput1=scanner.next();
                	
                	switch(searchSupplierInput1) {
                	
                	case "a","A":      	
                	Scanner scan = new Scanner(System.in);
                	System.out.print("Enter a letter to search: ");
                	String searchName1 = scan.next(); 

                	System.out.println("-----------------------------------------------------------------------------------------------");
                	System.out.println("|                                       Supplier List                                         |");
                	System.out.println("-----------------------------------------------------------------------------------------------");
                	try {
                	for(int c =1 ; c<5 ;c++) {
                	    byte[] supplierWrittenBytes = FileOperations.readBlock(c, SupplierFeature.SUPPLIER_DATA_BLOCK_SIZE, "supplier.dat");
                	    SupplierFeature supplierWrittenObject = SupplierFeature.ByteArrayBlockToBook(supplierWrittenBytes);

                	   
                	    if (supplierWrittenObject.getSupplierName().toLowerCase().startsWith(searchName1.toLowerCase())) {
                	        System.out.println(" Supplier ID: " + supplierWrittenObject.getId());
                	        System.out.println(" Supplier Num: " + supplierWrittenObject.getContactNum());
                	        System.out.println(" Supplier Name: " + supplierWrittenObject.getSupplierName());
                	        System.out.println(" Suppliers City: " + supplierWrittenObject.getCityName());
                	        System.out.println(" Supplier Mail: " + supplierWrittenObject.getEmail());
                	        System.out.println("|---------------------------------------------------------------------------------------------|");
                	    }
                	}
                	}
                	
                	catch(Exception e)
					{
            		
            		String searchExit="";	
                	System.out.print("|                               <Press m For Return Main Menu>");
        			searchExit=scanner.next();
        			
        			switch(searchExit) {
        			
        			
                	
                	
                	
                	case "m","M":break;
        			
                	
                	}
        			break;
					}
                	
                	
                
                	
                	
                	
                case "n","N":
            		
                	System.out.println("-----------------------------------------------------------------------------------------------");
            		System.out.println("|                                       List All                                             |");
            		System.out.println("-----------------------------------------------------------------------------------------------");
                	
                	
                	
                	
                	try {
                    	for(int c =1 ; c<5 ;c++)
                		{
                    		
                			byte[] supplierWrittenBytes = FileOperations.readBlock(c, SupplierFeature.SUPPLIER_DATA_BLOCK_SIZE, "supplier.dat");
                			
                			
                			
                				
                				SupplierFeature supplierWrittenObject = SupplierFeature.ByteArrayBlockToBook(supplierWrittenBytes);
                			int counter=0;	
                			int a=supplierWrittenObject.getId();
                			while (a > 0)
                            {
                                a /= 10;
                                counter++;
                            }
                    	
                    		
                			if(counter==4) {
        					
        					System.out.print(" Supplier ID: " + supplierWrittenObject.getId() + "\n");
        					System.out.print(" Supplier Num: " + supplierWrittenObject.getContactNum() + "\n");
        					System.out.print(" Supplier Name: " + supplierWrittenObject.getSupplierName() + "\n");
        					System.out.print(" Suppliers City: " + supplierWrittenObject.getCityName() + "\n");
        					System.out.print(" Supplier Mail: " + supplierWrittenObject.getEmail() + "\n");
        					System.out.println("|---------------------------------------------------------------------------------------------|");
                			}
                    	
                	}}
                    	catch(Exception e)
    						{
                    		
                    		String searchExit="";	
                        	System.out.print("|                               <Press m For Return Main Menu>");
                			searchExit=scanner.next();
                			
                			switch(searchExit) {
                			
                			case "m","M":break;
                			}
                    		
    						}
                	
                	
                    		break;
                case "m","M": break;
                
            }
            
            }
	        }
        catch (Exception ex){
            
        }
	        
	        
	    }
	    private static void option2() {
	    	@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
	    	String customerInput;
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	System.out.println("|                                       Customer Info                                         |");
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	for(int i=0;i<=2;i++) {
        		System.out.println("|                                                                                             |");
        	}
	    	
	        System.out.println("|                                      Add New Customer                                       |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                       Uptade Customer                                       |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                       Search Customer                                       |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                        List Customer                                        |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                          Main Menu                                          |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("-----------------------------------------------------------------------------------------------");
	        try {
	        	
	        	System.out.print("|    Enter Operations Character Which You Want:");
	        customerInput = scanner.next();
            
            String searchExit;
			switch (customerInput){
                case "a","A": 
                	
                	
                	
                	int customerId;
        	    	long contactNum;
        	    	String customerName;
        	    	String cityName;
        	    	String email;
        	    	String customInput;
                
                
                
                
                
	                System.out.println("-----------------------------------------------------------------------------------------------");
	            	System.out.println("|                                       Add New Customer                                      |");
	            	System.out.println("-----------------------------------------------------------------------------------------------");
	            	for(int i=0;i<=1;i++) {
	            		System.out.println("|                                                                                             |");
	            	}
	            	System.out.print("|  Customer ID:");
	            	customerId = scanner.nextInt();
	            	System.out.println("|                                                                                             |");
	            	
	            	System.out.print("|  Customer Name:");
	    	    	customerName=scanner.next();
	    	    	System.out.println("|                                                                                             |");
	
	            	System.out.print("|  Contact Number:");
	            	contactNum = scanner.nextLong();
	    	    	System.out.println("|                                                                                             |");
	    	    	
	    	    	System.out.print("|  City Name:");
	    	    	cityName=scanner.next();
	    	    	System.out.println("|                                                                                             |");
	    	    	
	    	    	System.out.print("|  Email:");
	    	    	email=scanner.next();
	    	    	System.out.println("|                                                                                             |");
	    	    	
	    	    	System.out.print("|                           <<Press s for Save,Press c for Cancel[s/c]>>");
	    	    	customInput=scanner.next();
	    	    	switch(customInput) {
	    	    	case "s","S":
	    	    		MainFunctions.AddCustomer(customerId, contactNum, customerName, cityName, email);
	    	    		for(int i=0;i<=2;i++) {
	                		System.out.println("|                                                                                             |");
	                	}
	    	    		System.out.println("-----------------------------------------------------------------------------------------------");
	                	System.out.println("|                               Customer Added Successfully                                   |");
	                	System.out.println("-----------------------------------------------------------------------------------------------");
	                	
	                	Thread.sleep(2500);
	                	break;
	    	    	case "c":
        	    		
        	    		break;
        	    	}
	    	    	break;
                
                case "u","U": 
                	
                	
                	int customerUptadeId;
            	System.out.println("-----------------------------------------------------------------------------------------------");
            	System.out.println("|                                       Update Customer                                      |");
            	System.out.println("-----------------------------------------------------------------------------------------------");
            	for(int i=0;i<=1;i++) {
            		System.out.println("|                                                                                             |");
            	}
            	System.out.print("|  Supplier ID:");
            	customerUptadeId = scanner.nextInt();
                	
            	try {
            	for(int c =1 ; c<5 ;c++)
        		{
        		
        		
        			byte[] customerWrittenBytes = FileOperations.readBlock(c, CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE, "customer.dat");
        			
        			
        			
        				
        				CustomerFeature customerWrittenObject = CustomerFeature.ByteArrayBlockToBook(customerWrittenBytes);
        				
        			
        			if(customerUptadeId==customerWrittenObject.getId()) {
					
					
					System.out.println(" Customer Num: " + customerWrittenObject.getContactNum());
					System.out.println(" Customer Name: " + customerWrittenObject.getCustomerName());
					System.out.println(" Customers City: " + customerWrittenObject.getCityName());
					System.out.println(" Customer Mail: " + customerWrittenObject.getEmail());
					System.out.println("|---------------------------------------------------------------------------------------------|");
					
					if(c==1)
					{
						FileOperations.deleteBlock2(CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE, 0,"customer.dat");
						for(int i=0;i<=1;i++) {
	                		System.out.println("|                                                                                             |");
	                	}
	                	System.out.print("|  Customer ID:");
	                	customerId = scanner.nextInt();
	                	System.out.println("|                                                                                             |");
	                	
	                	System.out.print("|  Customer Name:");
	        	    	customerName=scanner.next();
	        	    	System.out.println("|                                                                                             |");
	  
	                	System.out.print("|  Contact Number:");
	                	contactNum = scanner.nextLong();
	        	    	System.out.println("|                                                                                             |");
	        	    	
	        	    	System.out.print("|  City Name:");
	        	    	cityName=scanner.next();
	        	    	System.out.println("|                                                                                             |");
	        	    	
	        	    	System.out.print("|  Email:");
	        	    	email=scanner.next();
	        	    	System.out.println("|                                                                                             |");
	        	    		
	        	    	CustomerFeature customer = new CustomerFeature();

	        	    	customer.setId(customerId);
	        	    	customer.setContactNum(contactNum);
	        	    	customer.setCustomerName(customerName);
	        	    	customer.setCityName(cityName);
	        	    	customer.setEmail(email);
	        			

	        			byte[] customerBytes = CustomerFeature.BookToByteArrayBlock(customer);
	        			
	        			FileOperations.updateBlock(customerBytes,0, CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE ,"customer.dat");
	        			
	        			
	    	    		for(int i=0;i<=2;i++) {
	                		System.out.println("|                                                                                             |");
	                	}
	    	    		System.out.println("-----------------------------------------------------------------------------------------------");
	                	System.out.println("|                              Customer Updated Successfully                                  |");
	                	System.out.println("-----------------------------------------------------------------------------------------------");
	        		
						Thread.sleep(2500);
						
						break;
						
					}
					
					if(c==2) 
					{
						FileOperations.deleteBlock2(CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE, 170,"customer.dat");
						for(int i=0;i<=1;i++) {
	                		System.out.println("|                                                                                             |");
	                	}
	                	System.out.print("|  Customer ID:");
	                	customerId = scanner.nextInt();
	                	System.out.println("|                                                                                             |");
	                	
	                	System.out.print("|  Customer Name:");
	        	    	customerName=scanner.next();
	        	    	System.out.println("|                                                                                             |");
	  
	                	System.out.print("|  Contact Number:");
	                	contactNum = scanner.nextLong();
	        	    	System.out.println("|                                                                                             |");
	        	    	
	        	    	System.out.print("|  City Name:");
	        	    	cityName=scanner.next();
	        	    	System.out.println("|                                                                                             |");
	        	    	
	        	    	System.out.print("|  Email:");
	        	    	email=scanner.next();
	        	    	System.out.println("|                                                                                             |");
	        	    		
	        	    	CustomerFeature customer = new CustomerFeature();

	        	    	customer.setId(customerId);
	        	    	customer.setContactNum(contactNum);
	        	    	customer.setCustomerName(customerName);
	        	    	customer.setCityName(cityName);
	        	    	customer.setEmail(email);
	        			

	        			byte[] customerBytes = CustomerFeature.BookToByteArrayBlock(customer);
	        			
	        			FileOperations.updateBlock(customerBytes,170, CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE ,"customer.dat");
	        			
	        			
	    	    		for(int i=0;i<=2;i++) {
	                		System.out.println("|                                                                                             |");
	                	}
	    	    		System.out.println("-----------------------------------------------------------------------------------------------");
	                	System.out.println("|                              Customer Updated Successfully                                  |");
	                	System.out.println("-----------------------------------------------------------------------------------------------");
	        		
	                	Thread.sleep(2500);
						
						break;
						
						
					}
					
					if(c==3) 
					{
						FileOperations.deleteBlock2(CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE, 340,"customer.dat");
						for(int i=0;i<=1;i++) {
	                		System.out.println("|                                                                                             |");
	                	}
	                	System.out.print("|  Customer ID:");
	                	customerId = scanner.nextInt();
	                	System.out.println("|                                                                                             |");
	                	
	                	System.out.print("|  Customer Name:");
	        	    	customerName=scanner.next();
	        	    	System.out.println("|                                                                                             |");
	  
	                	System.out.print("|  Contact Number:");
	                	contactNum = scanner.nextLong();
	        	    	System.out.println("|                                                                                             |");
	        	    	
	        	    	System.out.print("|  City Name:");
	        	    	cityName=scanner.next();
	        	    	System.out.println("|                                                                                             |");
	        	    	
	        	    	System.out.print("|  Email:");
	        	    	email=scanner.next();
	        	    	System.out.println("|                                                                                             |");
	        	    		
	        	    	CustomerFeature customer = new CustomerFeature();

	        	    	customer.setId(customerId);
	        	    	customer.setContactNum(contactNum);
	        	    	customer.setCustomerName(customerName);
	        	    	customer.setCityName(cityName);
	        	    	customer.setEmail(email);
	        			

	        			byte[] customerBytes = CustomerFeature.BookToByteArrayBlock(customer);
	        			
	        			FileOperations.updateBlock(customerBytes,340, CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE ,"customer.dat");
	        			
	        			
	    	    		for(int i=0;i<=2;i++) {
	                		System.out.println("|                                                                                             |");
	                	}
	    	    		System.out.println("-----------------------------------------------------------------------------------------------");
	                	System.out.println("|                              Customer Updated Successfully                                  |");
	                	System.out.println("-----------------------------------------------------------------------------------------------");
	        		
	                	Thread.sleep(2500);
						
						break;
						
						
					}
					
					if(c==4) 
					{
						FileOperations.deleteBlock2(CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE, 510,"customer.dat");
						for(int i=0;i<=1;i++) {
	                		System.out.println("|                                                                                             |");
	                	}
	                	System.out.print("|  Customer ID:");
	                	customerId = scanner.nextInt();
	                	System.out.println("|                                                                                             |");
	                	
	                	System.out.print("|  Customer Name:");
	        	    	customerName=scanner.next();
	        	    	System.out.println("|                                                                                             |");
	  
	                	System.out.print("|  Contact Number:");
	                	contactNum = scanner.nextLong();
	        	    	System.out.println("|                                                                                             |");
	        	    	
	        	    	System.out.print("|  City Name:");
	        	    	cityName=scanner.next();
	        	    	System.out.println("|                                                                                             |");
	        	    	
	        	    	System.out.print("|  Email:");
	        	    	email=scanner.next();
	        	    	System.out.println("|                                                                                             |");
	        	    		
	        	    	CustomerFeature customer = new CustomerFeature();

	        	    	customer.setId(customerId);
	        	    	customer.setContactNum(contactNum);
	        	    	customer.setCustomerName(customerName);
	        	    	customer.setCityName(cityName);
	        	    	customer.setEmail(email);
	        			

	        			byte[] customerBytes = CustomerFeature.BookToByteArrayBlock(customer);
	        			
	        			FileOperations.updateBlock(customerBytes,510, CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE ,"customer.dat");
	        			
	        			
	    	    		for(int i=0;i<=2;i++) {
	                		System.out.println("|                                                                                             |");
	                	}
	    	    		System.out.println("-----------------------------------------------------------------------------------------------");
	                	System.out.println("|                              Customer Updated Successfully                                  |");
	                	System.out.println("-----------------------------------------------------------------------------------------------");
	        		
	                	Thread.sleep(2500);
						
						break;
						
						
					}
					
					if(c==5)
					{
						FileOperations.deleteBlock2(CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE, 680,"customer.dat");
						for(int i=0;i<=1;i++) {
	                		System.out.println("|                                                                                             |");
	                	}
	                	System.out.print("|  Customer ID:");
	                	customerId = scanner.nextInt();
	                	System.out.println("|                                                                                             |");
	                	
	                	System.out.print("|  Customer Name:");
	        	    	customerName=scanner.next();
	        	    	System.out.println("|                                                                                             |");
	  
	                	System.out.print("|  Contact Number:");
	                	contactNum = scanner.nextLong();
	        	    	System.out.println("|                                                                                             |");
	        	    	
	        	    	System.out.print("|  City Name:");
	        	    	cityName=scanner.next();
	        	    	System.out.println("|                                                                                             |");
	        	    	
	        	    	System.out.print("|  Email:");
	        	    	email=scanner.next();
	        	    	System.out.println("|                                                                                             |");
	        	    		
	        	    	CustomerFeature customer = new CustomerFeature();

	        	    	customer.setId(customerId);
	        	    	customer.setContactNum(contactNum);
	        	    	customer.setCustomerName(customerName);
	        	    	customer.setCityName(cityName);
	        	    	customer.setEmail(email);
	        			

	        			byte[] customerBytes = CustomerFeature.BookToByteArrayBlock(customer);
	        			
	        			FileOperations.updateBlock(customerBytes,680, CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE ,"customer.dat");
	        			
	        			
	    	    		for(int i=0;i<=2;i++) {
	                		System.out.println("|                                                                                             |");
	                	}
	    	    		System.out.println("-----------------------------------------------------------------------------------------------");
	                	System.out.println("|                              Customer Updated Successfully                                  |");
	                	System.out.println("-----------------------------------------------------------------------------------------------");
	        		
	                	Thread.sleep(2500);
						
						break;
						
						
					}
					
					
					
					
					break;
    			}
        			
    		}
            	}
        	catch(Exception e) {
        		
        	}
            	
            	
            	System.out.print("|                               <Press m For Return Main Menu>");
    			searchExit=scanner.next();
    			switch(searchExit) {
    			
    			case "m","M":break;
    			}
            	
            	
                
                
                
                
                
                
                
                
                
                case "s","S": 
                	
                	
                	String searchCustomerInput;
                	int searchId;
                	String searchName;
                	System.out.println("-----------------------------------------------------------------------------------------------");
                	System.out.println("|                                       Search Customer                                       |");
                	System.out.println("-----------------------------------------------------------------------------------------------");
                	for(int i=0;i<=1;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	System.out.println("|                                          Search By ID                                       |");
                	for(int i=0;i<=1;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	System.out.println("|                                         Search By Name                                      |");
        	    	System.out.println("|                                                                                             |");
                	
        	    	for(int i=0;i<=3;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	
        	    
        	    	System.out.println("-----------------------------------------------------------------------------------------------");
                	System.out.print("                      <<Press ı for Search By Id,Press n for Search By Name>>");
                	searchCustomerInput=scanner.next();
                	switch(searchCustomerInput) {
                	
                	case "I","ı":
                		System.out.println("-----------------------------------------------------------------------------------------------");
                		System.out.println("|                                        Search By ID                                         |");
                		System.out.println("-----------------------------------------------------------------------------------------------");
                		for(int i=0;i<=1;i++) {
                			System.out.println("|                                                                                             |");
                		}
                		System.out.print("Customer ID:");
                		searchId=scanner.nextInt();
                		
                		
                        	for(int c =1 ; c<5 ;c++)
                    		{
                        		
                        		
                    			byte[] customerWrittenBytes = FileOperations.readBlock(c, CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE, "customer.dat");
                    			
                    			
                    			
                    				
                    				CustomerFeature customerWrittenObject = CustomerFeature.ByteArrayBlockToBook(customerWrittenBytes);
                    				
                    			
                    			if(searchId==customerWrittenObject.getId()) {
            					
                    			System.out.println(" Customer Name: " + customerWrittenObject.getCustomerName());
            					System.out.println(" Customer Number: " + customerWrittenObject.getContactNum());         					
            					System.out.println(" Customers City: " + customerWrittenObject.getCityName());
            					System.out.println(" Customer Mail: " + customerWrittenObject.getEmail());
            					System.out.println("|---------------------------------------------------------------------------------------------|");
                    			break;
                    			}
                    			
                    				
                    			
                    		}
                        	
                        	
                        	String searchExit1="";	
                        	System.out.print("|                               <Press m For Return Main Menu>");
                			searchExit1=scanner.next();
                			switch(searchExit1) {
                			
                			case "m","M":break;
                			}
                        		


                        		break;
                	
                	case "n","N":
                		
                		System.out.println("-----------------------------------------------------------------------------------------------");
            		System.out.println("|                                       Search By Name                                        |");
            		System.out.println("-----------------------------------------------------------------------------------------------");
            		for(int i=0;i<=1;i++) {
            			System.out.println("|                                                                                             |");
            		}
            		System.out.print(" Customer Name:");
            		searchName=scanner.next();
            		
            		
                    	for(int c =1 ; c<5 ;c++)
                		{
                    		
                    		
                			byte[] customerWrittenBytes = FileOperations.readBlock(c, CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE, "customer.dat");
                			
                			
                			
                				
                				CustomerFeature customerWrittenObject = CustomerFeature.ByteArrayBlockToBook(customerWrittenBytes);
                				
                			
                			if(searchName.equals(customerWrittenObject.getCustomerName())) {
        					
                			System.out.println(" Supplier ID: " + customerWrittenObject.getId());
        					System.out.println(" Supplier Num: " + customerWrittenObject.getContactNum());
        					System.out.println(" Suppliers City: " + customerWrittenObject.getCityName());
        					System.out.println(" Supplier Mail: " + customerWrittenObject.getEmail());
        					System.out.println("|---------------------------------------------------------------------------------------------|");
                			
                			break;
                			}
                			
                				
                			
                		}
                    	
                    	
                    		
                    	String searchExit2="";	
                    	System.out.print("|                               <Press m For Return Main Menu>");
            			searchExit2=scanner.next();
            			switch(searchExit2) {
            			
            			case "m","M":break;
            			}
                    		


                    		break;
  
                	}
                	
                	
                	
                	break;
                	
                case "l","L": 
                	String searchSupplierInput;
                	System.out.println("-----------------------------------------------------------------------------------------------");
                	System.out.println("|                                       List Customer                                         |");
                	System.out.println("-----------------------------------------------------------------------------------------------");
                	for(int i=0;i<=1;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	System.out.println("|                                     Search By Letter(a)                                     |");
                	for(int i=0;i<=1;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	System.out.println("|                                        List all(n)                                          |");
        	    	System.out.println("|                                                                                             |");
                	
        	    	for(int i=0;i<=3;i++) {
                		System.out.println("|                                                                                             |");
                	}
                	
        	    
        	    	System.out.println("-----------------------------------------------------------------------------------------------");
                	System.out.print("                       <<Press a for List By Letter,Press n for List All>>");
                	searchSupplierInput=scanner.next();
                	
                	switch(searchSupplierInput) {
                	
                	case "a","A":
                	Scanner scan1 = new Scanner(System.in);
                	System.out.print("Enter Letter of customer name: ");
                	String searchName1 = scan1.next(); 

                	System.out.println("-----------------------------------------------------------------------------------------------");
                	System.out.println("|                                       Customer List                                         |");
                	System.out.println("-----------------------------------------------------------------------------------------------");
                	
                	try {
                	for(int c =1 ; c<5 ;c++) {
                	    byte[] customerWrittenBytes = FileOperations.readBlock(c, CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE, "customer.dat");
                	    CustomerFeature customerWrittenObject = CustomerFeature.ByteArrayBlockToBook(customerWrittenBytes);

                	   
                	    if (customerWrittenObject.getCustomerName().toLowerCase().startsWith(searchName1.toLowerCase())) {
                	        System.out.println(" Customer ID: " + customerWrittenObject.getId());
                	        System.out.println(" Customer Number: " + customerWrittenObject.getContactNum());
                	        System.out.println(" Customer Name: " + customerWrittenObject.getCustomerName());
                	        System.out.println(" Customers City: " + customerWrittenObject.getCityName());
                	        System.out.println(" Customer Mail: " + customerWrittenObject.getEmail());
                	        System.out.println("|---------------------------------------------------------------------------------------------|");
                	    }
                	}
                	}	
                	
                	catch(Exception e)
					{
            		
            		Thread.sleep(550);
                	System.out.print("|                               <Press m For Return Main Menu>");
        			searchExit=scanner.next();
        			
        			switch(searchExit) {
        			
        			case "m","M":break;
        			}
						}
                	Thread.sleep(550);
                	System.out.print("|                               <Press m For Return Main Menu>");
        			searchExit=scanner.next();
        			
        			switch(searchExit) {
        			
        			case "m","M":break;
        			}
                	break;

                        		
                        		
                	
                	case "n","N":
                		
                	System.out.println("-----------------------------------------------------------------------------------------------");
            		System.out.println("|                                       List All                                             |");
            		System.out.println("-----------------------------------------------------------------------------------------------");
            		
            		
            		try {
                    	for(int c =1 ; c<5 ;c++)
                		{
                    		
                			byte[] customerWrittenBytes = FileOperations.readBlock(c, CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE, "customer.dat");
                			
                			
                			
                				
                			CustomerFeature customerWrittenObject = CustomerFeature.ByteArrayBlockToBook(customerWrittenBytes);
                			int counter=0;	
                			int a=customerWrittenObject.getId();
                			while (a > 0)
                            {
                                a /= 10;
                                counter++;
                            }
                			
                			

                			if(counter==4) {
        					
        					
        					System.out.println(" Customer ID: " + customerWrittenObject.getId());
        					System.out.println(" Customer Number: " + customerWrittenObject.getContactNum());
        					System.out.println(" Customer Name: " + customerWrittenObject.getCustomerName());
        					System.out.println(" Customers City: " + customerWrittenObject.getCityName());
        					System.out.println(" Customer Mail: " + customerWrittenObject.getEmail());
        					System.out.println("|---------------------------------------------------------------------------------------------|");
                			}
                		}
                	}
                	
                		catch(Exception e)
						{
                		
                		Thread.sleep(550);
                    	System.out.print("|                               <Press m For Return Main Menu>");
            			searchExit=scanner.next();
            			
            			switch(searchExit) {
            			
            			case "m","M":break;
            			}
            			
						}
            			Thread.sleep(550);
            		System.out.print("|                               <Press m For Return Main Menu>");
        			searchExit=scanner.next();
        			
        			switch(searchExit) {
        			
        			case "m","M":break;
        			}
                	}
                	
        		
                		
    			
        		
					
                	
			case "m","M": break;
                
            }
        }
        catch (Exception ex){
            System.out.println("Please enter an integer value between 1 and 5");
            scanner.next();
        }
	        
	    }
	    
		private static void option3() {
	    	@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
	    	String medicineInput;
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	System.out.println("|                                       Medicine Info                                         |");
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	for(int i=0;i<=2;i++) {
        		System.out.println("|                                                                                             |");
        	}
	    	
	        System.out.println("|                                   Purchase New Medicine                                     |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                     Sale Medicine(a)                                        |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                      Medicine Stock                                         |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                    Search medicine(s)                                       |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                       Main Menu(x)                                          |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("-----------------------------------------------------------------------------------------------");
	        try {
	        	
	        	System.out.print("|    Enter Operations Character Which You Want:");
	        medicineInput = scanner.next();
            
            switch (medicineInput){
                case "p","P": 
                	int medicineId;
                	String medicineSupplier;
        	    	String companyName;
        	    	int Quantity;
        	    	int Rack;
        	    	int Cabnit;
        	    	double Price;
        	    	String medicineAddInput;
        	    	String medicineName;
        	    	
        	    	
                
        	    	
                
	                System.out.println("-----------------------------------------------------------------------------------------------");
	            	System.out.println("|                                    Purchase New Medicine                                    |");
	            	System.out.println("-----------------------------------------------------------------------------------------------");
	            	for(int i=0;i<=1;i++) {
	            		System.out.println("|                                                                                             |");
	            	}
	            	System.out.print("|  Medicine ID:");
	            	medicineId = scanner.nextInt();
	            	System.out.println("|                                                                                             |");
	            	
	            	System.out.print("|  Medicine Name:");
	    	    	medicineName=scanner.next();
	    	    	System.out.println("|                                                                                             |");
	
	    	    	
	            	System.out.print("|  Medicine Supplier:");
	    	    	medicineSupplier=scanner.next();
	    	    	System.out.println("|                                                                                             |");
	
	            	System.out.print("|  Company Name:");
	            	companyName = scanner.next();
	    	    	System.out.println("|                                                                                             |");
	    	    	
	    	    	
	    	    	Scanner klavye = new Scanner(System.in);
		    	    System.out.print("|  Price:");
		            Price = klavye.nextDouble();
	    	    	
	    	    	
	            	
	    	    	System.out.println("|                                                                                             |");
	    	    	
	    	    	System.out.print("|  Quantity:");
	    	    	Quantity=scanner.nextInt();
	    	    	System.out.println("|                                                                                             |");
	    	    	
	    	    	System.out.print("|  Rack:");
	    	    	Rack=scanner.nextInt();
	    	    	System.out.println("|                                                                                             |");
	    	    	
	    	    	System.out.print("|  Cabnit:");
	    	    	Cabnit =scanner.nextInt();
	    	    	System.out.println("|                                                                                             |");
	    	    	
	    	    	System.out.print("|                           <<Press s for Save,Press c for Cancel[s/c]>>");
	    	    	medicineAddInput=scanner.next();
	    	    	switch(medicineAddInput) {
	    	    	case "s":
	    	    		MainFunctions.AddMedicine(medicineId,medicineName,medicineSupplier,companyName,Price,Quantity,Rack,Cabnit);
	    	    		for(int i=0;i<=2;i++) {
	                		System.out.println("|                                                                                             |");
	                	}
	    	    		System.out.println("-----------------------------------------------------------------------------------------------");
	                	System.out.println("|                             Medicine Purchased Sucessfully                                  |");
	                	System.out.println("-----------------------------------------------------------------------------------------------");
	                	
	                	Thread.sleep(2500);
	                	break;
	    	    	case "c":
        	    		
        	    		break;
        	    	} 
                	
                	
                	
                	
                	
                	break;
                case "a","A" : 
                	
        	    	Scanner scanner1 = new Scanner(System.in);
                Date objDate =new Date();
                String strDateDayFormat="dd";
                SimpleDateFormat objDay =new SimpleDateFormat(strDateDayFormat);
                String strDateFormat="dd-MMM-yyyy";
                SimpleDateFormat objFullDate =new SimpleDateFormat(strDateFormat);
                
                
                String saleFullDate=objFullDate.format(objDate);
             	String saleDate=objDay.format(objDate);
    	    	int medicineId1=0;
    	    	int customerId = 0;
    	    	int option=1;
    	    	int option1=1;
    	    	int medicineQuantity=0;
    	    	String saleAddInput;
    	    		
    	    	
    	    	
    	    	
    	    	
    	    	
    	    	
    	    	 a:
    	    	while(option!=2) {
    	    	System.out.println("-----------------------------------------------------------------------------------------------");
    	    	System.out.print("|       Customer Id:");
    	    	customerId=scanner1.nextInt();
    	    	
    	    	    		
        		try {
                	for(int c =1 ; c<5 ;c++)
            		{
                		
                		
            			byte[] customerWrittenBytes = FileOperations.readBlock(c, CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE, "customer.dat");
            			
            			
            			
            				
            				CustomerFeature customerWrittenObject = CustomerFeature.ByteArrayBlockToBook(customerWrittenBytes);
            				
            			
            			if(customerId==customerWrittenObject.getId()) {
            				System.out.println("-----------------------------------------------------------------------------------------------");
            		    	System.out.println("| Customer ID    Customer Name           Contact Number              City                Email         |");
            		    	System.out.println("-----------------------------------------------------------------------------------------------");
            				
            				System.out.print("|     " + customerWrittenObject.getId());
    	        			System.out.print("|        " + customerWrittenObject.getCustomerName());
    						System.out.print("         |       " + customerWrittenObject.getContactNum());         					
    						System.out.print("          |         "+ customerWrittenObject.getCityName());
    						System.out.println("          |    " + customerWrittenObject.getEmail());
    						System.out.println("|---------------------------------------------------------------------------------------------|");
            			break;
            			}
            			
            				
            			
            		}
        		}
        		catch(Exception e) 
        		{
        			
        			System.out.println("|                          !Customer Not Found Please Enter Again!                            |");
        			option=1;
        			Thread.sleep(1250);
        			continue a;
        			
        			
        		}
        		b:
        		while(option1!= 2) 
        		{
    	    	System.out.println("-----------------------------------------------------------------------------------------------");
    	    	System.out.print("|       Medicine ID:");
    	    	medicineId1=scanner1.nextInt();
    	    	
    	    	try {
                	for(int c =1 ; c<5 ;c++)
            		{
                		
                		
            			byte[] medicineWrittenBytes = FileOperations.readBlock(c, MedicineFeature.MEDICINE_DATA_BLOCK_SIZE, "medicine.dat");
            			
            			
            			
            				
            				MedicineFeature medicineWrittenObject = MedicineFeature.ByteArrayBlockToBook(medicineWrittenBytes);
            				
            			
            			if(medicineId1==medicineWrittenObject.getMedicineId()) {
            				System.out.println("-----------------------------------------------------------------------------------------------");
            		    	System.out.println("| Medicine ID      Medicine Name         Stock of Medicine      Company Name      Sale Price  |");
            		    	System.out.println("-----------------------------------------------------------------------------------------------");
            				
            				System.out.print("|        " + medicineWrittenObject.getMedicineId());
    	        			System.out.print("|        " + medicineWrittenObject.getMedicineName());
    						System.out.print("         |       " + medicineWrittenObject.getQuantity());         					
    						System.out.print("          |         "+ medicineWrittenObject.getCompanyName());
    						System.out.println("          |    " + medicineWrittenObject.getPrice());
    						System.out.println("|---------------------------------------------------------------------------------------------|");
    						
    						
    						
    						System.out.println("-----------------------------------------------------------------------------------------------");
    		    	    	System.out.print("|       Quantity Of Medicine Sold:");
    		    	    	medicineQuantity=scanner1.nextInt();
    		    	    	if(medicineQuantity>medicineWrittenObject.getQuantity()) {
    		    	    		System.out.println("|                    !Insufficient Stock of Medicine Please Enter Again!                      |");
    		    	    		option=2;
    		    	    		continue b;
    		    	    	}
    		    	    	else {
    		    	    		option1=2;
        						option=2;
    		    	    		break;
    		    	    	}
            			
            			}
            			
            				
            			
            		}
        		}
        		catch(Exception e) {
        			option=1;
        			System.out.println("|                          !Medicine Not Found Please Enter Again!                            |");
        			continue b;
        		}                                                                                           
        		
        		}
        		
        		
    	    	
        		
    	    	System.out.println("-----------------------------------------------------------------------------------------------");
    	    	System.out.print("|       Date:");System.out.println(saleFullDate);
    	    	for(int i=0;i<=1;i++) {
            		System.out.println("|                                                                                             |");
            	}
    	    	}
    	    	System.out.print("|                           <<Press s for Save,Press c for Cancel[s/c]>>");
    	    	saleAddInput=scanner1.next();
    	    	switch(saleAddInput) {
    	    	case "s","S":
    	    		
    					MainFunctions.AddSaleMedicine(medicineId1,customerId,medicineQuantity,saleDate);
					String medicineSupplier1;
    	    	String companyName1;
            	int rack1;
            	int cabnit1;
            	int quantity1;
            	double price1;
                	
            	try {
            	for(int c =1 ; c<5 ;c++)
        		{
        		
        		
        			byte[] medicineWrittenBytes = FileOperations.readBlock(c, MedicineFeature.MEDICINE_DATA_BLOCK_SIZE, "medicine.dat");
        			
        			
        			
        				
        				MedicineFeature medicineWrittenObject = MedicineFeature.ByteArrayBlockToBook(medicineWrittenBytes);
        				
        			
        			if(medicineId1==medicineWrittenObject.getMedicineId()) {
					
					
					if(c==1)
					{
						FileOperations.deleteBlock2(MedicineFeature.MEDICINE_DATA_BLOCK_SIZE, 0,"medicine.dat");
						
	                	medicineId = medicineWrittenObject.getMedicineId();  
	        	    	medicineName=medicineWrittenObject.getMedicineName();
	        	    	medicineSupplier1 = medicineWrittenObject.getMedicineSupplier();
	        	    	companyName1=medicineWrittenObject.getCompanyName();
	        	    	rack1=medicineWrittenObject.getRack();
	        	    	cabnit1=medicineWrittenObject.getCabnit();
	        	    	quantity1=(medicineWrittenObject.getQuantity()-medicineQuantity);
	        	    	price1=medicineWrittenObject.getPrice();
	                	                                                                       
	        	    		
	        	    	MedicineFeature medicine = new MedicineFeature();

	        	    	medicine.setMedicineId(medicineId1);
	        	    	medicine.setMedicineName(medicineName);
	        	    	medicine.setMedicineSupplier(medicineSupplier1);
	        	    	medicine.setCompanyName(companyName1);
	        	    	medicine.setRack(rack1);
	        	    	medicine.setCabnit(cabnit1);
	        	    	medicine.setQuantity(quantity1);
	        	    	medicine.setPrice(price1);
	        			

	        			byte[] medicineBytes = MedicineFeature.BookToByteArrayBlock(medicine);
	        			
	        			FileOperations.updateBlock(medicineBytes,0,MedicineFeature.MEDICINE_DATA_BLOCK_SIZE ,"medicine.dat");
	        			
	        			
	    	    		
						
						break;
						
					}
					
					if(c==2) 
					{
						FileOperations.deleteBlock2(MedicineFeature.MEDICINE_DATA_BLOCK_SIZE, 174,"medicine.dat");
						
	                	medicineId = medicineWrittenObject.getMedicineId();  
	        	    	medicineName=medicineWrittenObject.getMedicineName();
	        	    	medicineSupplier1 = medicineWrittenObject.getMedicineSupplier();
	        	    	companyName1=medicineWrittenObject.getCompanyName();
	        	    	rack1=medicineWrittenObject.getRack();
	        	    	cabnit1=medicineWrittenObject.getCabnit();
	        	    	quantity1=(medicineWrittenObject.getQuantity()-medicineQuantity);
	        	    	price1=medicineWrittenObject.getPrice();
	                	                                                                       
	        	    		
	        	    	MedicineFeature medicine = new MedicineFeature();

	        	    	medicine.setMedicineId(medicineId1);
	        	    	medicine.setMedicineName(medicineName);
	        	    	medicine.setMedicineSupplier(medicineSupplier1);
	        	    	medicine.setCompanyName(companyName1);
	        	    	medicine.setRack(rack1);
	        	    	medicine.setCabnit(cabnit1);
	        	    	medicine.setQuantity(quantity1);
	        	    	medicine.setPrice(price1);
	        			

	        			byte[] medicineBytes = MedicineFeature.BookToByteArrayBlock(medicine);
	        			
	        			FileOperations.updateBlock(medicineBytes,174,MedicineFeature.MEDICINE_DATA_BLOCK_SIZE ,"medicine.dat");
	        			
	        			
	    	    		
						
						break;
						
						
						
					}
					
					if(c==3) 
					{
						FileOperations.deleteBlock2(MedicineFeature.MEDICINE_DATA_BLOCK_SIZE, 348,"medicine.dat");
						
	                	medicineId = medicineWrittenObject.getMedicineId();  
	        	    	medicineName=medicineWrittenObject.getMedicineName();
	        	    	medicineSupplier1 = medicineWrittenObject.getMedicineSupplier();
	        	    	companyName1=medicineWrittenObject.getCompanyName();
	        	    	rack1=medicineWrittenObject.getRack();
	        	    	cabnit1=medicineWrittenObject.getCabnit();
	        	    	quantity1=(medicineWrittenObject.getQuantity()-medicineQuantity);
	        	    	price1=medicineWrittenObject.getPrice();
	                	                                                                       
	        	    		
	        	    	MedicineFeature medicine = new MedicineFeature();

	        	    	medicine.setMedicineId(medicineId1);
	        	    	medicine.setMedicineName(medicineName);
	        	    	medicine.setMedicineSupplier(medicineSupplier1);
	        	    	medicine.setCompanyName(companyName1);
	        	    	medicine.setRack(rack1);
	        	    	medicine.setCabnit(cabnit1);
	        	    	medicine.setQuantity(quantity1);
	        	    	medicine.setPrice(price1);
	        			

	        			byte[] medicineBytes = MedicineFeature.BookToByteArrayBlock(medicine);
	        			
	        			FileOperations.updateBlock(medicineBytes,348,MedicineFeature.MEDICINE_DATA_BLOCK_SIZE ,"medicine.dat");
	        			
	        			
	    	    		
						
						break;
						
						
						
					}
					
					if(c==4) 
					{
						FileOperations.deleteBlock2(MedicineFeature.MEDICINE_DATA_BLOCK_SIZE, 522,"medicine.dat");
						
	                	medicineId = medicineWrittenObject.getMedicineId();  
	        	    	medicineName=medicineWrittenObject.getMedicineName();
	        	    	medicineSupplier1 = medicineWrittenObject.getMedicineSupplier();
	        	    	companyName1=medicineWrittenObject.getCompanyName();
	        	    	rack1=medicineWrittenObject.getRack();
	        	    	cabnit1=medicineWrittenObject.getCabnit();
	        	    	quantity1=(medicineWrittenObject.getQuantity()-medicineQuantity);
	        	    	price1=medicineWrittenObject.getPrice();
	                	                                                                       
	        	    		
	        	    	MedicineFeature medicine = new MedicineFeature();

	        	    	medicine.setMedicineId(medicineId1);
	        	    	medicine.setMedicineName(medicineName);
	        	    	medicine.setMedicineSupplier(medicineSupplier1);
	        	    	medicine.setCompanyName(companyName1);
	        	    	medicine.setRack(rack1);
	        	    	medicine.setCabnit(cabnit1);
	        	    	medicine.setQuantity(quantity1);
	        	    	medicine.setPrice(price1);
	        			

	        			byte[] medicineBytes = MedicineFeature.BookToByteArrayBlock(medicine);
	        			
	        			FileOperations.updateBlock(medicineBytes,522,MedicineFeature.MEDICINE_DATA_BLOCK_SIZE ,"medicine.dat");
	        			
	        			
	    	    		
						
						break;
						
						
					}
					
					if(c==5)
					{
						FileOperations.deleteBlock2(MedicineFeature.MEDICINE_DATA_BLOCK_SIZE, 696,"medicine.dat");
						
	                	medicineId = medicineWrittenObject.getMedicineId();  
	        	    	medicineName=medicineWrittenObject.getMedicineName();
	        	    	medicineSupplier1 = medicineWrittenObject.getMedicineSupplier();
	        	    	companyName1=medicineWrittenObject.getCompanyName();
	        	    	rack1=medicineWrittenObject.getRack();
	        	    	cabnit1=medicineWrittenObject.getCabnit();
	        	    	quantity1=(medicineWrittenObject.getQuantity()-medicineQuantity);
	        	    	price1=medicineWrittenObject.getPrice();
	                	                                                                       
	        	    		
	        	    	MedicineFeature medicine = new MedicineFeature();

	        	    	medicine.setMedicineId(medicineId1);
	        	    	medicine.setMedicineName(medicineName);
	        	    	medicine.setMedicineSupplier(medicineSupplier1);
	        	    	medicine.setCompanyName(companyName1);
	        	    	medicine.setRack(rack1);
	        	    	medicine.setCabnit(cabnit1);
	        	    	medicine.setQuantity(quantity1);
	        	    	medicine.setPrice(price1);
	        			

	        			byte[] medicineBytes = MedicineFeature.BookToByteArrayBlock(medicine);
	        			
	        			FileOperations.updateBlock(medicineBytes,696,MedicineFeature.MEDICINE_DATA_BLOCK_SIZE ,"medicine.dat");
	        			
	        			
	    	    		
						
						break;
						
						
					}
					
        			
					
					
					break;
    			}
        			else {
        				System.out.println("|                                    Medicine Not Found                                       |");
        			}
    		}
            	}
        	catch(Exception e) {
        		
        	}
            	
            	
            	
            	
            
    				
    	    		for(int i=0;i<=2;i++) {
                		System.out.println("|                                                                                             |");
                	}
    	    		System.out.println("-----------------------------------------------------------------------------------------------");
                	System.out.println("|                                  Sale Recorded Sucessfully                                  |");
                	System.out.println("-----------------------------------------------------------------------------------------------");
                	
                	Thread.sleep(2500);
                	break;
    	    	case "c":
    	    		
    	    		break;
    	    	} 
                	
                	
                	
                	
                	
                	 
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                break;
                case "m","M": 
                	String searchExit="";
                	
                	System.out.println("-----------------------------------------------------------------------------------------------");
	            	System.out.println("|                                      Stock Of Medicine                                      |");
	            	System.out.println("-----------------------------------------------------------------------------------------------");
	            	
	            	
	            	for(int i=0;i<=1;i++) {
	            		System.out.println("|                                                                                             |");
	            	}
                	
	            	System.out.println("-----------------------------------------------------------------------------------------------");
	    	    	System.out.println("|       Medicine Name       Supplier       Company Name       Quantity       Sale Price       |");
	    	    	System.out.println("-----------------------------------------------------------------------------------------------");
                	
	    	    	try {
                		for(int c =1 ; c<5 ;c++)
            			{
                		
                		
            			byte[] medicineWrittenBytes = FileOperations.readBlock(c, MedicineFeature.MEDICINE_DATA_BLOCK_SIZE, "medicine.dat");
            			
            			
            			
            			
            			MedicineFeature medicineWrittenObject = MedicineFeature.ByteArrayBlockToBook(medicineWrittenBytes);
            			
            			
            			
    					
            			System.out.print("|           "+medicineWrittenObject.getMedicineName());
            			System.out.print("     |    "+medicineWrittenObject.getMedicineSupplier());
            			System.out.print("      |    "+medicineWrittenObject.getCompanyName());
            			System.out.print("    |         "+medicineWrittenObject.getQuantity());
            			System.out.print("     |       "+medicineWrittenObject.getPrice());
            		
            			
    					System.out.println("\n|---------------------------------------------------------------------------------------------|");
            			
            			
            		
                	
            				
            			
            		
            			}
	    	    	}
	    	    	catch(Exception e) {
	    	    		break;
	    	    	}
                	
	    	    	
	    	    	
	    	    System.out.print("|                               <Press m For Return Main Menu>");
        		searchExit=scanner.next();
        		switch(searchExit) {
        			
        		case "m","M":break;
        			
        		}	


                		
                	
                	
                	
                	
                case "s","S": 
                	
                	String searchExit3="";
                	
                	int medicineSearchId;
                for(int i=0;i<=2;i++) {
            		System.out.println("|                                                                                             |");
            	}
                	System.out.print("|  Please Enter Medicine ID:");
            	medicineSearchId = scanner.nextInt();
            	for(int i=0;i<=1;i++) {
            		System.out.println("|                                                                                             |");
            	}
            	
            	System.out.println("-----------------------------------------------------------------------------------------------");
    	    	System.out.println("|       Medicine Name       Supplier       Company Name       Quantity       Sale Price       |");
    	    	System.out.println("-----------------------------------------------------------------------------------------------");
            	
    	    	try {
            		for(int c =1 ; c<5 ;c++)
        			{
            		
            		
        			byte[] medicineWrittenBytes = FileOperations.readBlock(c, MedicineFeature.MEDICINE_DATA_BLOCK_SIZE, "medicine.dat");
        			
        			
        			
        			
        			MedicineFeature medicineWrittenObject = MedicineFeature.ByteArrayBlockToBook(medicineWrittenBytes);
        			
        			
        			if(medicineSearchId==medicineWrittenObject.getMedicineId()) {
					
        			System.out.print("|           "+medicineWrittenObject.getMedicineName());
        			System.out.print("     |    "+medicineWrittenObject.getMedicineSupplier());
        			System.out.print("      |    "+medicineWrittenObject.getCompanyName());
        			System.out.print("    |         "+medicineWrittenObject.getQuantity());
        			System.out.print("     |       "+medicineWrittenObject.getPrice());
        		
        			
					System.out.println("\n|---------------------------------------------------------------------------------------------|");
        			break;
        			}
        			}
            		}
            		catch(Exception ex) {
            			System.out.print("*********************************Medicine Not In Stock****************************************");
            		}
        			
        			System.out.print("|                               <Press m For Return Main Menu>");
        			searchExit=scanner.next();
        			switch(searchExit3) {
        			
        			case "m","M":break;
        			}
        				
    	    	
        		
        			
            	
            		
            		
            		


            		break;
            	
                
                
                
                
                
                
                
                
                
                
                case "x","X": break;
                
            }
        }
        catch (Exception ex){
            System.out.println("Please enter an integer value between 1 and 5");
            scanner.next();
        }
	        
	    }
	    @SuppressWarnings("unused")
		private static void option4() {
	    	
	    	Date objDate =new Date();
            String strDateDayFormat="dd";
            SimpleDateFormat objDay =new SimpleDateFormat(strDateDayFormat);
            String strDateFormat="dd-MMM-yyyy";
            SimpleDateFormat objFullDate =new SimpleDateFormat(strDateFormat);
            
            
            objFullDate.format(objDate);
         	objDay.format(objDate);
	    	String reportInput;
	    	@SuppressWarnings("resource")
			Scanner scanner=new Scanner(System.in);
	    	
	    	
         	System.out.println("-----------------------------------------------------------------------------------------------");
        	System.out.println("|                                            Report                                           |");
        	System.out.println("-----------------------------------------------------------------------------------------------");
        	for(int i=0;i<=3;i++) {
        		System.out.println("|                                                                                             |");
        	}
        	
        	System.out.println("|                                          Purchase                                           |");
    	    
        	for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
        	
        	
        	System.out.println("|                                           Sale(s)                                           |");
    	    
        	for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
        	
        	
        	
        	System.out.println("|                                          Profit(f)                                          |");
    	    
        	for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	    	
	    	     
        	System.out.println("|                                       Daily Purchase(b)                                     |");
	    
        	for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	    	
        	System.out.println("|                                        Daily Sale(a)                                        |");
	    	
        	for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	    	
        	System.out.println("|                                            Exit                                             |");
        	System.out.println("-----------------------------------------------------------------------------------------------");
        	System.out.println("|                             <<Please Enter Operations Letter>>");
        	reportInput=scanner.next();
        	
        	switch(reportInput) {
        	case"d","D":
        		String searchExit="";
        	
        	System.out.println("-----------------------------------------------------------------------------------------------");
        	System.out.println("|                                        Daily Purchase                                       |");
        	System.out.println("-----------------------------------------------------------------------------------------------");
        	for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
        	
        	
        	
	    	try {
        		for(int c =1 ; c<5 ;c++)
    			{
        		
        		
    			byte[] medicineWrittenBytes = FileOperations.readBlock(c, MedicineFeature.MEDICINE_DATA_BLOCK_SIZE, "medicine.dat");
    			
    			
    			
    			
    			MedicineFeature medicineWrittenObject = MedicineFeature.ByteArrayBlockToBook(medicineWrittenBytes);
    			
    			
    			//if(medicineStockId==medicineWrittenObject.getMedicineId()) {
				System.out.println("| Medicine ID:" +medicineWrittenObject.getMedicineId());
    			System.out.println("| Medicine Name:"+medicineWrittenObject.getMedicineName());
    			System.out.println("| Medicine Supplier:"+medicineWrittenObject.getMedicineSupplier());
    			System.out.println("| Company Name:"+medicineWrittenObject.getCompanyName());
    			System.out.println("| Quantity:"+medicineWrittenObject.getQuantity());
    			System.out.println("| Price:"+medicineWrittenObject.getPrice());
    		
    			
				System.out.println("|---------------------------------------------------------------------------------------------|");
    			
    			
    		
        	
    				
    			
    		
    			}
	    	}
	    	catch(Exception e) {
	    		System.out.print("|                               <Press m For Return Main Menu>");
				searchExit=scanner.next();
				switch(searchExit) {
				
				case "m","M":break;
				}
	    		
	    	}
        		
	    	
        		
        		
        		break;
        	case"p","P":
        		String searchExit1="";
        	
        	System.out.println("-----------------------------------------------------------------------------------------------");
        	System.out.println("|                                        Purchase                                             |");
        	System.out.println("-----------------------------------------------------------------------------------------------");
        	for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
        	
        	
        	
	    	try {
        		for(int c =1 ; c<5 ;c++)
    			{
        		
        		
    			byte[] medicineWrittenBytes = FileOperations.readBlock(c, MedicineFeature.MEDICINE_DATA_BLOCK_SIZE, "medicine.dat");
    			
    			
    			
    			
    			MedicineFeature medicineWrittenObject = MedicineFeature.ByteArrayBlockToBook(medicineWrittenBytes);
    			
    			
    			//if(medicineStockId==medicineWrittenObject.getMedicineId()) {
				System.out.println("| Medicine ID:" +medicineWrittenObject.getMedicineId());
    			System.out.println("| Medicine Name:"+medicineWrittenObject.getMedicineName());
    			System.out.println("| Medicine Supplier:"+medicineWrittenObject.getMedicineSupplier());
    			System.out.println("| Company Name:"+medicineWrittenObject.getCompanyName());
    			System.out.println("| Quantity:"+medicineWrittenObject.getQuantity());
    			System.out.println("| Price:"+medicineWrittenObject.getPrice());
    		
    			
				System.out.println("|---------------------------------------------------------------------------------------------|");
    			
    			
    		
        	
    				
    			
    		
    			}
	    	}
	    	catch(Exception e) {
	    		System.out.print("|                               <Press m For Return Main Menu>");
				searchExit1=scanner.next();
				switch(searchExit1) {
				
				case "m","M":break;
				}
	    		
	    	}
        		
	    	
        		
        		
        		break;
        		
        	case"f","F":
        		String searchExit11="";
        	
        	System.out.println("-----------------------------------------------------------------------------------------------");
        	System.out.println("|                                         Profit                                              |");
        	System.out.println("-----------------------------------------------------------------------------------------------");
        	for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
        	
        	int totalProfit=0;
        	int medicineId;
        	int price;
        	int quantity;
        	
	    	try {
        		for(int c =1 ; c<5 ;c++)
    			{
        		
        		
    			byte[] saleWrittenBytes = FileOperations.readBlock(c, SaleMedicineFeature.SALE_DATA_BLOCK_SIZE, "sale.dat");
    			
    			
    			
    			
    			SaleMedicineFeature saleWrittenObject = SaleMedicineFeature.ByteArrayBlockToBook(saleWrittenBytes);
    			
    			
    			//if(medicineStockId==medicineWrittenObject.getMedicineId()) {
				
    			quantity=saleWrittenObject.getMedicineQuantity();
    			medicineId=saleWrittenObject.getMedicineId();
    			
    			
    			int medicineSearchId;
            
        	medicineSearchId = medicineId;
        	
        	
	    	
        		for(int a =1 ; a<5 ;a++)
    			{
        		
        		
    			byte[] medicineWrittenBytes = FileOperations.readBlock(a, MedicineFeature.MEDICINE_DATA_BLOCK_SIZE, "medicine.dat");
    			
    			
    			
    			
    			MedicineFeature medicineWrittenObject = MedicineFeature.ByteArrayBlockToBook(medicineWrittenBytes);
    			
    			
    			if(medicineSearchId==medicineWrittenObject.getMedicineId()) {
				
    			price=(int) medicineWrittenObject.getPrice();
    			totalProfit+=price*quantity;
    			
    			
    			}
    			
    			
    			
    			
    			//System.out.println("|                  Total Profit"+totalProfit+" TL");
    		
    			
        	
        		
        		
        		

    				break;
        		
        	
            
            
            
            
            
            
            
            
            
            
    			
    			
        		
    		
        	
    				
    			
    		
    			
    			}
        		System.out.println("|                  Total Profit: "+totalProfit+" TL");
        		}
        		
        		}
	    	
    			
	    	catch(Exception e) {
	    		System.out.print("|                               <Press m For Return Main Menu>");
				searchExit11=scanner.next();
				switch(searchExit11) {
				
				case "m","M":break;
				}
	    		
	    	}
        		
	    	
	    	
			
        		
        		break;
        		
        		
        		
        		
        		
        	case"b","B":
        		String searchExit111="";
        	
        	System.out.println("-----------------------------------------------------------------------------------------------");
        	System.out.println("|                                        Daily Purchase                                       |");
        	System.out.println("-----------------------------------------------------------------------------------------------");
        	for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
        	
        	
        	
	    	try {
        		for(int c =1 ; c<5 ;c++)
    			{
        		
        		
    			byte[] medicineWrittenBytes = FileOperations.readBlock(c, MedicineFeature.MEDICINE_DATA_BLOCK_SIZE, "medicine.dat");
    			
    			
    			
    			
    			MedicineFeature medicineWrittenObject = MedicineFeature.ByteArrayBlockToBook(medicineWrittenBytes);
    			
    			
    			//if(medicineStockId==medicineWrittenObject.getMedicineId()) {
				System.out.println("| Medicine ID:" +medicineWrittenObject.getMedicineId());
    			System.out.println("| Medicine Name:"+medicineWrittenObject.getMedicineName());
    			System.out.println("| Medicine Supplier:"+medicineWrittenObject.getMedicineSupplier());
    			System.out.println("| Company Name:"+medicineWrittenObject.getCompanyName());
    			System.out.println("| Quantity:"+medicineWrittenObject.getQuantity());
    			System.out.println("| Price:"+medicineWrittenObject.getPrice());
    		
    			
				System.out.println("|---------------------------------------------------------------------------------------------|");
    			
    			
    		
        	
    				
    			
    		
    			}
	    	}
	    	catch(Exception e) {
	    		System.out.print("|                               <Press m For Return Main Menu>");
				searchExit111=scanner.next();
				switch(searchExit111) {
				
				case "m","M":break;
				}
	    		
	    	}
        		
	    	
        		
        		
        		break;
case"s","S":
        		
        		
	System.out.println("-----------------------------------------------------------------------------------------------");
	System.out.println("|                                           Sale                                              |");
	System.out.println("-----------------------------------------------------------------------------------------------");
	for(int i=0;i<=1;i++) {	
	System.out.println("|                                                                                             |");
	}

        		
        		
        		for(int c =1 ; c<5 ;c++)
        		{
        		
        		
        			byte[] saleWrittenBytes;
					try {
						
						
						saleWrittenBytes = FileOperations.readBlock(c, SaleMedicineFeature.SALE_DATA_BLOCK_SIZE, "sale.dat");
					
        			
        			
        			
        				
        				SaleMedicineFeature saleWrittenObject = SaleMedicineFeature.ByteArrayBlockToBook(saleWrittenBytes);
        				int counter=0;	
            			int a=saleWrittenObject.getMedicineId();
            			while (a > 0)
                        {
                            a /= 10;
                            counter++;
                        }
        				
        				
        			
        			if(counter==4) 
        			{
        				System.out.println("| Medicine Id:"+saleWrittenObject.getMedicineId());
            			System.out.println("| Customer Id:"+saleWrittenObject.getCustomerId());
            			System.out.println("| Medicine Quantity:"+saleWrittenObject.getMedicineQuantity());
            			
            		
            			
        				System.out.println("|---------------------------------------------------------------------------------------------|");
        			}
					} catch (Exception e) {
						break;
					}
					
					
        		}
        	System.out.print("|                               <Press m For Return Main Menu>");
			searchExit111=scanner.next();
			switch(searchExit111) {
			
			case "m","M":break;
			}
        		
        	case"a","A":
        		
        		
        		
        		System.out.println("-----------------------------------------------------------------------------------------------");
        		System.out.println("|                                     Daily Sale                                              |");
        		System.out.println("-----------------------------------------------------------------------------------------------");
        		for(int i=0;i<=1;i++) {	
        		System.out.println("|                                                                                             |");
        		}
        		
        		
        		
        		
        		for(int c =1 ; c<5 ;c++)
        		{
        		
        		
        			byte[] saleWrittenBytes;
					try {
						
						
						saleWrittenBytes = FileOperations.readBlock(c, SaleMedicineFeature.SALE_DATA_BLOCK_SIZE, "sale.dat");
					
        			
        			
        			
        				
        				SaleMedicineFeature saleWrittenObject = SaleMedicineFeature.ByteArrayBlockToBook(saleWrittenBytes);
        				int counter=0;	
            			int a=saleWrittenObject.getMedicineId();
            			while (a > 0)
                        {
                            a /= 10;
                            counter++;
                        }
        				
        				
        			
        			if(counter==4) 
        			{
        				System.out.println("| Medicine Id:"+saleWrittenObject.getMedicineId());
            			System.out.println("| Customer Id:"+saleWrittenObject.getCustomerId());
            			System.out.println("| Medicine Quantity:"+saleWrittenObject.getMedicineQuantity());
            			
            		
            			
        				System.out.println("|---------------------------------------------------------------------------------------------|");
        			}
					} catch (Exception e) {
						break;
					}
					
					
        		}
        	System.out.print("|                               <Press m For Return Main Menu>");
			searchExit111=scanner.next();
			switch(searchExit111) {
			
			case "m","M":break;
			}
        		
        	
        	case"e","E":
        		break;
        	
        	
        	
        	}
	    }
	    private static void option5() throws IOException, InterruptedException {
	    	
	    	@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
	    	int billNo=0;
	    	int medicineId=0;
	    	int customerId = 0;
	    	int option=1;
	    	int option1=1;
	    	int medicineQuantity=0;
	    	String billAddInput;
	    		
	    	
	    	
	    	
	    	
	    	
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	System.out.print("|       Bill No:");
	    	billNo=scanner.nextInt();
	    	
	    	scanner.nextLine(); 
	    	while(option!=2) {
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	System.out.print("|       Customer Id:");
	    	customerId=scanner.nextInt();
	    	
	    	    		
    		try {
            	for(int c =1 ; c<5 ;c++)
        		{
            		
            		
        			byte[] customerWrittenBytes = FileOperations.readBlock(c, CustomerFeature.CUSTOMER_DATA_BLOCK_SIZE, "customer.dat");
        			
        			
        			
        				
        				CustomerFeature customerWrittenObject = CustomerFeature.ByteArrayBlockToBook(customerWrittenBytes);
        				
        			
        			if(customerId==customerWrittenObject.getId()) {
        				System.out.println("-----------------------------------------------------------------------------------------------");
        		    	System.out.println("| Customer ID     Customer Name           Contact Number              City                Email         |");
        		    	System.out.println("-----------------------------------------------------------------------------------------------");
        				
        				System.out.print("|    "+customerWrittenObject.getId());
	        			System.out.print("|        " + customerWrittenObject.getCustomerName());
						System.out.print("         |       " + customerWrittenObject.getContactNum());         					
						System.out.print("          |         "+ customerWrittenObject.getCityName());
						System.out.println("          |    " + customerWrittenObject.getEmail());
						System.out.println("|---------------------------------------------------------------------------------------------|");
        			break;
        			}
        			
        				
        			
        		}
    		}
    		catch(Exception e) {
    			Thread.sleep(2000);
    			System.out.println("|                          !Customer Not Found Please Enter Again!                            |");
    			option=1;
    			break;
    		}
    		while(option1!= 2) 
    		{
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	System.out.print("|       Medicine ID:");
	    	medicineId=scanner.nextInt();
	    	
	    	try {
            	for(int c =1 ; c<5 ;c++)
        		{
            		
            		
        			byte[] medicineWrittenBytes = FileOperations.readBlock(c, MedicineFeature.MEDICINE_DATA_BLOCK_SIZE, "medicine.dat");
        			
        			
        			
        				
        				MedicineFeature medicineWrittenObject = MedicineFeature.ByteArrayBlockToBook(medicineWrittenBytes);
        				
        			
        			if(medicineId==medicineWrittenObject.getMedicineId()) {
        				System.out.println("-----------------------------------------------------------------------------------------------");
        		    	System.out.println("| Medicine ID      Medicine Name          Stock of Medicine          Company Name          Sale Price      |");
        		    	System.out.println("-----------------------------------------------------------------------------------------------");
        				
        				System.out.print("     "+ medicineWrittenObject.getMedicineId());
	        			System.out.print("|        " + medicineWrittenObject.getMedicineName());
						System.out.print("         |       " + medicineWrittenObject.getQuantity());         					
						System.out.print("          |         "+ medicineWrittenObject.getCompanyName());
						System.out.println("          |    " + medicineWrittenObject.getPrice());
						System.out.println("|---------------------------------------------------------------------------------------------|");
						option1=2;
						option=2;
        			break;
        			}
        			
        				
        			
        		}
    		}
    		catch(Exception e) {
    			option=1;
    			Thread.sleep(2000);
    			System.out.println("|                          !Medicine Not Found Please Enter Again!                            |");
    			break;
    		}                                                                                           
    		}
	    	
    		System.out.println("-----------------------------------------------------------------------------------------------");
	    	System.out.print("|       Quantity Of Medicine Sold:");
	    	medicineQuantity=scanner.nextInt();
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	    	}
	    	System.out.print("|                           <<Press s for Save,Press c for Cancel[s/c]>>");
	    	billAddInput=scanner.next();
	    	switch(billAddInput) {
	    	case "s":
	    		
					MainFunctions.AddBill(billNo,customerId,medicineId,medicineQuantity);
				
	    		for(int i=0;i<=2;i++) {
            		System.out.println("|                                                                                             |");
            	}
	    		System.out.println("-----------------------------------------------------------------------------------------------");
            	System.out.println("|                                  Bill Recorded Sucessfully                                  |");
            	System.out.println("-----------------------------------------------------------------------------------------------");
            	
            	Thread.sleep(2500);
            	break;
	    	case "c":
	    		
	    		break;
	    	} 
	        
	        
        }
       
	    private static void option6() {
	    	
	    	@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
	    	String aboutInput;
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	System.out.println("|                                           ABOUT                                             |");
	    	
	    	System.out.println("-----------------------------------------------------------------------------------------------");
	    	System.out.println("|                                         ########                                            |\r\n"
	    			+ "|                                        ##########                                           |\r\n"
	    			+ "|                                    #%%%%########%%%%#                                       |\r\n"
	    			+ "|                                     ################                                        |\r\n"
	    			+ "|                                     #######  #######                                        |\r\n"
	    			+ "|                                     #####      #####                                        |\r\n"
	    			+ "|                                     #######  #######                                        |\r\n"
	    			+ "|                                     ################                                        |");
	    	for(int i=0;i<=2;i++)
	    	{
        		System.out.println("|                                                                                             |");
        	}
	    	
	        System.out.println("|                    => This project is about Medical Store Management<=                      |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|              =>In This Project we Can Add Medicine ,Customer,Supplier Details<=             |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                        =>You Can Modifed & Delete Existing Record<=                         |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                 =>You Can Also Search Medicine ,Customer,Supplier Details<=                 |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|            =>This project written by Süleyman Mert Almalı and Eray Burak Çakır<=            |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("|                                 <Press m for Return Main Menu>                              |");
	        for(int i=0;i<=1;i++) {
        		System.out.println("|                                                                                             |");
        	}
	        System.out.println("-----------------------------------------------------------------------------------------------");
	        try {
	        	
	       
	        aboutInput = scanner.next();
            
            switch (aboutInput){
                case "m","M": break;
                
                
            }
        }
        catch (Exception ex){
            System.out.println("Please enter an integer value between 1 and 5");
            scanner.next();
        }
	        
	    }
	    
	   
	    
	}
	
	


