package sampleGIT1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleGIT1 {

	@Test
	public void login() throws IOException{
		
		WebDriver wd=new FirefoxDriver();
		wd.get("http://www.bing.com/");
		wd.manage().window().maximize();
		WebElement input=wd.findElement(By.name("q"));
		input.sendKeys("abc");
		input.submit();
		//wd.manage().timeouts().implicitlyWait(10,)
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\SeleniumWorkspace\\SampleGIT1\\Screenshottest.jpg"));
	}

	}

