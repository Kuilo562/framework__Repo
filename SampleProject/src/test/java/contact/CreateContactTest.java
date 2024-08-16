package contact;

import org.testng.annotations.Test;

public class CreateContactTest {
	@Test
	public void createContactTest() {
		String URL = System.getProperty("Url");
		String UserName=System.getProperty("username");
		String PWD=System.getProperty("pwd");
		String Browser=System.getProperty("browser");
		System.out.println("createcontactTest executed");
	}
	@Test
	public void modifycontactTest() {
		System.out.println("modifycontactTest executed");
		//chnge
	}
	@Test
	public void deletecontactTest() {
		System.out.println("deletecontactTest executed");
	}
}

