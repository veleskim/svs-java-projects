class WrongZip extends Exception {
	WrongZip(String msg) {
		System.out.println(msg);
	}
}

public class ZipCodeWithExceptions {

	private String zipCode;

	public void setZip(String zipCode) {
		this.zipCode = zipCode;
	}

	public void printZip() {
		System.out.println("The zip code is:" + zipCode);
	}

	public static void main(String[] args) throws WrongZip {

		ZipCodeWithExceptions zc = new ZipCodeWithExceptions();
		zc.setZip("1000");
		if (zc.zipCode.length() == 5 || zc.zipCode.length() == 9)
			zc.printZip();
		else
			throw new WrongZip("The zip code must be 5 or 9 digits long!");

	}
}
