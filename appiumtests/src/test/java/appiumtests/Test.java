package appiumtests;
//import java.net.MalformedURLException;

import java.net.URL;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidDriver;
//
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;




public class Test {
	
	static AppiumDriver driver;
	static AndroidDriver androidDriver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openApp();
			openFinanceApplication();
			
			Thread.sleep(10000);
			automateCustomerDetailScreen();
			
			Thread.sleep(10000);
			automateActiveLiabilitiesScreen();
			Thread.sleep(10000);
			automateFinanceCalculationsScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void openApp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","SM-A107F/DS");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("udid","R9WMA209ZDJ");
        capabilities.setCapability("appPackage","com.codebase.waqfe");
        capabilities.setCapability("appActivity","com.codebase.waqfe.ui.Splash");
//        capabilities.setCapability("unicodeKeyboard", true);
//        capabilities.setCapability("resetKeyboard", true);
        URL url =new URL("http://127.0.0.1:4723/wd/hub");
       
        
        driver=new AppiumDriver(url,capabilities);
        Thread.sleep(10000);
        WebElement loginbtn=driver.findElement(By.id("com.codebase.waqfe:id/login_button"));
        loginbtn.click();
        Thread.sleep(10000);
        WebElement username=driver.findElement(By.id("com.codebase.waqfe:id/et_email"));
        WebElement password=driver.findElement(By.id("com.codebase.waqfe:id/et_password"));
        WebElement login=driver.findElement(By.id("com.codebase.waqfe:id/login_button"));
        
        username.sendKeys("iAF6@bh.com");
        password.sendKeys("Test@1234");
//      546325 OTP  
        login.click();
        
        Thread.sleep(10000);
//        WebElement verifyOTPAlert=driver.findElement(By.id("com.codebase.waqfe:id/alert_verify"));
//        if(verifyOTPAlert!=null) {
//            Thread.sleep(10000);
//            
//        	WebElement verifyOTPAlert=driver.findElement(By.id("com.codebase.waqfe:id/alert_verify"));
//        	verifyOTPAlert.click();        
//	       WebElement OTP=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.TextView"));
//	       Actions actionOTP = new Actions(driver);
//	       actionOTP.sendKeys("546325").perform();
//	       Thread.sleep(3000);
//	       WebElement btnVerifyOTPAlert=driver.findElement(By.id("com.codebase.waqfe:id/btn_VerfiyOtp"));
//	       btnVerifyOTPAlert.click();
//        	Thread.sleep(5000);
//        }
	
        	WebElement btnMenuAccess=driver.findElement(By.id("com.codebase.waqfe:id/button"));
        	btnMenuAccess.click();
        	WebElement btnAccounts=driver.findElement(By.id("com.codebase.waqfe:id/button"));
        	btnAccounts.click();
        	WebElement btnAccountMenu=driver.findElement(By.id("com.codebase.waqfe:id/button"));
        	btnAccountMenu.click();
        	WebElement btnQuickActions=driver.findElement(By.id("com.codebase.waqfe:id/button"));
        	btnQuickActions.click();
        	
