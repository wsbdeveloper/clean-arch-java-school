package br.com.wbit.escola.infra.indicacao;

import br.com.wbit.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.wbit.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de email com a lib Java Mail
	}
}
