package WebDriver;

public class ChromeDriver implements WebDriver{
	
	public ChromeDriver() {
		System.out.println("Launch Chrome Browser");
	}

	@Override
	public void get(String url) {
		System.out.println("Launch url " + url);
		
		
	}

	@Override
	public void findElement(String locator) {
		System.out.println("finding the element " + locator);
		
		
	}

	@Override
	public void close() {
		System.out.println("Cloase the Browser");
		
		
	}

	@Override
	public void quit() {
		System.out.println("Close All the Browser");
	
		
	}
	

}
