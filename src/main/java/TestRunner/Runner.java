package TestRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;




import StepDefinition.Steps;
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="D:\\WorkplaceS\\CucumberWithS\\src\\main\\java\\Features",tags="@login,@Cra", glue={"StepDefinition"},format = {"pretty", "html:target/html/"})	

public class Runner {
	
	
	@BeforeClass
	public static void before_class()
	{
		//Steps.driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver/chromedriver.exe");
		Steps.driver.get("https://byblos-tnr-patch.talan.com/nb/#/login");
		Steps.driver.manage().window().maximize();
		System.out.println("test");

	}

	@AfterClass
	public static void close_browser()
	{
		
		
		//Steps.driver.close();
		
	}
}


