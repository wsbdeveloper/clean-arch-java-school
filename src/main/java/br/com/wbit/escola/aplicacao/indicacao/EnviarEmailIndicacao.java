package br.com.wbit.escola.aplicacao.indicacao;

import br.com.wbit.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}
