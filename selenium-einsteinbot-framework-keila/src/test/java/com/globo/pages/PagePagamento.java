package com.globo.pages;

import org.openqa.selenium.By;

public class PagePagamento {

	public static By TXT_TEXTAREABOT = By
			.xpath("/html/body/app-root/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div[2]/textarea");
	public static By BL_UM_PAGAMENTO = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[6]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BTN_PAGAMENTO_JA_PAGUEI = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[1]/button");
	public static By BTN_PAGAMENTO_QUANTOS_DIAS = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[2]/button");
	// public static By BTN_PAGAMENTO_IMPRIMIR_BOLETO =
	// By.xpath("//*[@id="chatbot-area"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[3]/button");
	public static By BTN_PAGAMENTO_PAGAR_FATURA = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[3]/button");
	public static By BTN_PAGAMENTO_PASSOU_PRAZO = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[4]/button");
	public static By BTN_PAGAMENTO_QUANTIDADE_ASSINATURA = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[5]/button");
	public static By BTN_PAGAMENTO_NAO_VENCEU = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[6]/button");
	public static By BTN_PAGAMENTO_NAO_PARCELADO = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[7]/button");
	public static By BTN_PAGAMENTO_REAGENDAR_PAGAMENTO = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/div[1]/div/ul/li[8]/button");

	// Já Paguei esta no PageJaPaguei
	// QUANTOS DIAS DEMORA
	public static By BL_UM_PAGUEI_QUANTOS_DIAS = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_DOIS_PAGUEI_QUANTOS_DIAS = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_TRES_PAGUEI_QUANTOS_DIAS = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div/lightning-formatted-rich-text");
	public static By BL_AJUDA_QUANTOS_DIAS = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_AJUDA_QUANTOS_DIAS_SIM = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[1]/button");
	public static By BT_AJUDA_QUANTOS_DIAS_NAO = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[2]/button");
	public static By BT_AJUDA_QUANTOS_DIAS_CONTINUAR = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[13]/div[1]/div/ul/li[3]/button");

	// PAGAR FATURA na PagePagarFatura

	// pASSOU DO PRAZO
	

	public static By BL_UM_PASSOU_PRAZO_TRANSBORDO = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_PASSOU_PRAZO_AGORA_NAO = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[1]/button");
	public static By BT_PASSOU_PRAZO_FALAR_ATENDENTE = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[2]/button");

	// QUANTIDADE ASSINATURAS POR CPF
	public static By BL_UM_QUANTIDADE_ASSINATURA_TRANSBORDO = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_QUANTIDADE_ASSINATURA_AGORA_NAO = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[1]/button");
	public static By BT_QUANTIDADE_ASSINATURA_FALAR_ATENDENTE = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/div/ul/li[2]/button");

	// NÃO VENCEU
	public static By BL_UM_NAO_VENCEU = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_DOIS_NAO_VENCEU = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_AJUDA_NAO_VENCEU = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[2]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BT_AJUDA_NAO_VENCEU_SIM = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[1]/button");
	public static By BT_AJUDA_NAO_VENCEU_NAO = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[2]/button");
	public static By BT_AJUDA_NAO_VENCEU_CONTINUAR = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[12]/div[1]/div/ul/li[3]/button");

	// Plano não foi parcelado
	public static By BL_UM_NAO_PARCELADO = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[9]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_DOIS_NAO_PARCELADO = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/div[1]/c-chat-message/div");
	public static By BL_TRES_NAO_PARCELADO = By.xpath(
			"//*[@id=\"chatbot-area\"]/div[2]/div/div/div[2]/div/div/div[1]/ul/li[11]/div[1]/c-chat-message/div/lightning-formatted-rich-text/span");
	public static By BL_AJUDA_NAO_PARCELADO = By.xpath("");
	public static By BT_AJUDA_NAO_PARCELADO_SIM = By.xpath("");
	public static By BT_AJUDA_NAO_PARCELADO_NAO = By.xpath("");
	public static By BT_AJUDA_NAO_PARCELADO_CONTINUAR = By.xpath("");

	// Reagenda Pagamento
	public static By BL_UM_REAGENDAR_PAGAMENTO = By.xpath("");
	public static By BL_DOIS_REAGENDAR_PAGAMENTO = By.xpath("");
	public static By BL_TRES_REAGENDAR_PAGAMENTO = By.xpath("");
	public static By BL_QUATRO_REAGENDAR_PAGAMENTO = By.xpath("");
	public static By BL_CINCO_REAGENDAR_PAGAMENTO = By.xpath("");
	public static By BL_AJUDA_REAGENDAR_PAGAMENTO = By.xpath("");
	public static By BT_AJUDA_REAGENDAR_PAGAMENTO_SIM = By.xpath("");
	public static By BT_AJUDA_REAGENDAR_PAGAMENTO_NAO = By.xpath("");
	public static By BT_AJUDA_REAGENDAR_PAGAMENTO_CONTINUAR = By.xpath("");

}
