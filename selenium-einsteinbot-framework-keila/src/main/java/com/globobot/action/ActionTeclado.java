package com.globobot.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.globo.util.DriverContext;

public interface ActionTeclado {
	default void escrever(By element , String texto) {
		DriverContext.getDriver().findElement(element).sendKeys(texto);
	}
	default void acionarEnter(By elemento) {
		DriverContext.getDriver().findElement(elemento).sendKeys(Keys.ENTER);
	}
}
