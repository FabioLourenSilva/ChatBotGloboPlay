package com.globo.pages;

import org.openqa.selenium.By;

public class PageLogin {
	public static By IPT_LOGIN = By.id("login");
	public static By IPT_SENHA = By.id("password");
	public static By CHK_CAPTCHA = By.xpath("//*[@id='checkbox']");
	public static By BTN_ENTRAR = By.xpath("//*[@id='login-form']/div[6]/button");
	public static By BTN_ERRO_LOGIN = By.xpath("");
}