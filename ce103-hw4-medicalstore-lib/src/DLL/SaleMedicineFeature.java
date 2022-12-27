package DLL;



public class SaleMedicineFeature {
	
	

	public static final int CUSTOMER_ID_MAX_LENGTH = 4;

	public static final int MEDICINE_ID_LENGTH = 4;

	public static final int MEDICINE_QUANTITY_LENGTH = 4;

	public static final int SALE_DATE=4;

	public static final int SALE_DATA_BLOCK_SIZE = SALE_DATE+CUSTOMER_ID_MAX_LENGTH + MEDICINE_ID_LENGTH + MEDICINE_QUANTITY_LENGTH ;

	



	private int _customerId;
	private int _medicineId;
	private int _medicineQuantity;
	private String _saleDate;
	
	
	
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
	public final String getSaleDate() {
		return _saleDate;
	}
	public final void setSaleDate(String value) {
		_saleDate=value;
	}
	
	
	
	public static byte[] BookToByteArrayBlock(SaleMedicineFeature sale)
	{
		int index = 0;

		byte[] dataBuffer = new byte[SALE_DATA_BLOCK_SIZE];


		
		byte[] customerIdBytes = DataOperations.integerToByteArray(sale.getCustomerId());
		System.arraycopy(customerIdBytes, 0, dataBuffer, index, customerIdBytes.length);
		index += SaleMedicineFeature.CUSTOMER_ID_MAX_LENGTH;
		
		byte[] medicineIdBytes = DataOperations.integerToByteArray(sale.getMedicineId());
		System.arraycopy(medicineIdBytes, 0, dataBuffer, index, medicineIdBytes.length);
		index += SaleMedicineFeature.MEDICINE_ID_LENGTH;
	
		byte[] medicineQuantityBytes = DataOperations.integerToByteArray(sale.getMedicineQuantity());
		System.arraycopy(medicineQuantityBytes, 0, dataBuffer, index, medicineQuantityBytes.length);
		index += SaleMedicineFeature.MEDICINE_QUANTITY_LENGTH;
		
		
		
		byte[] saleDateBytes = DataOperations.StringToByteArray(sale.getSaleDate());
		System.arraycopy(saleDateBytes, 0, dataBuffer, index, saleDateBytes.length);
		index += SaleMedicineFeature.SALE_DATE;
		
		
		
		if (index != dataBuffer.length)
		{

			throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
		}

		return dataBuffer;
		
		
		
	}
	
	
	public static SaleMedicineFeature ByteArrayBlockToBook(byte[] byteArray)
	{

		SaleMedicineFeature sale = new SaleMedicineFeature();

		if (byteArray.length != SALE_DATA_BLOCK_SIZE)
		{
			throw new IllegalArgumentException("Byte Array Size Not Match with Constant Data Block Size");
		}

		int index = 0;

		//byte[] dataBuffer = new byte[BOOK_DATA_BLOCK_SIZE];

		
		
		byte[] customerIdBytes = new byte[SaleMedicineFeature.CUSTOMER_ID_MAX_LENGTH];
		System.arraycopy(byteArray, index, customerIdBytes, 0, customerIdBytes.length);
		sale.setCustomerId(DataOperations.byteArrayToInteger(customerIdBytes));

		index += SaleMedicineFeature.CUSTOMER_ID_MAX_LENGTH;
		
		byte[] medicineIdBytes = new byte[SaleMedicineFeature.MEDICINE_ID_LENGTH];
		System.arraycopy(byteArray, index, medicineIdBytes, 0, medicineIdBytes.length);
		sale.setMedicineId(DataOperations.byteArrayToInteger(medicineIdBytes));

		index += SaleMedicineFeature.MEDICINE_ID_LENGTH;
	
		byte[] medicineQuantityBytes = new byte[SaleMedicineFeature.MEDICINE_QUANTITY_LENGTH];
		System.arraycopy(byteArray, index, medicineQuantityBytes, 0, medicineQuantityBytes.length);
		sale.setMedicineQuantity(DataOperations.byteArrayToInteger(medicineQuantityBytes));

		index += SaleMedicineFeature.MEDICINE_QUANTITY_LENGTH;
		
		byte[] saleDateBytes =new byte[SaleMedicineFeature.SALE_DATE];
		System.arraycopy(byteArray, index, saleDateBytes, 0, saleDateBytes.length);
		sale.setSaleDate(DataOperations.byteArrayToString(saleDateBytes));
		
		index += SaleMedicineFeature.SALE_DATE;
		
		if (index != byteArray.length)
		{

			throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
		}

		if (sale.getMedicineId() == 0)
		{
			return null;
		}
		else
		{
			return sale;
		}
		
		
		
	}
	
	
	
	
	


}