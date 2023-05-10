package com.globobot.steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.globo.pages.PageAlterarFormaPagamento;
import com.globo.pages.PageAlterarPlano;
import com.globo.pages.PageAtivarSmart;
import com.globo.pages.PageBot;
import com.globo.pages.PageErrosAssistir;
import com.globo.pages.PageLogin;
import com.globo.pages.PageOutrosAssuntos;
import com.globo.util.DriverContext;
import com.globo.util.LeituraProperties;
import com.globobot.action.InteracaoWeb;

import cucumber.api.java8.En;

public class StepDefinitions implements En {

	InteracaoWeb a = new InteracaoWeb();

	public StepDefinitions() {

		Given("que acesso a url", () -> {

			a.abrirUrl(LeituraProperties.getAcessoUrl());

		});

		When("informo o {string}", (String email) -> {
			a.escrever(PageLogin.IPT_LOGIN, email);
		});

		When("a {string}", (String senha) -> {
			a.escrever(PageLogin.IPT_SENHA, senha);
		});

		// When("clico no checkbox do Capcha", () -> {
		// a.clicar(PageLogin.CHK_CAPTCHA);
//	});

		Then("clico no botao Entrar", () -> {
			a.clicar(PageLogin.BTN_ENTRAR);
//	 if(PageLogin.BTN_ERRO_LOGIN= true ){
//		 a.clicar(PageLogin.BTN_ENTRAR);
//	 }
		});

		Given("que seleciono o produto", () -> {
			Thread.sleep(20000);
			a.clicar(PageBot.CARD_ASS);
		});

		And("clico no botao atendimento", () -> {
			Thread.sleep(20000);
			a.clicar(PageBot.BTN_ATENDIMENTO);
		});

		When("quando o bot Globoplay é exibido", () -> {
			Thread.sleep(20000);
			// new Actions(DriverContext.getDriver()).moveToElement((WebElement)
			// PageBot.BOT).perform();
			
			a.clicar(PageBot.BOT);
			Thread.sleep(30000);
			a.validarTextoContido(PageBot.TIT_BOT, "Assistente Virtual");

		});
		Then("o menu generico é exibido", () -> {
		
			a.validarTextoContido(PageBot.BL_OLA, "Olá, João, eu sou o assistente virtual do Globoplay!");
			a.validarTextoContido(PageBot.BL_DOIS_M,
					"Por aqui, estou pronto para tirar suas dúvidas sobre o uso da nossa plataforma e sua assinatura. Para interagir comigo, selecione um assunto ou digite sua dúvida.");
			a.validarTextoContido(PageBot.BL_TRES_M,"🙂");
			//a.validarTextoContido(PageBot.BTN_DISNEY, "Disney+");
			//a.validarTextoContido(PageBot.BTN_DISCOVERY, "discovery+");
			//a.validarTextoContido(PageBot.BTN_DEEZER, "6 meses de Deezer Premium");
			a.validarTextoContido(PageBot.BTN_ATIVARSMART, "Ativar Smart TV");
			a.validarTextoContido(PageBot.BTN_ERROSASSISTIR, "Erros ao assistir");
			a.validarTextoContido(PageBot.BTN_ALTERARPLANO, "Alterar plano");
			a.validarTextoContido(PageBot.BTN_ALTERARFORMAPAGAMENTO, "Alterar forma de pagamento");
			a.validarTextoContido(PageBot.BTN_MAISPRODUTOSGLOBO, "Mais produtos Globo");
			// a.validarTextoContido(PageBot.BTN_GLOBOMAIL, "Ajuda Globomail");
			a.validarTextoContido(PageBot.BTN_OUTROSASSUNTOS, "Outros assuntos");

		});
		Then("Logout", () -> {
			Thread.sleep(30000);
			a.clicar(PageBot.BTN_FECHAR);
			Thread.sleep(30000);
			a.clicar(PageBot.BTN_ENCERRAR);
			Thread.sleep(30000);
			a.clicar(PageBot.BTN_FECHAR_CHAT);
			Thread.sleep(30000);
			a.clicar(PageBot.BTN_CONTA);
			Thread.sleep(30000);
			a.clicar(PageBot.BTN_TROCAR_CONTA);
		});
		// ##### validar os botões do menu genérico globoplay

		Given("que clico no botao {string} do menu inicial", (String botao) -> {
			switch (botao) {

		/*	case "Disney+":
				Thread.sleep(20000);
				a.clicar(PageBot.BTN_DISNEY);

				break;

			case "discovery+":
				a.clicar(PageBot.BTN_DISCOVERY);
				Thread.sleep(30000);
				break;

			case "6 meses de Deezer Premium":
				a.clicar(PageBot.BTN_DEEZER);
				Thread.sleep(30000);
				break;*/

			case "Ativar Smart TV":
				a.clicar(PageBot.BTN_ATIVARSMART);
				Thread.sleep(30000);
				break;

			case "Erros ao assistir":
				a.clicar(PageBot.BTN_ERROSASSISTIR);
				Thread.sleep(30000);
				break;
			case "Alterar plano":
				a.clicar(PageBot.BTN_ALTERARPLANO);
				Thread.sleep(30000);
				break;
			case "Alterar forma de pagamento":
				a.clicar(PageBot.BTN_ALTERARFORMAPAGAMENTO);
				Thread.sleep(30000);
				break;
			case "Mais produtos Globo":
				a.clicar(PageBot.BTN_MAISPRODUTOSGLOBO);
				Thread.sleep(30000);
				break;

			case "Outros assuntos":
				a.clicar(PageBot.BTN_OUTROSASSUNTOS);
				Thread.sleep(30000);
				break;
			}

		});
		// Texto: eu valido o texto exibido ao clicar nos botões do menu genérico

		Then("valido o texto do botao {string}", (String botao) -> {
			switch (botao) {
/*
			case "Disney+":
				a.validarTextoContido(PageBot.BL_UM_DISNEY, "Já vi que você não resistiu à parceria com o Disney+ 😍");
				a.validarTextoContido(PageBot.BL_DOIS_DISNEY,
						"1. Pra adicionar o Disney+, é só acessar globoplay.com/disneyplus/bot" + "\n" + "\n"
								+ "2. Depois, clique em ”assine” e faça login, se for preciso." + "\n" + "\n"
								+ "3. Informe os dados de pagamento e finalize sua contratação.");
				a.validarTextoContido(PageBot.BL_TRES_DISNEY,
						"4. Em seguida, clique na opção “ativar Disney+” para criar seu cadastro no site do Disney+.");
				a.validarTextoContido(PageBot.BL_AJUDA_DISNEY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				a.validarTextoContido(PageBot.BT_AJUDA_DISNEY_SIM, "🙂 Sim, a resposta foi útil");
				a.validarTextoContido(PageBot.BT_AJUDA_DISNEY_NÃO, "😕 A resposta não atendeu à pergunta");
				a.validarTextoContido(PageBot.BT_AJUDA_DISNEY_CONTINUAR, "💬 Continuar conversando");
				break;

			case "discovery+":
				a.validarTextoContido(PageBot.BL_UM_DISNEY,
						"Eba! Vou te ajudar a ter o melhor do entretenimento Globoplay e discovery+. Vamos lá? 😁");
				a.validarTextoContido(PageBot.BL_DOIS_DISNEY,
						"1. Para começar, acesse globoplay.com/assine/discoveryplus e faça login." + "\n" + "\n"
								+ "2. Depois, clique em “assine já”." + "\n" + "\n"
								+ "3. Informe os dados de pagamento e finalize sua contratação.");
				a.validarTextoContido(PageBot.BL_TRES_DISNEY,
						"4. Em seguida, é só clicar na opção “ativar discovery+”, criar seu cadastro no site do discovery+ e partir pro play 🎉");
				a.validarTextoContido(PageBot.BL_AJUDA_DISNEY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				a.validarTextoContido(PageBot.BT_AJUDA_DISNEY_SIM, "🙂 Sim, a resposta foi útil");
				a.validarTextoContido(PageBot.BT_AJUDA_DISNEY_NÃO, "😕 A resposta não atendeu à pergunta");
				a.validarTextoContido(PageBot.BT_AJUDA_DISNEY_CONTINUAR, "💬 Continuar conversando");

				break;

			case "6 meses de Deezer Premium":
				a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR,
						"Pra te ajudar com isso, é só selecionar uma opção ou um produto abaixo.");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_TROCA_MENSAL_ANUAL,
						"Trocar de plano mensal para anual");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_TROCA_MAISCANAIS,
						"Trocar para Globoplay + canais ao vivo");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_DISNEY, "Disney+");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_DISCOVERY, "discovery+");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_DEEZER, "Deezer Premium");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_PREMIERE, "Premiere");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_TELECINE, "Telecine");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_BIANUAL, "Trocar para bianual");
				break;
*/
			case "Ativar Smart TV":
				a.validarTextoContido(PageAtivarSmart.BL_UM_SMART,
						"Pra eu te entender melhor, selecione uma das opções abaixo ou reescreva sua dúvida 🙂");
				a.validarTextoContido(PageAtivarSmart.BTN_SMART_QRCODE, "QR Code");
				a.validarTextoContido(PageAtivarSmart.BTN_SMART_TVCOMPATIVEL, "Minha TV é compatível?");
				a.validarTextoContido(PageAtivarSmart.BTN_SMART_INSTALARSMART, "Instalar na Smart TV");
				a.validarTextoContido(PageAtivarSmart.BTN_SMART_CODNAOAPARECE, "Código não aparece");
				a.validarTextoContido(PageAtivarSmart.BTN_SMART_CODINVALIDO, "Código inválido");
				a.validarTextoContido(PageAtivarSmart.BTN_SMART_ATUALIZARAPP, "Atualizar o aplicativo na TV");
				a.validarTextoContido(PageAtivarSmart.BTN_SMART_ATIVARSMART, "Ativar Smart TV");
				a.validarTextoContido(PageAtivarSmart.BTN_SMART_NAOCONSIGOATIVAR, "Não consigo ativar minha Smart TV");

				break;

			case "Erros ao assistir":
				a.validarTextoContido(PageErrosAssistir.Bl_UM_ERROS_ASSISTIR,
						"Para falar sobre isso, selecione uma das opções ou digite o código de erro, se ele apareceu na sua tela.");
				a.validarTextoContido(PageErrosAssistir.BTN_ERROS_CONTEUDOINDISPONIVEL, "Conteúdo indisponível");
				a.validarTextoContido(PageErrosAssistir.BTN_ERROS_CONTEUDOEXCLUSIVO,
						"Conteúdo exclusivo para assinantes");
				a.validarTextoContido(PageErrosAssistir.BTN_ERROS_VIDEOINDISPONIVEL, "Vídeo indisponível nessa região");
				a.validarTextoContido(PageErrosAssistir.BTN_ERROS_VIDEOTRAVANDO, "Vídeo travando / só carregando");
				a.validarTextoContido(PageErrosAssistir.BTN_ERROS_NAOCONTEUDOSINTERNACIONAIS,
						"Não encontro conteúdos internacionais na Smart TV");
				a.validarTextoContido(PageErrosAssistir.BTN_ERROS_NAOASSISTIRDISNEY, "Não consigo assistir Disney+");
				a.validarTextoContido(PageErrosAssistir.BTN_ERROS_DATAHORA, "Data e hora de seu aparelho");

				break;
			case "Alterar Plano":
				 a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR, "Pra te ajudar com isso, é só selecionar uma opção ou um produto abaixo.");
					a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_TROCA_MENSAL_ANUAL,"Trocar de plano mensal para anual");
					a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_TROCA_MAISCANAIS, "Trocar para Globoplay + canais ao vivo");
					a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_DISNEY, "Disney+");
					a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_DISCOVERY,"discovery+");
					a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_DEEZER, "Deezer Premium");
					a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_PREMIERE, "Premiere");
					a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_TELECINE, "Telecine");
					a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_BIANUAL, "Trocar para bianual"); 
					break;
					
			case "Alterar forma de pagamento":
				a.validarTextoContido(PageAlterarFormaPagamento.BL_UM_MENU_GENERICO_ALTERAR_PAGAMENTO, "Tudo bem... Vou te ajudar com a alteração da sua forma de pagamento.");
				a.validarTextoContido(PageAlterarFormaPagamento.BL_DOIS_MENU_GENERICO_ALTERAR_PAGAMENTO, "1. Primeiro, acesse meusprodutos.globo.com e faça login, se for preciso.\r\n"
						+ "2. Selecione Globoplay.\r\n"
						+ "3. Depois, clique em \"alterar forma de pagamento\" e informe os novos dados.");
				a.validarTextoContido(PageAlterarFormaPagamento.BL_TRES_MENU_GENERICO_ALTERAR_PAGAMENTO, "Ah! Se você já tentou fazer essa alteração e deu erro 105, abra uma janela anônima e tente mais uma vez.");
				a.validarTextoContido(PageAlterarFormaPagamento.BL_AJUDA_MENU_GENERICO_ALTERAR_PAGAMENTO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				a.validarTextoContido(PageAlterarFormaPagamento.BT_AJUDA_MENU_GENERICO_ALTERAR_PAGAMENTO_SIM, "Sim, a resposta foi útil");
				a.validarTextoContido(PageAlterarFormaPagamento.BT_AJUDA_MENU_GENERICO_ALTERAR_PAGAMENTO_NÃO, "A resposta não atendeu à pergunta");
				a.validarTextoContido(PageAlterarFormaPagamento.BT_AJUDA_MENU_GENERICO_ALTERAR_PAGAMENTO_CONTINUAR, "Continuar conversando");
				break;
			case "Mais produtos Globo":
			
				break;
			case "Outros Assuntos":
				a.validarTextoContido(PageOutrosAssuntos.Bl_UM_OUTROSASSUNTOS,
						"Sem problemas, GEORGIO! É só digitar o que você precisa 😊");
				break;
			}

		});

		/*
		 * 
		 * //botão Disney+ //botão Disney+ When("clico no botao Disney+", () -> {
		 * a.clicar(PageBot.BTN_DISNEY); a.validarTextoContido(PageBot.BL_UM_DISNEY,
		 * "Já vi que você não resistiu à parceria com o Disney+ 😍");
		 * a.validarTextoContido(PageBot.BL_DOIS_DISNEY,
		 * "1. Pra adicionar o Disney+, é só acessar globoplay.com/disneyplus/bot" +"\n"
		 * + "\n" + "2. Depois, clique em ”assine” e faça login, se for preciso." + "\n"
		 * + "\n" + "3. Informe os dados de pagamento e finalize sua contratação.");
		 * a.validarTextoContido(PageBot.BL_TRES_DISNEY,
		 * "4. Em seguida, clique na opção “ativar Disney+” para criar seu cadastro no site do Disney+."
		 * ); a.validarTextoContido(PageBot.BL_AJUDA_DISNEY,
		 * "Agora me diz, te ajudei ou te ajudo em algo mais?");
		 * a.validarTextoContido(PageBot.BT_AJUDA_DISNEY_SIM,
		 * "🙂 Sim, a resposta foi útil");
		 * a.validarTextoContido(PageBot.BT_AJUDA_DISNEY_NÃO,
		 * "😕 A resposta não atendeu à pergunta");
		 * a.validarTextoContido(PageBot.BT_AJUDA_DISNEY_CONTINUAR,
		 * "💬 Continuar conversando"); });
		 * 
		 * //botão discovery When("clico no botao discovery+", () -> {
		 * a.clicar(PageBot.BTN_ATENDIMENTO); a.clicar(PageBot.BTN_DISCOVERY);
		 * a.validarTextoContido(PageBot.BL_UM_DISNEY,
		 * "Eba! Vou te ajudar a ter o melhor do entretenimento Globoplay e discovery+. Vamos lá? 😁"
		 * ); a.validarTextoContido(PageBot.BL_DOIS_DISNEY,
		 * "1. Para começar, acesse globoplay.com/assine/discoveryplus e faça login."
		 * +"\n" + "\n" + "2. Depois, clique em “assine já”." + "\n" + "\n" +
		 * "3. Informe os dados de pagamento e finalize sua contratação.");
		 * a.validarTextoContido(PageBot.BL_TRES_DISNEY,
		 * "4. Em seguida, é só clicar na opção “ativar discovery+”, criar seu cadastro no site do discovery+ e partir pro play 🎉"
		 * ); a.validarTextoContido(PageBot.BL_AJUDA_DISNEY,
		 * "Agora me diz, te ajudei ou te ajudo em algo mais?");
		 * a.validarTextoContido(PageBot.BT_AJUDA_DISNEY_SIM,
		 * "🙂 Sim, a resposta foi útil");
		 * a.validarTextoContido(PageBot.BT_AJUDA_DISNEY_NÃO,
		 * "😕 A resposta não atendeu à pergunta");
		 * a.validarTextoContido(PageBot.BT_AJUDA_DISNEY_CONTINUAR,
		 * "💬 Continuar conversando"); }); //botão deezer
		 * When("clico no botao 6 meses de Deezer Premium", () -> {
		 * a.clicar(PageBot.BTN_DEEZER);
		 * a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR,
		 * "Pra te ajudar com isso, é só selecionar uma opção ou um produto abaixo.");
		 * a.validarTextoContido(PageAlterarPlano.
		 * BTN_ALTERAR_TROCA_MENSAL_ANUAL,"Trocar de plano mensal para anual");
		 * a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_TROCA_MAISCANAIS,
		 * "Trocar para Globoplay + canais ao vivo");
		 * a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_DISNEY, "Disney+");
		 * a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_DISCOVERY,"discovery+");
		 * a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_DEEZER, "Deezer Premium");
		 * a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_PREMIERE, "Premiere");
		 * a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_TELECINE, "Telecine");
		 * a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_BIANUAL,
		 * "Trocar para bianual"); }); //botão ativar smart tv
		 * When("clico no botao Ativação Smart TV", () -> {
		 * a.clicar(PageBot.BTN_ATIVARSMART);
		 * a.validarTextoContido(PageAtivarSmart.BL_UM_SMART,
		 * "Pra eu te entender melhor, selecione uma das opções abaixo ou reescreva sua dúvida 🙂"
		 * ); a.validarTextoContido(PageAtivarSmart.BTN_SMART_QRCODE, "QR Code");
		 * a.validarTextoContido(PageAtivarSmart.BTN_SMART_TVCOMPATIVEL,
		 * "Minha TV é compatível?");
		 * a.validarTextoContido(PageAtivarSmart.BTN_SMART_INSTALARSMART,
		 * "Instalar na Smart TV"); a.validarTextoContido(PageAtivarSmart.
		 * BTN_SMART_CODNAOAPARECE,"Código não aparece");
		 * a.validarTextoContido(PageAtivarSmart.BTN_SMART_CODINVALIDO,"Código inválido"
		 * ); a.validarTextoContido(PageAtivarSmart.
		 * BTN_SMART_ATUALIZARAPP,"Atualizar o aplicativo na TV");
		 * a.validarTextoContido(PageAtivarSmart.BTN_SMART_ATIVARSMART,"Ativar Smart TV"
		 * ); a.validarTextoContido(PageAtivarSmart.
		 * BTN_SMART_NAOCONSIGOATIVAR,"Não consigo ativar minha Smart TV");
		 * 
		 * }); //botão ativar erros ao assisitir
		 * When("clico no botao Erros ao assistir", () -> {
		 * a.clicar(PageBot.BTN_ERROSASSISTIR);
		 * a.validarTextoContido(PageErrosAssistir.Bl_UM_ERROS_ASSISTIR,
		 * "Para falar sobre isso, selecione uma das opções abaixo ou digite o código de erro, se ele apareceu na sua tela."
		 * ); a.validarTextoContido(PageErrosAssistir.
		 * BTN_ERROS_CONTEUDOINDISPONIVEL,"Conteúdo indisponível");
		 * a.validarTextoContido(PageErrosAssistir.BTN_ERROS_CONTEUDOEXCLUSIVO,
		 * "Conteúdo exclusivo para assinantes");
		 * a.validarTextoContido(PageErrosAssistir.BTN_ERROS_VIDEOINDISPONIVEL ,
		 * "Vídeo indisponível nessa região");
		 * a.validarTextoContido(PageErrosAssistir.BTN_ERROS_VIDEOTRAVANDO,
		 * "Vídeo travando / só carregando");
		 * a.validarTextoContido(PageErrosAssistir.BTN_ERROS_NAOCONTEUDOSINTERNACIONAIS,
		 * "Não encontro conteúdos internacionais na Smart TV");
		 * a.validarTextoContido(PageErrosAssistir.BTN_ERROS_NAOASSISTIRDISNEY,
		 * "Não consigo assistir Disney+");
		 * a.validarTextoContido(PageErrosAssistir.BTN_ERROS_DATAHORA,
		 * "Data e hora de seu aparelho");
		 * 
		 * });
		 * 
		 * //botão outros Assuntos When("clico no botao Outros Assuntos", () -> {
		 * a.clicar(PageBot.BTN_OUTROSASSUNTOS);
		 * a.validarTextoContido(PageOutrosAssuntos.Bl_UM_OUTROSASSUNTOS,
		 * "Sem problemas, GEORGIO! É só digitar o que você precisa 😊");
		 * 
		 * 
		 * });
		 * 
		 */

	}

}
