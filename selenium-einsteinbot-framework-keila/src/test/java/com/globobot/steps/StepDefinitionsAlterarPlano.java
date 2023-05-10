package com.globobot.steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.globo.pages.PageAcesso;
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

public class StepDefinitionsAlterarPlano implements En{

InteracaoWeb a = new InteracaoWeb();
	
	public StepDefinitionsAlterarPlano(){
		Given("que seleciono o produto Globoplay", () -> {
		   a.clicar(PageAlterarPlano.BTN_PRODUTO_COM_ADDON);
		});

	
	
		Then("digito alterar plano", () -> {
		 a.clicar(PageAlterarPlano.TXT_TEXTAREABOT);
		 a.escrever(PageAlterarPlano.TXT_TEXTAREABOT, "alterar plano");
		 a.acionarEnter(PageAlterarPlano.TXT_TEXTAREABOT);
		 a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR, "Pra te ajudar com isso, é só selecionar uma opção ou um produto abaixo.");
			a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_TROCA_MENSAL_ANUAL,"Trocar de plano mensal para anual");
			a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_TROCA_MAISCANAIS, "Trocar para Globoplay + canais ao vivo");
			a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_DISNEY, "Disney+");
			a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_DISCOVERY,"discovery+");
			a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_DEEZER, "Deezer Premium");
			a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_PREMIERE, "Premiere");
			a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_TELECINE, "Telecine");
			a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_BIANUAL, "Trocar para bianual"); 
	});
		Given("que clico no botao {string} do menu do fluxo alterar plano", (String botao) -> {
			switch (botao) {
		
			case "Trocar de plano mensal para anual":
				Thread.sleep(20000);
				a.clicar(PageAlterarPlano.BTN_ALTERAR_TROCA_MENSAL_ANUAL);

				break;

			case "Trocar para Globoplay + canais ao vivo":
				Thread.sleep(20000);
				a.clicar(PageAlterarPlano.BTN_ALTERAR_TROCA_MAISCANAIS);

				break;

			case "Disney+":
				Thread.sleep(20000);
				a.clicar(PageAlterarPlano.BTN_ALTERAR_DISNEY);

				break;

			case "discovery+":
				Thread.sleep(20000);
				a.clicar(PageAlterarPlano.BTN_ALTERAR_DISCOVERY);

				break;

			case "Deezer Premium":
				Thread.sleep(20000);
				a.clicar(PageAlterarPlano.BTN_ALTERAR_DEEZER);

				break;

			case "Premiere":
				Thread.sleep(20000);
				a.clicar(PageAlterarPlano.BTN_ALTERAR_PREMIERE);

				break;
				case "Telecine":
					Thread.sleep(20000);
					a.clicar(PageAlterarPlano.BTN_ALTERAR_TELECINE);

					break;
				case "Trocar para bianual":
					Thread.sleep(20000);
					a.clicar(PageAlterarPlano.BTN_ALTERAR_BIANUAL);

					break;
			}
		});

// Cliente com Globoplay básico e ativo
		Then("valido o texto do botao {string} do fluxo alterar plano", (String botao) -> {
		   
			switch (botao) {
			
			case "Trocar de plano mensal para anual":
					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCAR_MENSAL_ANUAL, "Aproveite o desconto do plano anual e vamos viver juntos e felizes para sempre!"
							+"\n" + "\n" +"Se você é assinante do plano mensal e quer trocar para o plano anual, eu te ensino como:");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCAR_MENSAL_ANUAL, "1. Acesse globo.com/minhaconta e faça seu login."
							+"\n" + "2. Clique no seu produto Globoplay."
							+"\n" + "3. Selecione a opção \"alterar plano\"."
							+"\n" + "4. Você será direcionado para a página de contratação do plano anual. Não esqueça de revisar as informações de pagamento.");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCAR_MENSAL_ANUAL, "Após o encerramento da vigência do seu plano mensal, seu plano mudará automaticamente para o plano anual.");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TROCAR_MENSAL_ANUAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_SIM, "Sim, a resposta foi útil");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_NÃO, "A resposta não atendeu à pergunta");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_CONTINUAR, "Continuar conversando");

				break;

			case "Trocar para Globoplay + canais ao vivo":
				   
				    a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCA_MAISCANAL, "Assinar o Globoplay + canais ao vivo é bem fácil! Olha só:");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCA_MAISCANAL, "1. Acesse vitrine.globo.com/bot e faça login."
				    		+"\n" + "\n" + "2. Depois, é só descer até o fim da página, escolher o seu plano e clicar em \"assine já\".");
				    a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCA_MAISCANAL, "3. Informe os dados de pagamento e finalize sua assinatura."
				    		+"\n" + "\n" +"Feito isso, você já pode curtir o melhor do conteúdo ao vivo 😍");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_MAISCANAIS, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_CONTINUAR, "Continuar conversando");
				break;

			case "Disney+":

				    a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISNEY, "Já vi que você não resistiu à parceria com o Disney+ 😍");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DISNEY, "1. Pra adicionar o Disney+, é só acessar globoplay.com/disneyplus/bot"
				    		+"\n" + "\n" +"2. Depois, clique em ”assine” e faça login, se for preciso."
				    		+"\n" + "\n" +"3. Informe os dados de pagamento e finalize sua contratação.");
				    a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DISNEY, "4. Em seguida, clique na opção “ativar Disney+” para criar seu cadastro no site do Disney+.");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DISNEY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_CONTINUAR, "Continuar conversando");
				
				break;

			case "discovery+":

					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISCOVERY, "Eba! Vou te ajudar a ter o melhor do entretenimento Globoplay e discovery+. Vamos lá? 😁");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DISCOVERY, "1. Para começar, acesse globoplay.com/assine/discoveryplus e faça login."
							+"\n" + "\n" + "2. Depois, clique em “assine já”."
							+"\n" + "\n" + "3. Informe os dados de pagamento e finalize sua contratação.");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DISCOVERY, "4. Em seguida, é só clicar na opção “ativar discovery+”, criar seu cadastro no site do discovery+ e partir pro play 🎉");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DISCOVERY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_CONTINUAR, "Continuar conversando");
				

				break;

			case "Deezer Premium":

					  a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DEEZER, "Como assinante Globoplay, você ganhou 6 meses de Deezer Premium para curtir milhões de músicas, podcasts e playlists, sem anúncios! Legal, né? 😎");
					  a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DEEZER, 
							  "1. Para resgatar seu presente, acesse globoplay.com/assine/deezer "
							  + "\n" + "2. Faça login, se for preciso."
							  + "\n" + "3. Depois, clique em “assine já” e garanta seu Deezer Premium.");
					  a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DEEZER, "Ah! Ao fim dos 6 meses, como assinante Globoplay, você ainda tem um desconto especial. O seu plano Deezer Premium ficará por apenas R$17,90/mês 🎉");
					  a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DEEZER, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_CONTINUAR, "Continuar conversando");
					
				break;

			case "Premiere":
	
					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_PREMIERE, "Já entendi que você quer falar sobre o Premiere, né?!");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_PREMIERE, "Se você quer assinar o combo Globoplay e Premiere, acesse duvidas.globo.com/globoplayepremiere que eu te ensino =)");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_PREMIERE, "Mas se a sua dúvida é algo relacionado a assinatura do Premiere ou alguma dificuldade com o produto, meus amigos especialistas em futebol podem te ajudar. É só clicar em duvidas.globo.com/ajudapremiere");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_PREMIERE, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_CONTINUAR, "Continuar conversando");
				

				break;
				case "Telecine":
	
						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TELECINE, "Eba! Vou te ajudar a ter o melhor do cinema. Vamos lá? 😁");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TELECINE, "1. Acesse vitrine.globo.com/bot e faça login."
								+ "2. Depois, é só descer até o fim da página, escolher o seu plano e clicar em \"assine já\".");
						a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TELECINE, "3. Em seguida, informe os dados de pagamento e finalize sua assinatura.\r\n"
								+ "\r\n"
								+ "Feito isso, é só partir pro play 🎉");
						a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TELECINE, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_CONTINUAR, "Continuar conversando");
					
					break;
				case "Trocar para bianual":

						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_BIANUAL, "Poxa, fico feliz pelo interesse no plano bianual, mas no momento não está disponível...");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_BIANUAL, "Mas não se preocupe, pois temos outros planos disponíveis pra você, acesse vitrine.globo.com/bot e faça login, tá bem? 😊");
						a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_BIANUAL, "Feito isso, você já pode ficar tranquilo e curtir o melhor do conteúdo 😍");
						a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_BIANUAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_CONTINUAR, "Continuar conversando");

					break;
			}
		
		});
	// Cliente Globoplay que possui o Addon discovery		

		Then("valido o texto do botao {string} do fluxo alterar plano com cliente que possui ADDON discovery+", (String botao) -> {
	switch (botao) {
	
	case "Trocar de plano mensal para anual":
			a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCAR_MENSAL_ANUAL, "Aproveite o desconto do plano anual e vamos viver juntos e felizes para sempre!"
					+"\n" + "\n" +"Se você é assinante do plano mensal e quer trocar para o plano anual, eu te ensino como:");
			a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCAR_MENSAL_ANUAL, "1. Acesse globo.com/minhaconta e faça seu login."
					+"\n" + "2. Clique no seu produto Globoplay."
					+"\n" + "3. Selecione a opção \"alterar plano\"."
					+"\n" + "4. Você será direcionado para a página de contratação do plano anual. Não esqueça de revisar as informações de pagamento.");
			a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCAR_MENSAL_ANUAL, "Após o encerramento da vigência do seu plano mensal, seu plano mudará automaticamente para o plano anual.");
			a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TROCAR_MENSAL_ANUAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
			a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_SIM, "Sim, a resposta foi útil");
			a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_NÃO, "A resposta não atendeu à pergunta");
			a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_CONTINUAR, "Continuar conversando");

		break;

	case "Trocar para Globoplay + canais ao vivo":
		   
		    a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCA_MAISCANAL, "Assinar o Globoplay + canais ao vivo é bem fácil! Olha só:");
		    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCA_MAISCANAL, "1. Acesse vitrine.globo.com/bot e faça login."
		    		+"\n" + "\n" + "2. Depois, é só descer até o fim da página, escolher o seu plano e clicar em \"assine já\".");
		    a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCA_MAISCANAL, "3. Informe os dados de pagamento e finalize sua assinatura."
		    		+"\n" + "\n" +"Feito isso, você já pode curtir o melhor do conteúdo ao vivo 😍");
		    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_MAISCANAIS, "Agora me diz, te ajudei ou te ajudo em algo mais?");
		    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_SIM, "Sim, a resposta foi útil");
		    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_NÃO, "A resposta não atendeu à pergunta");
		    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_CONTINUAR, "Continuar conversando");
		break;

	case "Disney+":

		    a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISNEY, "Já vi que você não resistiu à parceria com o Disney+ 😍");
		    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DISNEY, "1. Pra adicionar o Disney+, é só acessar globoplay.com/disneyplus/bot"
		    		+"\n" + "\n" +"2. Depois, clique em ”assine” e faça login, se for preciso."
		    		+"\n" + "\n" +"3. Informe os dados de pagamento e finalize sua contratação.");
		    a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DISNEY, "4. Em seguida, clique na opção “ativar Disney+” para criar seu cadastro no site do Disney+.");
		    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DISNEY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
		    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_SIM, "Sim, a resposta foi útil");
		    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_NÃO, "A resposta não atendeu à pergunta");
		    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_CONTINUAR, "Continuar conversando");
		
		break;
