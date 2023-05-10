package com.globobot.steps;

import com.globo.pages.PageAcesso;
import com.globo.pages.PageCadastro;
import com.globo.pages.PageDuvidasAssinatura;
import com.globobot.action.InteracaoWeb;

import cucumber.api.java8.En;

public class StepDefinitionsCadastro implements En{
	
	InteracaoWeb a = new InteracaoWeb();

	public StepDefinitionsCadastro() {
	
		Then("digito Cadastro", () -> {
		a.escrever(PageCadastro.TXT_TEXTAREABOT, "Cadastro");
		a.acionarEnter(PageCadastro.TXT_TEXTAREABOT);
		a.validarTextoContido(PageCadastro.BL_UM_CADASTRO, "Pra eu te entender melhor, selecione uma das opções abaixo ou reescreva sua dúvida 🙂");
		a.validarTextoContido(PageCadastro.BTN_CADASTRO_ALTERAR_EMAIL, "Alterar e-mail");
		a.validarTextoContido(PageCadastro.BTN_CADASTRO_ALTERAR_FOTO, "Alterar foto de perfil");
		a.validarTextoContido(PageCadastro.BTN_CADASTRO_ATUALIZAR_DADOS, "Atualizar dados");
		
	});
		Given("que clico no botao {string} do menu do fluxo Cadastro", (String botao) -> {
			switch (botao) {
			
			case "Alterar e-mail":
				Thread.sleep(20000);
				a.clicar(PageCadastro.BTN_CADASTRO_ALTERAR_EMAIL);

				break;

			case "Alterar foto de perfil":
				Thread.sleep(20000);
				a.clicar(PageCadastro.BTN_CADASTRO_ALTERAR_FOTO);

				break;

			case "Atualizar dados":
				Thread.sleep(20000);
				a.clicar(PageCadastro.BTN_CADASTRO_ATUALIZAR_DADOS);

				break;
			}  
		});

		Then("valido o texto do botao {string} do fluxo Cadastro", (String botao) -> {
		switch (botao) {
			
			case "Alterar e-mail":
				 a.validarTextoContido(PageCadastro.BL_UM_CADASTRO_ALTERAR_EMAIL, "Sem problemas! "
					  		+"\n" + "A gente te ensina agora mesmo a alterar o seu e-mail. Olha como é fácil:      "
					  		+"\n"+ "1. Acesse minhaconta.globo.com e faça login com seu e-mail e senha.");
					  a.validarTextoContido(PageCadastro.BL_DOIS_CADASTRO_ALTERAR_EMAIL, "2. Clique em \"alterar e-mail\". "
					  		+"\n"+ "3. Depois de alterar, é só não esquecer de clicar em \"salvar alterações\".");
					  a.validarTextoContido(PageCadastro.BL_AJUDA_CADASTRO_ALTERAR_EMAIL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					  a.validarTextoContido(PageCadastro.BT_AJUDA_CADASTRO_ALTERAR_EMAIL_SIM, "🙂 Sim, a resposta foi útil");
					  a.validarTextoContido(PageCadastro.BT_AJUDA_CADASTRO_ALTERAR_EMAIL_NÃO, "😕 A resposta não atendeu à pergunta");
					  a.validarTextoContido(PageCadastro.BT_AJUDA_CADASTRO_ALTERAR_EMAIL_CONTINUAR, "💬 Continuar conversando");

				break;

			case "Alterar foto de perfil":

				   a.validarTextoContido(PageCadastro.BL_UM_CADASTRO_FOTO_PERFIL, "Para colocar uma foto no perfil, é só associar sua conta com o Facebook. Olha só:"
				   		+"\n"+"\n"+ "1. Acesse minhaconta.globo.com "
				   		+"\n"+ "2. Faça login com o e-mail e senha."
				   		+"\n"+ "3. No fim da página, associe sua conta do Facebook e sua foto será atualizada automaticamente.");
				   a.validarTextoContido(PageCadastro.BL_AJUDA_CADASTRO_ALTERAR_FOTO, "Agora me diz, te ajudei ou te ajudo em algo mais?");
				   a.validarTextoContido(PageCadastro.BT_AJUDA_CADASTRO_ALTERAR_FOTO_SIM, "🙂 Sim, a resposta foi útil");
					  a.validarTextoContido(PageCadastro.BT_AJUDA_CADASTRO_ALTERAR_FOTO_NÃO, "😕 A resposta não atendeu à pergunta");
					  a.validarTextoContido(PageCadastro.BT_AJUDA_CADASTRO_ALTERAR_FOTO_CONTINUAR, "💬 Continuar conversando");

				break;

			case "Atualizar dados":
					a.validarTextoContido(PageCadastro.BL_UM_CADASTRO_ATUALIZAR_DADOS, "Está precisando atualizar os seus dados?");
					a.validarTextoContido(PageCadastro.BL_DOIS_CADASTRO_ATUALIZAR_DADOS, "É simples e sem neuras. Olha só:"
							+"\n"+"\n"+ "1. Acesse minhaconta.globo.com e faça seu login."
							+"\n"+ "2. Clique em \"editar dados pessoais\" e, em seguida, atualize suas informações.");
					a.validarTextoContido(PageCadastro.BL_TRES_CADASTRO_ATUALIZAR_DADOS, "Pronto! Não disse que ia ser fácil?");
					a.validarTextoContido(PageCadastro.BL_AJUDA_CADASTRO_ATUALIZAR_DADOS, "Agora me diz, te ajudei ou te ajudo em algo mais?");
					   a.validarTextoContido(PageCadastro.BT_AJUDA_CADASTRO_ATUALIZAR_DADOS_SIM, "🙂 Sim, a resposta foi útil");
						  a.validarTextoContido(PageCadastro.BT_AJUDA_CADASTRO_ATUALIZAR_DADOS_NÃO, "😕 A resposta não atendeu à pergunta");
						  a.validarTextoContido(PageCadastro.BT_AJUDA_CADASTRO_ATUALIZAR_DADOS_CONTINUAR, "💬 Continuar conversando");
					

				break;
			}  
		});

	
}
}
