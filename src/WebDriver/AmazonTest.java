package WebDriver;

public class AmazonTest {
	
	public static void main(String...s)
	
	{
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://amazon.com");
	driver.findElement("name");
	driver.close();
	driver.quit();
	
	
	}
	
}