// ele será direcionado para o bot parceiro
	case "discovery+":

			a.validarTextoContido(PageAlterarPlano.BL_UM_TRANSFERENCIA_DISCOVERY, "Legal! Já entendi que você quer falar sobre o discovery+... Agora, só preciso que escolha uma opção abaixo ou reescreva sua dúvida 😬");
			a.validarTextoContido(PageAlterarPlano.BL_DOIS_TRANSFERENCIA_DISCOVERY, "Por aqui, estou pronto para tirar suas dúvidas sobre sua assinatura. Para interagir comigo, selecione um assunto ou digite sua dúvida.");
		    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_DISCOVERY_ATIVAR, "Ativar discovery+");
		    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_DISCOVERY_MAIS_PRODUTOS, "Mais Produtos Globo");
		    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_DISCOVERY_OUTROS_PRODUTOS, "Outros assuntos");
		

		break;

	case "Deezer Premium":

			  a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DEEZER, "Como assinante Globoplay, você ganhou 6 meses de Deezer Premium para curtir milhões de músicas, podcasts e playlists, sem anúncios! Legal, né? 😎");
			  a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DEEZER, 
					  "1. Para resgatar seu presente, acesse globoplay.com/assine/deezer "
					  + "\n" + "2. Faça login, se for preciso."
					  + "\n" + "3. Depois, clique em “assine já” e garanta seu Deezer Premium.");
			  a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DEEZER, "Ah! Ao fim dos 6 meses, como assinante Globoplay, você ainda tem um desconto especial. O seu plano Deezer Premium ficará por apenas R$17,90/mês 🎉");
			  a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DEEZER, "Agora me diz, te ajudei ou te ajudo em algo mais?");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_SIM, "Sim, a resposta foi útil");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_NÃO, "A resposta não atendeu à pergunta");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_CONTINUAR, "Continuar conversando");
			
		break;

	case "Premiere":

			a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_PREMIERE, "Já entendi que você quer falar sobre o Premiere, né?!");
			a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_PREMIERE, "Se você quer assinar o combo Globoplay e Premiere, acesse duvidas.globo.com/globoplayepremiere que eu te ensino =)");
			a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_PREMIERE, "Mas se a sua dúvida é algo relacionado a assinatura do Premiere ou alguma dificuldade com o produto, meus amigos especialistas em futebol podem te ajudar. É só clicar em duvidas.globo.com/ajudapremiere");
			a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_PREMIERE, "Agora me diz, te ajudei ou te ajudo em algo mais?");
		    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_SIM, "Sim, a resposta foi útil");
		    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_NÃO, "A resposta não atendeu à pergunta");
		    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_CONTINUAR, "Continuar conversando");
		

		break;
		case "Telecine":

				a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TELECINE, "Eba! Vou te ajudar a ter o melhor do cinema. Vamos lá? 😁");
				a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TELECINE, "1. Acesse vitrine.globo.com/bot e faça login."
						+ "\r\n"+ "2. Depois, é só descer até o fim da página, escolher o seu plano e clicar em \"assine já\".");
				a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TELECINE, "3. Em seguida, informe os dados de pagamento e finalize sua assinatura.\r\n"
						+ "\r\n"
						+ "Feito isso, é só partir pro play 🎉");
				a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TELECINE, "Agora me diz, te ajudei ou te ajudo em algo mais?");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_SIM, "Sim, a resposta foi útil");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_NÃO, "A resposta não atendeu à pergunta");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_CONTINUAR, "Continuar conversando");
			
			break;
		case "Trocar para bianual":

				a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_BIANUAL, "Poxa, fico feliz pelo interesse no plano bianual, mas no momento não está disponível...");
				a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_BIANUAL, "Mas não se preocupe, pois temos outros planos disponíveis pra você, acesse vitrine.globo.com/bot e faça login, tá bem? 😊");
				a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_BIANUAL, "Feito isso, você já pode ficar tranquilo e curtir o melhor do conteúdo 😍");
				a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_BIANUAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_SIM, "Sim, a resposta foi útil");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_NÃO, "A resposta não atendeu à pergunta");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_CONTINUAR, "Continuar conversando");

			break;
	}
});
		//	// Cliente Globoplay que possui o Addon Disney+

		Then("valido o texto do botao {string} do fluxo alterar plano com cliente que possui ADDON disney+", (String botao) -> {
			switch (botao) {
			
			case "Trocar de plano mensal para anual":
					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCAR_MENSAL_ANUAL, "Aproveite o desconto do plano anual e vamos viver juntos e felizes para sempre!"
							+"\n" + "\n" +"Se você é assinante do plano mensal e quer trocar para o plano anual, eu te ensino como:");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCAR_MENSAL_ANUAL, "1. Acesse globo.com/minhaconta e faça seu login."
							+"\n" + "2. Clique no seu produto Globoplay."
							+"\n" + "3. Selecione a opção \"alterar plano\"."
							+"\n" + "4. Você será direcionado para a página de contratação do plano anual. Não esqueça de revisar as informações de pagamento.");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCAR_MENSAL_ANUAL, "Após o encerramento da vigência do seu plano mensal, seu plano mudará automaticamente para o plano anual.");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TROCAR_MENSAL_ANUAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_SIM, "Sim, a resposta foi útil");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_NÃO, "A resposta não atendeu à pergunta");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_CONTINUAR, "Continuar conversando");

				break;

			case "Trocar para Globoplay + canais ao vivo":
				   
				    a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCA_MAISCANAL, "Assinar o Globoplay + canais ao vivo é bem fácil! Olha só:");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCA_MAISCANAL, "1. Acesse vitrine.globo.com/bot e faça login."
				    		+"\n" + "\n" + "2. Depois, é só descer até o fim da página, escolher o seu plano e clicar em \"assine já\".");
				    a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCA_MAISCANAL, "3. Informe os dados de pagamento e finalize sua assinatura."
				    		+"\n" + "\n" +"Feito isso, você já pode curtir o melhor do conteúdo ao vivo 😍");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_MAISCANAIS, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_CONTINUAR, "Continuar conversando");
				break;

			case "Disney+":

				    a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISNEY, "Oba! Chegou a hora de ativar o Disney+ 🎉");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DISNEY, "1. Para isso acesse globo.com/minhaconta e faça login, se for necessário. "
				    		+"\n" + "2. Clique em Globoplay e em seguida em \"ativar Disney+\"."
				    		+"\n" + "3. Depois, é só criar seu cadastro no site do Disney+, como os passos vão te mostrar.");
				    a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DISNEY, "Feito isso, você passa a ter acesso a todos os conteúdos do Disney+ 😊");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DISNEY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_CONTINUAR, "Continuar conversando");
				
				break;

			case "discovery+":

				a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISCOVERY, "Eba! Vou te ajudar a ter o melhor do entretenimento Globoplay e discovery+. Vamos lá? 😁");
				a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DISCOVERY, "1. Para começar, acesse globoplay.com/assine/discoveryplus e faça login."
						+"\n" + "\n" + "2. Depois, clique em “assine já”."
						+"\n" + "\n" + "3. Informe os dados de pagamento e finalize sua contratação.");
				a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DISCOVERY, "4. Em seguida, é só clicar na opção “ativar discovery+”, criar seu cadastro no site do discovery+ e partir pro play 🎉");
			    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DISCOVERY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_SIM, "Sim, a resposta foi útil");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_NÃO, "A resposta não atendeu à pergunta");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_CONTINUAR, "Continuar conversando");
					
				   
				

				break;

			case "Deezer Premium":

					  a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DEEZER, "Como assinante Globoplay, você ganhou 6 meses de Deezer Premium para curtir milhões de músicas, podcasts e playlists, sem anúncios! Legal, né? 😎");
					  a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DEEZER, 
							  "1. Para resgatar seu presente, acesse globoplay.com/assine/deezer "
							  + "\n" + "2. Faça login, se for preciso."
							  + "\n" + "3. Depois, clique em “assine já” e garanta seu Deezer Premium.");
					  a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DEEZER, "Ah! Ao fim dos 6 meses, como assinante Globoplay, você ainda tem um desconto especial. O seu plano Deezer Premium ficará por apenas R$17,90/mês 🎉");
					  a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DEEZER, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_CONTINUAR, "Continuar conversando");
					
				break;

			case "Premiere":

					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_PREMIERE, "Já entendi que você quer falar sobre o Premiere, né?!");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_PREMIERE, "Se você quer assinar o combo Globoplay e Premiere, acesse duvidas.globo.com/globoplayepremiere que eu te ensino =)");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_PREMIERE, "Mas se a sua dúvida é algo relacionado a assinatura do Premiere ou alguma dificuldade com o produto, meus amigos especialistas em futebol podem te ajudar. É só clicar em duvidas.globo.com/ajudapremiere");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_PREMIERE, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_CONTINUAR, "Continuar conversando");
				

				break;
				case "Telecine":

						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TELECINE, "Eba! Vou te ajudar a ter o melhor do cinema. Vamos lá? 😁");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TELECINE, "1. Acesse vitrine.globo.com/bot e faça login."
								+ "\r\n"+ "2. Depois, é só descer até o fim da página, escolher o seu plano e clicar em \"assine já\".");
						a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TELECINE, "3. Em seguida, informe os dados de pagamento e finalize sua assinatura.\r\n"
								+ "\r\n"
								+ "Feito isso, é só partir pro play 🎉");
						a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TELECINE, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_CONTINUAR, "Continuar conversando");
					
					break;
				case "Trocar para bianual":

						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_BIANUAL, "Poxa, fico feliz pelo interesse no plano bianual, mas no momento não está disponível...");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_BIANUAL, "Mas não se preocupe, pois temos outros planos disponíveis pra você, acesse vitrine.globo.com/bot e faça login, tá bem? 😊");
						a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_BIANUAL, "Feito isso, você já pode ficar tranquilo e curtir o melhor do conteúdo 😍");
						a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_BIANUAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_CONTINUAR, "Continuar conversando");

					break;
			}
		});
		// Cliente Globoplay que possui o Addon Deezer

		Then("valido o texto do botao {string} do fluxo alterar plano com cliente que possui ADDON deezer premium", (String botao) -> {
		switch (botao) {
			
			case "Trocar de plano mensal para anual":
					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCAR_MENSAL_ANUAL, "Aproveite o desconto do plano anual e vamos viver juntos e felizes para sempre!"
							+"\n" + "\n" +"Se você é assinante do plano mensal e quer trocar para o plano anual, eu te ensino como:");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCAR_MENSAL_ANUAL, "1. Acesse globo.com/minhaconta e faça seu login."
							+"\n" + "2. Clique no seu produto Globoplay."
							+"\n" + "3. Selecione a opção \"alterar plano\"."
							+"\n" + "4. Você será direcionado para a página de contratação do plano anual. Não esqueça de revisar as informações de pagamento.");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCAR_MENSAL_ANUAL, "Após o encerramento da vigência do seu plano mensal, seu plano mudará automaticamente para o plano anual.");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TROCAR_MENSAL_ANUAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_SIM, "Sim, a resposta foi útil");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_NÃO, "A resposta não atendeu à pergunta");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_CONTINUAR, "Continuar conversando");

				break;

			case "Trocar para Globoplay + canais ao vivo":
				   
				    a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCA_MAISCANAL, "Assinar o Globoplay + canais ao vivo é bem fácil! Olha só:");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCA_MAISCANAL, "1. Acesse vitrine.globo.com/bot e faça login."
				    		+"\n" + "\n" + "2. Depois, é só descer até o fim da página, escolher o seu plano e clicar em \"assine já\".");
				    a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCA_MAISCANAL, "3. Informe os dados de pagamento e finalize sua assinatura."
				    		+"\n" + "\n" +"Feito isso, você já pode curtir o melhor do conteúdo ao vivo 😍");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_MAISCANAIS, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_CONTINUAR, "Continuar conversando");
				break;

			case "Disney+":

				 a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISNEY, "Já vi que você não resistiu à parceria com o Disney+ 😍");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DISNEY, "1. Pra adicionar o Disney+, é só acessar globoplay.com/disneyplus/bot"
				    		+"\n" + "\n" +"2. Depois, clique em ”assine” e faça login, se for preciso."
				    		+"\n" + "\n" +"3. Informe os dados de pagamento e finalize sua contratação.");
				    a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DISNEY, "4. Em seguida, clique na opção “ativar Disney+” para criar seu cadastro no site do Disney+.");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DISNEY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_CONTINUAR, "Continuar conversando");
				
				break;
		
			case "discovery+":

				a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISCOVERY, "Eba! Vou te ajudar a ter o melhor do entretenimento Globoplay e discovery+. Vamos lá? 😁");
				a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DISCOVERY, "1. Para começar, acesse globoplay.com/assine/discoveryplus e faça login."
						+"\n" + "\n" + "2. Depois, clique em “assine já”."
						+"\n" + "\n" + "3. Informe os dados de pagamento e finalize sua contratação.");
				a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DISCOVERY, "4. Em seguida, é só clicar na opção “ativar discovery+”, criar seu cadastro no site do discovery+ e partir pro play 🎉");
			    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DISCOVERY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_SIM, "Sim, a resposta foi útil");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_NÃO, "A resposta não atendeu à pergunta");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_CONTINUAR, "Continuar conversando");

				break;

			case "Deezer Premium":

					  a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DEEZER, "Oba! Chegou a hora de ativar o Deezer Premium 🎧");
					  a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DEEZER, 
							  "1. Para isso, acesse globo.com/minhaconta e faça login, se for necessário. "
									  +"\n" +  "2. Clique em Globoplay e, em seguida, em \"ativar Deezer Premium\"."
									  +"\n" +  "3. Depois, é só criar seu cadastro no site do Deezer.");
					  a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DEEZER, "Feito isso, você passa a ter acesso a todas as músicas e conteúdos disponíveis no Deezer 😎");
					  a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DEEZER, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_CONTINUAR, "Continuar conversando");
					
				break;

			case "Premiere":

					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_PREMIERE, "Já entendi que você quer falar sobre o Premiere, né?!");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_PREMIERE, "Se você quer assinar o combo Globoplay e Premiere, acesse duvidas.globo.com/globoplayepremiere que eu te ensino =)");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_PREMIERE, "Mas se a sua dúvida é algo relacionado a assinatura do Premiere ou alguma dificuldade com o produto, meus amigos especialistas em futebol podem te ajudar. É só clicar em duvidas.globo.com/ajudapremiere");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_PREMIERE, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_CONTINUAR, "Continuar conversando");
				

				break;
				case "Telecine":

						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TELECINE, "Eba! Vou te ajudar a ter o melhor do cinema. Vamos lá? 😁");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TELECINE, "1. Acesse vitrine.globo.com/bot e faça login."
								+ "\r\n"+ "2. Depois, é só descer até o fim da página, escolher o seu plano e clicar em \"assine já\".");
						a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TELECINE, "3. Em seguida, informe os dados de pagamento e finalize sua assinatura.\r\n"
								+ "\r\n"
								+ "Feito isso, é só partir pro play 🎉");
						a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TELECINE, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_CONTINUAR, "Continuar conversando");
					
					break;
				case "Trocar para bianual":

						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_BIANUAL, "Poxa, fico feliz pelo interesse no plano bianual, mas no momento não está disponível...");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_BIANUAL, "Mas não se preocupe, pois temos outros planos disponíveis pra você, acesse vitrine.globo.com/bot e faça login, tá bem? 😊");
						a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_BIANUAL, "Feito isso, você já pode ficar tranquilo e curtir o melhor do conteúdo 😍");
						a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_BIANUAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_CONTINUAR, "Continuar conversando");

					break;
			}
		});
		//Login Globoplay com Telecine
		Then("valido o texto do botao {string} do fluxo alterar plano com cliente que possui Telecine", (String botao) -> {
switch (botao) {
			
			case "Trocar de plano mensal para anual":
					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCAR_MENSAL_ANUAL, "Aproveite o desconto do plano anual e vamos viver juntos e felizes para sempre!"
							+"\n" + "\n" +"Se você é assinante do plano mensal e quer trocar para o plano anual, eu te ensino como:");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCAR_MENSAL_ANUAL, "1. Acesse globo.com/minhaconta e faça seu login."
							+"\n" + "2. Clique no seu produto Globoplay."
							+"\n" + "3. Selecione a opção \"alterar plano\"."
							+"\n" + "4. Você será direcionado para a página de contratação do plano anual. Não esqueça de revisar as informações de pagamento.");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCAR_MENSAL_ANUAL, "Após o encerramento da vigência do seu plano mensal, seu plano mudará automaticamente para o plano anual.");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TROCAR_MENSAL_ANUAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_SIM, "Sim, a resposta foi útil");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_NÃO, "A resposta não atendeu à pergunta");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_CONTINUAR, "Continuar conversando");

				break;

			case "Trocar para Globoplay + canais ao vivo":
				   
				    a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCA_MAISCANAL, "Assinar o Globoplay + canais ao vivo é bem fácil! Olha só:");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCA_MAISCANAL, "1. Acesse vitrine.globo.com/bot e faça login."
				    		+"\n" + "\n" + "2. Depois, é só descer até o fim da página, escolher o seu plano e clicar em \"assine já\".");
				    a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCA_MAISCANAL, "3. Informe os dados de pagamento e finalize sua assinatura."
				    		+"\n" + "\n" +"Feito isso, você já pode curtir o melhor do conteúdo ao vivo 😍");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_MAISCANAIS, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_CONTINUAR, "Continuar conversando");
				break;

			case "Disney+":

				 a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISNEY, "Já vi que você não resistiu à parceria com o Disney+ 😍");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DISNEY, "1. Pra adicionar o Disney+, é só acessar globoplay.com/disneyplus/bot"
				    		+"\n" + "\n" +"2. Depois, clique em ”assine” e faça login, se for preciso."
				    		+"\n" + "\n" +"3. Informe os dados de pagamento e finalize sua contratação.");
				    a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DISNEY, "4. Em seguida, clique na opção “ativar Disney+” para criar seu cadastro no site do Disney+.");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DISNEY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_CONTINUAR, "Continuar conversando");
				
				break;
		
			case "discovery+":

				a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISCOVERY, "Eba! Vou te ajudar a ter o melhor do entretenimento Globoplay e discovery+. Vamos lá? 😁");
				a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DISCOVERY, "1. Para começar, acesse globoplay.com/assine/discoveryplus e faça login."
						+"\n" + "\n" + "2. Depois, clique em “assine já”."
						+"\n" + "\n" + "3. Informe os dados de pagamento e finalize sua contratação.");
				a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DISCOVERY, "4. Em seguida, é só clicar na opção “ativar discovery+”, criar seu cadastro no site do discovery+ e partir pro play 🎉");
			    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DISCOVERY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_SIM, "Sim, a resposta foi útil");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_NÃO, "A resposta não atendeu à pergunta");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_CONTINUAR, "Continuar conversando");

				break;

			case "Deezer Premium":

				 a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DEEZER, "Como assinante Globoplay, você ganhou 6 meses de Deezer Premium para curtir milhões de músicas, podcasts e playlists, sem anúncios! Legal, né? 😎");
				  a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DEEZER, 
						  "1. Para resgatar seu presente, acesse globoplay.com/assine/deezer "
						  + "\n" + "2. Faça login, se for preciso."
						  + "\n" + "3. Depois, clique em “assine já” e garanta seu Deezer Premium.");
				  a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DEEZER, "Ah! Ao fim dos 6 meses, como assinante Globoplay, você ainda tem um desconto especial. O seu plano Deezer Premium ficará por apenas R$17,90/mês 🎉");
				  a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DEEZER, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_CONTINUAR, "Continuar conversando");
				
				break;

			case "Premiere":

					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_PREMIERE, "Já entendi que você quer falar sobre o Premiere, né?!");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_PREMIERE, "Se você quer assinar o combo Globoplay e Premiere, acesse duvidas.globo.com/globoplayepremiere que eu te ensino =)");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_PREMIERE, "Mas se a sua dúvida é algo relacionado a assinatura do Premiere ou alguma dificuldade com o produto, meus amigos especialistas em futebol podem te ajudar. É só clicar em duvidas.globo.com/ajudapremiere");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_PREMIERE, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_CONTINUAR, "Continuar conversando");
				

				break;
				case "Telecine":

						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TELECINE, "Eba! Vou te ajudar a ter o melhor do cinema. Vamos lá? 😁");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TELECINE, "Vi aqui que você já tem o Telecine... Você pode aproveitar os conteúdos acessando globoplay.com ou maratonando até pelo aplicativo do Globoplay 😊");
						a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TELECINE, "Mas, olha, se você estiver encontrando algum problema para assistir ou estiver com alguma dúvida, é só me falar que te ajudo por aqui.  ");
						a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TELECINE, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_CONTINUAR, "Continuar conversando");
					
					break;
				case "Trocar para bianual":

						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_BIANUAL, "Poxa, fico feliz pelo interesse no plano bianual, mas no momento não está disponível...");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_BIANUAL, "Mas não se preocupe, pois temos outros planos disponíveis pra você, acesse vitrine.globo.com/bot e faça login, tá bem? 😊");
						a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_BIANUAL, "Feito isso, você já pode ficar tranquilo e curtir o melhor do conteúdo 😍");
						a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_BIANUAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_CONTINUAR, "Continuar conversando");

					break;
			}
		});
		//Globoplay Anual
		Then("valido o texto do botao {string} do fluxo alterar plano com cliente que possui Globoplay Anual", (String botao) -> {
			   
			switch (botao) {
			
			case "Trocar de plano mensal para anual":
					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCAR_MENSAL_ANUAL, "Aproveite o desconto do plano anual e vamos viver juntos e felizes para sempre!"
							+"\n" + "\n" +"Se você é assinante do plano mensal e quer trocar para o plano anual, eu te ensino como:");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCAR_MENSAL_ANUAL, "1. Acesse globo.com/minhaconta e faça seu login."
							+"\n" + "2. Clique no seu produto Globoplay."
							+"\n" + "3. Selecione a opção \"alterar plano\"."
							+"\n" + "4. Você será direcionado para a página de contratação do plano anual. Não esqueça de revisar as informações de pagamento.");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCAR_MENSAL_ANUAL, "Após o encerramento da vigência do seu plano mensal, seu plano mudará automaticamente para o plano anual.");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TROCAR_MENSAL_ANUAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_SIM, "Sim, a resposta foi útil");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_NÃO, "A resposta não atendeu à pergunta");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_CONTINUAR, "Continuar conversando");

				break;

			case "Trocar para Globoplay + canais ao vivo":
				   
				    a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCA_MAISCANAL, "Assinar o Globoplay + canais ao vivo é bem fácil! Olha só:");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCA_MAISCANAL, "1. Acesse vitrine.globo.com/bot e faça login."
				    		+"\n" + "\n" + "2. Depois, é só descer até o fim da página, escolher o seu plano e clicar em \"assine já\".");
				    a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCA_MAISCANAL, "3. Informe os dados de pagamento e finalize sua assinatura."
				    		+"\n" + "\n" +"Feito isso, você já pode curtir o melhor do conteúdo ao vivo 😍");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_MAISCANAIS, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_CONTINUAR, "Continuar conversando");
				break;

			case "Disney+":

				    a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISNEY, "Já vi que você não resistiu à parceria com o Disney+ 😍");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DISNEY, "1. Pra adicionar o Disney+, é só acessar globoplay.com/disneyplus/bot"
				    		+"\n" + "\n" +"2. Depois, clique em ”assine” e faça login, se for preciso."
				    		+"\n" + "\n" +"3. Informe os dados de pagamento e finalize sua contratação.");
				    a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DISNEY, "4. Em seguida, clique na opção “ativar Disney+” para criar seu cadastro no site do Disney+.");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DISNEY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_CONTINUAR, "Continuar conversando");
				
				break;

			case "discovery+":

					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISCOVERY, "Eba! Vou te ajudar a ter o melhor do entretenimento Globoplay e discovery+. Vamos lá? 😁");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DISCOVERY, "1. Para começar, acesse globoplay.com/assine/discoveryplus e faça login."
							+"\n" + "\n" + "2. Depois, clique em “assine já”."
							+"\n" + "\n" + "3. Informe os dados de pagamento e finalize sua contratação.");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DISCOVERY, "4. Em seguida, é só clicar na opção “ativar discovery+”, criar seu cadastro no site do discovery+ e partir pro play 🎉");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DISCOVERY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_CONTINUAR, "Continuar conversando");
				

				break;

			case "Deezer Premium":

					  a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DEEZER, "Como assinante Globoplay, você ganhou 6 meses de Deezer Premium para curtir milhões de músicas, podcasts e playlists, sem anúncios! Legal, né? 😎");
					  a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DEEZER, 
							  "1. Para resgatar seu presente, acesse globoplay.com/assine/deezer "
							  + "\n" + "2. Faça login, se for preciso."
							  + "\n" + "3. Depois, clique em “assine já” e garanta seu Deezer Premium.");
					  a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DEEZER, "Ah! Ao fim dos 6 meses, como assinante Globoplay, você ainda tem um desconto especial. O seu plano Deezer Premium ficará por apenas R$17,90/mês 🎉");
					  a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DEEZER, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_CONTINUAR, "Continuar conversando");
					
				break;

			case "Premiere":
	
					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_PREMIERE, "Já entendi que você quer falar sobre o Premiere, né?!");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_PREMIERE, "Se você quer assinar o combo Globoplay e Premiere, acesse duvidas.globo.com/globoplayepremiere que eu te ensino =)");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_PREMIERE, "Mas se a sua dúvida é algo relacionado a assinatura do Premiere ou alguma dificuldade com o produto, meus amigos especialistas em futebol podem te ajudar. É só clicar em duvidas.globo.com/ajudapremiere");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_PREMIERE, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_CONTINUAR, "Continuar conversando");
				

				break;
				case "Telecine":
	
						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TELECINE, "Poxa, fico feliz pelo seu interesse no Telecine, mas como você já tem o {!NomeProduto}, não é possível trocar sua assinatura...  ");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TELECINE, "Para conhecer os planos disponíveis pra você, acesse vitrine.globo.com/bot e faça login, tá bem? 😊 ");
						a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TELECINE, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_CONTINUAR, "Continuar conversando");
					
					break;
				case "Trocar para bianual":

						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_BIANUAL, "Poxa, fico feliz pelo interesse no plano bianual, mas no momento não está disponível...");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_BIANUAL, "Mas não se preocupe, pois temos outros planos disponíveis pra você, acesse vitrine.globo.com/bot e faça login, tá bem? 😊");
						a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_BIANUAL, "Feito isso, você já pode ficar tranquilo e curtir o melhor do conteúdo 😍");
						a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_BIANUAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_CONTINUAR, "Continuar conversando");

					break;
			}
		
		
		
		});
		
		
		// Globoplay com canal de compra VIVO
		Then("valido o texto do botao {string} do fluxo alterar plano com cliente Globoplay Canal de Compra VIVO", (String botao) -> {

switch (botao) {
			
			case "Trocar de plano mensal para anual":
					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCAR_MENSAL_ANUAL, "Aproveite o desconto do plano anual e vamos viver juntos e felizes para sempre!"
							+"\n" + "\n" +"Se você é assinante do plano mensal e quer trocar para o plano anual, eu te ensino como:");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCAR_MENSAL_ANUAL, "1. Acesse globo.com/minhaconta e faça seu login."
							+"\n" + "2. Clique no seu produto Globoplay."
							+"\n" + "3. Selecione a opção \"alterar plano\"."
							+"\n" + "4. Você será direcionado para a página de contratação do plano anual. Não esqueça de revisar as informações de pagamento.");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCAR_MENSAL_ANUAL, "Após o encerramento da vigência do seu plano mensal, seu plano mudará automaticamente para o plano anual.");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TROCAR_MENSAL_ANUAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_SIM, "Sim, a resposta foi útil");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_NÃO, "A resposta não atendeu à pergunta");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_CONTINUAR, "Continuar conversando");

				break;

			case "Trocar para Globoplay + canais ao vivo":
				   
				    a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCA_MAISCANAL, "Assinar o Globoplay + canais ao vivo é bem fácil! Olha só:");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCA_MAISCANAL, "1. Acesse vitrine.globo.com/bot e faça login."
				    		+"\n" + "\n" + "2. Depois, é só descer até o fim da página, escolher o seu plano e clicar em \"assine já\".");
				    a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCA_MAISCANAL, "3. Informe os dados de pagamento e finalize sua assinatura."
				    		+"\n" + "\n" +"Feito isso, você já pode curtir o melhor do conteúdo ao vivo 😍");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_MAISCANAIS, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_CONTINUAR, "Continuar conversando");
				break;

			case "Disney+":

				 a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISNEY, "Poxa, como sua assinatura foi feita pela Vivo, ainda não é possível adicionar esse produto...");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DISNEY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_CONTINUAR, "Continuar conversando");
				
				break;
		
			case "discovery+":

				a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISCOVERY, "Poxa, como sua assinatura foi feita pela Vivo, ainda não é possível adicionar esse produto...");
			    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DISCOVERY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_SIM, "Sim, a resposta foi útil");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_NÃO, "A resposta não atendeu à pergunta");
			    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_CONTINUAR, "Continuar conversando");

				break;

			case "Deezer Premium":

				 a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DEEZER, "Poxa, como sua assinatura foi feita pela Vivo, ainda não é possível adicionar esse produto...");
				  a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DEEZER, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_CONTINUAR, "Continuar conversando");
				
				break;

			case "Premiere":

					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_PREMIERE, "Já entendi que você quer falar sobre o Premiere, né?!");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_PREMIERE, "Se você quer assinar o combo Globoplay e Premiere, acesse duvidas.globo.com/globoplayepremiere que eu te ensino =)");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_PREMIERE, "Mas se a sua dúvida é algo relacionado a assinatura do Premiere ou alguma dificuldade com o produto, meus amigos especialistas em futebol podem te ajudar. É só clicar em duvidas.globo.com/ajudapremiere");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_PREMIERE, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_CONTINUAR, "Continuar conversando");
				

				break;
				case "Telecine":

						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TELECINE, "Eba! Vou te ajudar a ter o melhor do cinema. Vamos lá? 😁");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TELECINE, "1. Acesse vitrine.globo.com/bot e faça login."
								+"/n"+ "2. Depois, é só descer até o fim da página, escolher o seu plano e clicar em \"assine já\".");
						a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TELECINE, "3. Em seguida, informe os dados de pagamento e finalize sua assinatura."
								+"/n"+ 
								 "Feito isso, é só partir pro play 🎉");
						a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TELECINE, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_CONTINUAR, "Continuar conversando");
					
					break;
				case "Trocar para bianual":

						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_BIANUAL, "Poxa, fico feliz pelo interesse no plano bianual, mas no momento não está disponível...");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_BIANUAL, "Mas não se preocupe, pois temos outros planos disponíveis pra você, acesse vitrine.globo.com/bot e faça login, tá bem? 😊");
						a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_BIANUAL, "Feito isso, você já pode ficar tranquilo e curtir o melhor do conteúdo 😍");
						a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_BIANUAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_CONTINUAR, "Continuar conversando");

					break;
			}
		});
		//Login Globoplay com Canal de compra GOOGLE
		Then("valido o texto do botao {string} do fluxo alterar plano com cliente Globoplay Canal de Compra GOOGLE", (String botao) -> {
switch (botao) {
			
			case "Trocar de plano mensal para anual":
					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCAR_MENSAL_ANUAL, "Aproveite o desconto do plano anual e vamos viver juntos e felizes para sempre!"
							+"\n" + "\n" +"Se você é assinante do plano mensal e quer trocar para o plano anual, eu te ensino como:");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCAR_MENSAL_ANUAL, "1. Acesse globo.com/minhaconta e faça seu login."
							+"\n" + "2. Clique no seu produto Globoplay."
							+"\n" + "3. Selecione a opção \"alterar plano\"."
							+"\n" + "4. Você será direcionado para a página de contratação do plano anual. Não esqueça de revisar as informações de pagamento.");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCAR_MENSAL_ANUAL, "Após o encerramento da vigência do seu plano mensal, seu plano mudará automaticamente para o plano anual.");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TROCAR_MENSAL_ANUAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_SIM, "Sim, a resposta foi útil");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_NÃO, "A resposta não atendeu à pergunta");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_CONTINUAR, "Continuar conversando");

				break;

			case "Trocar para Globoplay + canais ao vivo":
				   
				    a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCA_MAISCANAL, "Como você fez sua assinatura pelo celular, a mudança de plano também precisar ser feita pelo aplicativo... Para mudar para Globoplay + canais  ao vivo, acesse duvidas.globo.com/mudarplano e veja o passo a passo para seguir no app 😬");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_MAISCANAIS, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_CONTINUAR, "Continuar conversando");
				break;

			case "Disney+":

				    a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISNEY, "Já vi que você não resistiu à parceria com o Disney+ 😍");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DISNEY, "1. Pra adicionar o Disney+, é só acessar globoplay.com/disneyplus/bot"
				    		+"\n" + "\n" +"2. Depois, clique em ”assine” e faça login, se for preciso."
				    		+"\n" + "\n" +"3. Informe os dados de pagamento e finalize sua contratação.");
				    a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DISNEY, "4. Em seguida, clique na opção “ativar Disney+” para criar seu cadastro no site do Disney+.");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DISNEY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_CONTINUAR, "Continuar conversando");
				
				break;

			case "discovery+":

					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISCOVERY, "Eba! Vou te ajudar a ter o melhor do entretenimento Globoplay e discovery+. Vamos lá? 😁");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DISCOVERY, "1. Para começar, acesse globoplay.com/assine/discoveryplus e faça login."
							+"\n" + "\n" + "2. Depois, clique em “assine já”."
							+"\n" + "\n" + "3. Informe os dados de pagamento e finalize sua contratação.");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DISCOVERY, "4. Em seguida, é só clicar na opção “ativar discovery+”, criar seu cadastro no site do discovery+ e partir pro play 🎉");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DISCOVERY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_CONTINUAR, "Continuar conversando");
				

				break;

			case "Deezer Premium":

					  a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DEEZER, "Como assinante Globoplay, você ganhou 6 meses de Deezer Premium para curtir milhões de músicas, podcasts e playlists, sem anúncios! Legal, né? 😎");
					  a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DEEZER, 
							  "1. Para resgatar seu presente, acesse globoplay.com/assine/deezer "
							  + "\n" + "2. Faça login, se for preciso."
							  + "\n" + "3. Depois, clique em “assine já” e garanta seu Deezer Premium.");
					  a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DEEZER, "Ah! Ao fim dos 6 meses, como assinante Globoplay, você ainda tem um desconto especial. O seu plano Deezer Premium ficará por apenas R$17,90/mês 🎉");
					  a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DEEZER, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_CONTINUAR, "Continuar conversando");
					
				break;

			case "Premiere":
	
					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_PREMIERE, "Já entendi que você quer falar sobre o Premiere, né?!");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_PREMIERE, "Se você quer assinar o combo Globoplay e Premiere, acesse duvidas.globo.com/globoplayepremiere que eu te ensino =)");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_PREMIERE, "Mas se a sua dúvida é algo relacionado a assinatura do Premiere ou alguma dificuldade com o produto, meus amigos especialistas em futebol podem te ajudar. É só clicar em duvidas.globo.com/ajudapremiere");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_PREMIERE, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_CONTINUAR, "Continuar conversando");
				

				break;
				case "Telecine":
	
						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TELECINE, "Eba! Vou te ajudar a ter o melhor do cinema. Vamos lá? 😁");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TELECINE, "1. Acesse vitrine.globo.com/bot e faça login."
								+ "/n"+ "2. Depois, é só descer até o fim da página, escolher o seu plano e clicar em \"assine já\".");
						a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TELECINE, "3. Em seguida, informe os dados de pagamento e finalize sua assinatura."
								+ "/n"
								+ "Feito isso, é só partir pro play 🎉");
						a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TELECINE, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_CONTINUAR, "Continuar conversando");
					
					break;
				case "Trocar para bianual":

						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_BIANUAL, "Poxa, fico feliz pelo interesse no plano bianual, mas no momento não está disponível...");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_BIANUAL, "Mas não se preocupe, pois temos outros planos disponíveis pra você, acesse vitrine.globo.com/bot e faça login, tá bem? 😊");
						a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_BIANUAL, "Feito isso, você já pode ficar tranquilo e curtir o melhor do conteúdo 😍");
						a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_BIANUAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_CONTINUAR, "Continuar conversando");

					break;
			}
		
		});
