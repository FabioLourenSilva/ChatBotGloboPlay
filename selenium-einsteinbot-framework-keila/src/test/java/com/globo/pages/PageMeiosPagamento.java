package com.globo.pages;

import org.openqa.selenium.By;

public class PageMeiosPagamento {
	public static By TXT_TEXTAREABOT = By.xpath("/html/body/app-root/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div[2]/textarea");
	public static By BL_UM_MEIOS_PAGAMENTO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[6]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BTN_FORMAS_PAGAMENTO_GLOBOPLAY= By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[1]/button");
	public static By BTN_FORMAS_PAGAMENTO_COMBO_DISNEY = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[2]/button");
	public static By BTN_FORMAS_PAGAMENTO_ALTERAR_ATUAL = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[3]/button");
	public static By BTN_FORMAS_PAGAMENTO_ERRO_EDITAR_CARTAO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[4]/button");
	public static By BTN_FORMAS_PAGAMENTO_BANCO_ITAU = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[5]/button");
	public static By BTN_FORMAS_PAGAMENTO_CARTAO_INTERNACIONAL = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[6]/button");
	public static By BTN_FORMAS_PAGAMENTO_NAO_TENHO_CARTAO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[7]/button");

	// balões do botão Formas de pagamento Globoplay
	public static By BL_UM_PAGAMENTO_GLOBOPLAY = By.xpath ("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_DOIS_PAGAMENTO_GLOBOPLAY = By.xpath ("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_TRES_PAGAMENTO_GLOBOPLAY = By.xpath ("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_QUATRO_PAGAMENTO_GLOBOPLAY = By.xpath ("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_CINCO_PAGAMENTO_GLOBOPLAY = By.xpath ("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_SEIS_PAGAMENTO_GLOBOPLAY = By.xpath ("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_AJUDA_PAGAMENTO_GLOBOPLAY = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[15]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_AJUDA_PAGAMENTO_GLOBOPLAY_SIM = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[1]/button");
	public static By BT_AJUDA_PAGAMENTO_GLOBOPLAY_NÃO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[2]/button");
	public static By BT_AJUDA_PAGAMENTO_GLOBOPLAY_CONTINUAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[3]/button");
	
	
	// balões do botão Formas de pagamento dos combos Disney+
	public static By BL_UM_PAGAMENTO_COMBO_DISNEY = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_DOIS_PAGAMENTO_COMBO_DISNEY =By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_AJUDA_PAGAMENTO_COMBO_DISNEY = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_AJUDA_PAGAMENTO_COMBO_DISNEY_SIM = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[1]/button");
	public static By BT_AJUDA_PAGAMENTO_COMBO_DISNEY_NÃO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[2]/button");
	public static By BT_AJUDA_PAGAMENTO_COMBO_DISNEY_CONTINUAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[3]/button");
	
	
	// botão meios de pagamento atual esta na page Alterar forma de pagamento
	
	
	// balões do botão Erro ao editar dados cartão
	public static By BL_UM_ERRO_DADOS_CARTAO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_AJUDA_EDITAR_CARTAO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_AJUDA_EDITAR_CARTAO_SIM = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/div/ul/li[1]/button");
	public static By BT_AJUDA_EDITAR_CARTAO_NÃO = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/div/ul/li[2]/button");
	public static By BT_AJUDA_EDITAR_CARTAO_CONTINUAR = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/div/ul/li[3]/button");
	
	// balões do botão Banco Itaú
	public static By BL_UM_BANCO_ITAU = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_DOIS_BANCO_ITAU = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_TRES_BANCO_ITAU = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_AJUDA_BANCO_ITAU = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_AJUDA_BANCO_ITAU_SIM = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[1]/button");
	public static By BT_AJUDA_BANCO_ITAU_NÃO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[2]/button");
	public static By BT_AJUDA_BANCO_ITAU_CONTINUAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[3]/button");
	
	
	// balões do botão Cartão internacional
	public static By BL_UM_CARTAO_INTERNACIONAL = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_DOIS_CARTAO_INTERNACIONAL = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_AJUDA_CARTAO_INTERNACIONAL = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_AJUDA_CARTAO_INTERNACIONAL_SIM = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[1]/button");
	public static By BT_AJUDA_CARTAO_INTERNACIONAL_NÃO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[2]/button");
	public static By BT_AJUDA_CARTAO_INTERNACIONAL_CONTINUAR = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[3]/button");
	
	
	// balões do botão Não tenho cartão
	public static By BL_UM_NAO_TENHO_CARTAO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_DOIS_NAO_TENHO_CARTAO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div");
	public static By BL_AJUDA_NAO_TEM_CARTAO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[2]/c-chat-message/div");
	public static By BT_AJUDA_NAO_TEM_CARTAO_SIM = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[1]/button");
	public static By BT_AJUDA_NAO_TEM_CARTAO_NÃO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[2]/button");
	// oPÇÃO SIM QUERO AJUDA VAI PARA ALTERAR FORMA DE PAGAMENTO
	// não é necessário
	public static By BL_UM_NAO_NECESSARIO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[14]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_DOIS_NAO_NECESSARIO = By.xpath("//*[@id='chatbot-area']/div[2]/div/div/div[2]/div/div/div[1]/ul/li[15]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_UM_NAO_DISNEY = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[1]/button");
	public static By BT_DOIS_NAO_DISCOVERY = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[2]/button");
	public static By BT_TRES_NAO_DEEZER = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[3]/button");
	public static By BT_QUATRO_NÃO_ATIVACAO_SMART = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[4]/button");
	public static By BT_CINCO_NAO_ERROS_ASSISTIR = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[5]/button");
	public static By BT_SEIS_NAO_OUTROS_ASSUNTOS = By.xpath("//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[16]/div[1]/div/ul/li[6]/button");
	
}
