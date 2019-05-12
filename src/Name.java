//import java.util.List;

public class Name {
	private final String firstName;
//	private final List<String> middleNames;
	private String middleName;
	private final String lastName;
	
	private Name(Builder builder) {
		this.firstName = builder.firstName;
//		this.middleNames = builder.middleNames;
		this.middleName = builder.middleName;
		this.lastName = builder.lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

//	public List<String> getMiddleNames() {
//		return middleNames;
//	}
	
	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public static class Builder {
		private String firstName;
//		private List<String> middleNames;
		private String middleName;
		private String lastName;
		
		public Builder firstName(final String firstName) {
			this.firstName = firstName;
			return this;
		}
		
//		public Builder middleNames(final List<String> middleNames) {
//			this.middleNames = middleNames;
//			return this;
//		}
		
		public Builder middleName(final String middleName) {
			this.middleName = middleName;
			return this;
		}
		
		public Builder lastName(final String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public Name build() {
			return new Name(this);
		}
	}
}
