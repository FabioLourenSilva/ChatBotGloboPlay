package com.globobot.steps;

import com.globo.pages.PageBot;
import com.globo.pages.PageCadastro;
import com.globo.pages.PageDuvidasAssinatura;
import com.globo.pages.PageJaPaguei;
import com.globo.pages.PagePagamento;
import com.globo.pages.PagePagarFatura;
import com.globobot.action.InteracaoWeb;

import cucumber.api.java8.En;

public class StepDefinitionsPagamento implements En {

	InteracaoWeb a = new InteracaoWeb();

	public StepDefinitionsPagamento() {

		Then("digito Pagamento", () -> {
			Thread.sleep(20000);
			a.escrever(PagePagamento.TXT_TEXTAREABOT, "Pagamento");
			a.acionarEnter(PagePagamento.TXT_TEXTAREABOT);
			a.validarTextoContido(PagePagamento.BL_UM_PAGAMENTO,
					"Pra eu te entender melhor, selecione uma das opções abaixo ou reescreva sua dúvida 🙂");
			a.validarTextoContido(PagePagamento.BTN_PAGAMENTO_JA_PAGUEI, "Já paguei");
			a.validarTextoContido(PagePagamento.BTN_PAGAMENTO_QUANTOS_DIAS, "Quantos dias demora");
			a.validarTextoContido(PagePagamento.BTN_PAGAMENTO_PAGAR_FATURA, "Pagar fatura");
			a.validarTextoContido(PagePagamento.BTN_PAGAMENTO_PASSOU_PRAZO, "Passou do prazo");
			a.validarTextoContido(PagePagamento.BTN_PAGAMENTO_QUANTIDADE_ASSINATURA,
					"Quantidade de assinaturas por CPF");
			a.validarTextoContido(PagePagamento.BTN_PAGAMENTO_NAO_VENCEU, "Não venceu");
			a.validarTextoContido(PagePagamento.BTN_PAGAMENTO_NAO_PARCELADO, "O plano não foi parcelado");
			a.validarTextoContido(PagePagamento.BTN_PAGAMENTO_REAGENDAR_PAGAMENTO, "Reagendar pagamento");

		});

		Given("que clico no botao {string} do menu da FAQ de Pagamentos", (String botao) -> {
			switch (botao) {

			case "Já paguei":
				Thread.sleep(20000);
				a.clicar(PagePagamento.BTN_PAGAMENTO_JA_PAGUEI);

				break;

			case "Quantos dias demora":
				Thread.sleep(20000);
				a.clicar(PagePagamento.BTN_PAGAMENTO_QUANTOS_DIAS);

				break;

			case "Pagar fatura":
				Thread.sleep(20000);
				a.clicar(PagePagamento.BTN_PAGAMENTO_PAGAR_FATURA);

				break;

			case "Passou do prazo":
				Thread.sleep(20000);
				a.clicar(PagePagamento.BTN_PAGAMENTO_PASSOU_PRAZO);

				break;

			case "Quantidade de assinaturas por CPF":
				Thread.sleep(20000);
				a.clicar(PagePagamento.BTN_PAGAMENTO_QUANTIDADE_ASSINATURA);

				break;

			case "Não venceu":
				Thread.sleep(20000);
				a.clicar(PagePagamento.BTN_PAGAMENTO_NAO_VENCEU);

				break;

			case "O plano não foi parcelado":
				Thread.sleep(20000);
				a.clicar(PagePagamento.BTN_PAGAMENTO_NAO_PARCELADO);

				break;

			case "Reagendar pagamento ":
				Thread.sleep(20000);
				a.clicar(PagePagamento.BTN_PAGAMENTO_REAGENDAR_PAGAMENTO);

				break;

			}

		});

		Then("valido o texto do botao {string} da FAQ de Pagamentos", (String botao) -> {
			switch (botao) {

			case "Já paguei":

				a.validarTextoContido(PageJaPaguei.BL_UM_JA_PAGUEI,
						"Vi que sua assinatura está funcionando normalmente e pronta pro play." + "\n" + "\n"
								+ "É só fazer login com glb***@mai****.com e sua senha para aproveitar todos os conteúdos da sua assinatura.");
				a.validarTextoContido(PageJaPaguei.Bl_DOIS_JA_PAGUEI,
						"Mas se acessar com esse e-mail, você continua com alguma dificuldade, é só me dizer exatamente o que acontece.");
				a.validarTextoContido(PageJaPaguei.BL_AJUDA_JA_PAGUEI,
						"Agora me diz, te ajudei ou te ajudo em algo mais?");
				a.validarTextoContido(PageJaPaguei.BT_AJUDA_JA_PAGUEI_SIM, "🙂 Sim, a resposta foi útil");
				a.validarTextoContido(PageJaPaguei.BT_AJUDA_JA_PAGUEI_NAO, "😕 A resposta não atendeu à pergunta");
				a.validarTextoContido(PageJaPaguei.BT_AJUDA_JA_PAGUEI_CONTINUAR, "💬 Continuar conversando");

				break;

			case "Quantos dias demora":
				a.validarTextoContido(PagePagamento.BL_UM_PAGUEI_QUANTOS_DIAS,
						"O período que tentamos realizar o seu pagamento junto ao banco ou administradora do cartão varia de acordo com a sua forma de pagamento:");
				a.validarTextoContido(PagePagamento.BL_DOIS_PAGUEI_QUANTOS_DIAS,
						"Cartão de crédito e débito: concilia no momento do pagamento, ao longo do dia. Você pode conferir o status da sua assinatura em minhaconta.globo.com");
				a.validarTextoContido(PagePagamento.BL_TRES_PAGUEI_QUANTOS_DIAS,
						"Débito em conta: pode levar até 3 dias úteis, então o melhor é acompanhar diariamente o minhaconta.globo.com e verificar se o status muda antes desse prazo.");
				a.validarTextoContido(PagePagamento.BL_AJUDA_QUANTOS_DIAS,
						"Agora me diz, te ajudei ou te ajudo em algo mais?");
				a.validarTextoContido(PagePagamento.BT_AJUDA_QUANTOS_DIAS_SIM, "🙂 Sim, a resposta foi útil");
				a.validarTextoContido(PagePagamento.BT_AJUDA_QUANTOS_DIAS_NAO, "😕 A resposta não atendeu à pergunta");
				a.validarTextoContido(PagePagamento.BT_AJUDA_QUANTOS_DIAS_CONTINUAR, "💬 Continuar conversando");

				break;

			case "Pagar fatura":
				a.validarTextoContido(PagePagarFatura.BL_UM_PAGAR_FATURA,
						"Aqui, sua fatura é cobrada automaticamente usando a forma de pagamento que você cadastrou."
								+ "\n" + "\n"
								+ "Tudo que você precisa fazer é garantir que tenha limite no seu cartão quando a cobrança for feita 😉");
				a.validarTextoContido(PagePagarFatura.BL_AJUDA_PAGAR_FATURA,
						"Agora me diz, te ajudei ou te ajudo em algo mais?");
				a.validarTextoContido(PagePagarFatura.BT_AJUDA_PAGAR_FATURA_SIM, "🙂 Sim, a resposta foi útil");
				a.validarTextoContido(PagePagarFatura.BT_AJUDA_PAGAR_FATURA_NAO,
						"😕 A resposta não atendeu à pergunta");
				a.validarTextoContido(PagePagarFatura.BT_AJUDA_PAGAR_FATURA_CONTINUAR, "💬 Continuar conversando");

				break;

			case "Passou do prazo":
				a.validarTextoContido(PagePagamento.BL_UM_PASSOU_PRAZO_TRANSBORDO,
						"Nesse caso, somente um atendente pode te ajudar. Quer falar com ele agora?");
				a.validarTextoContido(PagePagamento.BT_PASSOU_PRAZO_AGORA_NAO, "Agora não");
				a.validarTextoContido(PagePagamento.BT_PASSOU_PRAZO_FALAR_ATENDENTE, "Falar com atendente");

				break;

			case "Quantidade de assinaturas por CPF":
				a.validarTextoContido(PagePagamento.BL_UM_QUANTIDADE_ASSINATURA_TRANSBORDO,
						"Nesse caso, somente um atendente pode te ajudar. Quer falar com ele agora?");
				a.validarTextoContido(PagePagamento.BT_QUANTIDADE_ASSINATURA_AGORA_NAO, "Agora não");
				a.validarTextoContido(PagePagamento.BT_QUANTIDADE_ASSINATURA_FALAR_ATENDENTE, "Falar com atendente");

				break;

			case "Não venceu":
				a.validarTextoContido(PagePagamento.BL_UM_NAO_VENCEU,
						"Nesse caso, o melhor a fazer é consultar a data de vencimento da sua fatura na sua conta. Siga o passo a passo:");
				a.validarTextoContido(PagePagamento.BL_DOIS_NAO_VENCEU, "1. Acesse minhaconta.globo.com e faça login."
						+ "\n" + "2. Clique em \"ver pagamentos\" e depois escolha o produto Globoplay." + "\n"
						+ "3. Em \"histórico de cobrança\", clique em \"ver todos\" e consulte a data de vencimento.");
				a.validarTextoContido(PagePagamento.BL_AJUDA_NAO_VENCEU,
						"Agora me diz, te ajudei ou te ajudo em algo mais?");
				a.validarTextoContido(PagePagamento.BT_AJUDA_NAO_VENCEU_SIM, "🙂 Sim, a resposta foi útil");
				a.validarTextoContido(PagePagamento.BT_AJUDA_NAO_VENCEU_NAO, "😕 A resposta não atendeu à pergunta");
				a.validarTextoContido(PagePagamento.BT_AJUDA_NAO_VENCEU_CONTINUAR, "💬 Continuar conversando");
				break;

			case "O plano não foi parcelado":
				a.validarTextoContido(PagePagamento.BL_UM_NAO_PARCELADO,
						"No momento da contratação, você pode escolher se prefere pagar o valor do plano anual ou bianual à vista ou parcelar em 12x. "
								+ "\n" + "\n" + "Para conferir se você selecionou a opção de parcelar, faça assim:");
				a.validarTextoContido(PagePagamento.BL_DOIS_NAO_PARCELADO,
						"1. Acesse meusprodutos.globo.com e faça login, se for preciso." + "\n"
								+ "2. Selecione Globoplay." + "\n"
								+ "3. Ao final da página, clique em \"exibir histórico completo\" e confira se o seu pagamento foi parcelado.");
				a.validarTextoContido(PagePagamento.BL_TRES_NAO_PARCELADO,
						"Se não tem essa informação, você provavelmente esqueceu de selecionar a opção de parcelamento. De qualquer forma, aproveite para começar a maratonar as séries exclusivas, todos os programas da TV Globo que estão no ar e muito mais 😍");
				a.validarTextoContido(PagePagamento.BL_AJUDA_NAO_PARCELADO,
						"Agora me diz, te ajudei ou te ajudo em algo mais?");
				a.validarTextoContido(PagePagamento.BT_AJUDA_NAO_PARCELADO_SIM, "🙂 Sim, a resposta foi útil");
				a.validarTextoContido(PagePagamento.BT_AJUDA_NAO_PARCELADO_NAO, "😕 A resposta não atendeu à pergunta");
				a.validarTextoContido(PagePagamento.BT_AJUDA_NAO_PARCELADO_CONTINUAR, "💬 Continuar conversando");

				break;

			case "Reagendar pagamento ":
				a.validarTextoContido(PagePagamento.BL_UM_REAGENDAR_PAGAMENTO,
						"Poxa, a gente não consegue reagendar. Mas você pode pagar sua fatura direto na sua Conta Globo.");
				a.validarTextoContido(PagePagamento.BL_DOIS_REAGENDAR_PAGAMENTO,
						"Olha só como é fácil: " + "\n"
								+ "1. Acesse meusprodutos.globo.com e faça login, se for preciso." + "\n"
								+ "3. Selecione Globoplay.");
				a.validarTextoContido(PagePagamento.BL_TRES_REAGENDAR_PAGAMENTO,
						"4. Depois, é só clicar no botão \"realizar pagamento\".");
				a.validarTextoContido(PagePagamento.BL_QUATRO_REAGENDAR_PAGAMENTO,
						"Se preferir o passo a passo ilustrado, acesse duvidas.globo.com/pagarfatura|");
				a.validarTextoContido(PagePagamento.BL_CINCO_REAGENDAR_PAGAMENTO,
						"Ah! E seguindo esse mesmo passo a passo, você pode ver o histórico de pagamentos e atualizar a forma de pagamento atual.");
				a.validarTextoContido(PagePagamento.BL_AJUDA_REAGENDAR_PAGAMENTO,
						"Agora me diz, te ajudei ou te ajudo em algo mais?");
				a.validarTextoContido(PagePagamento.BT_AJUDA_REAGENDAR_PAGAMENTO_SIM, "🙂 Sim, a resposta foi útil");
				a.validarTextoContido(PagePagamento.BT_AJUDA_REAGENDAR_PAGAMENTO_NAO,
						"😕 A resposta não atendeu à pergunta");
				a.validarTextoContido(PagePagamento.BT_AJUDA_REAGENDAR_PAGAMENTO_CONTINUAR, "💬 Continuar conversando");

				break;

			}
		});

	}
}
