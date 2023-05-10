package com.globobot.action;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.globo.util.DriverContext;

public interface ActionValidacoes {
	default void validarTextoContido(By element , String msg) {
		String texto = DriverContext.getDriver().findElement(element).getText();
		if(!texto.equals(msg)) {
			Assert.fail("Elemento:" +element+ " não contém o texto: " + "\n"  + msg + "\n" +
					 " Esse é o texto exibido " + "\n" +texto);
			
		}
		//if (!element.equals(null)) {
		//	Assert.fail("Elemento não foi encontrado");
						
	//	}
	}
	default void ValidarTextoPassandoAtributo(By element , String atributo, String msg) {
		String texto = DriverContext.getDriver().findElement(element).getAttribute(atributo);
				
		if(!texto.contains(msg)) {
			Assert.fail("Elemento:" +element+ " não contém o texto " + msg);
		}
		if (!element.equals(null)) {
			Assert.fail("Elemento não foi encontrado");
	
			
		}
	}
	
}
