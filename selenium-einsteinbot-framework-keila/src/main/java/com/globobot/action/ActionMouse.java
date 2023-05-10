package com.globobot.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.globo.util.DriverContext;

public interface ActionMouse {
	default void clicar(By element) {
		DriverContext.getDriver().findElement(element).click();
	}
	
//	default void foco(By elemento) {
//		new Actions(DriverContext.getDriver()).moveToElement((WebElement) elemento).perform();
//	}

}
