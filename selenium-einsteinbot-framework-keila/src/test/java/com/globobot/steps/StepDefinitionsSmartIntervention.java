package com.globobot.steps;

import com.globo.pages.PageAlterarPlano;
import com.globo.pages.PageSmartIntervention;
import com.globobot.action.InteracaoWeb;

import cucumber.api.java8.En;

public class StepDefinitionsSmartIntervention  implements En{

		InteracaoWeb a = new InteracaoWeb();
			
			public StepDefinitionsSmartIntervention(){
	
	When("quando o bot Globoplay é exibido com smart intervention do Suspenso por Saldo", () -> {
		Thread.sleep(20000);
		a.validarTextoContido(PageSmartIntervention.BL_UM_SMART_SALDO, "Olá, João, eu sou o assistente virtual do Globoplay!");
		a.validarTextoContido(PageSmartIntervention.BL_DOIS_SMART_SALDO, "Antes de começar nosso papo, vi que seu Globoplay está suspenso porque não identificamos seu pagamento...");
		a.validarTextoContido(PageSmartIntervention.BL_TRES_SMART_SALDO, "1. Para reativar sua assinatura, acesse meusprodutos.globo.com e faça login.");
		a.validarTextoContido(PageSmartIntervention.BL_QUATRO_SMART_SALDO, "2. Selecione Globoplay."
				+"\n"+ "3. Em seguida, clique no botão \"realizar pagamento\".");
		a.validarTextoContido(PageSmartIntervention.BL_CINCO_SMART_SALDO, "Ah! E escolhendo pagar por cartão de crédito ou cartão de débito, sua assinatura será ativada na hora 😉");
		a.validarTextoContido(PageSmartIntervention.BL_ALTERAR_AJUDA_SMART_SALDO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
		a.validarTextoContido(PageSmartIntervention.BT_ALTERAR_AJUDA_SMART_SALDO_SIM, "Sim, a resposta foi útil");
		a.validarTextoContido(PageSmartIntervention.BT_ALTERAR_AJUDA_SMART_SALDO_NÃO, "A resposta não atendeu à pergunta");
		a.validarTextoContido(PageSmartIntervention.BT_ALTERAR_AJUDA_SMART_SALDO_CONTINUAR, "Continuar conversando");
		
		
	});
	When("quando o bot Globoplay é exibido com smart intervention do Suspenso por Cadastro", () -> {
		Thread.sleep(30000);
		a.validarTextoContido(PageSmartIntervention.BL_UM_SMART_CADASTRO, "Olá, João, eu sou o assistente virtual do Globoplay!");
		a.validarTextoContido(PageSmartIntervention.BL_DOIS_SMART_CADASTRO, "Antes de começar nosso papo, vi que sua assinatura Globoplay está suspensa porque não identificamos seu pagamento...");
		a.validarTextoContido(PageSmartIntervention.BL_TRES_SMART_CADASTRO, "Para reativar sua assinatura, você deve atualizar seus dados de cobrança.");
		a.validarTextoContido(PageSmartIntervention.BL_QUATRO_SMART_CADASTRO, "1. Acesse meusprodutos.globo.com e faça login."
				+"\n"+ "2. Depois selecione Globoplay."
				+"\n"+ "3. E clique no botão \"realizar pagamento\".");
		a.validarTextoContido(PageSmartIntervention.BL_CINCO_SMART_CADASTRO, "Feito isso, sua assinatura ficará ativa de novo e é só correr pro play 😉");
		a.validarTextoContido(PageSmartIntervention.BL_ALTERAR_AJUDA_SMART_CADASTRO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
		a.validarTextoContido(PageSmartIntervention.BT_ALTERAR_AJUDA_SMART_CADASTRO_SIM, "Sim, a resposta foi útil");
		a.validarTextoContido(PageSmartIntervention.BT_ALTERAR_AJUDA_SMART_CADASTRO_NÃO, "A resposta não atendeu à pergunta");
		a.validarTextoContido(PageSmartIntervention.BT_ALTERAR_AJUDA_SMART_CADASTRO_CONTINUAR, "Continuar conversando");
		
	});


}
}
