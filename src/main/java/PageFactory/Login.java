package PageFactory;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public static WebDriver driver;

	@FindBy(xpath = "/html//input[@id='email']")
	static WebElement input_username;

	@FindBy(xpath = "/html//input[@id='password']")
	static WebElement input_password;

	@FindBy(xpath = "//div[@id='login']//form[@class='ng-dirty ng-touched ng-valid']/div/div[3]/button[.='Je me connecte ']")
	static WebElement btn_connexion;

	//@FindBy(xpath = "//html/body/app-root/div[@class='min-width']/app-content-layout/app-header/div[@class='container-fluid']/div[@class='row']/div[6]/div[@class='row']/div//a[@class='dropdown-toggle']/img[@src='blob:https://byblos-recette.talan.com/7f9f1e28-e119-4d64-8750-2d17a5964c16']")
	// @FindBy(xpath = "//html/body/app-root/div/app-content-layout/app-header/header/div/div/div[6]/div/div")
	@FindBy(xpath = "/html/body/app-root/div/app-content-layout/app-header/header/div/div/div[6]/div")
	static WebElement btn_user;
	 

	@FindBy(xpath = "//app-root/div[@class='min-width']/app-content-layout/app-header//div[@class='container-fluid']/div[@class='row']/div[6]/div[@class='row']/div//ul[@role='menu']/perfect-scrollbar//li[@role='menuitem']/b[@class='fullname']")
	static WebElement Text;
	///html/body/app-root/div/app-content-layout/app-header/header/div/div/div[6]/div/div/div[1]/a/img
//	Page_displayed.click();
	public void open_the_Chrome_and_launch_the_application() throws Throwable {

		System.out.println("I'm in the open browser method");

	}

	public void enter_the_Username_and_Password() {

		input_username.clear();

		input_username.sendKeys("ACBEGG");

		input_password.clear();

		input_password.sendKeys("byblos");

	}

	public void click_on_Connexion_button() throws InterruptedException {

		btn_connexion.click();
		
		System.out.println("buuug");
		Thread.sleep(3000);
	}

	public void the_Accueil_page_is_opened() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("The Accueil page is opened");
		btn_user.click(); 
		System.out.println(Text.getText());
		assertEquals("Vcbegg ACBEGG", Text.getText() );
		
	}



	public Login(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
}
