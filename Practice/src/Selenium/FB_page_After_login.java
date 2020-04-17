package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

@SuppressWarnings("unused")
public class FB_page_After_login {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\W2\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

// hit below URL
driver.get("https://m.facebook.com/");
 

//FB login page
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8073469494");

Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='m_login_password']")).sendKeys("Sharadha@123");

Thread.sleep(1000);
driver.findElement(By.xpath("//button[@name='login']")).click();

//Log in with one tap- selected not now

Thread.sleep(4000);
driver.findElement(By.linkText("Not Now")).click();

//get the title of the current page
String title= driver.getTitle();

//validate if we are landing on correct URL
System.out.println(driver.getCurrentUrl());
//Validation 
if(title.equals("Facebook"))
{
	System.out.println("correct title");
}
else
{
	System.out.println("wrong title");
	}

// Friend request tab
Thread.sleep(4000);

driver.findElement(By.xpath("//*[@id='u_0_b']/div/div")).click();
Thread.sleep(4000);
//see some suggestions
//Thread.sleep(4000);
//driver.findElement(By.xpath("//*[@id='u_0_c']/div/div")).click();
String Str1 = driver.getCurrentUrl();
if(Str1.equals("https://m.facebook.com/friends/center/requests/?rfj"))
{
	System.out.println("correct Find Friends page");
}
else
{
	System.out.println("wrong page");
	}
//Thread.sleep(4000);
driver.navigate().back();

//driver.findElement(By.linkText("Find Friends")).click();

//Messages tab
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id='u_0_c']/div/div")).click();
Thread.sleep(4000);

String Str2 = driver.getCurrentUrl();
if(Str2.equals("https://m.facebook.com/?soft=messages"))
{
	System.out.println("correct Message page");
}
else
{
	System.out.println("wrong page");
	}
//driver.navigate().back();

//Notification tab

Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id='u_0_d']/div/div")).click();
Thread.sleep(4000);
String Str3 = driver.getCurrentUrl();
if(Str3.equals("https://m.facebook.com/?soft=notifications"))
{
	System.out.println("correct Notification page");
}
else
{
	System.out.println("wrong page");
	}
//driver.navigate().back();

//search

Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id='search_jewel']/a/div/div")).click();
Thread.sleep(4000);


String Str4 = driver.getCurrentUrl();
if(Str4.equals("https://m.facebook.com/?soft=search"))
{
	System.out.println("correct Search page");
}
else
{
	System.out.println("wrong page");
	}
//driver.navigate().back();

//search for friend
driver.findElement(By.xpath("//input[@name='query']")).sendKeys("sinchana J N" + "\n");

Thread.sleep(2000);


driver.findElement(By.linkText("People")).click();
Thread.sleep(2000);


/*driver.switchTo().frame(0);

Actions act = new Actions(driver);
act.moveToElement(driver.findElement(By.xpath("//img[@id='u_6g_w']"))).click().build().perform();

//driver.findElement(By.xpath("//img[@id='u_6g_w']")).click();
*/
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id='u_0_f']/div/div")).click();

Thread.sleep(6000);
driver.get("https://m.facebook.com/sharadha.g.16?ref=bookmarks");

Thread.sleep(2000);
driver.findElement(By.linkText("Photo")).click();

Thread.sleep(6000);
driver.findElement(By.xpath("//button[@value='Upload a New Photo']")).sendKeys("C:\\Users\\Madhushree Meghraj\\Desktop\\madhu.png");




	}

}
