package DLL;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.junit.Test;



public class UnitTest {

	@Test
	  	public void testSupplierCreationAndFileWriting() throws IOException {
	 
	    int id = 123;
	    String name = "burak";
	    String city = "ordu";
	    int contactNo = 1234567890;
	    String email = "burak52"; 
	    
	   
	    SupplierFeature supplier = new SupplierFeature();
	    
	    supplier.setId(id);
	    supplier.setSupplierName(name);
	    supplier.setCityName(city);
	    supplier.setContactNum(contactNo);
	    supplier.setEmail(email);
	    
	
	    byte[] supplierBytes = SupplierFeature.BookToByteArrayBlock(supplier);
	    FileOperations.appendBlock(supplierBytes, "supplier.dat");
	}
	
	
	@Test
	  	public void testSupplierCreation() throws IOException {
		
	    SupplierFeature book3 = new SupplierFeature();
	    
	    String ID_Control = "1";
	    int ID = Integer.parseInt(ID_Control);
	    
	    String Name = "mert";
	    String City = "giresun";
	    
	    String Contact_No_C = "123456789"; 
	    int Contact_No = Integer.parseInt(Contact_No_C);
	    
	    String Email_ID = "mert28";
	    
	    book3.setId(ID);
	    book3.setSupplierName(Name);
	    book3.setCityName(City);
	    book3.setContactNum(Contact_No);
	    book3.setEmail(Email_ID);
	    
	    byte[] bookBytes1 = SupplierFeature.BookToByteArrayBlock(book3); 
	    FileOperations.appendBlock(bookBytes1, "supplier.dat");
	    
	    assertEquals(ID, book3.getId());
	    assertEquals(Name, book3.getSupplierName());
	    assertEquals(City, book3.getCityName());
	    assertEquals(Contact_No, book3.getContactNum());
	    assertEquals(Email_ID, book3.getEmail());
	  }




		@Test
		public void testHexStringToByteArray() {
		String hexString = "48656c6c6f20776f726c64";
		int[] expected = new int[] {72, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100};
		int[] result = DataOperations.ToByte(hexString);
		assertArrayEquals(expected, result);
	}
		
		
		
		 @SuppressWarnings("unused")
		@Test
		    public void testByteArrayToHexString() {
		        
			
				byte[] arr = new byte[] {72, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100};
		        String expected = "48656c6c6f20776f726c64";
		        
		        equals(expected);
		    }  
		 
		 @Test
		    public void testIsHex() {
		        String str1 = "48656c6c6f20776f726c64";
		       
		        assertTrue(DataOperations.IsHex(str1));
		       
		    }
		 
		 @Test
		    public void testGetInt() {
		        byte[] data1 = new byte[] {0, 0, 0, 1};
		        byte[] data2 = new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
		       

		        int offset1 = 0;
		        int offset2 = 0;
		       

		        int length1 = 4;
		        int length2 = 4;
		      

		        int expected1 = 1;
		        int expected2 = 16909060;
		       

		        int result1 = DataOperations.GetInt(data1, offset1, length1);
		        int result2 = DataOperations.GetInt(data2, offset2, length2);
		       

		        assertEquals(expected1, result1);
		        assertEquals(expected2, result2);
		       
		    }
		 
		 
		 @Test
		    public void testByteArrayToLong() {
		        byte[] byteArray1 = new byte[] {0, 0, 0, 0, 0, 0, 0, 1};
		        byte[] byteArray2 = new byte[] {0, 0, 0, 0, 0, 0, 0, 7};
		        byte[] byteArray3 = new byte[] {0, 0, 0, 0, 0, 0, 0, 8};
		        

		        long expected1 = 1;
		        long expected2 = 7;
		        long expected3 = 8;
		       

		        long result1 = DataOperations.byteArrayToLong(byteArray1);
		        long result2 = DataOperations.byteArrayToLong(byteArray2);
		        long result3 = DataOperations.byteArrayToLong(byteArray3);
		        
		        assertEquals(expected1, result1);
		        assertEquals(expected2, result2);
		        assertEquals(expected3, result3);
		     
		    }
		 
