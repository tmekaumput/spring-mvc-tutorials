package tutorial.spring.lab1.domain;

public class Address {

		private String street;
		private String city;
		private String zipCode;
		
		public void setStreet(String street) {
			this.street = street;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}

//		public Address(String street, String city, String zipCode) {
//			super();
//			this.street = street;
//			this.city = city;
//			this.zipCode = zipCode;
//		}

		@Override
		public String toString() {
			return "Address [street=" + street + ", city=" + city + ", zipCode=" + zipCode + "]";
		}
		
}
