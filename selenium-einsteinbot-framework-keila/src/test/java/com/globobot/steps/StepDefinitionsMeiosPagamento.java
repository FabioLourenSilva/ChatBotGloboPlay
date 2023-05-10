package com.globobot.steps;

import com.globo.pages.PageAlterarFormaPagamento;
import com.globo.pages.PageAlterarPlano;
import com.globo.pages.PageBot;
import com.globo.pages.PageMeiosPagamento;
import com.globobot.action.InteracaoWeb;

import cucumber.api.java8.En;

public class StepDefinitionsMeiosPagamento implements En{
	
InteracaoWeb a = new InteracaoWeb();
	
	public StepDefinitionsMeiosPagamento(){
				
		Then("informo Meios de pagamento", () -> {
			a.escrever(PageMeiosPagamento.TXT_TEXTAREABOT, "meios de pagamento");
			a.acionarEnter(PageMeiosPagamento.TXT_TEXTAREABOT);
			a.validarTextoContido(PageMeiosPagamento.BTN_FORMAS_PAGAMENTO_GLOBOPLAY, "Formas de pagamento Globoplay");
			a.validarTextoContido(PageMeiosPagamento.BTN_FORMAS_PAGAMENTO_COMBO_DISNEY, "Formas de pagamento dos combos Disney+");
			a.validarTextoContido(PageMeiosPagamento.BTN_FORMAS_PAGAMENTO_ALTERAR_ATUAL, "Alterar forma de pagamento atual");
			a.validarTextoContido(PageMeiosPagamento.BTN_FORMAS_PAGAMENTO_ERRO_EDITAR_CARTAO, "Erro ao editar dados cartão");
			a.validarTextoContido(PageMeiosPagamento.BTN_FORMAS_PAGAMENTO_BANCO_ITAU, "Banco Itaú");
			a.validarTextoContido(PageMeiosPagamento.BTN_FORMAS_PAGAMENTO_CARTAO_INTERNACIONAL, "Cartão internacional");
			a.validarTextoContido(PageMeiosPagamento.BTN_FORMAS_PAGAMENTO_NAO_TENHO_CARTAO, "Não tenho cartão");
   
});
	
		When("quando clico no botão Formas de pagamento Globoplay", () -> {
			a.clicar(PageMeiosPagamento.BTN_FORMAS_PAGAMENTO_GLOBOPLAY);
			a.validarTextoContido(PageMeiosPagamento.BL_UM_PAGAMENTO_GLOBOPLAY, "Você pode pagar o Globoplay, avulso, no plano mensal, anual e bianual com cartão de crédito e débito com as seguintes bandeiras e bancos:");
			a.validarTextoContido(PageMeiosPagamento.BL_DOIS_PAGAMENTO_GLOBOPLAY, "- Cartão de crédito das bandeiras Mastercard, Visa, American Express e ELO.");
			a.validarTextoContido(PageMeiosPagamento.BL_TRES_PAGAMENTO_GLOBOPLAY, "- Cartão de débito dos bancos Banco do Brasil, Itaú, Santander e Bradesco.");
			a.validarTextoContido(PageMeiosPagamento.BL_QUATRO_PAGAMENTO_GLOBOPLAY,"Mas caso escolha o plano anual ou bianual, somente com cartão de crédito em até 12x.");
			a.validarTextoContido(PageMeiosPagamento.BL_CINCO_PAGAMENTO_GLOBOPLAY,"Se preferir, o pagamento pode ser feito através da sua carteira digital Mercado Pago e PicPay.");
			a.validarTextoContido(PageMeiosPagamento.BL_SEIS_PAGAMENTO_GLOBOPLAY, "Ah, com a carteira digital o valor não pode ser parcelado.");
			a.validarTextoContido(PageMeiosPagamento.BL_AJUDA_PAGAMENTO_GLOBOPLAY , "Agora me diz, te ajudei ou te ajudo em algo mais?");
			a.validarTextoContido(PageMeiosPagamento.BT_AJUDA_PAGAMENTO_GLOBOPLAY_SIM, "🙂 Sim, a resposta foi útil");
			a.validarTextoContido(PageMeiosPagamento.BT_AJUDA_PAGAMENTO_GLOBOPLAY_NÃO, "😕 A resposta não atendeu à pergunta");
			a.validarTextoContido(PageMeiosPagamento.BT_AJUDA_PAGAMENTO_GLOBOPLAY_CONTINUAR, "💬 Continuar conversando");
		});

		When("quando clico no botão Formas de pagamento dos combos Disney+", () -> {
			a.clicar(PageMeiosPagamento.BTN_FORMAS_PAGAMENTO_COMBO_DISNEY);
			a.validarTextoContido(PageMeiosPagamento.BL_UM_PAGAMENTO_COMBO_DISNEY, "Você pode pagar o Globoplay e Disney+ no plano mensal, com cartão de crédito das bandeiras Visa, Amex, ELO e Mastercard ou com cartão de débito dos bancos Bradesco, Santander, Itaú e Banco do Brasil.");
			a.validarTextoContido(PageMeiosPagamento.BL_DOIS_PAGAMENTO_COMBO_DISNEY, "Ou pode pagar no plano anual, com cartão de crédito das bandeiras Visa, Amex, ELO e Mastercard.");
			a.validarTextoContido(PageMeiosPagamento.BL_AJUDA_PAGAMENTO_COMBO_DISNEY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
			a.validarTextoContido(PageMeiosPagamento.BT_AJUDA_PAGAMENTO_COMBO_DISNEY_SIM, "🙂 Sim, a resposta foi útil");
			a.validarTextoContido(PageMeiosPagamento.BT_AJUDA_PAGAMENTO_COMBO_DISNEY_NÃO, "😕 A resposta não atendeu à pergunta");
			a.validarTextoContido(PageMeiosPagamento.BT_AJUDA_PAGAMENTO_COMBO_DISNEY_CONTINUAR, "💬 Continuar conversando");
		});

		When("quando clico no botão Alterar forma de pagamento atual", () -> {
			a.clicar(PageMeiosPagamento.BTN_FORMAS_PAGAMENTO_ALTERAR_ATUAL);
			a.validarTextoContido(PageAlterarFormaPagamento.BL_UM_MEIOS_ALTERAR_PAGAMENTO_ATUAL, "Tudo bem... Vou te ajudar com a alteração da sua forma de pagamento.");
			a.validarTextoContido(PageAlterarFormaPagamento.BL_DOIS_MEIOS_ALTERAR_PAGAMENTO_ATUAL,
					"1. Primeiro, acesse meusprodutos.globo.com e faça login, se for preciso."
					+"\n" + "2. Selecione Globoplay."
					+"\n" + "3. Depois, clique em \"alterar forma de pagamento\" e informe os novos dados.");
			a.validarTextoContido(PageAlterarFormaPagamento.BL_TRES_MEIOS_ALTERAR_PAGAMENTO_ATUAL, "Ah! Se você já tentou fazer essa alteração e deu erro 105, abra uma janela anônima e tente mais uma vez.");
			a.validarTextoContido(PageAlterarFormaPagamento.BL_AJUDA_MEIOS_ALTERAR_FORMA_PAGAMENTO_ATUAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
			a.validarTextoContido(PageAlterarFormaPagamento.BT_AJUDA_MEIOS_PAGAMENTO_ATUAL_SIM, "🙂 Sim, a resposta foi útil");
			a.validarTextoContido(PageAlterarFormaPagamento.BT_AJUDA_MEIOS_PAGAMENTO_ATUAL_NÃO, "😕 A resposta não atendeu à pergunta");
			a.validarTextoContido(PageAlterarFormaPagamento.BT_AJUDA_MEIOS_PAGAMENTO_ATUAL_CONTINUAR, "💬 Continuar conversando");
		}); 

		When("quando clico no botão Erro ao editar dados cartão", () -> {
			a.clicar(PageMeiosPagamento.BTN_FORMAS_PAGAMENTO_ERRO_EDITAR_CARTAO);
			a.validarTextoContido(PageMeiosPagamento.BL_UM_ERRO_DADOS_CARTAO, "Eita! A página de pagamento não aparece ou mostra só a metade? 🤔"
					+"\n" +
					"\n" + "Se estiver no celular, é só rotacionar/virar a tela do seu celular na horizontal 😊 "
					+"\n" +"\n" +  "Mas se estiver no computador, tente trocar de navegador ou abrir uma janela anônima!");
			a.validarTextoContido(PageMeiosPagamento.BL_AJUDA_EDITAR_CARTAO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
			a.validarTextoContido(PageMeiosPagamento.BT_AJUDA_EDITAR_CARTAO_SIM, "🙂 Sim, a resposta foi útil");
			a.validarTextoContido(PageMeiosPagamento.BT_AJUDA_EDITAR_CARTAO_NÃO, "😕 A resposta não atendeu à pergunta");
			a.validarTextoContido(PageMeiosPagamento.BT_AJUDA_EDITAR_CARTAO_CONTINUAR, "💬 Continuar conversando");
		});

		When("quando clico no botão Banco Itaú", () -> {
			a.clicar(PageMeiosPagamento.BTN_FORMAS_PAGAMENTO_BANCO_ITAU);
			a.validarTextoContido(PageMeiosPagamento.BL_UM_BANCO_ITAU, "No Globoplay você é quem manda! Você pode usar o seu cartão de débito do Itaú como forma de pagamento!");
			a.validarTextoContido(PageMeiosPagamento.BL_DOIS_BANCO_ITAU, "Para atualizar a sua forma de pagamento, clique em duvidas.globo.com/alterarformasdepgto que eu te ensino.");
			a.validarTextoContido(PageMeiosPagamento.BL_TRES_BANCO_ITAU, "Ah, mas se quiser, ainda pode ser no crédito (Visa, Amex, ELO e Mastercard) ou no débito (Bradesco e Banrisul).");
			a.validarTextoContido(PageMeiosPagamento.BL_AJUDA_BANCO_ITAU , "Agora me diz, te ajudei ou te ajudo em algo mais?");
			a.validarTextoContido(PageMeiosPagamento.BT_AJUDA_BANCO_ITAU_SIM, "🙂 Sim, a resposta foi útil");
			a.validarTextoContido(PageMeiosPagamento.BT_AJUDA_BANCO_ITAU_NÃO, "😕 A resposta não atendeu à pergunta");
			a.validarTextoContido(PageMeiosPagamento.BT_AJUDA_BANCO_ITAU_CONTINUAR, "💬 Continuar conversando");
		});

		When("quando clico no botão Cartão internacional", () -> {
			a.clicar(PageMeiosPagamento.BTN_FORMAS_PAGAMENTO_CARTAO_INTERNACIONAL);
			a.validarTextoContido(PageMeiosPagamento.BL_UM_CARTAO_INTERNACIONAL, "Poxa, não é possível cadastrar um cartão internacional. Só aceitamos cartões emitidos no Brasil:"
					+ "\n"+ "\n"
					+ "- Cartão de crédito: Mastercard, Visa, American Express e Elo."
					+"\n"+ "- Cartão de débito: Banco do Brasil, Itaú, Santander e Bradesco.");
			a.validarTextoContido(PageMeiosPagamento.BL_DOIS_CARTAO_INTERNACIONAL, "Se preferir, você pode escolher a sua carteira digital: Mercado Pago e PicPay (exclusivo para novas assinaturas).");
			a.validarTextoContido(PageMeiosPagamento.BL_AJUDA_CARTAO_INTERNACIONAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
			a.validarTextoContido(PageMeiosPagamento.BT_AJUDA_CARTAO_INTERNACIONAL_SIM, "🙂 Sim, a resposta foi útil");
			a.validarTextoContido(PageMeiosPagamento.BT_AJUDA_CARTAO_INTERNACIONAL_NÃO, "😕 A resposta não atendeu à pergunta");
			a.validarTextoContido(PageMeiosPagamento.BT_AJUDA_CARTAO_INTERNACIONAL_CONTINUAR, "💬 Continuar conversando");
		});

		When("quando clico no botão Não tenho cartão", () -> {
			a.clicar(PageMeiosPagamento.BTN_FORMAS_PAGAMENTO_NAO_TENHO_CARTAO);
			a.validarTextoContido(PageMeiosPagamento.BL_UM_NAO_TENHO_CARTAO, "Para consultar as formas de pagamento disponíveis para a sua assinatura, acesse duvidas.globo.com/formadepagamento.");
			a.validarTextoContido(PageMeiosPagamento.BL_DOIS_NAO_TENHO_CARTAO, "Ou você pode trocar a sua forma de pagamento atual.");
			a.validarTextoContido(PageMeiosPagamento.BL_AJUDA_NAO_TEM_CARTAO, "Precisa de ajuda com isso?");
			a.validarTextoContido(PageMeiosPagamento.BT_AJUDA_NAO_TEM_CARTAO_SIM, "Sim, quero ajuda");
			a.validarTextoContido(PageMeiosPagamento.BT_AJUDA_NAO_TEM_CARTAO_NÃO, "Não é necessário");
			
		});
		When("clico no botão Sim, quero ajuda", () -> {
		  a.clicar(PageMeiosPagamento.BT_AJUDA_NAO_TEM_CARTAO_SIM);
		  a.validarTextoContido(PageAlterarFormaPagamento.BL_UM_MEIOS_NAO_TENHO_CARTAO_SIM_AJUDA, "Tudo bem... Vou te ajudar com a alteração da sua forma de pagamento.");
			a.validarTextoContido(PageAlterarFormaPagamento.BL_DOIS_MEIOS_NAO_TENHO_CARTAO_SIM_AJUDA,
					"1. Primeiro, acesse meusprodutos.globo.com e faça login, se for preciso."
					+"\n" + "2. Selecione Globoplay."
					+"\n" + "3. Depois, clique em \"alterar forma de pagamento\" e informe os novos dados.");
			a.validarTextoContido(PageAlterarFormaPagamento.BL_TRES_MEIOS_NAO_TENHO_CARTAO_SIM_AJUDA, "Ah! Se você já tentou fazer essa alteração e deu erro 105, abra uma janela anônima e tente mais uma vez.");
			a.validarTextoContido(PageAlterarFormaPagamento.BL_AJUDA_MEIOS_NAO_TENHO_CARTAO_SIM_AJUDA, "Agora me diz, te ajudei ou te ajudo em algo mais?");
			a.validarTextoContido(PageAlterarFormaPagamento.BT_AJUDA_MEIOS_NAO_TENHO_CARTAO_SIM_AJUDA_SIM, "🙂 Sim, a resposta foi útil");
			a.validarTextoContido(PageAlterarFormaPagamento.BT_AJUDA_MEIOS_NAO_TENHO_CARTAO_SIM_AJUDA_NÃO, "😕 A resposta não atendeu à pergunta");
			a.validarTextoContido(PageAlterarFormaPagamento.BT_AJUDA_MEIOS_NAO_TENHO_CARTAO_SIM_AJUDA_CONTINUAR, "💬 Continuar conversando");
		  
		});
		When("clico no botão Não é necesario", () -> {
			a.clicar(PageMeiosPagamento.BT_AJUDA_NAO_TEM_CARTAO_NÃO);
			a.validarTextoContido(PageMeiosPagamento.BL_UM_NAO_NECESSARIO, "Sem problemas! Se quiser falar sobre outro assunto, é só selecionar no menu ou digitar sua dúvida.");
			a.validarTextoContido(PageMeiosPagamento.BL_DOIS_NAO_NECESSARIO, "🙂");
			a.validarTextoContido(PageMeiosPagamento.BT_UM_NAO_DISNEY, "Disney+");
			a.validarTextoContido(PageMeiosPagamento.BT_DOIS_NAO_DISCOVERY,"discovery+");
			a.validarTextoContido(PageMeiosPagamento.BT_TRES_NAO_DEEZER,"6 meses de Deezer Premium");
			a.validarTextoContido(PageMeiosPagamento.BT_QUATRO_NÃO_ATIVACAO_SMART,"Ativação Smart TV");
			a.validarTextoContido(PageMeiosPagamento.BT_CINCO_NAO_ERROS_ASSISTIR,"Erros ao assistir");
			a.validarTextoContido(PageMeiosPagamento.BT_SEIS_NAO_OUTROS_ASSUNTOS,"Outros assuntos");
			
		
			
		});




}
}

