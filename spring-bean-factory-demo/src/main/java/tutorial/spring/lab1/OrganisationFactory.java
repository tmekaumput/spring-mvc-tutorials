package tutorial.spring.lab1;

public class OrganisationFactory {
	
	public Organisation getInstance(String companyName, int yearOfIncorporation) {
		System.out.println("OrganisationFactory.getInstance invoked");
		return new Organisation(companyName, yearOfIncorporation);
	}
}
