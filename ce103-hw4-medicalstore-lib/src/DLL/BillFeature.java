package DLL;



public class BillFeature {
	
	//We determine the block lengths and convert them to the ASCII version and then convert them to bytes so that they work together with the functions in the interface.

	
	public static final int BILL_ID_LENGTH = 4;

	public static final int CUSTOMER_ID_MAX_LENGTH = 4;

	public static final int MEDICINE_ID_LENGTH = 4;

	public static final int MEDICINE_QUANTITY_LENGTH = 4;


	public static final int BILL_DATA_BLOCK_SIZE = BILL_ID_LENGTH + CUSTOMER_ID_MAX_LENGTH + MEDICINE_ID_LENGTH + MEDICINE_QUANTITY_LENGTH ;

	


	private int _billId;
	private int _customerId;
	private int _medicineId;
	private int _medicineQuantity;
	
	
	
	public final int getBillId()
	{
		return _billId;
	}
	public final void setId(int value)
	{
		_billId = value;
	}
	public final int getCustomerId()
	{
		return _customerId;
	}
	public final void setCustomerId(int value)
	{
		_customerId = value;
	}
	public final int getMedicineId()
	{
		return _medicineId;
	}
	public final void setMedicineId(int value)
	{
		_medicineId = value;
	}
	public final int getMedicineQuantity()
	{
		return _medicineQuantity;
	}
	public final void setMedicineQuantity(int value)
	{
		_medicineQuantity = value;
	}
	
	
	
	
	
	public static byte[] BookToByteArrayBlock(BillFeature bill)
	{
		int index = 0;

		byte[] dataBuffer = new byte[BILL_DATA_BLOCK_SIZE];


		byte[] billIdBytes = DataOperations.integerToByteArray(bill.getBillId());
		System.arraycopy(billIdBytes, 0, dataBuffer, index, billIdBytes.length);
		index += BillFeature.BILL_ID_LENGTH;
		
		byte[] customerIdBytes = DataOperations.integerToByteArray(bill.getCustomerId());
		System.arraycopy(customerIdBytes, 0, dataBuffer, index, customerIdBytes.length);
		index += BillFeature.CUSTOMER_ID_MAX_LENGTH;
		
		byte[] medicineIdBytes = DataOperations.integerToByteArray(bill.getMedicineId());
		System.arraycopy(medicineIdBytes, 0, dataBuffer, index, medicineIdBytes.length);
		index += BillFeature.MEDICINE_ID_LENGTH;
	
		byte[] medicineQuantityBytes = DataOperations.integerToByteArray(bill.getMedicineQuantity());
		System.arraycopy(medicineQuantityBytes, 0, dataBuffer, index, medicineQuantityBytes.length);
		index += BillFeature.MEDICINE_QUANTITY_LENGTH;
		
		if (index != dataBuffer.length)
		{

			throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
		}

		return dataBuffer;
		
		
		
	}
	
	
	public static BillFeature ByteArrayBlockToBook(byte[] byteArray)
	{

		BillFeature bill = new BillFeature();

		if (byteArray.length != BILL_DATA_BLOCK_SIZE)
		{
			throw new IllegalArgumentException("Byte Array Size Not Match with Constant Data Block Size");
		}

		int index = 0;

		//byte[] dataBuffer = new byte[BOOK_DATA_BLOCK_SIZE];

		byte[] billIdBytes = new byte[BillFeature.BILL_ID_LENGTH];
		System.arraycopy(byteArray, index, billIdBytes, 0, billIdBytes.length);
		bill.setId(DataOperations.byteArrayToInteger(billIdBytes));

		index += BillFeature.BILL_ID_LENGTH;
		
		byte[] customerIdBytes = new byte[BillFeature.CUSTOMER_ID_MAX_LENGTH];
		System.arraycopy(byteArray, index, customerIdBytes, 0, customerIdBytes.length);
		bill.setCustomerId(DataOperations.byteArrayToInteger(customerIdBytes));

		index += BillFeature.CUSTOMER_ID_MAX_LENGTH;
		
		byte[] medicineIdBytes = new byte[BillFeature.MEDICINE_ID_LENGTH];
		System.arraycopy(byteArray, index, medicineIdBytes, 0, medicineIdBytes.length);
		bill.setMedicineId(DataOperations.byteArrayToInteger(medicineIdBytes));

		index += BillFeature.MEDICINE_ID_LENGTH;
	
		byte[] medicineQuantityBytes = new byte[BillFeature.MEDICINE_QUANTITY_LENGTH];
		System.arraycopy(byteArray, index, medicineQuantityBytes, 0, medicineQuantityBytes.length);
		bill.setMedicineQuantity(DataOperations.byteArrayToInteger(medicineQuantityBytes));

		index += BillFeature.MEDICINE_QUANTITY_LENGTH;
		
		
		if (index != byteArray.length)
		{

			throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
		}

		if (bill.getBillId() == 0)
		{
			return null;
		}
		else
		{
			return bill;
		}
		
		
		
	}
	
	
	
	
	
}

