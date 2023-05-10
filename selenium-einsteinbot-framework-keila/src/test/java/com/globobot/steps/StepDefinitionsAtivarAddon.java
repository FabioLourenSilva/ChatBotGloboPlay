package com.globobot.steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.globo.pages.PageAcesso;
import com.globo.pages.PageAlterarPlano;
import com.globo.pages.PageAtivarAddon;
import com.globo.pages.PageAtivarSmart;
import com.globo.pages.PageBot;
import com.globo.pages.PageErrosAssistir;
import com.globo.pages.PageLogin;
import com.globo.pages.PageOutrosAssuntos;
import com.globo.util.DriverContext;
import com.globo.util.LeituraProperties;
import com.globobot.action.InteracaoWeb;

import cucumber.api.java8.En;

public class StepDefinitionsAtivarAddon implements En{
	InteracaoWeb a = new InteracaoWeb();
	
	public StepDefinitionsAtivarAddon(){
	
		Then("digito ativar addon", () -> {
			 a.clicar(PageAtivarAddon.TXT_TEXTAREABOT);
			 a.escrever(PageAtivarAddon.TXT_TEXTAREABOT, "ativar addon");
			 a.acionarEnter(PageAtivarAddon.TXT_TEXTAREABOT);
			 a.validarTextoContido(PageAtivarAddon.BL_UM_ATIVAR_ADDON_GLOBOPLAY, "Parece que você quer saber como ativar algum dos nossos produtos adicionais... Para isso, preciso que selecione uma das opções abaixo 🙂");
			 a.validarTextoContido(PageAtivarAddon.BT_ATIVAR_ADDON_GLOBOPLAY_DISNEY, "Disney+");
			 a.validarTextoContido(PageAtivarAddon.BT_ATIVAR_ADDON_GLOBOPLAY_DEEZER, "Deezer Premium");
		});

		Given("que clico no botao {string} do menu do fluxo ativar addon com familia globoplay", (String botao) -> {
switch (botao) {
			
			case "Disney+":
				Thread.sleep(20000);
				a.clicar(PageAtivarAddon.BT_ATIVAR_ADDON_GLOBOPLAY_DISNEY);

				break;

			case "Deezer Premium":
				Thread.sleep(20000);
				a.clicar(PageAtivarAddon.BT_ATIVAR_ADDON_GLOBOPLAY_DEEZER);

				break;
			}
		});
		

		Then("valido o texto do botao {string} do fluxo ativar addon familia globoplay", (String botao) -> {
	switch (botao) {
			
			case "Disney+":
				a.validarTextoContido(PageAtivarAddon.BL_UM_ATIVAR_ADDON_GLOBOPLAY_DISNEY, "Já vi que você não resistiu à parceria com o Disney+ 😍");
			    a.validarTextoContido(PageAtivarAddon.BL_DOIS_ATIVAR_ADDON_GLOBOPLAY_DISNEY, "1. Pra adicionar o Disney+, é só acessar globoplay.com/disneyplus/bot"
			    		+"\n" + "\n" +"2. Depois, clique em ”assine” e faça login, se for preciso."
			    		+"\n" + "\n" +"3. Informe os dados de pagamento e finalize sua contratação.");
			    a.validarTextoContido(PageAtivarAddon.BL_TRES_ATIVAR_ADDON_GLOBOPLAY_DISNEY, "4. Em seguida, clique na opção “ativar Disney+” para criar seu cadastro no site do Disney+.");
			    a.validarTextoContido(PageAtivarAddon.BL_AJUDA_ATIVAR_ADDON_GLOBOPLAY_DISNEY, "Agora me diz, te ajudei ou te ajudo em algo mais?");
			    a.validarTextoContido(PageAtivarAddon.BT_AJUDA_ATIVAR_ADDON_GLOBOPLAY_DISNEY_SIM, "Sim, a resposta foi útil");
			    a.validarTextoContido(PageAtivarAddon.BT_AJUDA_ATIVAR_ADDON_GLOBOPLAY_DISNEY_NÃO, "A resposta não atendeu à pergunta");
			    a.validarTextoContido(PageAtivarAddon.BT_AJUDA_ATIVAR_ADDON_GLOBOPLAY_DISNEY_CONTINUAR, "Continuar conversando");
			
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
			}
		});
		Then("digito ativar addon para o combo Disney", () -> {
			 a.clicar(PageAtivarAddon.TXT_TEXTAREABOT);
			 a.escrever(PageAtivarAddon.TXT_TEXTAREABOT, "ativar addon");
			 a.acionarEnter(PageAtivarAddon.TXT_TEXTAREABOT);
			 a.validarTextoContido(PageAtivarAddon.BL_UM_ATIVAR_ADDON_GLOBOPLAY, "Parece que você quer saber como ativar algum dos nossos produtos adicionais... Para isso, preciso que selecione uma das opções abaixo 🙂");
			 a.validarTextoContido(PageAtivarAddon.BT_ATIVAR_ADDON_GLOBOPLAY_DISNEY, "Disney+");
			 a.validarTextoContido(PageAtivarAddon.BT_ATIVAR_ADDON_GLOBOPLAY_DEEZER, "Deezer Premium");
		
		});
	}

}
