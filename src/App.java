
public class App {

	public static void main(String[] args) {
		
		//in case of List type middleName: middleNames(ImmutableList.of("Bernat"))
		new Name.Builder().firstName("Gabor").middleName("Bernat").surname("Orban").build();

	}

}
