package com.globo.pages;

import org.openqa.selenium.By;

public class PageCadastro {
	public static By TXT_TEXTAREABOT = By.xpath("/html/body/app-root/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div[2]/textarea");
	public static By BL_UM_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[6]/div[2]/c-chat-message/div");
	public static By BTN_CADASTRO_ALTERAR_EMAIL = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[1]");
	public static By BTN_CADASTRO_ALTERAR_FOTO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[2]");
	public static By BTN_CADASTRO_ATUALIZAR_DADOS = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[3]");
	
	//ALTERAR E-MAIL
	public static By BL_UM_CADASTRO_ALTERAR_EMAIL = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text");
	public static By BL_DOIS_CADASTRO_ALTERAR_EMAIL = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_AJUDA_CADASTRO_ALTERAR_EMAIL = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_AJUDA_CADASTRO_ALTERAR_EMAIL_SIM = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[1]/button");
	public static By BT_AJUDA_CADASTRO_ALTERAR_EMAIL_NÃO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[2]/button");
	public static By BT_AJUDA_CADASTRO_ALTERAR_EMAIL_CONTINUAR = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[3]/button");
	
	//ALTERAR FOTO PERFIL
	public static By BL_UM_CADASTRO_FOTO_PERFIL = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_AJUDA_CADASTRO_ALTERAR_FOTO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_AJUDA_CADASTRO_ALTERAR_FOTO_SIM = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/div/ul/li[1]/button");
	public static By BT_AJUDA_CADASTRO_ALTERAR_FOTO_NÃO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/div/ul/li[2]/button");
	public static By BT_AJUDA_CADASTRO_ALTERAR_FOTO_CONTINUAR = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/div/ul/li[3]/button");
	
	// ATUALIZAR DADOS
	public static By BL_UM_CADASTRO_ATUALIZAR_DADOS = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_DOIS_CADASTRO_ATUALIZAR_DADOS = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_TRES_CADASTRO_ATUALIZAR_DADOS = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_AJUDA_CADASTRO_ATUALIZAR_DADOS = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_AJUDA_CADASTRO_ATUALIZAR_DADOS_SIM = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[1]/button");
	public static By BT_AJUDA_CADASTRO_ATUALIZAR_DADOS_NÃO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[2]/button");
	public static By BT_AJUDA_CADASTRO_ATUALIZAR_DADOS_CONTINUAR = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[3]/button");
}
