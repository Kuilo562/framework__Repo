package organisation;

import org.testng.annotations.Test;

public class CreateOrgTest {
	@Test
	public void createOrgTest() {
		String URL = System.getProperty("Url");
		String UserName=System.getProperty("username");
		String PWD=System.getProperty("pwd");
		String Browser=System.getProperty("browser");
		System.out.println(Browser);
		System.out.println(PWD);
		System.out.println( UserName);
		System.out.println(URL);
		System.out.println("createOrgTest executed");
	}
	@Test
	public void modifyOrgTest() {
		System.out.println("modifyOrgTest executed");
		
	//chnges
	}
	}

