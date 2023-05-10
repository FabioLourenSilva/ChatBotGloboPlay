package com.globo.pages;

import org.openqa.selenium.By;

public class PageAlterarFormaPagamento {
	
	// balões do botão não tenho cartão do fluxo meio de pagamento
	
	public static By BL_UM_MEIOS_NAO_TENHO_CARTAO_SIM_AJUDA = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_DOIS_MEIOS_NAO_TENHO_CARTAO_SIM_AJUDA=By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[15]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_TRES_MEIOS_NAO_TENHO_CARTAO_SIM_AJUDA=By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_AJUDA_MEIOS_NAO_TENHO_CARTAO_SIM_AJUDA= By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[17]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_AJUDA_MEIOS_NAO_TENHO_CARTAO_SIM_AJUDA_SIM = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[18]/div[2]/div/ul/li[1]/button");
	public static By BT_AJUDA_MEIOS_NAO_TENHO_CARTAO_SIM_AJUDA_NÃO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[18]/div[2]/div/ul/li[2]");
	public static By BT_AJUDA_MEIOS_NAO_TENHO_CARTAO_SIM_AJUDA_CONTINUAR = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[18]/div[2]/div/ul/li[3]");

	
	
	// balões do botão Alterar forma de pagamento atual do fluxo meio de pagamento
		public static By BL_UM_MEIOS_ALTERAR_PAGAMENTO_ATUAL = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_DOIS_MEIOS_ALTERAR_PAGAMENTO_ATUAL=By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_TRES_MEIOS_ALTERAR_PAGAMENTO_ATUAL=By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_AJUDA_MEIOS_ALTERAR_FORMA_PAGAMENTO_ATUAL = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BT_AJUDA_MEIOS_PAGAMENTO_ATUAL_SIM = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[1]/button");
		public static By BT_AJUDA_MEIOS_PAGAMENTO_ATUAL_NÃO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[2]/button");
		public static By BT_AJUDA_MEIOS_PAGAMENTO_ATUAL_CONTINUAR = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[3]/button");


		// balões do botão Alterar forma de pagamento do botão no menu inicial
		public static By BL_UM_MENU_GENERICO_ALTERAR_PAGAMENTO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[6]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_DOIS_MENU_GENERICO_ALTERAR_PAGAMENTO=By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_TRES_MENU_GENERICO_ALTERAR_PAGAMENTO=By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[8]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BL_AJUDA_MENU_GENERICO_ALTERAR_PAGAMENTO= By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
		public static By BT_AJUDA_MENU_GENERICO_ALTERAR_PAGAMENTO_SIM = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[2]/div/ul/li[1]/button");
		public static By BT_AJUDA_MENU_GENERICO_ALTERAR_PAGAMENTO_NÃO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[2]/div/ul/li[2]/button");
		public static By BT_AJUDA_MENU_GENERICO_ALTERAR_PAGAMENTO_CONTINUAR = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[2]/div/ul/li[3]/button");


}