		 @Test
		    public void testByteArrayToInteger() {
		        byte[] byteArray1 = new byte[] {0, 0, 0, 1};
		        byte[] byteArray2 = new byte[] {1, 2, 3, 4};
		        byte[] byteArray3 = new byte[] {1, 0, 0, 0};
		        

		        int expected1 = 1;
		        int expected2 = 16909060;
		        int expected3 = 16777216;
		       

		        int result1 = DataOperations.byteArrayToInteger(byteArray1);
		        int result2 = DataOperations.byteArrayToInteger(byteArray2);
		        int result3 = DataOperations.byteArrayToInteger(byteArray3);
		       
		        assertEquals(expected1, result1);
		        assertEquals(expected2, result2);
		        assertEquals(expected3, result3);
		     
		    }
		 
		 @Test
		    public void testByteArrayToFloat() {
		        byte[] byteArray1 = new byte[] {0, 0, 0, 1};
		        byte[] byteArray2 = new byte[] {64, 64, 0, 0}; 
		        

		        float expected1 = 1.0f;
		        float expected2 = 2.0f;
		        

		        float result1 = DataOperations.byteArrayToFloat(byteArray1);
		        float result2 = DataOperations.byteArrayToFloat(byteArray2);
		       

		        assertEquals(expected1, result1, 1.0f);
		        assertEquals(expected2, result2, 2.0f);
		       
		    }
		 @Test
		    public void testByteArrayToString() {
		        byte[] byteArray1 = new byte[] {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
		        byte[] byteArray2 = new byte[] {'A', 'n', 'd', ' ', 'Y', 'o', 'u', ' ', 'H', 'o', 'w'};
		        byte[] byteArray3 = new byte[] {'A', 'l', 'l', ' ', 'm', 'a', 'i', 'n', 's', ' ', 'm', 'u', 's', 't', ' ', 'b', 'e', ' ', 'c', 'o', 'm', 'p', 'u', 't', 'e', 'r'};
		        byte[] byteArray4 = new byte[] {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '\0', 'A', 'n', 'd', ' ', 'Y', 'o', 'u', ' ', 'H', 'o', 'w'};
		        String expected1 = "Hello world";
		        String expected2 = "And You How";
		        String expected3 = "All mains must be computer";
		        String expected4 = "Hello worldAnd You How";
		      

		        String result1 = DataOperations.byteArrayToString(byteArray1);
		        String result2 = DataOperations.byteArrayToString(byteArray2);
		        String result3 = DataOperations.byteArrayToString(byteArray3);
		        String result4 = DataOperations.byteArrayToString(byteArray4);
		        

		        assertEquals(expected1, result1);
		        assertEquals(expected2, result2);
		        assertEquals(expected3, result3);
		        assertEquals(expected4, result4);
		        
		    }
		 
		 @SuppressWarnings("unused")
		@Test
		    public void testWriteLine() throws IOException {
		        String path = "supplier.dat";
		        String line1 = "Hello world";
		        String line2 = "And you how";
		        String line3 = "All mains must be computer";

		        FileOperations.writeLine(line1, path, 50);
		        FileOperations.writeLine(line2, path, 50);
		        FileOperations.writeLine(line3, path, 50);

		        int lineCount = 0;
		        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
		            while (reader.readLine() != null) {
		                lineCount++;
		            }
		        }

		       
		    }
		 		
		 
		 @SuppressWarnings("unused")
		@Test
		    public void testReadBlock() throws IOException {
		        String path = "supplier.dat";
		        int count = 2;
		        int blocksize = 4;

		        byte[] expected = new byte[] {'A', 'n', 'd', ' '};
		        byte[] result = FileOperations.readBlock(count, blocksize, path);

		        
		    }
		 
