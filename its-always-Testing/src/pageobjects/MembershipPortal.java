package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MembershipPortal"                                
     , summary=""
     , relativeUrl=""
     , connection="LP_UAT"
     )             
public class MembershipPortal {

	@LinkType()
	@FindBy(linkText = "Logout")
	public WebElement logout;
	@LinkType()
	@FindBy(linkText = "Return to Profile")
	public WebElement returnToProfile;
	@LinkType()
	@FindBy(css = "a.dropdown-toggle.profile-dropdown-toggle")
	public WebElement ProfileDropDown;
	@LinkType()
	@FindBy(linkText = "Logout")
	public WebElement logout1;
	@ButtonType()
	@FindByLabel(label = "Become a Member")
	public WebElement becomeAMember;
		@ButtonType()
	@FindByLabel(label = "Renew Dues")
	public WebElement renewDues;
		@ButtonType()
		@FindByLabel(label = "Launch Directory")
		public WebElement launchDirectory;
		@LinkType()
		@FindBy(linkText = "My Membership")
		public WebElement myMembershipTab;
				
}
