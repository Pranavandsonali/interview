import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranav Chavan\\Desktop\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//int data=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr")).size();
		System.out.println("enter input");
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine();
		ArrayList<String> a1=new ArrayList<String>();
		List<WebElement> a=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/descendant::td[text()='"+input+"']/following-sibling::td"));
		
		for(WebElement e:a)
		{
			a1.add(e.getText());
		}
		Collections.sort(a1);
		System.out.println(a1);
		/*for(int i=0;i<=data-1;i++)
		{
			//value.add(Integer.parseInt(a.get(i).getText()));
			//sum=sum+Integer.parseInt(a.get(i).getText());
			
		}*/
			
		
	}

}
