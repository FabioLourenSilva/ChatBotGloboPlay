package com.globo.pages;

import org.openqa.selenium.By;

public class PageAlterarPlano {
	
	// Produto globoplay
	public static By BTN_PRODUTO_COM_ADDON =By.xpath("/html/body/app-root/app-base-layout/main/app-home/div/app-asset-list/div/div[2]/ul/li[2]/div/a/div[1]");
		
	// menu exibido para alterar plano
	public static By TXT_TEXTAREABOT = By.id("119:0");
	public static By BL_UM_ALTERAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[6]/div[2]/c-chat-message/div/lightning-formatted-rich-text");
	public static By BTN_ALTERAR_TROCA_MENSAL_ANUAL= By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[1]/button");
	public static By BTN_ALTERAR_TROCA_MAISCANAIS = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[2]/button");
	public static By BTN_ALTERAR_DISNEY = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[3]");
	public static By BTN_ALTERAR_DISCOVERY = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[4]/button");
	public static By BTN_ALTERAR_DEEZER = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[5]/button");
	public static By BTN_ALTERAR_PREMIERE = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[6]/button");
	public static By BTN_ALTERAR_TELECINE = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[7]/button");
	public static By BTN_ALTERAR_BIANUAL = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[8]/button");
	
	// balões ao clicar em trocar mensal para anual
	public static By BL_UM_ALTERAR_TROCAR_MENSAL_ANUAL = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_DOIS_ALTERAR_TROCAR_MENSAL_ANUAL = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_TRES_ALTERAR_TROCAR_MENSAL_ANUAL = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_ALTERAR_AJUDA_TROCAR_MENSAL_ANUAL = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_ALTERAR_AJUDA_MENSALANUAL_SIM = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[1]/button");
	public static By BT_ALTERAR_AJUDA_MENSALANUAL_NÃO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[2]/button");
	public static By BT_ALTERAR_AJUDA_MENSALANUAL_CONTINUAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[3]/button");

	
	
	// balões ao clicar em trocar para globoplay +canais
	public static By BL_UM_ALTERAR_TROCA_MAISCANAL = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div");
	public static By BL_DOIS_ALTERAR_TROCA_MAISCANAL = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_TRES_ALTERAR_TROCA_MAISCANAL = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div");
	public static By BL_ALTERAR_AJUDA_MAISCANAIS = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_ALTERAR_AJUDA_MAISCANAIS_SIM = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/div/ul/li[1]/button");
	public static By BT_ALTERAR_AJUDA_MAISCANAIS_NÃO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/div/ul/li[2]/button");
	public static By BT_ALTERAR_AJUDA_MAISCANAIS_CONTINUAR = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/div/ul/li[3]/button");

//Balões da opção Disney+
	public static By BL_UM_ALTERAR_DISNEY = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div");
	public static By BL_DOIS_ALTERAR_DISNEY = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div");
	public static By BL_TRES_ALTERAR_DISNEY = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_ALTERAR_AJUDA_DISNEY = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_ALTERAR_AJUDA_DISNEY_SIM = By.xpath("/html/body/app-root/div[1]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[1]/button");
	public static By BT_ALTERAR_AJUDA_DISNEY_NÃO = By.xpath("/html/body/app-root/div[1]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[2]/button");
	public static By BT_ALTERAR_AJUDA_DISNEY_CONTINUAR = By.xpath("/html/body/app-root/div[1]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[3]/button");

	//Balões da opção discovery+
	public static By BL_UM_ALTERAR_DISCOVERY = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div");
	public static By BL_DOIS_ALTERAR_DISCOVERY = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div");
	public static By BL_TRES_ALTERAR_DISCOVERY = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_ALTERAR_AJUDA_DISCOVERY = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_ALTERAR_AJUDA_DISCOVERY_SIM = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[1]/button");
	public static By BT_ALTERAR_AJUDA_DISCOVERY_NÃO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[2]/button");
	public static By BT_ALTERAR_AJUDA_DISCOVERY_CONTINUAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[3]/button");
	//Balões da opção discovery+ TRANFERÊNCIA QUANDO É ADDON
	public static By BL_UM_TRANSFERENCIA_DISCOVERY = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_DOIS_TRANSFERENCIA_DISCOVERY = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_ALTERAR_DISCOVERY_ATIVAR = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[1]/button");
	public static By BT_ALTERAR_DISCOVERY_MAIS_PRODUTOS = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[2]/button");
	public static By BT_ALTERAR_DISCOVERY_OUTROS_PRODUTOS = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[3]/button");
	
