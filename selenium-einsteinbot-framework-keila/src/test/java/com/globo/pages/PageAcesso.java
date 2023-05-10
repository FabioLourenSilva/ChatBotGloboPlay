package com.globo.pages;

import org.openqa.selenium.By;

public class PageAcesso {
	
	public static By TXT_TEXTAREABOT = By.xpath("/html/body/app-root/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div[2]/textarea");
	public static By BL_UM_ACESSO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[6]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_ACESSO_ERRO_FAZER_LOGIN = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[1]/button");
	public static By BT_ACESSO_NAO_AUTORIZADO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[2]/button");
	public static By BT_ACESSO_LOGIN_FACEBOOK = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[3]/button");
	public static By BT_ACESSO_EMAIL_VALIDACAO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[4]/button");
	public static By BT_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[5]/button");
	public static By BT_ACESSO_COMO_ASSISTIR_DISNEY= By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[6]/button");
	//Erro ao fazer login esta no esqueci email
// botão acesso não autorizado
	public static By BL_UM_ACESSO_NAO_AUTORIZADO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_DOIS_ACESSO_NAO_AUTORIZADO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_TRES_ACESSO_NAO_AUTORIZADO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_AJUDA_ACESSO_NAO_AUTORIZADO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_AJUDA_ACESSO_NAO_AUTORIZADO_SIM = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[1]/button");
	public static By BT_AJUDA_ACESSO_NAO_AUTORIZADO_NÃO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[2]/button");
	public static By BT_AJUDA_ACESSO_NAO_AUTORIZADO_CONTINUAR = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[3]/button");

//botão fazer login com o facebook
	public static By BL_UM_ACESSO_LOGIN_FACEBOOK = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_DOIS_ACESSO_LOGIN_FACEBOOK = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_TRES_ACESSO_LOGIN_FACEBOOK = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_AJUDA_ACESSO_LOGIN_FACEBOOK = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_AJUDA_ACESSO_LOGIN_FACEBOOK_SIM = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[1]/button");
	public static By BT_AJUDA_ACESSO_LOGIN_FACEBOOK_NÃO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[2]/button");
	public static By BT_AJUDA_ACESSO_LOGIN_FACEBOOK_CONTINUAR = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[3]/button");
	
	
	//botão E-mail de validação
		public static By BL_UM_ACESSO_EMAIL_VALIDACAO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_DOIS_ACESSO_EMAIL_VALIDACAO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_TRES_ACESSO_EMAIL_VALIDACAO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_AJUDA_ACESSO_EMAIL_VALIDACAO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BT_AJUDA_ACESSO_EMAIL_VALIDACAO_SIM = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[1]/button");
		public static By BT_AJUDA_ACESSO_EMAIL_VALIDACAO_NÃO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[2]/button");
		public static By BT_AJUDA_ACESSO_EMAIL_VALIDACAO_CONTINUAR = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[3]/button");
		
		
	//botão Não consigo acessar Disney+
		public static By BL_UM_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_DOIS_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_TRES_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BT_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_SIM = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[1]/button");
		public static By BT_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_NÃO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[2]/button");
		public static By BT_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_CONTINUAR = By.xpath("//*[@id=\\\"chatbot-area\\\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[3]/button");
		
		
		//botão Como assistir Disney+
		public static By BL_UM_ACESSO_COMO_ASSISTIR_DISNEY = By.xpath("");
		public static By BT_UM_ACESSO_SABE_COMO_CONTRATAR = By.xpath("");
		public static By BT_DOIS_ACESSO_NAO_NECESSARIO = By.xpath("");
			// BOTÃO SABE COMO CONTRATAR
		public static By BL_UM_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR = By.xpath("");
		public static By BL_DOIS_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR = By.xpath("");
		public static By BL_TRES_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR = By.xpath("");
		public static By BL_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR = By.xpath("");
		public static By BT_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_SIM = By.xpath("");
		public static By BT_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_NÃO = By.xpath("");
		public static By BT_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_CONTINUAR = By.xpath("");
	
		
		//-------------------- COMBO DISNEY ATIVO--------------------------	
		//clicar no produto do combo
		public static By BT_PRODUTO_COMBO = By.xpath("/html/body/modal-container/div/div/app-helper-modal/div/div[2]/div/div[1]/p/a[1]/div/div/div[1]");
		//botão Não consigo acessar Disney+
		public static By BL_UM_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_ATIVO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text");
		public static By BL_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_ATIVO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BT_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_SIM_ATIVO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[2]/div/ul/li[1]/button");
		public static By BT_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_NÃO_ATIVO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[2]/div/ul/li[2]/button");
		public static By BT_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_CONTINUAR_ATIVO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[2]/div/ul/li[3]/button");

		
		
		//botão Como assistir Disney+
		public static By BL_UM_ACESSO_COMO_ASSISTIR_DISNEY_ATIVO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_DOIS_ACESSO_COMO_ASSISTIR_DISNEY_ATIVO  = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div");
		public static By BL_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_ATIVO  = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BT_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_SIM_ATIVO  = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[2]/div/ul/li[1]/button");
		public static By BT_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_NÃO_ATIVO  = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[2]/div/ul/li[2]/button");
		public static By BT_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_CONTINUAR_ATIVO  = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[2]/div/ul/li[3]/button");

		//-------------------- COMBO DISNEY INATIVO--------------------------	
	
		//botão Não consigo acessar Disney+
	//	public static By BL_UM_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_INATIVO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_DOIS_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_INATIVO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div");
		public static By BL_TRES_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_INATIVO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div");
		public static By BL_QUATRO_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_INATIVO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_INATIVO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BT_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_SIM_INATIVO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[2]/div/ul/li[1]/button");
		public static By BT_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_NÃO_INATIVO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[2]/div/ul/li[2]/button");
		public static By BT_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_CONTINUAR_INATIVO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[2]/div/ul/li[3]/button");

		
		
		//botão Como assistir Disney+
		public static By BL_UM_ACESSO_COMO_ASSISTIR_DISNEY_INATIVO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_DOIS_ACESSO_COMO_ASSISTIR_DISNEY_INATIVO  = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div");
		public static By BL_TRES_ACESSO_COMO_ASSISTIR_DISNEY_INATIVO  = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div");
		public static By BL_QUATRO_ACESSO_COMO_ASSISTIR_DISNEY_INATIVO  = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_INATIVO  = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BT_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_SIM_INATIVO  = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/div/ul/li[1]/button");
		public static By BT_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_NÃO_INATIVO  = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/div/ul/li[2]/button");
		public static By BT_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_CONTINUAR_INATIVO  = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/div/ul/li[3]/button");

}
