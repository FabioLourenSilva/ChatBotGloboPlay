package com.globobot.steps;

import com.globo.pages.PageAcesso;
import com.globo.pages.PageAlterarPlano;
import com.globo.pages.PageEsqueciEmail;
import com.globo.pages.PagePagamento;
import com.globobot.action.InteracaoWeb;

import cucumber.api.java8.En;

public class StepDefinitionsAcesso implements En{
			
		InteracaoWeb a = new InteracaoWeb();
		
		public StepDefinitionsAcesso(){
			
			Then("digito Acesso", () -> {
				Thread.sleep(20000);
					 a.clicar(PageAcesso.TXT_TEXTAREABOT);
					 a.escrever(PageAcesso.TXT_TEXTAREABOT, "Acesso");
					 a.acionarEnter(PageAlterarPlano.TXT_TEXTAREABOT);
					 a.validarTextoContido(PageAcesso. BL_UM_ACESSO, "Pra eu te entender melhor, selecione uma das opções abaixo ou reescreva sua dúvida 🙂");
					 a.validarTextoContido(PageAcesso.BT_ACESSO_ERRO_FAZER_LOGIN, "Erro ao fazer login");
					 a.validarTextoContido(PageAcesso.BT_ACESSO_NAO_AUTORIZADO, "Acesso não autorizado");
					 a.validarTextoContido(PageAcesso.BT_ACESSO_LOGIN_FACEBOOK, "Fazer login com Facebook");
					 a.validarTextoContido(PageAcesso.BT_ACESSO_EMAIL_VALIDACAO, "E-mail de validação");
					 a.validarTextoContido(PageAcesso.BT_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY, "Não consigo acessar Disney+");
					 a.validarTextoContido(PageAcesso.BT_ACESSO_COMO_ASSISTIR_DISNEY, "Como assistir o Disney+");
					
				});

			Given("que clico no botao {string} do menu do fluxo acesso", (String botao) -> {
				switch (botao) {
				// texto na step de esqueci e-mail
				case "Erro ao fazer login":
					Thread.sleep(20000);
					a.clicar(PageAcesso.BT_ACESSO_ERRO_FAZER_LOGIN);

					break;

				case "Acesso não autorizado":
					Thread.sleep(20000);
					a.clicar(PageAcesso.BT_ACESSO_NAO_AUTORIZADO);

					break;

				case "Fazer login com Facebook":
					Thread.sleep(20000);
					a.clicar(PageAcesso.BT_ACESSO_LOGIN_FACEBOOK);

					break;

				case "E-mail de validação":
					Thread.sleep(20000);
					a.clicar(PageAcesso.BT_ACESSO_EMAIL_VALIDACAO);

					break;

				case "Não consigo acessar Disney+":
					Thread.sleep(20000);
					a.clicar(PageAcesso.BT_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY);

					break;

				case "Como assistir o Disney+ ":
					Thread.sleep(20000);
					a.clicar(PageAcesso.BT_ACESSO_COMO_ASSISTIR_DISNEY);

					break;
				}
			});
			
			Then("valido o texto do botao {string} do fluxo acesso", (String botao) -> {
				switch (botao) {
				
				case "Erro ao fazer login":	
					a.validarTextoContido(PageEsqueciEmail.BL_ACESSO_UM_ESQUECI_EMAIL, "Sem problemas, João! O seu e-mail de acesso é glb***@mai****.com e se você precisa recuperar sua senha, é só clicar em globo.com/senha para gerar uma nova 🙂");
					a.validarTextoContido(PageEsqueciEmail.BL_ACESSO_AJUDA_ESQUECI_EMAIL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					  a.validarTextoContido(PageEsqueciEmail.BT_ACESSO_AJUDA_ESQUECI_EMAIL_SIM, "Sim, a resposta foi útil");
					  a.validarTextoContido(PageEsqueciEmail.BT_ACESSO_AJUDA_ESQUECI_EMAIL_NÃO, "A resposta não atendeu à pergunta");
					  a.validarTextoContido(PageEsqueciEmail.BT_ACESSO_AJUDA_ESQUECI_EMAIL_CONTINUAR, "Continuar conversando");
						break;
				
				case "Acesso não autorizado":
					a.validarTextoContido(PageAcesso.BL_UM_ACESSO_NAO_AUTORIZADO, "A gente vai te ajudar com a dificuldade de \"Sinto muito, seu acesso não foi autorizado\".");
						a.validarTextoContido(PageAcesso.BL_DOIS_ACESSO_NAO_AUTORIZADO, "Esse erro pode ocorrer quando você digitou algumas vezes o e-mail/senha errados. Se isso aconteceu, é preciso que você aguarde 2 horas para voltar acessar os conteúdos novamente.");
						a.validarTextoContido(PageAcesso.BL_TRES_ACESSO_NAO_AUTORIZADO, "Mas se você já aguardou as 2 horas e mesmo assim está com o erro, vai precisar alterar a sua senha. Para isso, acesse duvidas.globo.com/recuperarsenha");
						a.validarTextoContido(PageAcesso.BL_AJUDA_ACESSO_NAO_AUTORIZADO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
						a.validarTextoContido(PageAcesso.BT_AJUDA_ACESSO_NAO_AUTORIZADO_SIM, "Sim, a resposta foi útil");
						a.validarTextoContido(PageAcesso.BT_AJUDA_ACESSO_NAO_AUTORIZADO_NÃO, "A resposta não atendeu à pergunta");
						a.validarTextoContido(PageAcesso.BT_AJUDA_ACESSO_NAO_AUTORIZADO_CONTINUAR, "Continuar conversando");

					break;

				case "Fazer login com Facebook":
					
					    a.validarTextoContido(PageAcesso.BL_UM_ACESSO_LOGIN_FACEBOOK, "Pra fazer login usando a sua conta do Facebook ou Google, é só escolher a opção de entrar com Facebook ou Google, logo na tela de login.");
					    a.validarTextoContido(PageAcesso.BL_DOIS_ACESSO_LOGIN_FACEBOOK, "Se você ainda não associou seu e-mail, é só clicar em duvidas.globo.com/logincomsociais que eu explico pra você.");
					    a.validarTextoContido(PageAcesso.BL_TRES_ACESSO_LOGIN_FACEBOOK, "Mas, se você deseja recuperar sua senha do Globoplay, é só acessar duvidas.globo.com/recuperarsenha para gerar uma nova.");
					    a.validarTextoContido(PageAcesso.BL_AJUDA_ACESSO_LOGIN_FACEBOOK, "Agora me diz, te ajudei ou te ajudo em algo mais?");
						a.validarTextoContido(PageAcesso.BT_AJUDA_ACESSO_LOGIN_FACEBOOK_SIM, "Sim, a resposta foi útil");
						a.validarTextoContido(PageAcesso.BT_AJUDA_ACESSO_LOGIN_FACEBOOK_NÃO, "A resposta não atendeu à pergunta");
						a.validarTextoContido(PageAcesso.BT_AJUDA_ACESSO_LOGIN_FACEBOOK_CONTINUAR, "Continuar conversando");
					

					break;

				case "E-mail de validação":

						    a.validarTextoContido(PageAcesso.BL_UM_ACESSO_EMAIL_VALIDACAO, "Assim que você faz o seu cadastro é preciso validar e confirmar o seu e-mail.");
						    a.validarTextoContido(PageAcesso.BL_DOIS_ACESSO_EMAIL_VALIDACAO, "Se ainda não confirmou, eu te ensino:"
						    		+"\n"+ "1º- No seu e-mail, haverá uma mensagem, com o assunto Clique para ativar sua conta. "
						    		+"\n"+ "2º- Para validar, é só clicar no botão Confirmar e-mail.");
						    a.validarTextoContido(PageAcesso.BL_TRES_ACESSO_EMAIL_VALIDACAO, "Se não estiver achando o e-mail, procure na sua caixa de spam ou acesse minhacglobo.com/minhaconta e, na tela de autenticação, clique em \"reenviar e-mail\".");
						    a.validarTextoContido(PageAcesso.BL_AJUDA_ACESSO_EMAIL_VALIDACAO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
							a.validarTextoContido(PageAcesso.BT_AJUDA_ACESSO_EMAIL_VALIDACAO_SIM, "Sim, a resposta foi útil");
							a.validarTextoContido(PageAcesso.BT_AJUDA_ACESSO_EMAIL_VALIDACAO_NÃO, "A resposta não atendeu à pergunta");
							a.validarTextoContido(PageAcesso.BT_AJUDA_ACESSO_EMAIL_VALIDACAO_CONTINUAR, "Continuar conversando");
				

					break;

				case "Não consigo acessar Disney+":
;
					    a.validarTextoContido(PageAcesso.BL_UM_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY, "Assim que você faz o seu cadastro é preciso validar e confirmar o seu e-mail.");
					    a.validarTextoContido(PageAcesso.BL_DOIS_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY, "Se ainda não confirmou, eu te ensino:"
					    		+"\n"+ "1. No seu e-mail, haverá uma mensagem, com o assunto \"clique para ativar sua conta\"."
					    		+"\n"+ "2. Para validar, é só clicar no botão \"confirmar\" do e-mail.");
					    a.validarTextoContido(PageAcesso.BL_TRES_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY, "Se não estiver achando o e-mail, procure na sua caixa de spam ou acesse globo.com/minhaconta e, na tela de autenticação, clique em \"reenviar e-mail\".");
					    a.validarTextoContido(PageAcesso.BL_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
						a.validarTextoContido(PageAcesso.BT_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_SIM, "Sim, a resposta foi útil");
						a.validarTextoContido(PageAcesso.BT_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_NÃO, "A resposta não atendeu à pergunta");
						a.validarTextoContido(PageAcesso.BT_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_CONTINUAR, "Continuar conversando");
				
					break;

				case "Como assistir o Disney+ ":
					 a.validarTextoContido(PageAcesso.BL_UM_ACESSO_COMO_ASSISTIR_DISNEY,"Para ter acesso aos conteúdos do Disney+, é preciso contratar a assinatura primeiro. Quer saber como fazer a contratação?");
					 a.validarTextoContido(PageAcesso.BT_UM_ACESSO_SABE_COMO_CONTRATAR, "Saber como contratar");
				    a.validarTextoContido(PageAcesso.BT_DOIS_ACESSO_NAO_NECESSARIO, "Não é necessário");
				    a.clicar(PageAcesso.BT_UM_ACESSO_SABE_COMO_CONTRATAR);
				  a.validarTextoContido(PageAcesso.BL_UM_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR,"Já vi que você não resistiu à parceria com o Disney+ 😍");
				  a.validarTextoContido(PageAcesso.BL_DOIS_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR, "1. Pra adicionar o Disney+, é só acessar globoplay.com/disneyplus/bot\r\n"
				  		+ "2. Depois, clique em ”assine” e faça login, se for preciso.\r\n"
				  		+ "3. Informe os dados de pagamento e finalize sua contratação.");
				  a.validarTextoContido(PageAcesso.BL_TRES_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR,"4. Em seguida, clique na opção “ativar Disney+” para criar seu cadastro no site do Disney+.");
				  a.validarTextoContido(PageAcesso.BL_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR,"Agora me diz, te ajudei ou te ajudo em algo mais?");
				  a.validarTextoContido(PageAcesso.BT_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_SIM,  "Sim, a resposta foi útil");
				  a.validarTextoContido(PageAcesso.BT_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_NÃO,  "A resposta não atendeu à pergunta");
				  a.validarTextoContido(PageAcesso.BT_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_CONTINUAR, "Continuar conversando");
					break;
				}
			});
			// Cliente combo disney Ativo
			Then("seleciono o produto do combo", () -> {
			  a.clicar(PageAcesso.BT_PRODUTO_COMBO );
			});

	
			Then("valido o texto do botao {string} do fluxo acesso com Disney+ ativo", (String botao) -> {
				switch (botao) {
				case "Não consigo acessar Disney+":
					;
					  a.validarTextoContido(PageAcesso.BL_UM_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_ATIVO, "Nesse caso, só a Central de Ajuda do Disney+ pode te ajudar... Acesse help.disneyplus.com 🙂");
					    
					    a.validarTextoContido(PageAcesso.BL_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_ATIVO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
						a.validarTextoContido(PageAcesso.BT_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_SIM_ATIVO, "Sim, a resposta foi útil");
						a.validarTextoContido(PageAcesso.BT_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_NÃO_ATIVO, "A resposta não atendeu à pergunta");
						a.validarTextoContido(PageAcesso.BT_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_CONTINUAR_ATIVO, "Continuar conversando");
										  
					break;

				case "Como assistir o Disney+ ":
				a.validarTextoContido(PageAcesso.BL_UM_ACESSO_COMO_ASSISTIR_DISNEY_ATIVO,"Você pode acessar os conteúdos Disney+ pelo site disneyplus.com ou pelo próprio aplicativo do serviço.");
				a.validarTextoContido(PageAcesso.BL_DOIS_ACESSO_COMO_ASSISTIR_DISNEY_ATIVO,"Mas se você estiver com dificuldades para assistir, é só acessar a Central de Ajuda Disney+, em help.disneyplus.com 😉");
				 a.validarTextoContido(PageAcesso.BL_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_ATIVO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					a.validarTextoContido(PageAcesso.BT_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_SIM_ATIVO, "Sim, a resposta foi útil");
					a.validarTextoContido(PageAcesso.BT_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_NÃO_ATIVO, "A resposta não atendeu à pergunta");
					a.validarTextoContido(PageAcesso.BT_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_CONTINUAR_ATIVO, "Continuar conversando");
				break;
				}
			});
			Then("valido o texto do botao {string} do fluxo acesso com Disney+ inativo", (String botao) -> {
				switch (botao) {
				case "Não consigo acessar Disney+":
					;
					//  a.validarTextoContido(PageAcesso.BL_UM_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_INATIVO, "Pra conseguir assistir aos conteúdos Disney+, é preciso fazer a ativação da assinatura, depois da contratação.\r\n"
					//  		+ "\r\n"
					//  		+ "Mas isso é fácil de resolver! 🤓");
					  a.validarTextoContido(PageAcesso.BL_DOIS_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_INATIVO, "1. Comece clicando globo.com/minhaconta e fazendo login.");
					  a.validarTextoContido(PageAcesso.BL_TRES_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_INATIVO, "2. Selecione Globoplay e Disney+.\r\n"
					  		+ "3. Clique em \"ativar Disney+”.\r\n"
					  		+ "4. Depois, é só criar seu cadastro no site do Disney+, como os passos vão te mostrar.");
					  a.validarTextoContido(PageAcesso.BL_QUATRO_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_INATIVO, "Feito isso, você passa a ter acesso a todos os conteúdos do combo Globoplay e Disney+😊");
					    a.validarTextoContido(PageAcesso.BL_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_INATIVO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
						a.validarTextoContido(PageAcesso.BT_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_SIM_INATIVO, "Sim, a resposta foi útil");
						a.validarTextoContido(PageAcesso.BT_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_NÃO_INATIVO, "A resposta não atendeu à pergunta");
						a.validarTextoContido(PageAcesso.BT_AJUDA_ACESSO_NAO_CONSIGO_ACESSAR_DISNEY_CONTINUAR_INATIVO, "Continuar conversando");
										  
					break;

				case "Como assistir o Disney+ ":
				a.validarTextoContido(PageAcesso.BL_UM_ACESSO_COMO_ASSISTIR_DISNEY_INATIVO,"Pra conseguir assistir aos conteúdos Disney+, é preciso fazer a ativação da assinatura, depois da contratação.\r\n"
						+ "\r\n"
						+ "Mas isso é fácil de resolver! 🤓");
				a.validarTextoContido(PageAcesso.BL_DOIS_ACESSO_COMO_ASSISTIR_DISNEY_INATIVO,"1. Comece acessando meusprodutos.globo.com e fazendo login.");
				a.validarTextoContido(PageAcesso.BL_TRES_ACESSO_COMO_ASSISTIR_DISNEY_INATIVO,"2. Selecione {!NomeProduto} e clique em \"ativar Disney+”."
						+"\n"+ "3. Depois, faça seu cadastro no site do Disney+, como os passos que vão te mostrar.");
				a.validarTextoContido(PageAcesso.BL_QUATRO_ACESSO_COMO_ASSISTIR_DISNEY_INATIVO,"Feito isso, é só acessar o site ou o app Disney+ e deixar a magia acontecer 😊");
				a.validarTextoContido(PageAcesso.BL_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_INATIVO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					a.validarTextoContido(PageAcesso.BT_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_SIM_INATIVO, "Sim, a resposta foi útil");
					a.validarTextoContido(PageAcesso.BT_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_NÃO_INATIVO, "A resposta não atendeu à pergunta");
					a.validarTextoContido(PageAcesso.BT_AJUDA_COMO_ASSISTIR_DISNEY_SABE_CONTRATAR_CONTINUAR_INATIVO, "Continuar conversando");
				break;
				}
			});
			
			
			
			
			
	
	
	
	
	
	
	

	
	
	

}
}