	//Balões da opção Deezer Premium
	public static By BL_UM_ALTERAR_DEEZER = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_DOIS_ALTERAR_DEEZER = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_TRES_ALTERAR_DEEZER = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_ALTERAR_AJUDA_DEEZER = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_ALTERAR_AJUDA_DEEZER_SIM = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[1]/button");
	public static By BT_ALTERAR_AJUDA_DEEZER_NÃO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[2]/button");
	public static By BT_ALTERAR_AJUDA_DEEZER_CONTINUAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[3]/button");
			
	//Balões da opção Premiere
	public static By BL_UM_ALTERAR_PREMIERE = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_DOIS_ALTERAR_PREMIERE  = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_TRES_ALTERAR_PREMIERE  = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_ALTERAR_AJUDA_PREMIERE = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_ALTERAR_AJUDA_PREMIERE_SIM = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[1]/button");
	public static By BT_ALTERAR_AJUDA_PREMIERE_NÃO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[2]/button");
	public static By BT_ALTERAR_AJUDA_PREMIERE_CONTINUAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[3]/button");
	
	//Balões da opção Telecine
	public static By BL_UM_ALTERAR_TELECINE = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div");
	public static By BL_DOIS_ALTERAR_TELECINE = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div");
	public static By BL_TRES_ALTERAR_TELECINE = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_ALTERAR_AJUDA_TELECINE = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_ALTERAR_AJUDA_TELECINE_SIM = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[1]/button");
	public static By BT_ALTERAR_AJUDA_TELECINE_NÃO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[2]/button");
	public static By BT_ALTERAR_AJUDA_TELECINE_CONTINUAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[3]/button");
	
	//Balões da opção Trocar para bianual
	public static By BL_UM_ALTERAR_BIANUAL = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_DOIS_ALTERAR_BIANUAL = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_TRES_ALTERAR_BIANUAL = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_ALTERAR_AJUDA_BIANUAL = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_ALTERAR_AJUDA_BIANUAL_SIM = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[1]/button");
	public static By BT_ALTERAR_AJUDA_BIANUAL_NÃO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[2]/button");
	public static By BT_ALTERAR_AJUDA_BIANUAL_CONTINUAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[3]/button");
	
//************************* Balões dos botões do alterar plano do cliente Suspenso por Saldo ******************************
	// Menu alterar plano
	
	public static By BL_UM_ALTERAR_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BTN_ALTERAR_TROCA_MENSAL_ANUAL_SUSPENSO_SALDO= By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[1]/button");
	public static By BTN_ALTERAR_TROCA_MAISCANAIS_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[2]/button");
	public static By BTN_ALTERAR_DISNEY_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[2]/div/ul/li[3]/button");
	public static By BTN_ALTERAR_DISCOVERY_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[4]/button");
	public static By BTN_ALTERAR_DEEZER_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[5]/button");
	public static By BTN_ALTERAR_PREMIERE_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[6]/button");
	public static By BTN_ALTERAR_TELECINE_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[2]/div/ul/li[7]/button");
	public static By BTN_ALTERAR_BIANUAL_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[2]/div/ul/li[8]/button");
	
	// balões ao clicar em trocar mensal para anual
	public static By BL_UM_ALTERAR_TROCAR_MENSAL_ANUAL_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/c-chat-message/div");
	public static By BL_DOIS_ALTERAR_TROCAR_MENSAL_ANUAL_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/c-chat-message/div");
	public static By BL_TRES_ALTERAR_TROCAR_MENSAL_ANUAL_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/c-chat-message/div");
	public static By BL_ALTERAR_AJUDA_TROCAR_MENSAL_ANUAL_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[15]/div[2]/c-chat-message/div");
	public static By BT_ALTERAR_AJUDA_MENSALANUAL_SIM_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[1]/button");
	public static By BT_ALTERAR_AJUDA_MENSALANUAL_NÃO_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[2]/button");
	public static By BT_ALTERAR_AJUDA_MENSALANUAL_CONTINUAR_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[3]/button");

	
	// balões ao clicar em trocar para globoplay +canais
	public static By BL_UM_ALTERAR_TROCA_MAISCANAL_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/c-chat-message/div");
	public static By BL_DOIS_ALTERAR_TROCA_MAISCANAL_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_TRES_ALTERAR_TROCA_MAISCANAL_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/c-chat-message/div");
	public static By BL_ALTERAR_AJUDA_MAISCANAIS_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[15]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_ALTERAR_AJUDA_MAISCANAIS_SIM_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[1]/button");
	public static By BT_ALTERAR_AJUDA_MAISCANAIS_NÃO_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[2]/button");
	public static By BT_ALTERAR_AJUDA_MAISCANAIS_CONTINUAR_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[3]/button");

