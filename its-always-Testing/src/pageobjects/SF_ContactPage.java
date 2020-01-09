package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="SF_ContactPage"                                
     , summary=""
     , relativeUrl=""
     , connection="LP_UAT"
     )             
public class SF_ContactPage {

	@ButtonType()
	@FindByLabel(label = "Renew")
	public WebElement renew;
			
}