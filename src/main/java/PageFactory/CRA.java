package PageFactory;

import static org.junit.Assert.assertEquals;

import java.io.InterruptedIOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CRA {
	public static WebDriver driver;
	
	@FindBy(xpath = "/html//app-root/div[@class='min-width']/app-content-layout/div[@class='container-fluid']/dashboard/div[@class='row']/div[4]/div[1]/app-widget//widget-cra//button[@class='btn btn-primary']")
	WebElement Remplir_btn;
	
	@FindBy(xpath = "/html//div[@id='main']/div[@class='row']/div[2]/cra-table//form//textarea[@name='commentaire']")
	WebElement Commentaire;
	
	@FindBy(xpath = "/html//div[@id='main']/div[@class='row']//cra-table//form/div[3]//button[.='Enregistrer ']")
	WebElement Enregistrer_btn;
	
	
	
	public void je_clique_sur_le_widget_cra_à_travers_le_bouton_Remplir_mon_cra() throws InterruptedException{
		Remplir_btn.click();
		Thread.sleep(3000);
		
		
	}
	
	
	public void je_saisie_un_commentaire() throws Throwable {
		Commentaire.click();
		Thread.sleep(1000);
		Commentaire.clear();
		Commentaire.sendKeys( "je teste le champs commentaire");
		
	}
	
	
	public void je_clique_sur_enregistrer() throws Throwable {
		
		Enregistrer_btn.click();
		Thread.sleep(1000);
		
	}
	
	public void je_vérifie_que_le_commentaire_a_été_ajouté() throws Throwable {
		
	    System.out.println(Commentaire.getText());	
		assertEquals("je teste le champs commentaire", Commentaire.getText());
		
		
		
		
	}
	
	
	public CRA (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
		
	}
	

}