	//Balões da opção Disney+
	
	public static By BL_UM_ALTERAR_DISNEY_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/c-chat-message/div");
	public static By BL_DOIS_ALTERAR_DISNEY_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_ALTERAR_AJUDA_DISNEY_SIM_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/div/ul/li[1]/button");
	public static By BT_ALTERAR_AJUDA_DISNEY_NÃO_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/div/ul/li[2]");

	//Balões da opção discovery
	public static By BL_UM_ALTERAR_DISCOVERY_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/c-chat-message/div");
	public static By BL_DOIS_ALTERAR_DISCOVERY_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_ALTERAR_AJUDA_DISCOVERY_SIM_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/div/ul/li[1]/button");
	public static By BT_ALTERAR_AJUDA_DISCOVERY_NÃO_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/div/ul/li[2]");
	
	// Balões da opção Deezer
	public static By BL_UM_ALTERAR_DEEZER_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/c-chat-message/div");
	public static By BL_DOIS_ALTERAR_DEEZER_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_ALTERAR_AJUDA_DEEZER_SIM_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/div/ul/li[1]/button");
	public static By BT_ALTERAR_AJUDA_DEEZER_NÃO_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/div/ul/li[2]");

	//Balões da opção Premiere
		public static By BL_UM_ALTERAR_PREMIERE_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_DOIS_ALTERAR_PREMIERE_SUSPENSO_SALDO  = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_TRES_ALTERAR_PREMIERE_SUSPENSO_SALDO  = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_ALTERAR_AJUDA_PREMIERE_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[15]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BT_ALTERAR_AJUDA_PREMIERE_SIM_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[1]/button");
		public static By BT_ALTERAR_AJUDA_PREMIERE_NÃO_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[2]/button");
		public static By BT_ALTERAR_AJUDA_PREMIERE_CONTINUAR_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[3]/button");
		
		//Balões da opção Telecine
		public static By BL_UM_ALTERAR_TELECINE_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_DOIS_ALTERAR_TELECINE_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_TRES_ALTERAR_TELECINE_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_ALTERAR_AJUDA_TELECINE_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[15]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BT_ALTERAR_AJUDA_TELECINE_SIM_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[1]/button");
		public static By BT_ALTERAR_AJUDA_TELECINE_NÃO_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[2]/button");
		public static By BT_ALTERAR_AJUDA_TELECINE_CONTINUAR_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[3]/button");
			
		//Balões da opção Trocar para bianual
		public static By BL_UM_ALTERAR_BIANUAL_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_DOIS_ALTERAR_BIANUAL_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_TRES_ALTERAR_BIANUAL_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_ALTERAR_AJUDA_BIANUAL_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[15]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BT_ALTERAR_AJUDA_BIANUAL_SIM_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[1]/button");
		public static By BT_ALTERAR_AJUDA_BIANUAL_NÃO_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[2]/button");
		public static By BT_ALTERAR_AJUDA_BIANUAL_CONTINUAR_SUSPENSO_SALDO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[3]/button");
		
		
		//************************* Balões dos botões do alterar plano do cliente Suspenso por Cadastro ******************************
		// Menu alterar plano
		
		public static By BL_UM_ALTERAR_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BTN_ALTERAR_TROCA_MENSAL_ANUAL_SUSPENSO_CADASTRO= By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[1]/button");
		public static By BTN_ALTERAR_TROCA_MAISCANAIS_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[2]/button");
		public static By BTN_ALTERAR_DISNEY_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[3]/button");
		public static By BTN_ALTERAR_DISCOVERY_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[4]/button");
		public static By BTN_ALTERAR_DEEZER_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[5]/button");
		public static By BTN_ALTERAR_PREMIERE_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[6]/button");
		public static By BTN_ALTERAR_TELECINE_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[7]/button");
		public static By BTN_ALTERAR_BIANUAL_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[8]/button");
		
