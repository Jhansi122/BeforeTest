package BeforeTest;

import org.testng.SkipException;
import org.testng.annotations.*;

public class BeforeMethod_Test {

	

	int a = 10;
	int b = 20;
	String c = "true";

	@Test(priority = 1)
	public void Test1() 
	{
		if (c.equals("true")) 
		{
			if (a < b) 
			{
				System.out.println(" only Test 1 will be executed");
				
			} 
			else 
			{
				throw new SkipException("Skipping Test 1");
			}
		}
	}

	@Test(priority = 2)
	public void Test2() {
		if (c.equals("false"))
		{
			System.out.println(" only Test 2 will be executed");
		}
		else 
		{

			throw new SkipException("Skipping Test 2 ");
		}
	} 

	@Test(priority = 3 ,enabled=false)
	public void Test3() 
	{
		if (c.equals("false")) 
		{
			if (a < b) 
			{
				System.out.println(" Test3 gets executed");
			} 
			else 
			{
				throw new SkipException("Skipping Test 3");
			}
				
			}
	}

	
	/* WebDriver driver; String DataAvailable="null";
	 * 
	 * @BeforeTest public void setup() throws Exception { System.setProperty(
	 * "webdriver.gecko.driver","C:\\Program Files\\Selenium\\Geckodriver\\geckodriver.exe\\"
	 * ); driver = new FirefoxDriver();
	 * driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 * driver.get("https://www.google.com/"); }
	 * 
	 * @Test(priority=1, enabled=false) public void Test1(){
	 * System.out.println("Test1  Executed"); }
	 * 
	 * @Test(priority=2) public void Test2() {
	 * 
	 * String title = driver.getTitle();
	 * System.out.println("Title of the webpage is "+title);
	 * if(title.equals("Google")) {
	 * 
	 * System.out.println("Test2 Executed Successfully");
	 * 
	 * } else { throw new SkipException("Test2 Is Skipped");
	 * 
	 * } }
	 * 
	 * @Test(priority=3) public void Test3(){
	 * 
	 * if(DataAvailable.equals("null")) {
	 * System.out.println("Test3 Executed Successfully");
	 * 
	 * } else { throw new SkipException("Test is Skipped - Data Not Available"); }
	 * 
	 * 
	 * }
	 * 
	 * @AfterTest public void close() throws Exception { driver.quit(); }
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