	          WebElement btnApply=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout"
	          		+ "/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/"
	          		+ "androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup"
	          		+ "/android.widget.FrameLayout[1]"
	          		+ "/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[4]"));
	          
	          btnApply.click();
	        Thread.sleep(3000);
		
	}
    public static void openFinanceApplication() throws InterruptedException{
    	
    	WebElement optionAutoFinance=driver.findElement(By.id("com.codebase.waqfe:id/auto_finance"));
      	optionAutoFinance.click();
      	Thread.sleep(3000);
      	WebElement btnLetsGo=driver.findElement(By.id("com.codebase.waqfe:id/lets_go"));
      	btnLetsGo.click();
      	Thread.sleep(3000);
      	WebElement btnLetsGo2=driver.findElement(By.id("com.codebase.waqfe:id/lets_go"));
      	btnLetsGo2.click();
      	
    }
    public static void automateCustomerDetailScreen() throws InterruptedException{
    	
		   WebElement employerName=driver.findElement(By.id("com.codebase.waqfe:id/employer_name_field"));
	       employerName.click();
	       Thread.sleep(3000);
	       
	       WebElement employerSearchBox=driver.findElement(By.id("com.codebase.waqfe:id/search_src_text"));
	       employerSearchBox.sendKeys("CENTRAL BANK OF BAHRAIN");
	       Thread.sleep(3000);
	       
	       WebElement clickSelectedEmployer=driver.findElement(By.id("com.codebase.waqfe:id/mainLayout"));
	       clickSelectedEmployer.click();
	       Thread.sleep(10000);
	       
	       WebElement basicSalaryField=driver.findElement(By.id("com.codebase.waqfe:id/salary_field"));
	       
	       basicSalaryField.sendKeys("1500");
	       
	       WebElement fixedAllowance=driver.findElement(By.id("com.codebase.waqfe:id/allowances_field"));
	       fixedAllowance.sendKeys("200");
	       
	       WebElement dropDownVehicleType=driver.findElement(By.id("android:id/text1"));
	       dropDownVehicleType.click();
	       Thread.sleep(3000);
	       
	       	WebElement selectVehicle=driver.findElement(By.xpath("/hierarchy/"
	         	+ "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/"
	         	+ "android.widget.TextView[4]"));
		          
	       selectVehicle.click();
	       Thread.sleep(3000);
		        
		   WebElement dropDownInstallmentField=driver.findElement(By.id("com.codebase.waqfe:id/grace_period_field"));
		   dropDownInstallmentField.click();
		   Thread.sleep(3000);
		        
		   WebElement selectDate=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
		          + "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
		          + "androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]"));
			          
		  selectDate.click();
		  Thread.sleep(3000);
		          
		  WebElement optionForAccount=driver.findElement(By.id("com.codebase.waqfe:id/btnRadioNo"));
		  optionForAccount.click();
		  Thread.sleep(3000);  
		          
		  WebElement btnNextCustomerDetails=driver.findElement(By.id("com.codebase.waqfe:id/next_button"));
		  btnNextCustomerDetails.click();
		  Thread.sleep(3000);
		          
		  WebElement autofinanceDisclaimer=driver.findElement(By.id("com.codebase.waqfe:id/checkbox_agreement"));
		  autofinanceDisclaimer.click();
		  Thread.sleep(3000); 
		          
		  WebElement btnDisclaimerConfirm=driver.findElement(By.id("com.codebase.waqfe:id/confirm_button"));
		  btnDisclaimerConfirm.click();
		  Thread.sleep(10000);
    }
    public static void automateActiveLiabilitiesScreen() throws InterruptedException{
   	
        WebElement checkBoxInternalFinancing=driver.findElement(By.id("com.codebase.waqfe:id/internalNo"));
        checkBoxInternalFinancing.click();
        Thread.sleep(3000); 
        
        WebElement btnNext=driver.findElement(By.id("com.codebase.waqfe:id/next_button"));
        btnNext.click();
        Thread.sleep(10000); 
   }
   public static void automateFinanceCalculationsScreen() throws InterruptedException{
       	
	   WebElement vehiclePriceField=driver.findElement(By.id("com.codebase.waqfe:id/vehicle_price_field"));
       vehiclePriceField.sendKeys("30000");
       Thread.sleep(3000);
       
       WebElement downPaymentField=driver.findElement(By.id("com.codebase.waqfe:id/down_payment_amount_field"));
       downPaymentField.click();
       driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "GO"));
       Thread.sleep(3000);
       
       WebElement financingAmountField=driver.findElement(By.id("com.codebase.waqfe:id/financing_amount_field"));
       financingAmountField.click();
       driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "GO"));
       Thread.sleep(3000);

       WebElement dropDownTenor=driver.findElement(By.id("android:id/text1"));
       dropDownTenor.click();
       Thread.sleep(3000);
       
       WebElement selectTenor7=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/"
         + "android.widget.ListView/android.widget.TextView[1]"));
	          
       selectTenor7.click();
       WebElement installmentAmountField=driver.findElement(By.id("com.codebase.waqfe:id/installment_amount_profit_rate"));
    		          
       installmentAmountField.click();
       String actualFinancingAmount=financingAmountField.getText();
       String excelFinancingAmount="29700.000";
       String actualIntallment=installmentAmountField.getText();
       String excelIstallment="BHD 401.719(3.60% APR)";
       if (actualIntallment.equals(excelIstallment) && actualFinancingAmount.equals(excelFinancingAmount)) {
    	   System.out.println("Financing Amount,Installment Amount and APR is correct for tenor 7 with vehicle Price 30000");
       }
       else {
    	   System.out.println("Financing Amount Installment Amount and APR is incorrect for tenor 7 with vehicle Price 30000"); 
       }
       
	        

   }
   

}