		// balões ao clicar em trocar mensal para anual
		public static By BL_UM_ALTERAR_TROCAR_MENSAL_ANUAL_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/c-chat-message/div");
		public static By BL_DOIS_ALTERAR_TROCAR_MENSAL_ANUAL_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/c-chat-message/div");
		public static By BL_TRES_ALTERAR_TROCAR_MENSAL_ANUAL_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/c-chat-message/div");
		public static By BL_ALTERAR_AJUDA_TROCAR_MENSAL_ANUAL_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[15]/div[2]/c-chat-message/div");
		public static By BT_ALTERAR_AJUDA_MENSALANUAL_SIM_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[1]/button");
		public static By BT_ALTERAR_AJUDA_MENSALANUAL_NÃO_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[2]/button");
		public static By BT_ALTERAR_AJUDA_MENSALANUAL_CONTINUAR_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[3]/button");

		
		// balões ao clicar em trocar para globoplay +canais
		public static By BL_UM_ALTERAR_TROCA_MAISCANAL_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/c-chat-message/div");
		public static By BL_DOIS_ALTERAR_TROCA_MAISCANAL_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_TRES_ALTERAR_TROCA_MAISCANAL_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/c-chat-message/div");
		public static By BL_ALTERAR_AJUDA_MAISCANAIS_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[15]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BT_ALTERAR_AJUDA_MAISCANAIS_SIM_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[1]/button");
		public static By BT_ALTERAR_AJUDA_MAISCANAIS_NÃO_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[2]/button");
		public static By BT_ALTERAR_AJUDA_MAISCANAIS_CONTINUAR_SUSPENSO_CADASTRO= By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[3]/button");

		//Balões da opção Disney+
		
		public static By BL_UM_ALTERAR_DISNEY_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/c-chat-message/div");
		public static By BL_DOIS_ALTERAR_DISNEY_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BT_ALTERAR_AJUDA_DISNEY_SIM_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/div/ul/li[1]/button");
		public static By BT_ALTERAR_AJUDA_DISNEY_NÃO_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/div/ul/li[2]");

		//Balões da opção discovery
		public static By BL_UM_ALTERAR_DISCOVERY_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/c-chat-message/div");
		public static By BL_DOIS_ALTERAR_DISCOVERY_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BT_ALTERAR_AJUDA_DISCOVERY_SIM_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/div/ul/li[1]/button");
		public static By BT_ALTERAR_AJUDA_DISCOVERY_NÃO_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/div/ul/li[2]");
		
		// Balões da opção Deezer
		public static By BL_UM_ALTERAR_DEEZER_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/c-chat-message/div");
		public static By BL_DOIS_ALTERAR_DEEZER_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BT_ALTERAR_AJUDA_DEEZER_SIM_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/div/ul/li[1]/button");
		public static By BT_ALTERAR_AJUDA_DEEZER_NÃO_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/div/ul/li[2]");

		//Balões da opção Premiere
			public static By BL_UM_ALTERAR_PREMIERE_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
			public static By BL_DOIS_ALTERAR_PREMIERE_SUSPENSO_CADASTRO  = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
			public static By BL_TRES_ALTERAR_PREMIERE_SUSPENSO_CADASTRO  = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
			public static By BL_ALTERAR_AJUDA_PREMIERE_SUSPENSO_CADASTRO= By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[15]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
			public static By BT_ALTERAR_AJUDA_PREMIERE_SIM_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[1]/button");
			public static By BT_ALTERAR_AJUDA_PREMIERE_NÃO_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[2]/button");
			public static By BT_ALTERAR_AJUDA_PREMIERE_CONTINUAR_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[3]/button");
			
			//Balões da opção Telecine
			public static By BL_UM_ALTERAR_TELECINE_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
			public static By BL_DOIS_ALTERAR_TELECINE_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
			
			public static By BT_ALTERAR_AJUDA_TELECINE_SIM_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[1]/button");
			public static By BT_ALTERAR_AJUDA_TELECINE_NÃO_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[2]/button");
			
				
			//Balões da opção Trocar para bianual
			public static By BL_UM_ALTERAR_BIANUAL_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
			public static By BL_DOIS_ALTERAR_BIANUAL_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
			public static By BL_TRES_ALTERAR_BIANUAL_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
			public static By BL_ALTERAR_AJUDA_BIANUAL_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[15]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
			public static By BT_ALTERAR_AJUDA_BIANUAL_SIM_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[1]/button");
			public static By BT_ALTERAR_AJUDA_BIANUAL_NÃO_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[2]/button");
			public static By BT_ALTERAR_AJUDA_BIANUAL_CONTINUAR_SUSPENSO_CADASTRO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[3]/button");
			
}