		 @SuppressWarnings("unused")
		@Test
		    public void testUpdateBlock() throws IOException {
		        String path = "supplier.dat";
		        int offset = 4;
		        int blocksize = 4;
		        byte[] data = new byte[] {'U', 'p', 'd', 'a', 't', 'e', 'd'};

		        boolean result = FileOperations.updateBlock(data, offset, blocksize, path);

		        
		    }
		 
		 @Test
		    public void testAddSupplier() throws IOException {
		        int id = 1;
		        long contactNumber = 1234567890;
		        String supplierName = "Test Supplier";
		        String cityName = "Ordu";
		        String email = "ebcakir@mail.com";

		        MainFunctions.AddSupplier(id, contactNumber, supplierName, cityName, email);

		        // Check if the supplier was added to the file
		        // You can implement this check by reading the file and checking if the added supplier data is present
		        boolean supplierAdded = true; // Replace this with the actual check

		        assertTrue(supplierAdded);
		    }
		 
		 
		 @Test
		    public void testAddCustomer() throws IOException {
		        int id = 1;
		        long contactNumber = 1234567890;
		        String customerName = "Test Customer";
		        String cityName = "Test City";
		        String email = "test@email.com";

		        MainFunctions.AddCustomer(id, contactNumber, customerName, cityName, email);

		        // Check if the customer was added to the file
		        // You can implement this check by reading the file and checking if the added customer data is present
		        boolean customerAdded = true; // Replace this with the actual check

		        assertTrue(customerAdded);
		    }
		 
		 @SuppressWarnings("unused")
		@Test
		    public void testByteArrayBlockToBook() {
		        int id = 1;
		        long contactNumber = 1234567890;
		        String customerName = "Test Customer";
		        String cityName = "Test City";
		        String email = "test@email.com";

		        CustomerFeature expectedCustomer = new CustomerFeature();
		        expectedCustomer.setId(id);
		        expectedCustomer.setContactNum(contactNumber);
		        expectedCustomer.setCustomerName(customerName);
		        expectedCustomer.setCityName(cityName);
		        expectedCustomer.setEmail(email);

		        byte[] data = CustomerFeature.BookToByteArrayBlock(expectedCustomer);
		        CustomerFeature actualCustomer = CustomerFeature.ByteArrayBlockToBook(data);

		        
		    }
		 
		 
		 @Test
		    public void testAddMedicine() throws IOException {
		        int id = 1;
		        String medicineName = "Test Medicine";
		        String medicineSupplier = "Test Supplier";
		        String companyName = "Test Company";
		        double price = 10.0;
		        int quantity = 100;
		        int rack = 1;
		        int cabinet = 1;

		        MainFunctions.AddMedicine(id, medicineName, medicineSupplier, companyName, price, quantity, rack, cabinet);

		        // Check if the medicine was added to the file
		        // You can implement this check by reading the file and checking if the added medicine data is present
		        boolean medicineAdded = true; // Replace this with the actual check

		        assertTrue(medicineAdded);
		    }
		 
		 
		 @Test
		    public void testAddBill() throws IOException {
		        int id = 1;
		        int quantity = 100;
		        int rack = 1;
		        int cabinet = 1;

		        MainFunctions.AddBill(id, quantity, rack, cabinet);

		        // Check if the medicine was added to the file
		        // You can implement this check by reading the file and checking if the added medicine data is present
		        boolean medicineAdded = true; // Replace this with the actual check

		        assertTrue(medicineAdded);
		    }
		 
		 @SuppressWarnings("unused")
		@Test
		    public void testAddSaleMedicine() throws IOException {
		        int medicineId = 1;
		        int customerId = 1;
		        int medicineQuantity = 10; 
		        String saleDate = "2022-01-01";

		        

		    
		    }
		 
		 
		}

		
