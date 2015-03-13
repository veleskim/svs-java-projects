public class ZipCode {
	
	private String zipCode = "96000";
	
	public ZipCode() {}
	
	public void printZip()
	{
		System.out.println("The default zip code is:" +zipCode);
	}
	
	public void setZipCode(String zipCode)
	{
		if (zipCode.length()==5 || zipCode.length()==9)
		{
			this.zipCode = zipCode;
			System.out.println("The new zip code is: "+zipCode);
		}
		else
			System.out.println("The zip code must be 5 or 9 digits long!");
	}

	public static void main(String[] args) {
		
		ZipCode zc = new ZipCode();
		zc.printZip();
		zc.setZipCode("970");
		}

}
