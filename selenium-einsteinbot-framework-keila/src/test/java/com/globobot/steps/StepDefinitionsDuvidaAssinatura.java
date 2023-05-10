package com.globobot.steps;

import com.globo.pages.PageAcesso;
import com.globo.pages.PageDuvidasAssinatura;
import com.globo.pages.PageMeiosPagamento;
import com.globobot.action.InteracaoWeb;

import cucumber.api.java8.En;

public class StepDefinitionsDuvidaAssinatura implements En{
			
		InteracaoWeb a = new InteracaoWeb();

		public StepDefinitionsDuvidaAssinatura() {
			Then("digito Duvida Assinatura", () -> {
				a.escrever(PageDuvidasAssinatura.TXT_TEXTAREABOT, "Duvidas de Assinatura");
				a.acionarEnter(PageDuvidasAssinatura.TXT_TEXTAREABOT);
				a.validarTextoContido(PageDuvidasAssinatura.BL_UM_DUVIDAS_ASSINATURA, "Pra eu te entender melhor, selecione uma das opções abaixo ou reescreva sua dúvida 🙂");
				a.validarTextoContido(PageDuvidasAssinatura.BTN_DUVIDAS_NAO_LEMBRO_CONTRATEI, "Não lembro por onde contratei");
				a.validarTextoContido(PageDuvidasAssinatura.BTN_DUVIDAS_VALE_PRESENTE, "Tenho um vale-presente");
				a.validarTextoContido(PageDuvidasAssinatura.BTN_DUVIDAS_NAO_APARECE_ASSINATURA, "Não aparece minha assinatura");
				a.validarTextoContido(PageDuvidasAssinatura.BTN_DUVIDAS_USAR_DEPOIS_CANCELAR, "Usar depois de cancelar");
			});
			
			Given("que clico no botao {string} do menu do fluxo Duvida Assinatura", (String botao) -> {
				switch (botao) {
				
				case "Não lembro por onde contratei":
					Thread.sleep(20000);
					a.clicar(PageDuvidasAssinatura.BTN_DUVIDAS_NAO_LEMBRO_CONTRATEI);

					break;

				case "Tenho um vale-presente":
					Thread.sleep(20000);
					a.clicar(PageDuvidasAssinatura.BTN_DUVIDAS_VALE_PRESENTE);

					break;

				case "Não aparece minha assinatura":
					Thread.sleep(20000);
					a.clicar(PageDuvidasAssinatura.BTN_DUVIDAS_NAO_APARECE_ASSINATURA);

					break;
				case "Usar depois de cancelar":
					Thread.sleep(20000);
					a.clicar(PageDuvidasAssinatura.BTN_DUVIDAS_USAR_DEPOIS_CANCELAR);
							break;
				}

			});
			Then("valido o texto do botao {string} do fluxo Duvida Assinatura", (String botao) -> {
				switch (botao) {
				
				case "Não lembro por onde contratei":
					
						   a.validarTextoContido(PageDuvidasAssinatura.BL_UM_DUVIDA_NAO_LEMBRO_CONTRATEI, "Ihh, não está encontrando a sua assinatura?");
						   a.validarTextoContido(PageDuvidasAssinatura.BL_DOIS_DUVIDA_NAO_LEMBRO_CONTRATEI,"Pode ser que você tenha feito ela com outro e-mail, então dá uma olhada se o e-mail que está na sua loja foi o mesmo que você usou para fazer a sua assinatura.");
						   a.validarTextoContido(PageDuvidasAssinatura.BL_AJUDA_DUVIDAS_NAO_LEMBRO_CONTRATEI , "Agora me diz, te ajudei ou te ajudo em algo mais?");
							a.validarTextoContido(PageDuvidasAssinatura.BT_AJUDA_DUVIDAS_NAO_LEMBRO_CONTRATEI_SIM, "🙂 Sim, a resposta foi útil");
							a.validarTextoContido(PageDuvidasAssinatura.BT_AJUDA_DUVIDAS_NAO_LEMBRO_CONTRATEI_NÃO, "😕 A resposta não atendeu à pergunta");
							a.validarTextoContido(PageDuvidasAssinatura.BT_AJUDA_DUVIDAS_NAO_LEMBRO_CONTRATEI_CONTINUAR, "💬 Continuar conversando");
							
						
					break;

				case "Tenho um vale-presente":

					   a.validarTextoContido(PageDuvidasAssinatura.BL_UM_DUVIDA_VALE_PRESENTE, "Após o término do seu vale-presente, você pode comprar outro vale-presente a hora que quiser."
					   		+ "\n"+"\n"
					   		+ "Mas se preferir, você também pode fazer uma assinatura do plano mensal ou anual, é só acessar globoplay.com/assine/bot");
					a.validarTextoContido(PageDuvidasAssinatura.BL_AJUDA_DUVIDAS_VALE_PRESENTE , "Agora me diz, te ajudei ou te ajudo em algo mais?");
					a.validarTextoContido(PageDuvidasAssinatura.BT_AJUDA_DUVIDAS_VALE_PRESENTE_SIM, "🙂 Sim, a resposta foi útil");
					a.validarTextoContido(PageDuvidasAssinatura.BT_AJUDA_DUVIDAS_VALE_PRESENTE_NÃO, "😕 A resposta não atendeu à pergunta");
					a.validarTextoContido(PageDuvidasAssinatura.BT_AJUDA_DUVIDAS_VALE_PRESENTE_CONTINUAR, "💬 Continuar conversando");
					
					break;

				case "Não aparece minha assinatura":
					
						   a.validarTextoContido(PageDuvidasAssinatura.BL_UM_DUVIDA_MINHA_ASSINATURA, "Ihh, não está encontrando a sua assinatura?");
						   a.validarTextoContido(PageDuvidasAssinatura.BL_DOIS_DUVIDA_MINHA_ASSINATURA, "Pode ser que você tenha feito ela com outro e-mail, então dá uma olhada se o e-mail que está na sua loja foi o mesmo que você usou para fazer a sua assinatura.");
							 a.validarTextoContido(PageDuvidasAssinatura.BL_AJUDA_DUVIDAS_MINHA_ASSINATURA , "Agora me diz, te ajudei ou te ajudo em algo mais?");
								a.validarTextoContido(PageDuvidasAssinatura.BT_AJUDA_DUVIDAS_MINHA_ASSINATURA_SIM, "🙂 Sim, a resposta foi útil");
								a.validarTextoContido(PageDuvidasAssinatura.BT_AJUDA_DUVIDAS_MINHA_ASSINATURA_NÃO, "😕 A resposta não atendeu à pergunta");
								a.validarTextoContido(PageDuvidasAssinatura.BT_AJUDA_DUVIDAS_MINHA_ASSINATURA_CONTINUAR, "💬 Continuar conversando");
								
					
					break;
				case "Usar depois de cancelar":

					
						a.validarTextoContido(PageDuvidasAssinatura.BL_UM_DUVIDA_DEPOIS_CANCELAR, "Como a cobrança da sua assinatura é pré-pago, ou seja você paga e depois utiliza, o seu acesso do Globoplay ficará ativo até terminar os 30 dias que você já pagou.");
					 a.validarTextoContido(PageDuvidasAssinatura.BL_AJUDA_DUVIDAS_DEPOIS_CANCELAR , "Agora me diz, te ajudei ou te ajudo em algo mais?");
					a.validarTextoContido(PageDuvidasAssinatura.BT_AJUDA_DUVIDAS_DEPOIS_CANCELAR_SIM, "🙂 Sim, a resposta foi útil");
					a.validarTextoContido(PageDuvidasAssinatura.BT_AJUDA_DUVIDAS_DEPOIS_CANCELARE_NÃO, "😕 A resposta não atendeu à pergunta");
					a.validarTextoContido(PageDuvidasAssinatura.BT_AJUDA_DUVIDAS_DEPOIS_CANCELAR_CONTINUAR, "💬 Continuar conversando");
					
				}

			});
			
			

			

		
		}
		
}