//Login Globoplay com Canal de compra APPLE
		Then("valido o texto do botao {string} do fluxo alterar plano com cliente Globoplay Canal de Compra APPLE", (String botao) -> {
switch (botao) {
			
			case "Trocar de plano mensal para anual":
					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCAR_MENSAL_ANUAL, "Aproveite o desconto do plano anual e vamos viver juntos e felizes para sempre!"
							+"\n" + "\n" +"Se você é assinante do plano mensal e quer trocar para o plano anual, eu te ensino como:");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCAR_MENSAL_ANUAL, "1. Acesse globo.com/minhaconta e faça seu login."
							+"\n" + "2. Clique no seu produto Globoplay."
							+"\n" + "3. Selecione a opção \"alterar plano\"."
							+"\n" + "4. Você será direcionado para a página de contratação do plano anual. Não esqueça de revisar as informações de pagamento.");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCAR_MENSAL_ANUAL, "Após o encerramento da vigência do seu plano mensal, seu plano mudará automaticamente para o plano anual.");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TROCAR_MENSAL_ANUAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_SIM, "Sim, a resposta foi útil");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_NÃO, "A resposta não atendeu à pergunta");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_CONTINUAR, "Continuar conversando");

				break;

			case "Trocar para Globoplay + canais ao vivo":
				   
				    a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCA_MAISCANAL, "Como você fez sua assinatura pelo celular, a mudança de plano também precisar ser feita pelo aplicativo... Para mudar para Globoplay + canais  ao vivo, acesse duvidas.globo.com/mudarplano e veja o passo a passo para seguir no app 😬");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_MAISCANAIS, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_CONTINUAR, "Continuar conversando");
				break;

			case "Disney+":
				Thread.sleep(20000);
				    a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISNEY, "Já vi que você não resistiu à parceria com o Disney+ 😍");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DISNEY, "1. Pra adicionar o Disney+, é só acessar globoplay.com/disneyplus/bot"
				    		+"\n" + "\n" + "2. Depois, clique em \"assine\" e faça login, se for preciso."
				    		+"\n" + "\n" +"3. Informe os dados de pagamento e finalize sua contratação.");
				    a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DISNEY, "4. Em seguida, clique na opção \"ativar Disney+\" para criar seu cadastro no site do Disney+.");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DISNEY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_CONTINUAR, "Continuar conversando");
				
				break;

			case "discovery+":

					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISCOVERY, "Eba! Vou te ajudar a ter o melhor do entretenimento Globoplay e discovery+. Vamos lá? 😁");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DISCOVERY, "1. Para começar, acesse globoplay.com/assine/discoveryplus e faça login."
							+"\n" + "\n" + "2. Depois, clique em “assine já”."
							+"\n" + "\n" + "3. Informe os dados de pagamento e finalize sua contratação.");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DISCOVERY, "4. Em seguida, é só clicar na opção “ativar discovery+”, criar seu cadastro no site do discovery+ e partir pro play 🎉");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DISCOVERY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_CONTINUAR, "Continuar conversando");
				

				break;

			case "Deezer Premium":

					  a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DEEZER, "Como assinante Globoplay, você ganhou 6 meses de Deezer Premium para curtir milhões de músicas, podcasts e playlists, sem anúncios! Legal, né? 😎");
					  a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DEEZER, 
							  "1. Para resgatar seu presente, acesse globoplay.com/assine/deezer "
							  + "\n" + "2. Faça login, se for preciso."
							  + "\n" + "3. Depois, clique em “assine já” e garanta seu Deezer Premium.");
					  a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_DEEZER, "Ah! Ao fim dos 6 meses, como assinante Globoplay, você ainda tem um desconto especial. O seu plano Deezer Premium ficará por apenas R$17,90/mês 🎉");
					  a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_DEEZER, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_CONTINUAR, "Continuar conversando");
					
				break;

			case "Premiere":
	
					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_PREMIERE, "Já entendi que você quer falar sobre o Premiere, né?!");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_PREMIERE, "Se você quer assinar o combo Globoplay e Premiere, acesse duvidas.globo.com/globoplayepremiere que eu te ensino =)");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_PREMIERE, "Mas se a sua dúvida é algo relacionado a assinatura do Premiere ou alguma dificuldade com o produto, meus amigos especialistas em futebol podem te ajudar. É só clicar em duvidas.globo.com/ajudapremiere");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_PREMIERE, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_SIM, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_NÃO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_CONTINUAR, "Continuar conversando");
				

				break;
				case "Telecine":
	
						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TELECINE, "Eba! Vou te ajudar a ter o melhor do cinema. Vamos lá? 😁");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TELECINE, "1. Acesse vitrine.globo.com/bot e faça login."
								+"\n"+ "2. Depois, é só descer até o fim da página, escolher o seu plano e clicar em \"assine já\".");
						a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TELECINE, "3. Em seguida, informe os dados de pagamento e finalize sua assinatura."
								+ "\n"+"\n"
								+ "Feito isso, é só partir pro play 🎉");
						a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TELECINE, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_CONTINUAR, "Continuar conversando");
					
					break;
				case "Trocar para bianual":

						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_BIANUAL, "Poxa, fico feliz pelo interesse no plano bianual, mas no momento não está disponível...");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_BIANUAL, "Mas não se preocupe, pois temos outros planos disponíveis pra você, acesse vitrine.globo.com/bot e faça login, tá bem? 😊");
						a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_BIANUAL, "Feito isso, você já pode ficar tranquilo e curtir o melhor do conteúdo 😍");
						a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_BIANUAL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_SIM, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_NÃO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_CONTINUAR, "Continuar conversando");

					break;
			}
		
		});
		
		// *********Cliente Globoplay Suspenso por saldo*****
		
		Then("digito alterar plano no cliente suspenso por saldo", () -> {
			 a.clicar(PageAlterarPlano.TXT_TEXTAREABOT);
			 a.escrever(PageAlterarPlano.TXT_TEXTAREABOT, "alterar plano");
			 a.acionarEnter(PageAlterarPlano.TXT_TEXTAREABOT);
			 a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_SUSPENSO_SALDO, "Pra te ajudar com isso, é só selecionar uma opção ou um produto abaixo.");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_TROCA_MENSAL_ANUAL_SUSPENSO_SALDO,"Trocar de plano mensal para anual");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_TROCA_MAISCANAIS_SUSPENSO_SALDO, "Trocar para Globoplay + canais ao vivo");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_DISNEY_SUSPENSO_SALDO, "Disney+");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_DISCOVERY_SUSPENSO_SALDO,"discovery+");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_DEEZER_SUSPENSO_SALDO, "Deezer Premium");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_PREMIERE_SUSPENSO_SALDO, "Premiere");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_TELECINE_SUSPENSO_SALDO, "Telecine");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_BIANUAL_SUSPENSO_SALDO, "Trocar para bianual"); 
		});
		Given("que clico no botao {string} do menu do fluxo alterar plano cliente Globoplay Suspenso por Saldo", (String botao) -> {
			switch (botao) {
			
			case "Trocar de plano mensal para anual":
				Thread.sleep(20000);
				a.clicar(PageAlterarPlano.BTN_ALTERAR_TROCA_MENSAL_ANUAL_SUSPENSO_SALDO);

				break;

			case "Trocar para Globoplay + canais ao vivo":
				Thread.sleep(20000);
				a.clicar(PageAlterarPlano.BTN_ALTERAR_TROCA_MAISCANAIS_SUSPENSO_SALDO);

				break;

			case "Disney+":
				Thread.sleep(20000);
				a.clicar(PageAlterarPlano.BTN_ALTERAR_DISNEY_SUSPENSO_SALDO);

				break;

			case "discovery+":
				Thread.sleep(20000);
				a.clicar(PageAlterarPlano.BTN_ALTERAR_DISCOVERY_SUSPENSO_SALDO);

				break;

			case "Deezer Premium":
				Thread.sleep(20000);
				a.clicar(PageAlterarPlano.BTN_ALTERAR_DEEZER_SUSPENSO_SALDO);

				break;

			case "Premiere":
				Thread.sleep(20000);
				a.clicar(PageAlterarPlano.BTN_ALTERAR_PREMIERE_SUSPENSO_SALDO);

				break;
				case "Telecine":
					Thread.sleep(20000);
					a.clicar(PageAlterarPlano.BTN_ALTERAR_TELECINE_SUSPENSO_SALDO);

					break;
				case "Trocar para bianual":
					Thread.sleep(20000);
					a.clicar(PageAlterarPlano.BTN_ALTERAR_BIANUAL_SUSPENSO_SALDO);

					break;
			}
		});
		Then("valido o texto do botao {string} do fluxo alterar plano com cliente Globoplay Suspenso por Saldo", (String botao) -> {
switch (botao) {

			
			case "Trocar de plano mensal para anual":
					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCAR_MENSAL_ANUAL_SUSPENSO_SALDO, "Aproveite o desconto do plano anual e vamos viver juntos e felizes para sempre!"
							+"\n" + "\n" +"Se você é assinante do plano mensal e quer trocar para o plano anual, eu te ensino como:");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCAR_MENSAL_ANUAL_SUSPENSO_SALDO, "1. Acesse globo.com/minhaconta e faça seu login."
							+"\n" + "2. Clique no seu produto Globoplay."
							+"\n" + "3. Selecione a opção \"alterar plano\"."
							+"\n" + "4. Você será direcionado para a página de contratação do plano anual. Não esqueça de revisar as informações de pagamento.");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCAR_MENSAL_ANUAL_SUSPENSO_SALDO, "Após o encerramento da vigência do seu plano mensal, seu plano mudará automaticamente para o plano anual.");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TROCAR_MENSAL_ANUAL_SUSPENSO_SALDO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_SIM_SUSPENSO_SALDO, "Sim, a resposta foi útil");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_NÃO_SUSPENSO_SALDO, "A resposta não atendeu à pergunta");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_CONTINUAR_SUSPENSO_SALDO, "Continuar conversando");

				break;

			case "Trocar para Globoplay + canais ao vivo":
				   
				 a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCA_MAISCANAL_SUSPENSO_SALDO, "Assinar o Globoplay + canais ao vivo é bem fácil! Olha só:");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCA_MAISCANAL_SUSPENSO_SALDO, "1. Acesse vitrine.globo.com/bot e faça login."
				    		+"\n" + "\n" + "2. Depois, é só descer até o fim da página, escolher o seu plano e clicar em \"assine já\".");
				    a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCA_MAISCANAL_SUSPENSO_SALDO, "3. Informe os dados de pagamento e finalize sua assinatura."
				    		+"\n" + "\n" +"Feito isso, você já pode curtir o melhor do conteúdo ao vivo 😍");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_MAISCANAIS_SUSPENSO_SALDO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_SIM_SUSPENSO_SALDO, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_NÃO_SUSPENSO_SALDO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_CONTINUAR_SUSPENSO_SALDO, "Continuar conversando");
				break;


			case "Disney+":

				    a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISNEY_SUSPENSO_SALDO, "Olha, como a sua assinatura está suspensa, só é possível adicionar o Disney+ depois de pagar a fatura que está em aberto...");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DISNEY_SUSPENSO_SALDO, "Precisa de ajuda com o pagamento da sua fatura?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_SIM_SUSPENSO_SALDO, "Sim, quero ajuda");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_NÃO_SUSPENSO_SALDO, "Não é necessário");

				
				break;

			case "discovery+":

				 a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISCOVERY_SUSPENSO_SALDO, "Olha, como a sua assinatura está suspensa, só é possível adicionar o discovery+ depois de pagar a fatura que está em aberto...");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DISCOVERY_SUSPENSO_SALDO, "Precisa de ajuda com o pagamento da sua fatura?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_SIM_SUSPENSO_SALDO, "Sim, quero ajuda");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_NÃO_SUSPENSO_SALDO, "Não é necessário");

				break;

			case "Deezer Premium":

				 a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DEEZER_SUSPENSO_SALDO, "Olha, como a sua assinatura está suspensa, só é possível adicionar o Deezer Premium depois de pagar a fatura que está em aberto...");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DEEZER_SUSPENSO_SALDO, "Precisa de ajuda com o pagamento da sua fatura?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_SIM_SUSPENSO_SALDO, "Sim, quero ajuda");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_NÃO_SUSPENSO_SALDO, "Não é necessário");

				break;

			case "Premiere":
	
					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_PREMIERE_SUSPENSO_SALDO, "Já entendi que você quer falar sobre o Premiere, né?!");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_PREMIERE_SUSPENSO_SALDO, "Se você quer assinar o combo Globoplay e Premiere, acesse duvidas.globo.com/globoplayepremiere que eu te ensino =)");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_PREMIERE_SUSPENSO_SALDO, "Mas se a sua dúvida é algo relacionado a assinatura do Premiere ou alguma dificuldade com o produto, meus amigos especialistas em futebol podem te ajudar. É só clicar em duvidas.globo.com/ajudapremiere");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_PREMIERE_SUSPENSO_SALDO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_SIM_SUSPENSO_SALDO, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_NÃO_SUSPENSO_SALDO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_CONTINUAR_SUSPENSO_SALDO, "Continuar conversando");
				

				break;
				case "Telecine":
	
						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TELECINE_SUSPENSO_SALDO, "Eba! Vou te ajudar a ter o melhor do cinema. Vamos lá? 😁");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TELECINE_SUSPENSO_SALDO, "1. Acesse vitrine.globo.com/bot e faça login."
								+"\n"+ "2. Depois, é só descer até o fim da página, escolher o seu plano e clicar em \"assine já\".");
						a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TELECINE_SUSPENSO_SALDO, "3. Em seguida, informe os dados de pagamento e finalize sua assinatura."
								+ "\n"+"\n"
								+ "Feito isso, é só partir pro play 🎉");
						a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TELECINE_SUSPENSO_SALDO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_SIM_SUSPENSO_SALDO, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_NÃO_SUSPENSO_SALDO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_CONTINUAR_SUSPENSO_SALDO, "Continuar conversando");
					
					break;
				case "Trocar para bianual":

						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_BIANUAL_SUSPENSO_SALDO, "Poxa, fico feliz pelo interesse no plano bianual, mas no momento não está disponível...");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_BIANUAL_SUSPENSO_SALDO, "Mas não se preocupe, pois temos outros planos disponíveis pra você, acesse vitrine.globo.com/bot e faça login, tá bem? 😊");
						a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_BIANUAL_SUSPENSO_SALDO, "Feito isso, você já pode ficar tranquilo e curtir o melhor do conteúdo 😍");
						a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_BIANUAL_SUSPENSO_SALDO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_SIM_SUSPENSO_SALDO, "Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_NÃO_SUSPENSO_SALDO, "A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_CONTINUAR_SUSPENSO_SALDO, "Continuar conversando");

					break;
			}
		});
		// *********Cliente Globoplay Suspenso por Cadastro*****
		
		Then("digito alterar plano no cliente suspenso por Cadastro", () -> {
			 a.clicar(PageAlterarPlano.TXT_TEXTAREABOT);
			 a.escrever(PageAlterarPlano.TXT_TEXTAREABOT, "alterar plano");
			 a.acionarEnter(PageAlterarPlano.TXT_TEXTAREABOT);
			 a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_SUSPENSO_CADASTRO, "Pra te ajudar com isso, é só selecionar uma opção ou um produto abaixo.");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_TROCA_MENSAL_ANUAL_SUSPENSO_CADASTRO,"Trocar de plano mensal para anual");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_TROCA_MAISCANAIS_SUSPENSO_CADASTRO, "Trocar para Globoplay + canais ao vivo");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_DISNEY_SUSPENSO_CADASTRO, "Disney+");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_DISCOVERY_SUSPENSO_CADASTRO,"discovery+");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_DEEZER_SUSPENSO_CADASTRO, "Deezer Premium");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_PREMIERE_SUSPENSO_CADASTRO, "Premiere");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_TELECINE_SUSPENSO_CADASTRO, "Telecine");
				a.validarTextoContido(PageAlterarPlano.BTN_ALTERAR_BIANUAL_SUSPENSO_CADASTRO, "Trocar para bianual"); 
		});
	

		Given("que clico no botao {string} do menu do fluxo alterar plano cliente Globoplay Suspenso por Cadastro", (String botao) -> {
			switch (botao) {
			
			case "Trocar de plano mensal para anual":
				Thread.sleep(20000);
				a.clicar(PageAlterarPlano.BTN_ALTERAR_TROCA_MENSAL_ANUAL_SUSPENSO_SALDO);

				break;

			case "Trocar para Globoplay + canais ao vivo":
				Thread.sleep(20000);
				a.clicar(PageAlterarPlano.BTN_ALTERAR_TROCA_MAISCANAIS_SUSPENSO_SALDO);

				break;

			case "Disney+":
				Thread.sleep(20000);
				a.clicar(PageAlterarPlano.BTN_ALTERAR_DISNEY_SUSPENSO_SALDO);

				break;

			case "discovery+":
				Thread.sleep(20000);
				a.clicar(PageAlterarPlano.BTN_ALTERAR_DISCOVERY_SUSPENSO_SALDO);

				break;

			case "Deezer Premium":
				Thread.sleep(20000);
				a.clicar(PageAlterarPlano.BTN_ALTERAR_DEEZER_SUSPENSO_SALDO);

				break;

			case "Premiere":
				Thread.sleep(20000);
				a.clicar(PageAlterarPlano.BTN_ALTERAR_PREMIERE_SUSPENSO_SALDO);

				break;
				case "Telecine":
					Thread.sleep(20000);
					a.clicar(PageAlterarPlano.BTN_ALTERAR_TELECINE_SUSPENSO_SALDO);

					break;
				case "Trocar para bianual":
					Thread.sleep(20000);
					a.clicar(PageAlterarPlano.BTN_ALTERAR_BIANUAL_SUSPENSO_SALDO);

					break;
			}
		});

		Then("valido o texto do botao {string} do fluxo alterar plano com cliente Globoplay Suspenso por Cadastro", (String botao) -> {
switch (botao) {

			
			case "Trocar de plano mensal para anual":
					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCAR_MENSAL_ANUAL_SUSPENSO_CADASTRO, "Aproveite o desconto do plano anual e vamos viver juntos e felizes para sempre!"
							+"\n" + "\n" +"Se você é assinante do plano mensal e quer trocar para o plano anual, eu te ensino como:");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCAR_MENSAL_ANUAL_SUSPENSO_CADASTRO, "1. Acesse globo.com/minhaconta e faça seu login."
							+"\n" + "2. Clique no seu produto Globoplay."
							+"\n" + "3. Selecione a opção \"alterar plano\"."
							+"\n" + "4. Você será direcionado para a página de contratação do plano anual. Não esqueça de revisar as informações de pagamento.");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCAR_MENSAL_ANUAL_SUSPENSO_CADASTRO, "Após o encerramento da vigência do seu plano mensal, seu plano mudará automaticamente para o plano anual.");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_TROCAR_MENSAL_ANUAL_SUSPENSO_CADASTRO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_SIM_SUSPENSO_CADASTRO, "Sim, a resposta foi útil");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_NÃO_SUSPENSO_CADASTRO, "A resposta não atendeu à pergunta");
					a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MENSALANUAL_CONTINUAR_SUSPENSO_CADASTRO, "Continuar conversando");

				break;

			case "Trocar para Globoplay + canais ao vivo":
				   
				 a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TROCA_MAISCANAL_SUSPENSO_CADASTRO, "Assinar o Globoplay + canais ao vivo é bem fácil! Olha só:");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TROCA_MAISCANAL_SUSPENSO_CADASTRO, "1. Acesse vitrine.globo.com/bot e faça login."
				    		+"\n" + "\n" + "2. Depois, é só descer até o fim da página, escolher o seu plano e clicar em \"assine já\".");
				    a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_TROCA_MAISCANAL_SUSPENSO_CADASTRO, "3. Informe os dados de pagamento e finalize sua assinatura."
				    		+"\n" + "\n" +"Feito isso, você já pode curtir o melhor do conteúdo ao vivo 😍");
				    a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_MAISCANAIS_SUSPENSO_CADASTRO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_SIM_SUSPENSO_CADASTRO, "Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_NÃO_SUSPENSO_CADASTRO, "A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_MAISCANAIS_CONTINUAR_SUSPENSO_CADASTRO, "Continuar conversando");
				break;


			case "Disney+":

				    a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISNEY_SUSPENSO_CADASTRO, "Olha, como a sua assinatura está suspensa, só é possível adicionar o Disney+ depois de pagar a fatura que está em aberto e alterar seus dados de cobrança.");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DISNEY_SUSPENSO_CADASTRO, "Precisa de ajuda com o pagamento da sua fatura?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_SIM_SUSPENSO_CADASTRO, "Sim, quero ajuda");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISNEY_NÃO_SUSPENSO_CADASTRO, "Não é necessário");

				
				break;

			case "discovery+":

				 a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DISCOVERY_SUSPENSO_CADASTRO, "Olha, como a sua assinatura está suspensa, só é possível adicionar o discovery+ depois de pagar a fatura que está em aberto e alterar seus dados de cobrança.");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DISCOVERY_SUSPENSO_CADASTRO, "Precisa de ajuda com o pagamento da sua fatura?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_SIM_SUSPENSO_CADASTRO, "Sim, quero ajuda");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DISCOVERY_NÃO_SUSPENSO_CADASTRO, "Não é necessário");

				break;

			case "Deezer Premium":

				 a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_DEEZER_SUSPENSO_CADASTRO, "Olha, como a sua assinatura está suspensa, só é possível adicionar o Deezer Premium depois de pagar a fatura que está em aberto e alterar seus dados de cobrança.");
				    a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_DEEZER_SUSPENSO_CADASTRO, "Precisa de ajuda com o pagamento da sua fatura?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_SIM_SUSPENSO_CADASTRO, "Sim, quero ajuda");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_DEEZER_NÃO_SUSPENSO_CADASTRO, "Não é necessário");

				break;

			case "Premiere":
	
					a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_PREMIERE_SUSPENSO_CADASTRO, "Já entendi que você quer falar sobre o Premiere, né?!");
					a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_PREMIERE_SUSPENSO_CADASTRO, "Se você quer assinar o combo Globoplay e Premiere, acesse duvidas.globo.com/globoplayepremiere que eu te ensino =)");
					a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_PREMIERE_SUSPENSO_CADASTRO, "Mas se a sua dúvida é algo relacionado a assinatura do Premiere ou alguma dificuldade com o produto, meus amigos especialistas em futebol podem te ajudar. É só clicar em duvidas.globo.com/ajudapremiere");
					a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_PREMIERE_SUSPENSO_CADASTRO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_SIM_SUSPENSO_CADASTRO, "🙂 Sim, a resposta foi útil");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_NÃO_SUSPENSO_CADASTRO, "😕 A resposta não atendeu à pergunta");
				    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_PREMIERE_CONTINUAR_SUSPENSO_CADASTRO, "💬 Continuar conversando");
				

				break;
				case "Telecine":
	
						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_TELECINE_SUSPENSO_CADASTRO, "Olha, como a sua assinatura está suspensa, só é possível adicionar o discovery+ depois de pagar a fatura que está em aberto e alterar seus dados de cobrança.");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_TELECINE_SUSPENSO_CADASTRO, "Precisa de ajuda com o pagamento da sua fatura?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_SIM_SUSPENSO_CADASTRO, "Sim, quero ajuda");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_TELECINE_NÃO_SUSPENSO_CADASTRO, "Não é necessário");

					
					break;
				case "Trocar para bianual":

						a.validarTextoContido(PageAlterarPlano.BL_UM_ALTERAR_BIANUAL_SUSPENSO_CADASTRO, "Poxa, fico feliz pelo interesse no plano bianual, mas no momento não está disponível...");
						a.validarTextoContido(PageAlterarPlano.BL_DOIS_ALTERAR_BIANUAL_SUSPENSO_CADASTRO, "Mas não se preocupe, pois temos outros planos disponíveis pra você, acesse vitrine.globo.com/bot e faça login, tá bem? 😊");
						a.validarTextoContido(PageAlterarPlano.BL_TRES_ALTERAR_BIANUAL_SUSPENSO_CADASTRO, "Feito isso, você já pode ficar tranquilo e curtir o melhor do conteúdo 😍");
						a.validarTextoContido(PageAlterarPlano.BL_ALTERAR_AJUDA_BIANUAL_SUSPENSO_CADASTRO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_SIM_SUSPENSO_CADASTRO, "🙂 Sim, a resposta foi útil");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_NÃO_SUSPENSO_CADASTRO, "😕 A resposta não atendeu à pergunta");
					    a.validarTextoContido(PageAlterarPlano.BT_ALTERAR_AJUDA_BIANUAL_CONTINUAR_SUSPENSO_CADASTRO, "💬 Continuar conversando");

					break;
			}
		});



}
}
