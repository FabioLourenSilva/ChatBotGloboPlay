package com.globobot.steps;

import com.globo.pages.PageCadastro;
import com.globo.pages.PageDuvidasAssinatura;
import com.globo.pages.PageEsqueciEmail;
import com.globo.pages.PageJaPaguei;
import com.globo.pages.PagePagamento;
import com.globo.pages.PagePagarFatura;
import com.globobot.action.InteracaoWeb;

import cucumber.api.java8.En;

public class StepDefinitionsEsqueciEmail implements En{
	
	InteracaoWeb a = new InteracaoWeb();

	public StepDefinitionsEsqueciEmail() {
		Then("digito Esqueci e-mail", () -> {
		a.escrever(PageEsqueciEmail.TXT_TEXTAREABOT, "Esqueci e-mail");
		a.acionarEnter(PageEsqueciEmail.TXT_TEXTAREABOT);
		a.validarTextoContido(PageEsqueciEmail.BL_UM_ESQUECI_EMAIL, "Sem problemas, João! O seu e-mail de acesso é glb***@mai****.com e se você precisa recuperar sua senha, é só clicar em globo.com/senha para gerar uma nova 🙂");
		a.validarTextoContido(PageEsqueciEmail.BL_AJUDA_ESQUECI_EMAIL, "Agora me diz, te ajudei ou te ajudo em algo mais?");
		  a.validarTextoContido(PageEsqueciEmail.BT_AJUDA_ESQUECI_EMAIL_SIM, "🙂 Sim, a resposta foi útil");
		  a.validarTextoContido(PageEsqueciEmail.BT_AJUDA_ESQUECI_EMAIL_NÃO, "😕 A resposta não atendeu à pergunta");
		  a.validarTextoContido(PageEsqueciEmail.BT_AJUDA_ESQUECI_EMAIL_CONTINUAR, "💬 Continuar conversando");
	   
	});



}
}
