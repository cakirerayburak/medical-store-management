package DLL;

import java.io.File;
import java.io.IOException;



public class MainFunctions {

	
	
	
	public final static void AddSupplier(int Id, long ContactNumber, String SupplierName, String CityName, String Email) 
			throws IOException
	{
		SupplierFeature supplier = new SupplierFeature();

		supplier.setId(Id);
		supplier.setContactNum(ContactNumber);
		supplier.setSupplierName(SupplierName);
		supplier.setCityName(CityName);
		supplier.setEmail(Email);
		

		byte[] supplierBytes = SupplierFeature.BookToByteArrayBlock(supplier);
		ControlFile("supplier.dat");
		FileOperations.appendBlock(supplierBytes,"supplier.dat");
		//FileOperations.DeleteBlock();



	}

	public final static void AddCustomer(int Id, long ContactNumber, String CustomerName, String CityName, String Email) 
			throws IOException
	{
		CustomerFeature customer = new CustomerFeature();

		customer.setId(Id);
		customer.setContactNum(ContactNumber);
		customer.setCustomerName(CustomerName);
		customer.setCityName(CityName);
		customer.setEmail(Email);
		

		byte[] customerBytes = CustomerFeature.BookToByteArrayBlock(customer);
		ControlFile("customer.dat");
		FileOperations.appendBlock(customerBytes,"customer.dat");
		//FileOperations.DeleteBlock();



	}
	
	
	public final static void AddMedicine(int Id,String MedicineName, String MedicineSupplier, String CompanyName,double Price,int Quantity, int Rack,int Cabnit) 
			throws IOException
	{
		MedicineFeature medicine= new MedicineFeature();

		
		
		
		medicine.setMedicineId(Id);
		medicine.setMedicineName(MedicineName);
		medicine.setMedicineSupplier(MedicineSupplier);
		medicine.setCompanyName(CompanyName);
		medicine.setPrice(Price);
		medicine.setQuantity(Quantity);
		medicine.setRack(Rack);
		medicine.setCabnit(Cabnit);

		byte[] medicineBytes = MedicineFeature.BookToByteArrayBlock(medicine);
		ControlFile("medicine.dat");
		FileOperations.appendBlock(medicineBytes,"medicine.dat");
		//FileOperations.DeleteBlock();



	}
	
	public final static void AddBill(int BillId,int CustomerId ,int MedicineId, int MedicineQuantity) 
			throws IOException
	{
		BillFeature bill= new BillFeature();

		
		bill.setId(BillId);
		bill.setCustomerId(CustomerId);
		bill.setMedicineId(MedicineId);
		bill.setMedicineQuantity(MedicineQuantity);
		

		byte[] billBytes = BillFeature.BookToByteArrayBlock(bill);
		ControlFile("bill.dat");
		FileOperations.appendBlock(billBytes,"bill.dat");
		//FileOperations.DeleteBlock();



	}
	
	public final static void AddSaleMedicine(int MedicineId,int CustomerId , int MedicineQuantity,String SaleDate) 
			throws IOException
	{
		SaleMedicineFeature sale= new SaleMedicineFeature();

		
		
		sale.setCustomerId(CustomerId);
		sale.setMedicineId(MedicineId);
		sale.setMedicineQuantity(MedicineQuantity);
		sale.setSaleDate(SaleDate);
		
		byte[] saleMedicineBytes = SaleMedicineFeature.BookToByteArrayBlock(sale);
		
		ControlFile("sale.dat");
		FileOperations.appendBlock(saleMedicineBytes,"sale.dat");
		//FileOperations.DeleteBlock();



	}
	

	
	public final static void ControlFile(String FileName) throws IOException 
	{
		File file =new File(FileName);
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		
	}
	
	
}
