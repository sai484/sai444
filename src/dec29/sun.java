package dec29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sun {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver dev=new ChromeDriver();
		dev.get("http://newtours.demoaut.com/");
		dev.manage().window().maximize();
		WebElement reg=dev.findElement(By.xpath("//a[contains(text(),'REGISTER')]"));
		reg.click();
		WebElement fname=dev.findElement(By.xpath("//input[@name='firstName']"));
		fname.sendKeys("john");
		WebElement lname=dev.findElement(By.xpath("//input[@name='lastName']"));
		lname.sendKeys("cena");
		WebElement phone=dev.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("1234567890");
		WebElement email=dev.findElement(By.xpath("//input[@id='userName']"));
		email.sendKeys("john123@gmail.com");
		WebElement address=dev.findElement(By.xpath("//input[@name='address1']"));
		address.sendKeys("ameerpet");
		WebElement city=dev.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("hyderabad");
		WebElement state=dev.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys("telangana");
		WebElement postalcode=dev.findElement(By.xpath("//input[@name='postalCode']"));
		postalcode.sendKeys("500031");
		WebElement country=dev.findElement(By.xpath("//select[@name='country']"));
		country.sendKeys("INDIA");
		WebElement username=dev.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("john143");
		WebElement Password=dev.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("john@4143");
		WebElement cpassword=dev.findElement(By.xpath("//input[@name='confirmPassword']"));
		cpassword.sendKeys("john@4143");
		WebElement sub=dev.findElement(By.xpath("//input[@name='register']"));
		sub.click();
		dev.findElement(By.linkText("sign-in")).click();
		WebElement usrname=dev.findElement(By.xpath("//input[@name='userName']"));
		usrname.sendKeys("john143");
		WebElement Passwords=dev.findElement(By.xpath("//input[@name='password']"));
		Passwords.sendKeys("john@4143");
		WebElement login=dev.findElement(By.xpath("//input[@name='login']"));
		login.click();
		Thread.sleep(6000);
		//dev.close();
		
		

	}

}
