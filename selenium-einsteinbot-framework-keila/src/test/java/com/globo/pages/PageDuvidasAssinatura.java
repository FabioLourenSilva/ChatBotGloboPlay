package com.globo.pages;

import org.openqa.selenium.By;

public class PageDuvidasAssinatura {
	//Menu
	public static By TXT_TEXTAREABOT = By.xpath("/html/body/app-root/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div[2]/textarea");
	public static By BL_UM_DUVIDAS_ASSINATURA = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[6]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BTN_DUVIDAS_NAO_LEMBRO_CONTRATEI = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[1]/button");
	public static By BTN_DUVIDAS_VALE_PRESENTE = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[2]/button");
	public static By BTN_DUVIDAS_NAO_APARECE_ASSINATURA = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[3]/button");
	public static By BTN_DUVIDAS_USAR_DEPOIS_CANCELAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[4]/button");

	// botão Não lembro por onde contratei
	public static By BL_UM_DUVIDA_NAO_LEMBRO_CONTRATEI = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div");
	public static By BL_DOIS_DUVIDA_NAO_LEMBRO_CONTRATEI = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_AJUDA_DUVIDAS_NAO_LEMBRO_CONTRATEI = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_AJUDA_DUVIDAS_NAO_LEMBRO_CONTRATEI_SIM = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[1]/button");
	public static By BT_AJUDA_DUVIDAS_NAO_LEMBRO_CONTRATEI_NÃO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[2]/button");
	public static By BT_AJUDA_DUVIDAS_NAO_LEMBRO_CONTRATEI_CONTINUAR = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[3]/button");
	
	// botão Tenho um vale-presente
	public static By BL_UM_DUVIDA_VALE_PRESENTE = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_AJUDA_DUVIDAS_VALE_PRESENTE = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_AJUDA_DUVIDAS_VALE_PRESENTE_SIM = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/div/ul/li[1]/button");
	public static By BT_AJUDA_DUVIDAS_VALE_PRESENTE_NÃO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/div/ul/li[2]/button");
	public static By BT_AJUDA_DUVIDAS_VALE_PRESENTE_CONTINUAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/div/ul/li[3]/button");
	
	//botão Não aparece minha assinatura
	public static By BL_UM_DUVIDA_MINHA_ASSINATURA = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_DOIS_DUVIDA_MINHA_ASSINATURA = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div");
	public static By BL_AJUDA_DUVIDAS_MINHA_ASSINATURA = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_AJUDA_DUVIDAS_MINHA_ASSINATURA_SIM = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[1]/button");
	public static By BT_AJUDA_DUVIDAS_MINHA_ASSINATURA_NÃO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[2]/button");
	public static By BT_AJUDA_DUVIDAS_MINHA_ASSINATURA_CONTINUAR = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[3]/button");
	//botão Usar depois de cancelar
	public static By BL_UM_DUVIDA_DEPOIS_CANCELAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_AJUDA_DUVIDAS_DEPOIS_CANCELAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_AJUDA_DUVIDAS_DEPOIS_CANCELAR_SIM = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/div/ul/li[1]/button");
	public static By BT_AJUDA_DUVIDAS_DEPOIS_CANCELARE_NÃO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/div/ul/li[2]/button");
	public static By BT_AJUDA_DUVIDAS_DEPOIS_CANCELAR_CONTINUAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/div/ul/li[3]/button");
}
