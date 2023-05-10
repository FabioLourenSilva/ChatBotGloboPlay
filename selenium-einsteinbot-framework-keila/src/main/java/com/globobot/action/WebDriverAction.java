package com.globobot.action;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.globo.util.DriverContext;

public interface WebDriverAction {
	
	default void abrirUrl(String url) {
		WebDriver driver = DriverContext.getDriver();
		
		if(driver==null) {
			switch (System.getProperty("navegador")) {
				case "chrome":
					if (System.getProperty("SO").equals("mac")){
						System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
					} else System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");

					driver = new ChromeDriver();
					ChromeOptions options = new ChromeOptions();
					options.addArguments();
					break;
				case "firefox":
					System.setProperty("webdriver.gecko.driver", "src/test/resources/driver/geckodriver.exe");
					driver = new FirefoxDriver();
					break;
				default:
					Assert.fail("Navegador inválido");
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
			DriverContext.setDriver(driver);
		}else {
			driver.get(url);
			DriverContext.setDriver(driver);
			
		}
	}
}
