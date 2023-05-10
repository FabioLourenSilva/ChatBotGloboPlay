package com.globo.pages;

import org.openqa.selenium.By;

public class PageBot {
	public static By CARD_ASS = By.xpath("/html/body/app-root/app-base-layout/main/app-home/div/app-asset-list/div/div[2]/ul/li/div/a");
	public static By BTN_ATENDIMENTO = By.xpath("/html/body/app-root/app-base-layout/app-footer/footer/div/div[2]/div[3]/a");
	public static By BOT = By.xpath("//div[@class='dockableContainer showDockableContainer']");
	public static By TIT_BOT = By.xpath("//div[@class = 'dockableContainer showDockableContainer']//h2");
	public static By BL_OLA = By.xpath("//li[@class='wrapper chatMessage agent embeddedServiceLiveAgentStateChatItem embeddedServiceLiveAgentStateChatMessage']//div[@ class='chatContent ']//span");
	public static By BL_DOIS_M = By.xpath("//li[@class='wrapper chatMessage agent embeddedServiceLiveAgentStateChatItem embeddedServiceLiveAgentStateChatMessage']/following-sibling::li//div[@ class='chatContent ']//span");
	public static By BL_TRES_M = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[3]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By TXT_AREA = By.xpath("//textarea[@class='chasitorText  textarea uiInput uiInputTextArea uiInput--default uiInput--textarea']");
	//public static By BTN_DISNEY = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[4]/div[1]/div/ul/li[1]/button");
	//public static By BTN_DISCOVERY = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[4]/div[1]/div/ul/li[2]/button");
	//public static By BTN_DEEZER = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[4]/div[1]/div/ul/li[3]/button");								
	public static By BTN_ATIVARSMART = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[4]/div[1]/div/ul/li[1]/button");										
	public static By BTN_ERROSASSISTIR = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[4]/div[1]/div/ul/li[2]/button");
	public static By BTN_ALTERARPLANO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[4]/div[1]/div/ul/li[3]/button");
	public static By BTN_ALTERARFORMAPAGAMENTO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[4]/div[1]/div/ul/li[4]/button");
	public static By BTN_MAISPRODUTOSGLOBO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[4]/div[1]/div/ul/li[5]/button");
	public static By BTN_OUTROSASSUNTOS = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[4]/div[1]/div/ul/li[6]/button");
	
	//###### TROCAR DE CONTA
	public static By BTN_FECHAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/embeddedservice-chat-header/header/button[2]");
	public static By BTN_ENCERRAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div/div[2]/button[1]/span");
	public static By BTN_FECHAR_CHAT = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[2]/button[1]/span");
	public static By BTN_CONTA = By.xpath("//*[@id='account']");
	public static By BTN_TROCAR_CONTA = By.xpath("//*[@id='logout']");
	
	
	//##### Balões após o menu
	public static By BL_UM_DISNEY = By.xpath("//li[@class='wrapper chatMessage agent embeddedServiceLiveAgentStateChatItem embeddedServiceLiveAgentStateChatMessage'][4]/div[@ class='chatContent ']//span");
	public static By BL_DOIS_DISNEY = By.xpath("//li[@class='wrapper chatMessage agent embeddedServiceLiveAgentStateChatItem embeddedServiceLiveAgentStateChatMessage'][5]/div[@ class='chatContent ']//span");
	public static By BL_TRES_DISNEY = By.xpath("//li[@class='wrapper chatMessage agent embeddedServiceLiveAgentStateChatItem embeddedServiceLiveAgentStateChatMessage'][6]/div[@ class='chatContent ']//span");
	public static By BL_AJUDA_DISNEY = By.xpath("//li[@class='wrapper chatMessage agent embeddedServiceLiveAgentStateChatItem embeddedServiceLiveAgentStateChatMessage'][7]/div[@ class='chatContent ']//span");
	////li[@class='wrapper chatMessage agent embeddedServiceLiveAgentStateChatItem embeddedServiceLiveAgentStateChatMessage'][12]/div[@ class='chatContent ']//span
	public static By BT_AJUDA_DISNEY_SIM = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[1]/button");
	public static By BT_AJUDA_DISNEY_NÃO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[2]/button");
	public static By BT_AJUDA_DISNEY_CONTINUAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[3]/button");
	
	
	//Fechar
//	public static By BTN_FECHAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/embeddedservice-chat-header/header/button[2]");
//	public static By BTN_ENCERRAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div/div[2]/button[1]/span");
//	public static By BTN_FECHAR_CHAT = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[2]/button[1]/span");
}