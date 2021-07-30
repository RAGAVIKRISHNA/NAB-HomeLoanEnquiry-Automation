package com.standardsaustralia.homeloan.enquiry.pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.standardsaustralia.homeloan.utility.Hook;

public class EnquiryPage {
  public WebDriver driver;
  String userFirstName;
  String userLastName;
  String userPhone;
  String userEmail;
  String userState;
  
  @FindBy(xpath="//div[@class='textWithIconRed']//a[normalize-space()='Home loans']")
  public WebElement homeLoan;
	    
  @FindBy(xpath="//span[contains(text(),'Request a call back')]")
  public WebElement requestCallback;
	    
  @FindBy(id="contact-form-shadow-root")
  public WebElement shadowRootElement;
  
  @FindBy(xpath="//span[contains(text(),'No')]")
  public WebElement newCustomer;	  
  
  @FindBy(xpath="//span[contains(text(),'Submit')]")
  public WebElement submitButton;	  
  
  @FindBy(xpath="//input[@id='field-page-Page1-aboutYou-firstName']")
  public WebElement firstName;	  
  
  @FindBy(xpath="//form[@id='page-Page1']//input[@label='Last name']")
  public WebElement lastName;	  
  
  @FindBy(xpath="//form[@id='page-Page1']//input[@label='Phone number']")
  public WebElement phoneNumber;	  
  
  @FindBy(xpath="//form[@id='page-Page1']//input[@label='Email']")
  public WebElement email;	  
  
  @FindBy(xpath="//div[@class='css-1pcexqc-container']")
  public WebElement state;	  
  
  @FindBy(xpath="//div[contains(text(),'VIC')]")
  public WebElement chooseState;	
  
    
  public EnquiryPage()  {
	 this.driver = Hook.getDriver();
	 PageFactory.initElements(driver, this);
  }
 
  public void choose_homeLoan() {
	  System.out.println(homeLoan.getText());
	 homeLoan.click();
  }
	    
  public void request_callback() {
	 requestCallback.click();
  }
	    
  public void choose_category() {
	 WebElement shadowRoot1 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot",shadowRootElement);
	    	  
	 shadowRoot1.findElement(By.cssSelector("div[id=myRadioButton-0]>label")).click();
	 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	 
	          
	 WebElement nextButton = shadowRoot1.findElement(By.cssSelector("div.Buttonstyle__StyledWrapper-sc-1vu4swu-0.dEpQEc"));
	 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
	          
	 JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	 jse2.executeScript("arguments[0].scrollIntoView()", nextButton); 
	          
	 nextButton.click();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	 
  }
	
  public void provide_firstName(String firstname)
  {
	  userFirstName = firstname;
  }
  
  public void provide_lastName(String lastname)
  {
	  userLastName = lastname;
  }
  
  public void provide_email(String email)
  {
	  userEmail = email;
  }
  
  public void provide_phone(String Phone)
  {
	  userPhone = Phone;
  }
  
  public void provide_state(String state)
  {
	  userState = state;
  }
  
  public void provide_requestDetails() throws InterruptedException {
	      
  String parent=driver.getWindowHandle();
     Set<String>s=driver.getWindowHandles();

	 // Now iterate using Iterator
	 Iterator<String> I1= s.iterator();
	 while(I1.hasNext())
	 {
        String child_window=I1.next();
	    if(!parent.equals(child_window))
	    {
	       driver.switchTo().window(child_window);
	       driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);	 
	       newCustomer.click();    	
	       
	       firstName.sendKeys(userFirstName);
	       lastName.sendKeys(userLastName);
	       phoneNumber.sendKeys(userPhone);
	       email.sendKeys(userEmail);
	       
	       state.click();
	       Actions actions = new Actions(driver);
	       actions.moveToElement(chooseState).click().perform();
	       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	 
		      
	       submitButton.click();
	       //Added Thread.sleep only for video recording
	       Thread.sleep(5000);
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	 
		   
	    }
	 }
	 } 
  
}