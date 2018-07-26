package tutorial.spring.lab1.domain;

public class Organisation {
	
	private String companyName;
	private int yearOfIncorporation;
	private Address address;
	
	public Organisation(String companyName, int yearOfIncorporation, Address address) {
		super();
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
		this.address = address;
	}

//	public Organisation() {
//		
//	}
	
//	public Organisation(String companyName, int yearOfIncorporation) {
//		this.companyName = companyName;
//		this.yearOfIncorporation = yearOfIncorporation;
//	}
//
//	public void corporateSlogan() {
//		String slogan = "We build the ultimate driving machines!";
//		System.out.println(slogan);
//	}

	@Override
	public String toString() {
		return "Organisation [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", address=" + address + "]";
	}
}
