package selenium.examples;

import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 
{
	public static void main(String n[])
	{
		
	 ChromeDriver driver = new ChromeDriver();
	
	 driver.get("https://www.flexiquiz.com/home/features");
	 
	 String page_title = driver.getTitle(); 
		
	 System.out.println(page_title);
	 
	 driver.close();
	 
	}
}
