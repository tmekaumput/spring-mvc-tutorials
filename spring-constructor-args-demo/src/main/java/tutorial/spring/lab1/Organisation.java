package tutorial.spring.lab1;

public class Organisation {
	
	private String companyName;
	private int yearOfIncorporation;
	
	public Organisation() {
		
	}
	
	public Organisation(String companyName, int yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}

	public void corporateSlogan() {
		String slogan = "We build the ultimate driving machines!";
		System.out.println(slogan);
	}

	@Override
	public String toString() {
		return "Organisation [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation + "]";
	}
}
