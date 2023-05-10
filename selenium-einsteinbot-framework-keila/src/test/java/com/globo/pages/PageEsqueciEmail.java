package com.globo.pages;

import org.openqa.selenium.By;

public class PageEsqueciEmail {
	
	public static By TXT_TEXTAREABOT = By.xpath("/html/body/app-root/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div[2]/textarea");
	public static By BL_UM_ESQUECI_EMAIL = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[6]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_AJUDA_ESQUECI_EMAIL = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_AJUDA_ESQUECI_EMAIL_SIM = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[8]/div[1]/div/ul/li[1]/button");
	public static By BT_AJUDA_ESQUECI_EMAIL_NÃO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[8]/div[1]/div/ul/li[2]/button");
	public static By BT_AJUDA_ESQUECI_EMAIL_CONTINUAR = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[8]/div[1]/div/ul/li[3]/button");

	// ESqueci e-mail que é exibido ao informar acesso e clicar no botão Erro ao fazer login
	public static By BL_ACESSO_UM_ESQUECI_EMAIL = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_ACESSO_AJUDA_ESQUECI_EMAIL = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_ACESSO_AJUDA_ESQUECI_EMAIL_SIM = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/div/ul/li[1]/button");
	public static By BT_ACESSO_AJUDA_ESQUECI_EMAIL_NÃO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/div/ul/li[2]/button");
	public static By BT_ACESSO_AJUDA_ESQUECI_EMAIL_CONTINUAR = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/div/ul/li[3]/button");

}
