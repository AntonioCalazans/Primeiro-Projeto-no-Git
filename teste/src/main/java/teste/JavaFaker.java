//comentário
package teste;

import com.github.javafaker.Faker;

public class JavaFaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Faker faker = new Faker();
		String FirstName = faker.name().firstName();
		String LastName = faker.name().lastName();
		//String Domain = "wexinc.com";
		
		System.out.println("Nome " + FirstName + " Last Name " + LastName);
		System.out.println("Email: " + faker.internet().safeEmailAddress(FirstName +"."+ LastName).toLowerCase());
		System.out.println("City: " + faker.address().city());
		
		System.out.println(FirstName);
	}

}
